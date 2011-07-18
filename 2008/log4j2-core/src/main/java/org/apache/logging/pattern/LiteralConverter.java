/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.logging.pattern;

import org.apache.logging.core.LogEvent;

import java.io.Serializable;


/**
 * Converters a string literal.
 *
 * @Immutable
 */
public final class LiteralConverter<T extends Appendable>
        extends StringConverter<T> implements Serializable {
  /**
   * String literal.
   */
  private final String literal;

  /**
   * Create a new instance.
   * @param literal string literal.
   */
  public LiteralConverter(final String literal) {
    this.literal = literal;
  }

  /** {@inheritDoc} */
  public Object extract(final LogEvent record) {
      return literal;
  }
}
// Copyright 2010, Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.exception;

/**
 * Base exception for all authentication exceptions. Most exceptions extending
 * from this class can be recovered from.
 *
 * @author Adam Rogal
 */
public abstract class AuthenticationException extends Exception {

  /**
   * Constructor.
   *
   * @param message the exception message
   */
  public AuthenticationException(String message) {
    super(message);
  }

  /**
   * Constructor.
   *
   * @param message the exception message
   * @param cause the exception cause
   */
  public AuthenticationException(String message, Throwable cause) {
    super(message, cause);
  }
}

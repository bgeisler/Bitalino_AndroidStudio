/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.eece380.summer2015.SignalsApp.src.ceu;

public class BITalinoException extends Exception {

  private static final long serialVersionUID = 3850110443125871497L;

  private final int code;

  public BITalinoException(final BITalinoErrorTypes errorType) {
    super(errorType.getDescription());
    code = errorType.getValue();
  }

  public int getCode() {
    return code;
  }

}
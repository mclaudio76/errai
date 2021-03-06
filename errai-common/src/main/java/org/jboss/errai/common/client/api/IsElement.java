/**
 * Copyright (C) 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.common.client.api;

import com.google.gwt.dom.client.Element;

/**
 * Marks an object as being a UI component having some root element. Typically this should be implemented by presenters
 * that add behaviour to DOM fragments.
 *
 * @author Max Barkley <mbarkley@redhat.com>
 */
public interface IsElement {

  /**
   * @return The {@link Element} aspect of the implementor.
   */
  Element getElement();

}

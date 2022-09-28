/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.infrastructure.event.business.domain.savings.transaction;

import org.apache.fineract.infrastructure.event.business.domain.AbstractBusinessEvent;
import org.apache.fineract.portfolio.savings.domain.SavingsAccountTransaction;

public abstract class SavingsAccountTransactionBusinessEvent extends AbstractBusinessEvent<SavingsAccountTransaction> {

    private static final String CATEGORY = "Savings";

    public SavingsAccountTransactionBusinessEvent(SavingsAccountTransaction value) {
        super(value);
    }

    @Override
    public String getCategory() {
        return CATEGORY;
    }
}

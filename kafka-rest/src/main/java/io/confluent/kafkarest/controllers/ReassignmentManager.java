/*
 * Copyright 2020 Confluent Inc.
 *
 * Licensed under the Confluent Community License (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.kafkarest.controllers;

import io.confluent.kafkarest.entities.Reassignment;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ReassignmentManager {

  /**
   * Returns a list of Kafka {@link io.confluent.kafkarest.entities.Partition Partitions}
   * reassignments for all Kafka {@link io.confluent.kafkarest.entities.Topic Topics} for a
   * Kafka {@link io.confluent.kafkarest.entities.Cluster cluster} with the given {@code clusterId}.
   */
  CompletableFuture<List<Reassignment>> listReassignments(String clusterId);

}
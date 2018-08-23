/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.distributed_task_executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.after;
import static spark.Spark.get;
import static spark.Spark.port;

/**
 * The main building block for the Spark application to start the service and expose REST APIs
 * This is the main class for starting the service.
 */
public class DistributedTaskExecutor
{
    private static final String PATH = "/v1/repair";
    private static final Logger logger = LoggerFactory.getLogger(DistributedTaskExecutor.class);

    public static void main(String[] args)
    {


        System.out.println(" _____                               _              _____ _     _                     \n" +
                    "/  __ \\                             | |            /  ___(_)   | |                    \n" +
                    "| /  \\/ __ _ ___ ___  __ _ _ __   __| |_ __ __ _   \\ `--. _  __| | ___  ___ __ _ _ __ \n" +
                    "| |    / _` / __/ __|/ _` | '_ \\ / _` | '__/ _` |   `--. \\ |/ _` |/ _ \\/ __/ _` | '__|\n" +
                    "| \\__/\\ (_| \\__ \\__ \\ (_| | | | | (_| | | | (_| |  /\\__/ / | (_| |  __/ (_| (_| | |   \n" +
                    " \\____/\\__,_|___/___/\\__,_|_| |_|\\__,_|_|  \\__,_|  \\____/|_|\\__,_|\\___|\\___\\__,_|_|   \n" +
                    "                                                                                      \n" +
                    "                                                                                      ");
        get("/hello", (req, res) -> "This is too easy for java");
       
    }
}


/**
 * PermissionsEx
 * Copyright (C) zml and PermissionsEx contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ninja.leaping.permissionsex;

import com.google.common.collect.ImmutableSet;
import ninja.leaping.permissionsex.util.command.CommandSpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.nio.file.Path;
import java.util.Set;
import java.util.concurrent.Executor;

/**
 */
public class TestImplementationInterface implements ImplementationInterface {
    private final Path baseDirectory;
    private final Logger logger = LoggerFactory.getLogger("TestImpl");

    public TestImplementationInterface(Path baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    @Override
    public Path getBaseDirectory() {
        return baseDirectory;
    }

    @Override
    public Logger getLogger() {
        return logger;
    }

    @Override
    public DataSource getDataSourceForURL(String url) {
        return null;
    }

    /**
     * Get an executor to run tasks asynchronously on.
     *
     * @return The async executor
     */
    @Override
    public Executor getAsyncExecutor() {
        return Runnable::run;
    }

    @Override
    public void registerCommand(CommandSpec command) {
    }

    @Override
    public Set<CommandSpec> getImplementationCommands() {
        return ImmutableSet.of();
    }

    @Override
    public String getVersion() {
        return "test";
    }
}

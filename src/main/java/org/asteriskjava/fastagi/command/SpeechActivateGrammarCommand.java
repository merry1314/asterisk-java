/*
 * Copyright 2004-2022 Asterisk-Java contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.asteriskjava.fastagi.command;

/**
 * AGI Command: <b>SPEECH ACTIVATE GRAMMAR</b>
 * <p>
 * Activates a grammar.
 * <p>
 * See: <a href="https://wiki.asterisk.org/wiki/display/AST/Asterisk+18+AGICommand_speech+activate+grammar">AGI Command SPEECH ACTIVATE GRAMMAR (Asterisk 18)</a>
 *
 * @author srt
 * @see org.asteriskjava.fastagi.command.SpeechLoadGrammarCommand
 * @see org.asteriskjava.fastagi.command.SpeechDeactivateGrammarCommand
 * @since 1.0.0
 */
public class SpeechActivateGrammarCommand extends AbstractAgiCommand {
    private static final long serialVersionUID = 1L;

    private String name;

    /**
     * Creates a new SpeechActivateGrammarCommand that activates the given grammar.
     *
     * @param name the name of the grammar.
     */
    public SpeechActivateGrammarCommand(String name) {
        this.name = name;
    }

    /**
     * Returns the name of the grammar.
     *
     * @return the name of the grammar.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the grammar.
     *
     * @param name the name of the grammar.
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String buildCommand() {
        return "SPEECH ACTIVATE GRAMMAR " + escapeAndQuote(name);
    }
}

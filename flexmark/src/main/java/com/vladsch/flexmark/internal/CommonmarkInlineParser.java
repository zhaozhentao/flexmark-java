package com.vladsch.flexmark.internal;

import com.vladsch.flexmark.internal.util.Parsing;
import com.vladsch.flexmark.internal.util.options.DataHolder;
import com.vladsch.flexmark.node.Document;
import com.vladsch.flexmark.parser.DelimiterProcessor;

import java.util.BitSet;
import java.util.Map;

public class CommonmarkInlineParser extends InlineParserImpl {
    public CommonmarkInlineParser(DataHolder options, BitSet specialCharacters, BitSet delimiterCharacters,
            Map<Character, DelimiterProcessor> delimiterProcessors, LinkRefProcessorData referenceLinkProcessors) {
        super(options, specialCharacters, delimiterCharacters, delimiterProcessors, referenceLinkProcessors);
    }

    @Override
    public void initializeDocument(Parsing parsing, Document document) {
        super.initializeDocument(parsing, document);
    }
}
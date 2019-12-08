package com.vladsch.flexmark.util;

import com.vladsch.flexmark.util.ast.DocumentTest;
import com.vladsch.flexmark.util.collection.*;
import com.vladsch.flexmark.util.collection.iteration.PositionListTest;
import com.vladsch.flexmark.util.format.MarkdownParagraphTest;
import com.vladsch.flexmark.util.html.HtmlFormattingAppendableBaseTest;
import com.vladsch.flexmark.util.html.ui.HtmlBuilderTest;
import com.vladsch.flexmark.util.html.ui.HtmlHelpersTest;
import com.vladsch.flexmark.util.options.AttributeTest;
import com.vladsch.flexmark.util.options.AttributesTest;
import com.vladsch.flexmark.util.options.MutableAttributeTest;
import com.vladsch.flexmark.util.sequence.*;
import com.vladsch.flexmark.util.sequence.edit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SegmentBuilderTest.class,
        BasedSegmentBuilderTest.class,
        BasedSequenceBuilderTest.class,
        BasedSequenceImplTest.class,
        BaseSequenceEntryTest.class,
        SeqSegTest.class,
        PositionListTest.class,
        BaseSequenceManagerTest.class,
        MarkdownParagraphTest.class,
        TemplateUtilTest.class,
        OrderedMapTest.class,
        OrderedMultiMapTest.class,
        OrderedSetTest.class,
        MaxAggregatorTest.class,
        MinAggregatorTest.class,
        MutableAttributeTest.class,
        UtilsTest.class,
        ArrayUtilsTest.class,
        MappedBasedSequenceTest.class,
        MappedRichSequenceTest.class,
        AttributesTest.class,
        AttributeTest.class,
        BoundedMaxAggregatorTest.class,
        BoundedMinAggregatorTest.class,
        ClassificationBagTest.class,
        DocumentTest.class,
        HtmlBuilderTest.class,
        HtmlFormattingAppendableBaseTest.class,
        HtmlHelpersTest.class,
        IntegerBitSetTest.class,
        LineFormattingAppendableImplTest.class,
        PrefixedSubSequenceTest.class,
        RepeatedSequenceTest.class,
        CharPredicateTest.class,
})
public class UtilsTestSuite {
}

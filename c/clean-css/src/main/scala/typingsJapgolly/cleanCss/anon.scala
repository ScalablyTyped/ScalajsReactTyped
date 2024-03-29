package typingsJapgolly.cleanCss

import typingsJapgolly.cleanCss.cleanCssBooleans.`false`
import typingsJapgolly.cleanCss.cleanCssBooleans.`true`
import typingsJapgolly.cleanCss.cleanCssStrings.natural
import typingsJapgolly.cleanCss.cleanCssStrings.none
import typingsJapgolly.cleanCss.cleanCssStrings.standard
import typingsJapgolly.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdjacentSpace extends StObject {
    
    /**
      * Controls extra space before `nav` element; defaults to `false`
      */
    var adjacentSpace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
      */
    var ie7Hack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
      */
    var mergeLimit: Double
    
    /**
      * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
      */
    var mergeablePseudoClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
      */
    var mergeablePseudoElements: js.Array[String]
    
    /**
      * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
      */
    var multiplePseudoMerging: Boolean
  }
  object AdjacentSpace {
    
    inline def apply(mergeLimit: Double, mergeablePseudoElements: js.Array[String], multiplePseudoMerging: Boolean): AdjacentSpace = {
      val __obj = js.Dynamic.literal(mergeLimit = mergeLimit.asInstanceOf[js.Any], mergeablePseudoElements = mergeablePseudoElements.asInstanceOf[js.Any], multiplePseudoMerging = multiplePseudoMerging.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjacentSpace]
    }
    
    extension [Self <: AdjacentSpace](x: Self) {
      
      inline def setAdjacentSpace(value: Boolean): Self = StObject.set(x, "adjacentSpace", value.asInstanceOf[js.Any])
      
      inline def setAdjacentSpaceUndefined: Self = StObject.set(x, "adjacentSpace", js.undefined)
      
      inline def setIe7Hack(value: Boolean): Self = StObject.set(x, "ie7Hack", value.asInstanceOf[js.Any])
      
      inline def setIe7HackUndefined: Self = StObject.set(x, "ie7Hack", js.undefined)
      
      inline def setMergeLimit(value: Double): Self = StObject.set(x, "mergeLimit", value.asInstanceOf[js.Any])
      
      inline def setMergeablePseudoClasses(value: js.Array[String]): Self = StObject.set(x, "mergeablePseudoClasses", value.asInstanceOf[js.Any])
      
      inline def setMergeablePseudoClassesUndefined: Self = StObject.set(x, "mergeablePseudoClasses", js.undefined)
      
      inline def setMergeablePseudoClassesVarargs(value: String*): Self = StObject.set(x, "mergeablePseudoClasses", js.Array(value*))
      
      inline def setMergeablePseudoElements(value: js.Array[String]): Self = StObject.set(x, "mergeablePseudoElements", value.asInstanceOf[js.Any])
      
      inline def setMergeablePseudoElementsVarargs(value: String*): Self = StObject.set(x, "mergeablePseudoElements", js.Array(value*))
      
      inline def setMultiplePseudoMerging(value: Boolean): Self = StObject.set(x, "multiplePseudoMerging", value.asInstanceOf[js.Any])
    }
  }
  
  trait AfterAtRule extends StObject {
    
    /**
      * Controls if a line break comes after an at-rule; e.g. `@charset`; defaults to `false`
      */
    var afterAtRule: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes after a block begins; e.g. `@media`; defaults to `false`
      */
    var afterBlockBegins: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes after a block ends, defaults to `false`
      */
    var afterBlockEnds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes after a comment; defaults to `false`
      */
    var afterComment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes after a property; defaults to `false`
      */
    var afterProperty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes after a rule begins; defaults to `false`
      */
    var afterRuleBegins: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes after a rule ends; defaults to `false`
      */
    var afterRuleEnds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes before a block ends; defaults to `false`
      */
    var beforeBlockEnds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a line break comes between selectors; defaults to `false`
      */
    var betweenSelectors: js.UndefOr[Boolean] = js.undefined
  }
  object AfterAtRule {
    
    inline def apply(): AfterAtRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterAtRule]
    }
    
    extension [Self <: AfterAtRule](x: Self) {
      
      inline def setAfterAtRule(value: Boolean): Self = StObject.set(x, "afterAtRule", value.asInstanceOf[js.Any])
      
      inline def setAfterAtRuleUndefined: Self = StObject.set(x, "afterAtRule", js.undefined)
      
      inline def setAfterBlockBegins(value: Boolean): Self = StObject.set(x, "afterBlockBegins", value.asInstanceOf[js.Any])
      
      inline def setAfterBlockBeginsUndefined: Self = StObject.set(x, "afterBlockBegins", js.undefined)
      
      inline def setAfterBlockEnds(value: Boolean): Self = StObject.set(x, "afterBlockEnds", value.asInstanceOf[js.Any])
      
      inline def setAfterBlockEndsUndefined: Self = StObject.set(x, "afterBlockEnds", js.undefined)
      
      inline def setAfterComment(value: Boolean): Self = StObject.set(x, "afterComment", value.asInstanceOf[js.Any])
      
      inline def setAfterCommentUndefined: Self = StObject.set(x, "afterComment", js.undefined)
      
      inline def setAfterProperty(value: Boolean): Self = StObject.set(x, "afterProperty", value.asInstanceOf[js.Any])
      
      inline def setAfterPropertyUndefined: Self = StObject.set(x, "afterProperty", js.undefined)
      
      inline def setAfterRuleBegins(value: Boolean): Self = StObject.set(x, "afterRuleBegins", value.asInstanceOf[js.Any])
      
      inline def setAfterRuleBeginsUndefined: Self = StObject.set(x, "afterRuleBegins", js.undefined)
      
      inline def setAfterRuleEnds(value: Boolean): Self = StObject.set(x, "afterRuleEnds", value.asInstanceOf[js.Any])
      
      inline def setAfterRuleEndsUndefined: Self = StObject.set(x, "afterRuleEnds", js.undefined)
      
      inline def setBeforeBlockEnds(value: Boolean): Self = StObject.set(x, "beforeBlockEnds", value.asInstanceOf[js.Any])
      
      inline def setBeforeBlockEndsUndefined: Self = StObject.set(x, "beforeBlockEnds", js.undefined)
      
      inline def setBetweenSelectors(value: Boolean): Self = StObject.set(x, "betweenSelectors", value.asInstanceOf[js.Any])
      
      inline def setBetweenSelectorsUndefined: Self = StObject.set(x, "betweenSelectors", js.undefined)
    }
  }
  
  trait All extends StObject {
    
    /**
      * Sets all optimizations at this level unless otherwise specified
      */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `@charset` moving to the front of a stylesheet; defaults to `true`
      */
    var cleanupCharsets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls URL normalization; defaults to `true`
      */
    var normalizeUrls: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `background` property optimizations; defaults to `true`
      */
    var optimizeBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `border-radius` property optimizations; defaults to `true`
      */
    var optimizeBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `filter` property optimizations; defaults to `true`
      */
    var optimizeFilter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `font` property optimizations; defaults to `true`
      */
    var optimizeFont: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `font-weight` property optimizations; defaults to `true`
      */
    var optimizeFontWeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `outline` property optimizations; defaults to `true`
      */
    var optimizeOutline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removing empty rules and nested blocks; defaults to `true`
      */
    var removeEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removing negative paddings; defaults to `true`
      */
    var removeNegativePaddings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removing quotes when unnecessary; defaults to `true`
      */
    var removeQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removing unused whitespace; defaults to `true`
      */
    var removeWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Contols removing redundant zeros; defaults to `true`
      */
    var replaceMultipleZeros: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls replacing time units with shorter values; defaults to `true`
      */
    var replaceTimeUnits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls replacing zero values with units; defaults to `true`
      */
    var replaceZeroUnits: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rounds pixel values to `N` decimal places; `false` disables rounding; defaults to `false`
      */
    var roundingPrecision: js.UndefOr[Boolean] = js.undefined
    
    /**
      * denotes selector sorting method; can be `'natural'` or `'standard'`, `'none'`, or false (the last two
      * since 4.1.0); defaults to `'standard'`
      */
    var selectorsSortingMethod: js.UndefOr[standard | natural | none] = js.undefined
    
    /**
      * denotes a number of / *! ... * / comments preserved; defaults to `all`
      */
    var specialComments: js.UndefOr[String] = js.undefined
    
    /**
      * Controls at-rules (e.g. `@charset`, `@import`) optimizing; defaults to `true`
      */
    var tidyAtRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls block scopes (e.g. `@media`) optimizing; defaults to `true`
      */
    var tidyBlockScopes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls selectors optimizing; defaults to `true`
      */
    var tidySelectors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines a callback for fine-grained property optimization; defaults to no-op
      */
    var transform: js.UndefOr[
        js.Function3[
          /* propertyName */ String, 
          /* propertyValue */ String, 
          /* selector */ js.UndefOr[String], 
          String
        ]
      ] = js.undefined
  }
  object All {
    
    inline def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setCleanupCharsets(value: Boolean): Self = StObject.set(x, "cleanupCharsets", value.asInstanceOf[js.Any])
      
      inline def setCleanupCharsetsUndefined: Self = StObject.set(x, "cleanupCharsets", js.undefined)
      
      inline def setNormalizeUrls(value: Boolean): Self = StObject.set(x, "normalizeUrls", value.asInstanceOf[js.Any])
      
      inline def setNormalizeUrlsUndefined: Self = StObject.set(x, "normalizeUrls", js.undefined)
      
      inline def setOptimizeBackground(value: Boolean): Self = StObject.set(x, "optimizeBackground", value.asInstanceOf[js.Any])
      
      inline def setOptimizeBackgroundUndefined: Self = StObject.set(x, "optimizeBackground", js.undefined)
      
      inline def setOptimizeBorderRadius(value: Boolean): Self = StObject.set(x, "optimizeBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setOptimizeBorderRadiusUndefined: Self = StObject.set(x, "optimizeBorderRadius", js.undefined)
      
      inline def setOptimizeFilter(value: Boolean): Self = StObject.set(x, "optimizeFilter", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFilterUndefined: Self = StObject.set(x, "optimizeFilter", js.undefined)
      
      inline def setOptimizeFont(value: Boolean): Self = StObject.set(x, "optimizeFont", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFontUndefined: Self = StObject.set(x, "optimizeFont", js.undefined)
      
      inline def setOptimizeFontWeight(value: Boolean): Self = StObject.set(x, "optimizeFontWeight", value.asInstanceOf[js.Any])
      
      inline def setOptimizeFontWeightUndefined: Self = StObject.set(x, "optimizeFontWeight", js.undefined)
      
      inline def setOptimizeOutline(value: Boolean): Self = StObject.set(x, "optimizeOutline", value.asInstanceOf[js.Any])
      
      inline def setOptimizeOutlineUndefined: Self = StObject.set(x, "optimizeOutline", js.undefined)
      
      inline def setRemoveEmpty(value: Boolean): Self = StObject.set(x, "removeEmpty", value.asInstanceOf[js.Any])
      
      inline def setRemoveEmptyUndefined: Self = StObject.set(x, "removeEmpty", js.undefined)
      
      inline def setRemoveNegativePaddings(value: Boolean): Self = StObject.set(x, "removeNegativePaddings", value.asInstanceOf[js.Any])
      
      inline def setRemoveNegativePaddingsUndefined: Self = StObject.set(x, "removeNegativePaddings", js.undefined)
      
      inline def setRemoveQuotes(value: Boolean): Self = StObject.set(x, "removeQuotes", value.asInstanceOf[js.Any])
      
      inline def setRemoveQuotesUndefined: Self = StObject.set(x, "removeQuotes", js.undefined)
      
      inline def setRemoveWhitespace(value: Boolean): Self = StObject.set(x, "removeWhitespace", value.asInstanceOf[js.Any])
      
      inline def setRemoveWhitespaceUndefined: Self = StObject.set(x, "removeWhitespace", js.undefined)
      
      inline def setReplaceMultipleZeros(value: Boolean): Self = StObject.set(x, "replaceMultipleZeros", value.asInstanceOf[js.Any])
      
      inline def setReplaceMultipleZerosUndefined: Self = StObject.set(x, "replaceMultipleZeros", js.undefined)
      
      inline def setReplaceTimeUnits(value: Boolean): Self = StObject.set(x, "replaceTimeUnits", value.asInstanceOf[js.Any])
      
      inline def setReplaceTimeUnitsUndefined: Self = StObject.set(x, "replaceTimeUnits", js.undefined)
      
      inline def setReplaceZeroUnits(value: Boolean): Self = StObject.set(x, "replaceZeroUnits", value.asInstanceOf[js.Any])
      
      inline def setReplaceZeroUnitsUndefined: Self = StObject.set(x, "replaceZeroUnits", js.undefined)
      
      inline def setRoundingPrecision(value: Boolean): Self = StObject.set(x, "roundingPrecision", value.asInstanceOf[js.Any])
      
      inline def setRoundingPrecisionUndefined: Self = StObject.set(x, "roundingPrecision", js.undefined)
      
      inline def setSelectorsSortingMethod(value: standard | natural | none): Self = StObject.set(x, "selectorsSortingMethod", value.asInstanceOf[js.Any])
      
      inline def setSelectorsSortingMethodUndefined: Self = StObject.set(x, "selectorsSortingMethod", js.undefined)
      
      inline def setSpecialComments(value: String): Self = StObject.set(x, "specialComments", value.asInstanceOf[js.Any])
      
      inline def setSpecialCommentsUndefined: Self = StObject.set(x, "specialComments", js.undefined)
      
      inline def setTidyAtRules(value: Boolean): Self = StObject.set(x, "tidyAtRules", value.asInstanceOf[js.Any])
      
      inline def setTidyAtRulesUndefined: Self = StObject.set(x, "tidyAtRules", js.undefined)
      
      inline def setTidyBlockScopes(value: Boolean): Self = StObject.set(x, "tidyBlockScopes", value.asInstanceOf[js.Any])
      
      inline def setTidyBlockScopesUndefined: Self = StObject.set(x, "tidyBlockScopes", js.undefined)
      
      inline def setTidySelectors(value: Boolean): Self = StObject.set(x, "tidySelectors", value.asInstanceOf[js.Any])
      
      inline def setTidySelectorsUndefined: Self = StObject.set(x, "tidySelectors", js.undefined)
      
      inline def setTransform(
        value: (/* propertyName */ String, /* propertyValue */ String, /* selector */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait AroundSelectorRelation extends StObject {
    
    /**
      * Controls if spaces come around selector relations; e.g. `div > a`; defaults to `false`
      */
    var aroundSelectorRelation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a space comes before a block begins; e.g. `.block {`; defaults to `false`
      */
    var beforeBlockBegins: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls if a space comes before a value; e.g. `width: 1rem`; defaults to `false`
      */
    var beforeValue: js.UndefOr[Boolean] = js.undefined
  }
  object AroundSelectorRelation {
    
    inline def apply(): AroundSelectorRelation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AroundSelectorRelation]
    }
    
    extension [Self <: AroundSelectorRelation](x: Self) {
      
      inline def setAroundSelectorRelation(value: Boolean): Self = StObject.set(x, "aroundSelectorRelation", value.asInstanceOf[js.Any])
      
      inline def setAroundSelectorRelationUndefined: Self = StObject.set(x, "aroundSelectorRelation", js.undefined)
      
      inline def setBeforeBlockBegins(value: Boolean): Self = StObject.set(x, "beforeBlockBegins", value.asInstanceOf[js.Any])
      
      inline def setBeforeBlockBeginsUndefined: Self = StObject.set(x, "beforeBlockBegins", js.undefined)
      
      inline def setBeforeValue(value: Boolean): Self = StObject.set(x, "beforeValue", value.asInstanceOf[js.Any])
      
      inline def setBeforeValueUndefined: Self = StObject.set(x, "beforeValue", js.undefined)
    }
  }
  
  trait BackgroundClipMerging extends StObject {
    
    /**
      * Controls background-clip merging into shorthand; defaults to `true`
      */
    var backgroundClipMerging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls background-origin merging into shorthand; defaults to `true`
      */
    var backgroundOriginMerging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls background-size merging into shorthand; defaults to `true`
      */
    var backgroundSizeMerging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * controls color optimizations; defaults to `true`
      */
    var colors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls keeping IE bang hack; defaults to `false`
      */
    var ieBangHack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls keeping IE `filter` / `-ms-filter`; defaults to `false`
      */
    var ieFilters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls keeping IE prefix hack; defaults to `false`
      */
    var iePrefixHack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls keeping IE suffix hack; defaults to `false`
      */
    var ieSuffixHack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls property merging based on understandably; defaults to `true`
      */
    var merging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls shortening pixel units into `pc`, `pt`, or `in` units; defaults to `false`
      */
    var shorterLengthUnits: js.UndefOr[`false`] = js.undefined
    
    /**
      * Controls keeping space after closing brace - `url() no-repeat` into `url()no-repeat`; defaults to `true`
      */
    var spaceAfterClosingBrace: js.UndefOr[`true`] = js.undefined
    
    /**
      * Controls keeping quoting inside `url()`; defaults to `false`
      */
    var urlQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removal of units `0` value; defaults to `true`
      */
    var zeroUnits: js.UndefOr[Boolean] = js.undefined
  }
  object BackgroundClipMerging {
    
    inline def apply(): BackgroundClipMerging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundClipMerging]
    }
    
    extension [Self <: BackgroundClipMerging](x: Self) {
      
      inline def setBackgroundClipMerging(value: Boolean): Self = StObject.set(x, "backgroundClipMerging", value.asInstanceOf[js.Any])
      
      inline def setBackgroundClipMergingUndefined: Self = StObject.set(x, "backgroundClipMerging", js.undefined)
      
      inline def setBackgroundOriginMerging(value: Boolean): Self = StObject.set(x, "backgroundOriginMerging", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOriginMergingUndefined: Self = StObject.set(x, "backgroundOriginMerging", js.undefined)
      
      inline def setBackgroundSizeMerging(value: Boolean): Self = StObject.set(x, "backgroundSizeMerging", value.asInstanceOf[js.Any])
      
      inline def setBackgroundSizeMergingUndefined: Self = StObject.set(x, "backgroundSizeMerging", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setIeBangHack(value: Boolean): Self = StObject.set(x, "ieBangHack", value.asInstanceOf[js.Any])
      
      inline def setIeBangHackUndefined: Self = StObject.set(x, "ieBangHack", js.undefined)
      
      inline def setIeFilters(value: Boolean): Self = StObject.set(x, "ieFilters", value.asInstanceOf[js.Any])
      
      inline def setIeFiltersUndefined: Self = StObject.set(x, "ieFilters", js.undefined)
      
      inline def setIePrefixHack(value: Boolean): Self = StObject.set(x, "iePrefixHack", value.asInstanceOf[js.Any])
      
      inline def setIePrefixHackUndefined: Self = StObject.set(x, "iePrefixHack", js.undefined)
      
      inline def setIeSuffixHack(value: Boolean): Self = StObject.set(x, "ieSuffixHack", value.asInstanceOf[js.Any])
      
      inline def setIeSuffixHackUndefined: Self = StObject.set(x, "ieSuffixHack", js.undefined)
      
      inline def setMerging(value: Boolean): Self = StObject.set(x, "merging", value.asInstanceOf[js.Any])
      
      inline def setMergingUndefined: Self = StObject.set(x, "merging", js.undefined)
      
      inline def setShorterLengthUnits(value: `false`): Self = StObject.set(x, "shorterLengthUnits", value.asInstanceOf[js.Any])
      
      inline def setShorterLengthUnitsUndefined: Self = StObject.set(x, "shorterLengthUnits", js.undefined)
      
      inline def setSpaceAfterClosingBrace(value: `true`): Self = StObject.set(x, "spaceAfterClosingBrace", value.asInstanceOf[js.Any])
      
      inline def setSpaceAfterClosingBraceUndefined: Self = StObject.set(x, "spaceAfterClosingBrace", js.undefined)
      
      inline def setUrlQuotes(value: Boolean): Self = StObject.set(x, "urlQuotes", value.asInstanceOf[js.Any])
      
      inline def setUrlQuotesUndefined: Self = StObject.set(x, "urlQuotes", js.undefined)
      
      inline def setZeroUnits(value: Boolean): Self = StObject.set(x, "zeroUnits", value.asInstanceOf[js.Any])
      
      inline def setZeroUnitsUndefined: Self = StObject.set(x, "zeroUnits", js.undefined)
    }
  }
  
  trait Ch extends StObject {
    
    /**
      * Controls treating `ch` as a supported unit; defaults to `true`
      */
    var ch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `in` as a supported unit; defaults to `true`
      */
    var in: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `pc` as a supported unit; defaults to `true`
      */
    var pc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `pt` as a supported unit; defaults to `true`
      */
    var pt: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `rem` as a supported unit; defaults to `true`
      */
    var rem: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `vh` as a supported unit; defaults to `true`
      */
    var vh: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `vm` as a supported unit; defaults to `true`
      */
    var vm: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `vmax` as a supported unit; defaults to `true`
      */
    var vmax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls treating `vmin` as a supported unit; defaults to `true`
      */
    var vmin: js.UndefOr[Boolean] = js.undefined
  }
  object Ch {
    
    inline def apply(): Ch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ch]
    }
    
    extension [Self <: Ch](x: Self) {
      
      inline def setCh(value: Boolean): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setPc(value: Boolean): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
      
      inline def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
      
      inline def setPt(value: Boolean): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
      
      inline def setPtUndefined: Self = StObject.set(x, "pt", js.undefined)
      
      inline def setRem(value: Boolean): Self = StObject.set(x, "rem", value.asInstanceOf[js.Any])
      
      inline def setRemUndefined: Self = StObject.set(x, "rem", js.undefined)
      
      inline def setVh(value: Boolean): Self = StObject.set(x, "vh", value.asInstanceOf[js.Any])
      
      inline def setVhUndefined: Self = StObject.set(x, "vh", js.undefined)
      
      inline def setVm(value: Boolean): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
      
      inline def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
      
      inline def setVmax(value: Boolean): Self = StObject.set(x, "vmax", value.asInstanceOf[js.Any])
      
      inline def setVmaxUndefined: Self = StObject.set(x, "vmax", js.undefined)
      
      inline def setVmin(value: Boolean): Self = StObject.set(x, "vmin", value.asInstanceOf[js.Any])
      
      inline def setVminUndefined: Self = StObject.set(x, "vmin", js.undefined)
    }
  }
  
  trait Efficiency extends StObject {
    
    /**
      * `(originalSize - minifiedSize) / originalSize`, e.g. 0.25 if size is reduced from 100 bytes to 75 bytes
      */
    var efficiency: Double
    
    /**
      * Optimized content size
      */
    var minifiedSize: Double
    
    /**
      * Original content size after import inlining
      */
    var originalSize: Double
    
    /**
      * Time spent on optimizations in milliseconds
      */
    var timeSpent: Double
  }
  object Efficiency {
    
    inline def apply(efficiency: Double, minifiedSize: Double, originalSize: Double, timeSpent: Double): Efficiency = {
      val __obj = js.Dynamic.literal(efficiency = efficiency.asInstanceOf[js.Any], minifiedSize = minifiedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any], timeSpent = timeSpent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Efficiency]
    }
    
    extension [Self <: Efficiency](x: Self) {
      
      inline def setEfficiency(value: Double): Self = StObject.set(x, "efficiency", value.asInstanceOf[js.Any])
      
      inline def setMinifiedSize(value: Double): Self = StObject.set(x, "minifiedSize", value.asInstanceOf[js.Any])
      
      inline def setOriginalSize(value: Double): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
      
      inline def setTimeSpent(value: Double): Self = StObject.set(x, "timeSpent", value.asInstanceOf[js.Any])
    }
  }
  
  trait MergeAdjacentRules extends StObject {
    
    /**
      * Sets all optimizations at this level unless otherwise specified
      */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls adjacent rules merging; defaults to true
      */
    var mergeAdjacentRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls merging properties into shorthands; defaults to true
      */
    var mergeIntoShorthands: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls `@media` merging; defaults to true
      */
    var mergeMedia: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls non-adjacent rule merging; defaults to true
      */
    var mergeNonAdjacentRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls semantic merging; defaults to false
      */
    var mergeSemantically: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls property overriding based on understandably; defaults to true
      */
    var overrideProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls non-adjacent rule reducing; defaults to true
      */
    var reduceNonAdjacentRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls duplicate `@font-face` removing; defaults to true
      */
    var removeDuplicateFontRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls duplicate `@media` removing; defaults to true
      */
    var removeDuplicateMediaBlocks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls duplicate rules removing; defaults to true
      */
    var removeDuplicateRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls removing empty rules and nested blocks; defaults to `true`
      */
    var removeEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls unused at rule removing; defaults to false (available since 4.1.0)
      */
    var removeUnusedAtRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls rule restructuring; defaults to false
      */
    var restructureRules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls which properties won't be optimized, defaults to `[]` which means all will be optimized (since 4.1.0)
      */
    var skipProperties: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MergeAdjacentRules {
    
    inline def apply(): MergeAdjacentRules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeAdjacentRules]
    }
    
    extension [Self <: MergeAdjacentRules](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setMergeAdjacentRules(value: Boolean): Self = StObject.set(x, "mergeAdjacentRules", value.asInstanceOf[js.Any])
      
      inline def setMergeAdjacentRulesUndefined: Self = StObject.set(x, "mergeAdjacentRules", js.undefined)
      
      inline def setMergeIntoShorthands(value: Boolean): Self = StObject.set(x, "mergeIntoShorthands", value.asInstanceOf[js.Any])
      
      inline def setMergeIntoShorthandsUndefined: Self = StObject.set(x, "mergeIntoShorthands", js.undefined)
      
      inline def setMergeMedia(value: Boolean): Self = StObject.set(x, "mergeMedia", value.asInstanceOf[js.Any])
      
      inline def setMergeMediaUndefined: Self = StObject.set(x, "mergeMedia", js.undefined)
      
      inline def setMergeNonAdjacentRules(value: Boolean): Self = StObject.set(x, "mergeNonAdjacentRules", value.asInstanceOf[js.Any])
      
      inline def setMergeNonAdjacentRulesUndefined: Self = StObject.set(x, "mergeNonAdjacentRules", js.undefined)
      
      inline def setMergeSemantically(value: Boolean): Self = StObject.set(x, "mergeSemantically", value.asInstanceOf[js.Any])
      
      inline def setMergeSemanticallyUndefined: Self = StObject.set(x, "mergeSemantically", js.undefined)
      
      inline def setOverrideProperties(value: Boolean): Self = StObject.set(x, "overrideProperties", value.asInstanceOf[js.Any])
      
      inline def setOverridePropertiesUndefined: Self = StObject.set(x, "overrideProperties", js.undefined)
      
      inline def setReduceNonAdjacentRules(value: Boolean): Self = StObject.set(x, "reduceNonAdjacentRules", value.asInstanceOf[js.Any])
      
      inline def setReduceNonAdjacentRulesUndefined: Self = StObject.set(x, "reduceNonAdjacentRules", js.undefined)
      
      inline def setRemoveDuplicateFontRules(value: Boolean): Self = StObject.set(x, "removeDuplicateFontRules", value.asInstanceOf[js.Any])
      
      inline def setRemoveDuplicateFontRulesUndefined: Self = StObject.set(x, "removeDuplicateFontRules", js.undefined)
      
      inline def setRemoveDuplicateMediaBlocks(value: Boolean): Self = StObject.set(x, "removeDuplicateMediaBlocks", value.asInstanceOf[js.Any])
      
      inline def setRemoveDuplicateMediaBlocksUndefined: Self = StObject.set(x, "removeDuplicateMediaBlocks", js.undefined)
      
      inline def setRemoveDuplicateRules(value: Boolean): Self = StObject.set(x, "removeDuplicateRules", value.asInstanceOf[js.Any])
      
      inline def setRemoveDuplicateRulesUndefined: Self = StObject.set(x, "removeDuplicateRules", js.undefined)
      
      inline def setRemoveEmpty(value: Boolean): Self = StObject.set(x, "removeEmpty", value.asInstanceOf[js.Any])
      
      inline def setRemoveEmptyUndefined: Self = StObject.set(x, "removeEmpty", js.undefined)
      
      inline def setRemoveUnusedAtRules(value: Boolean): Self = StObject.set(x, "removeUnusedAtRules", value.asInstanceOf[js.Any])
      
      inline def setRemoveUnusedAtRulesUndefined: Self = StObject.set(x, "removeUnusedAtRules", js.undefined)
      
      inline def setRestructureRules(value: Boolean): Self = StObject.set(x, "restructureRules", value.asInstanceOf[js.Any])
      
      inline def setRestructureRulesUndefined: Self = StObject.set(x, "restructureRules", js.undefined)
      
      inline def setSkipProperties(value: js.Array[String]): Self = StObject.set(x, "skipProperties", value.asInstanceOf[js.Any])
      
      inline def setSkipPropertiesUndefined: Self = StObject.set(x, "skipProperties", js.undefined)
      
      inline def setSkipPropertiesVarargs(value: String*): Self = StObject.set(x, "skipProperties", js.Array(value*))
    }
  }
  
  trait Opacity extends StObject {
    
    /**
      * Controls `rgba()` / `hsla()` color support; defaults to `true`
      */
    var opacity: js.UndefOr[Boolean] = js.undefined
  }
  object Opacity {
    
    inline def apply(): Opacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opacity]
    }
    
    extension [Self <: Opacity](x: Self) {
      
      inline def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait SourceMap extends StObject {
    
    /**
      * The source map of the file, if needed
      */
    var sourceMap: js.UndefOr[RawSourceMap | String] = js.undefined
    
    /**
      * The contents of the file, should be css
      */
    var styles: String
  }
  object SourceMap {
    
    inline def apply(styles: String): SourceMap = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMap]
    }
    
    extension [Self <: SourceMap](x: Self) {
      
      inline def setSourceMap(value: RawSourceMap | String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
}

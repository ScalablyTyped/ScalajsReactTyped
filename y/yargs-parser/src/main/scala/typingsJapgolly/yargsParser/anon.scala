package typingsJapgolly.yargsParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Boolean extends StObject {
    
    var boolean: js.UndefOr[scala.Boolean] = js.undefined
    
    var key: String
    
    var number: js.UndefOr[scala.Boolean] = js.undefined
  }
  object Boolean {
    
    inline def apply(key: String): Boolean = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boolean]
    }
    
    extension [Self <: Boolean](x: Self) {
      
      inline def setBoolean(value: scala.Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: scala.Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  /* Inlined std.Partial<yargs-parser.yargs-parser.Configuration> */
  trait PartialConfiguration extends StObject {
    
    var `boolean-negation`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `camel-case-expansion`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `combine-arrays`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `dot-notation`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `duplicate-arguments-array`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `flatten-duplicate-arrays`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `greedy-arrays`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `halt-at-non-option`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `nargs-eats-options`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `negation-prefix`: js.UndefOr[String] = js.undefined
    
    var `parse-numbers`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `parse-positional-numbers`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `populate--`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `set-placeholder-key`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `short-option-groups`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `strip-aliased`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `strip-dashed`: js.UndefOr[scala.Boolean] = js.undefined
    
    var `unknown-options-as-args`: js.UndefOr[scala.Boolean] = js.undefined
  }
  object PartialConfiguration {
    
    inline def apply(): PartialConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfiguration]
    }
    
    extension [Self <: PartialConfiguration](x: Self) {
      
      inline def `setBoolean-negation`(value: scala.Boolean): Self = StObject.set(x, "boolean-negation", value.asInstanceOf[js.Any])
      
      inline def `setBoolean-negationUndefined`: Self = StObject.set(x, "boolean-negation", js.undefined)
      
      inline def `setCamel-case-expansion`(value: scala.Boolean): Self = StObject.set(x, "camel-case-expansion", value.asInstanceOf[js.Any])
      
      inline def `setCamel-case-expansionUndefined`: Self = StObject.set(x, "camel-case-expansion", js.undefined)
      
      inline def `setCombine-arrays`(value: scala.Boolean): Self = StObject.set(x, "combine-arrays", value.asInstanceOf[js.Any])
      
      inline def `setCombine-arraysUndefined`: Self = StObject.set(x, "combine-arrays", js.undefined)
      
      inline def `setDot-notation`(value: scala.Boolean): Self = StObject.set(x, "dot-notation", value.asInstanceOf[js.Any])
      
      inline def `setDot-notationUndefined`: Self = StObject.set(x, "dot-notation", js.undefined)
      
      inline def `setDuplicate-arguments-array`(value: scala.Boolean): Self = StObject.set(x, "duplicate-arguments-array", value.asInstanceOf[js.Any])
      
      inline def `setDuplicate-arguments-arrayUndefined`: Self = StObject.set(x, "duplicate-arguments-array", js.undefined)
      
      inline def `setFlatten-duplicate-arrays`(value: scala.Boolean): Self = StObject.set(x, "flatten-duplicate-arrays", value.asInstanceOf[js.Any])
      
      inline def `setFlatten-duplicate-arraysUndefined`: Self = StObject.set(x, "flatten-duplicate-arrays", js.undefined)
      
      inline def `setGreedy-arrays`(value: scala.Boolean): Self = StObject.set(x, "greedy-arrays", value.asInstanceOf[js.Any])
      
      inline def `setGreedy-arraysUndefined`: Self = StObject.set(x, "greedy-arrays", js.undefined)
      
      inline def `setHalt-at-non-option`(value: scala.Boolean): Self = StObject.set(x, "halt-at-non-option", value.asInstanceOf[js.Any])
      
      inline def `setHalt-at-non-optionUndefined`: Self = StObject.set(x, "halt-at-non-option", js.undefined)
      
      inline def `setNargs-eats-options`(value: scala.Boolean): Self = StObject.set(x, "nargs-eats-options", value.asInstanceOf[js.Any])
      
      inline def `setNargs-eats-optionsUndefined`: Self = StObject.set(x, "nargs-eats-options", js.undefined)
      
      inline def `setNegation-prefix`(value: String): Self = StObject.set(x, "negation-prefix", value.asInstanceOf[js.Any])
      
      inline def `setNegation-prefixUndefined`: Self = StObject.set(x, "negation-prefix", js.undefined)
      
      inline def `setParse-numbers`(value: scala.Boolean): Self = StObject.set(x, "parse-numbers", value.asInstanceOf[js.Any])
      
      inline def `setParse-numbersUndefined`: Self = StObject.set(x, "parse-numbers", js.undefined)
      
      inline def `setParse-positional-numbers`(value: scala.Boolean): Self = StObject.set(x, "parse-positional-numbers", value.asInstanceOf[js.Any])
      
      inline def `setParse-positional-numbersUndefined`: Self = StObject.set(x, "parse-positional-numbers", js.undefined)
      
      inline def `setPopulate--`(value: scala.Boolean): Self = StObject.set(x, "populate--", value.asInstanceOf[js.Any])
      
      inline def `setPopulate--Undefined`: Self = StObject.set(x, "populate--", js.undefined)
      
      inline def `setSet-placeholder-key`(value: scala.Boolean): Self = StObject.set(x, "set-placeholder-key", value.asInstanceOf[js.Any])
      
      inline def `setSet-placeholder-keyUndefined`: Self = StObject.set(x, "set-placeholder-key", js.undefined)
      
      inline def `setShort-option-groups`(value: scala.Boolean): Self = StObject.set(x, "short-option-groups", value.asInstanceOf[js.Any])
      
      inline def `setShort-option-groupsUndefined`: Self = StObject.set(x, "short-option-groups", js.undefined)
      
      inline def `setStrip-aliased`(value: scala.Boolean): Self = StObject.set(x, "strip-aliased", value.asInstanceOf[js.Any])
      
      inline def `setStrip-aliasedUndefined`: Self = StObject.set(x, "strip-aliased", js.undefined)
      
      inline def `setStrip-dashed`(value: scala.Boolean): Self = StObject.set(x, "strip-dashed", value.asInstanceOf[js.Any])
      
      inline def `setStrip-dashedUndefined`: Self = StObject.set(x, "strip-dashed", js.undefined)
      
      inline def `setUnknown-options-as-args`(value: scala.Boolean): Self = StObject.set(x, "unknown-options-as-args", value.asInstanceOf[js.Any])
      
      inline def `setUnknown-options-as-argsUndefined`: Self = StObject.set(x, "unknown-options-as-args", js.undefined)
    }
  }
}

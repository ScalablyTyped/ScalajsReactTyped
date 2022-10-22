package typingsJapgolly.ajvKeywords

import typingsJapgolly.ajv.distTypesMod.MacroKeywordDefinition
import typingsJapgolly.ajvKeywords.distDefinitionsTypesMod.GetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsRangeMod_ {
  
  @JSImport("ajv-keywords/dist/definitions/_range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(keyword: RangeKwd): GetDefinition[MacroKeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyword.asInstanceOf[js.Any]).asInstanceOf[GetDefinition[MacroKeywordDefinition]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.range
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.exclusiveRange
  */
  trait RangeKwd extends StObject
  object RangeKwd {
    
    inline def exclusiveRange: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.exclusiveRange = "exclusiveRange".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.exclusiveRange]
    
    inline def range: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.range = "range".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.range]
  }
}

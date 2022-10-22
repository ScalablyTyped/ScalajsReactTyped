package typingsJapgolly.ajvKeywords

import typingsJapgolly.ajv.distTypesMod.MacroKeywordDefinition
import typingsJapgolly.ajvKeywords.distDefinitionsTypesMod.GetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsRequiredMod {
  
  @JSImport("ajv-keywords/dist/definitions/_required", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(keyword: RequiredKwd): GetDefinition[MacroKeywordDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(keyword.asInstanceOf[js.Any]).asInstanceOf[GetDefinition[MacroKeywordDefinition]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.anyRequired
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.oneRequired
  */
  trait RequiredKwd extends StObject
  object RequiredKwd {
    
    inline def anyRequired: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.anyRequired = "anyRequired".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.anyRequired]
    
    inline def oneRequired: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.oneRequired = "oneRequired".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.oneRequired]
  }
}

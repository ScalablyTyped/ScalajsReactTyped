package typingsJapgolly.ajvKeywords

import typingsJapgolly.ajv.distTypesMod.ErrorNoParams
import typingsJapgolly.ajv.distTypesMod.Vocabulary
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.allRequired
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.anyRequired
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.deepProperties
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.deepRequired
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.dynamicDefaults
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.exclusiveRange
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.instanceof
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.oneRequired
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.prohibited
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.range
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.regexp
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.transform
import typingsJapgolly.ajvKeywords.ajvKeywordsStrings.uniqueItemProperties
import typingsJapgolly.ajvKeywords.distDefinitionsPatternRequiredMod.PatternRequiredError
import typingsJapgolly.ajvKeywords.distDefinitionsSelectMod.SelectError
import typingsJapgolly.ajvKeywords.distDefinitionsTypesMod.DefinitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsMod {
  
  @JSImport("ajv-keywords/dist/definitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Vocabulary]
  inline def default(opts: DefinitionOptions): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Vocabulary]
  
  type AjvKeywordsError = PatternRequiredError | SelectError | (ErrorNoParams[
    range | exclusiveRange | anyRequired | oneRequired | allRequired | deepProperties | deepRequired | dynamicDefaults | instanceof | prohibited | regexp | transform | uniqueItemProperties, 
    Any
  ])
}

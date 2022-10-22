package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.pattern
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.anon.Pattern
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationPatternMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/pattern", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type PatternError = ErrorObject[pattern, Pattern, String | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationPatternMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.required
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.anon.MissingPropertyString
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationRequiredMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/required", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type RequiredError = ErrorObject[required, MissingPropertyString, js.Array[String] | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationRequiredMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

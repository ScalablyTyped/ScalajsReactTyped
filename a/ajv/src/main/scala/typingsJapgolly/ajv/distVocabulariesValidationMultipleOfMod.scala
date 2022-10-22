package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.multipleOf
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.anon.MultipleOf
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationMultipleOfMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/multipleOf", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type MultipleOfError = ErrorObject[multipleOf, MultipleOf, Double | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationMultipleOfMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

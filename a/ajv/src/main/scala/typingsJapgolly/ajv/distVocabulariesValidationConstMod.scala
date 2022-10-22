package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.const
import typingsJapgolly.ajv.anon.AllowedValue
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationConstMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/const", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type ConstError = ErrorObject[const, AllowedValue, Any]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationConstMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

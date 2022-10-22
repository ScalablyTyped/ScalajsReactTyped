package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.`if`
import typingsJapgolly.ajv.anon.FailingKeyword
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorIfMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/if", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type IfKeywordError = ErrorObject[`if`, FailingKeyword, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorIfMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

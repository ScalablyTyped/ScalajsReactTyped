package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.contains
import typingsJapgolly.ajv.anon.MaxContains
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorContainsMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/contains", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type ContainsError = ErrorObject[contains, MaxContains, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorContainsMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.not
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorNoParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorNotMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/not", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type NotKeywordError = ErrorNoParams[not, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorNotMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

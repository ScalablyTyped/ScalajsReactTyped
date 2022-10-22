package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.oneOf
import typingsJapgolly.ajv.anon.PassingSchemas
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorOneOfMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/oneOf", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type OneOfError = ErrorObject[oneOf, PassingSchemas, js.Array[AnySchema]]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorOneOfMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

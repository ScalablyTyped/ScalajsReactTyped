package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.unevaluatedItems
import typingsJapgolly.ajv.anon.Limit
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesUnevaluatedUnevaluatedItemsMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/unevaluated/unevaluatedItems", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type UnevaluatedItemsError = ErrorObject[unevaluatedItems, Limit, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesUnevaluatedUnevaluatedItemsMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

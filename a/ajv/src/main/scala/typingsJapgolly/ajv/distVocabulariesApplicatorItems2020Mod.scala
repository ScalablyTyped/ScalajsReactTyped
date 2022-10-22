package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.items
import typingsJapgolly.ajv.anon.Limit
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorItems2020Mod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/items2020", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type ItemsError = ErrorObject[items, Limit, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorItems2020Mod.foo` */
  override def _to: CodeKeywordDefinition = default
}

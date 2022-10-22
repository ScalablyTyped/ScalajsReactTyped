package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.uniqueItems
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.anon.I
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationUniqueItemsMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation/uniqueItems", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type UniqueItemsError = ErrorObject[uniqueItems, I, Boolean | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationUniqueItemsMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

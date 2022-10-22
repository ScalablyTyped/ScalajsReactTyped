package typingsJapgolly.ajv

import typingsJapgolly.ajv.ajvStrings.additionalItems
import typingsJapgolly.ajv.anon.Limit
import typingsJapgolly.ajv.distCompileValidateMod.KeywordCxt
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorAdditionalItemsMod {
  
  @JSImport("ajv/dist/vocabularies/applicator/additionalItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/vocabularies/applicator/additionalItems", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  inline def validateAdditionalItems(cxt: KeywordCxt, items: js.Array[AnySchema]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAdditionalItems")(cxt.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AdditionalItemsError = ErrorObject[additionalItems, Limit, AnySchema]
}

package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.additionalProperties
import typingsJapgolly.ajv.anon.AdditionalProperty
import typingsJapgolly.ajv.distTypesMod.AddedKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorAdditionalPropertiesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/additionalProperties", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition & AddedKeywordDefinition = js.native
  
  type AdditionalPropertiesError = ErrorObject[additionalProperties, AdditionalProperty, AnySchema]
  
  type _To = CodeKeywordDefinition & AddedKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorAdditionalPropertiesMod.foo` */
  override def _to: CodeKeywordDefinition & AddedKeywordDefinition = default
}

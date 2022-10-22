package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.unevaluatedProperties
import typingsJapgolly.ajv.anon.UnevaluatedProperty
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesUnevaluatedUnevaluatedPropertiesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/unevaluated/unevaluatedProperties", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type UnevaluatedPropertiesError = ErrorObject[unevaluatedProperties, UnevaluatedProperty, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesUnevaluatedUnevaluatedPropertiesMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

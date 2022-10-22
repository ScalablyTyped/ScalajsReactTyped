package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.propertyNames
import typingsJapgolly.ajv.anon.PropertyName
import typingsJapgolly.ajv.distTypesMod.AnySchema
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorPropertyNamesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/applicator/propertyNames", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type PropertyNamesError = ErrorObject[propertyNames, PropertyName, AnySchema]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesApplicatorPropertyNamesMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

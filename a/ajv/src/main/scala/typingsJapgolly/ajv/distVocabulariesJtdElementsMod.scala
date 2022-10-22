package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.array
import typingsJapgolly.ajv.ajvStrings.elements
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.SchemaObject
import typingsJapgolly.ajv.distVocabulariesJtdErrorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdElementsMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/elements", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type JTDElementsError = JTDTypeError[elements, array, SchemaObject]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesJtdElementsMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

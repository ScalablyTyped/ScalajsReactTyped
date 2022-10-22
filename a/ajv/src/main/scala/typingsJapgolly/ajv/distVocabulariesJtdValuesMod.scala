package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.`object`
import typingsJapgolly.ajv.ajvStrings.values
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.SchemaObject
import typingsJapgolly.ajv.distVocabulariesJtdErrorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdValuesMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/values", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type JTDValuesError = JTDTypeError[values, `object`, SchemaObject]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesJtdValuesMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

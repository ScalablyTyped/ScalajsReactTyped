package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.format
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.anon.Format
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesFormatFormatMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/format/format", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type FormatError = ErrorObject[format, Format, String | Data]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesFormatFormatMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

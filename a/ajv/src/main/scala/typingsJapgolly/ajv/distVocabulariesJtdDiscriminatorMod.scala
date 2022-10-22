package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.`object`
import typingsJapgolly.ajv.ajvStrings.discriminator
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Mapping
import typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Tag
import typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrErrorObj
import typingsJapgolly.ajv.distVocabulariesJtdErrorMod.JTDTypeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdDiscriminatorMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/discriminator", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type JTDDiscriminatorError = (JTDTypeError[discriminator, `object`, String]) | (DiscrErrorObj[Mapping | Tag])
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesJtdDiscriminatorMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

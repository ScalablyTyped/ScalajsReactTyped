package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Mapping
import typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrError.Tag
import typingsJapgolly.ajv.distVocabulariesDiscriminatorTypesMod.DiscrErrorObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesDiscriminatorMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/discriminator", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  type DiscriminatorError = DiscrErrorObj[Mapping | Tag]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesDiscriminatorMod.foo` */
  override def _to: CodeKeywordDefinition = default
}

package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.ajvStrings.maxItems
import typingsJapgolly.ajv.ajvStrings.maxLength
import typingsJapgolly.ajv.ajvStrings.maxProperties
import typingsJapgolly.ajv.ajvStrings.minItems
import typingsJapgolly.ajv.ajvStrings.minLength
import typingsJapgolly.ajv.ajvStrings.minProperties
import typingsJapgolly.ajv.anon.Data
import typingsJapgolly.ajv.anon.Limit
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import typingsJapgolly.ajv.distTypesMod.Vocabulary
import typingsJapgolly.ajv.distVocabulariesValidationConstMod.ConstError
import typingsJapgolly.ajv.distVocabulariesValidationEnumMod.EnumError
import typingsJapgolly.ajv.distVocabulariesValidationLimitNumberMod.LimitNumberError
import typingsJapgolly.ajv.distVocabulariesValidationMultipleOfMod.MultipleOfError
import typingsJapgolly.ajv.distVocabulariesValidationPatternMod.PatternError
import typingsJapgolly.ajv.distVocabulariesValidationRequiredMod.RequiredError
import typingsJapgolly.ajv.distVocabulariesValidationUniqueItemsMod.UniqueItemsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesValidationMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/validation", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type LimitError = ErrorObject[
    maxItems | minItems | minProperties | maxProperties | minLength | maxLength, 
    Limit, 
    Double | Data
  ]
  
  type ValidationKeywordError = LimitError | LimitNumberError | MultipleOfError | PatternError | RequiredError | UniqueItemsError | ConstError | EnumError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesValidationMod.foo` */
  override def _to: Vocabulary = default
}

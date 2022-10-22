package typingsJapgolly.ajvDraft04

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distTypesMod.ErrorObject
import typingsJapgolly.ajv.distTypesMod.Vocabulary
import typingsJapgolly.ajv.distVocabulariesValidationConstMod.ConstError
import typingsJapgolly.ajv.distVocabulariesValidationEnumMod.EnumError
import typingsJapgolly.ajv.distVocabulariesValidationMultipleOfMod.MultipleOfError
import typingsJapgolly.ajv.distVocabulariesValidationPatternMod.PatternError
import typingsJapgolly.ajv.distVocabulariesValidationRequiredMod.RequiredError
import typingsJapgolly.ajv.distVocabulariesValidationUniqueItemsMod.UniqueItemsError
import typingsJapgolly.ajvDraft04.ajvDraft04Strings.maxItems
import typingsJapgolly.ajvDraft04.ajvDraft04Strings.maxLength
import typingsJapgolly.ajvDraft04.ajvDraft04Strings.maxProperties
import typingsJapgolly.ajvDraft04.ajvDraft04Strings.minItems
import typingsJapgolly.ajvDraft04.ajvDraft04Strings.minLength
import typingsJapgolly.ajvDraft04.ajvDraft04Strings.minProperties
import typingsJapgolly.ajvDraft04.anon.Data
import typingsJapgolly.ajvDraft04.anon.Limit
import typingsJapgolly.ajvDraft04.distVocabularyValidationLimitNumberMod.LimitNumberError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabularyValidationMod extends Shortcut {
  
  @JSImport("ajv-draft-04/dist/vocabulary/validation", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type LimitError = ErrorObject[
    maxItems | minItems | minProperties | maxProperties | minLength | maxLength, 
    Limit, 
    Double | Data
  ]
  
  type ValidationKeywordError = LimitError | LimitNumberError | MultipleOfError | PatternError | RequiredError | UniqueItemsError | ConstError | EnumError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `distVocabularyValidationMod.foo` */
  override def _to: Vocabulary = default
}

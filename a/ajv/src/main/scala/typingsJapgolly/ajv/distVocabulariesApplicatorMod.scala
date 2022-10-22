package typingsJapgolly.ajv

import typingsJapgolly.ajv.ajvStrings.`false schema`
import typingsJapgolly.ajv.distTypesMod.ErrorNoParams
import typingsJapgolly.ajv.distTypesMod.Vocabulary
import typingsJapgolly.ajv.distVocabulariesApplicatorAdditionalItemsMod.AdditionalItemsError
import typingsJapgolly.ajv.distVocabulariesApplicatorAdditionalPropertiesMod.AdditionalPropertiesError
import typingsJapgolly.ajv.distVocabulariesApplicatorAnyOfMod.AnyOfError
import typingsJapgolly.ajv.distVocabulariesApplicatorContainsMod.ContainsError
import typingsJapgolly.ajv.distVocabulariesApplicatorDependenciesMod.DependenciesError
import typingsJapgolly.ajv.distVocabulariesApplicatorIfMod.IfKeywordError
import typingsJapgolly.ajv.distVocabulariesApplicatorItems2020Mod.ItemsError
import typingsJapgolly.ajv.distVocabulariesApplicatorNotMod.NotKeywordError
import typingsJapgolly.ajv.distVocabulariesApplicatorOneOfMod.OneOfError
import typingsJapgolly.ajv.distVocabulariesApplicatorPropertyNamesMod.PropertyNamesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesApplicatorMod {
  
  @JSImport("ajv/dist/vocabularies/applicator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Vocabulary]
  inline def default(draft2020: Boolean): Vocabulary = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(draft2020.asInstanceOf[js.Any]).asInstanceOf[Vocabulary]
  
  type ApplicatorKeywordError = (ErrorNoParams[`false schema`, Any]) | AdditionalItemsError | ItemsError | ContainsError | AdditionalPropertiesError | DependenciesError | IfKeywordError | AnyOfError | OneOfError | NotKeywordError | PropertyNamesError
}

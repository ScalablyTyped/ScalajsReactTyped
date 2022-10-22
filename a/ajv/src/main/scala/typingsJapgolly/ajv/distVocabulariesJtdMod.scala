package typingsJapgolly.ajv

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distTypesMod.Vocabulary
import typingsJapgolly.ajv.distVocabulariesJtdDiscriminatorMod.JTDDiscriminatorError
import typingsJapgolly.ajv.distVocabulariesJtdElementsMod.JTDElementsError
import typingsJapgolly.ajv.distVocabulariesJtdEnumMod.JTDEnumError
import typingsJapgolly.ajv.distVocabulariesJtdPropertiesMod.JTDPropertiesError
import typingsJapgolly.ajv.distVocabulariesJtdTypeMod.JTDTypeError
import typingsJapgolly.ajv.distVocabulariesJtdValuesMod.JTDValuesError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd", JSImport.Default)
  @js.native
  val default: Vocabulary = js.native
  
  type JTDErrorObject = JTDTypeError | JTDEnumError | JTDElementsError | JTDPropertiesError | JTDDiscriminatorError | JTDValuesError
  
  type _To = Vocabulary
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesJtdMod.foo` */
  override def _to: Vocabulary = default
}

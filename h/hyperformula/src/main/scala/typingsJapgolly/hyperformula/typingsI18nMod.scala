package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellMod.TranslatableErrorType
import typingsJapgolly.hyperformula.typingsI18nTranslationPackageMod.RawTranslationPackage
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsI18nMod {
  
  @JSImport("hyperformula/typings/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyperformula/typings/i18n", "TranslationPackage")
  @js.native
  open class TranslationPackage protected ()
    extends typingsJapgolly.hyperformula.typingsI18nTranslationPackageMod.TranslationPackage {
    def this(functions: TranslationSet, errors: ErrorTranslationSet, ui: UITranslationSet) = this()
  }
  
  @js.native
  sealed trait UIElement extends StObject
  @JSImport("hyperformula/typings/i18n", "UIElement")
  @js.native
  object UIElement extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UIElement & String] = js.native
    
    @js.native
    sealed trait NEW_SHEET_PREFIX
      extends StObject
         with UIElement
    /* "NEW_SHEET_PREFIX" */ val NEW_SHEET_PREFIX: typingsJapgolly.hyperformula.typingsI18nMod.UIElement.NEW_SHEET_PREFIX & String = js.native
  }
  
  inline def buildTranslationPackage(rawTranslationPackage: RawTranslationPackage): typingsJapgolly.hyperformula.typingsI18nTranslationPackageMod.TranslationPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTranslationPackage")(rawTranslationPackage.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.hyperformula.typingsI18nTranslationPackageMod.TranslationPackage]
  
  type ErrorTranslationSet = Record[TranslatableErrorType, String]
  
  type TranslationSet = Record[String, String]
  
  type UITranslationSet = Record[UIElement, String]
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides character conversions like case folding or Hiragana to Katakana.
  *
  * It is derived from {@link com.sun.star.i18n.XTransliteration} and provides additional functionality for character to character and string to string
  * without offset parameter transliteration. These should be used for performance reason if their full-blown counterparts aren't needed.
  * @since OOo 1.1.2
  */
trait XExtendedTransliteration
  extends StObject
     with XTransliteration {
  
  /**
    * Transliterate a character to a character.
    *
    * If the output contains multiple characters, for example when transliterating German sharp "s" (the one that looks like a Greek Beta) to upper case
    * "SS", {@link MultipleCharsOutputException} will be thrown, the caller must catch the exception and then call
    * XTransliteration::transliterateChar2String() to obtain the correct result.
    * @param cChar The input character.
    */
  def transliterateChar2Char(cChar: String): String
  
  /**
    * Transliterate a character to a string.
    * @param cChar The input character.
    */
  def transliterateChar2String(cChar: String): String
  
  /**
    * Transliterate a substring. The functionality is the same as {@link com.sun.star.i18n.XTransliteration.transliterate()} but omits the offset parameter
    * to improve performance.
    * @param aStr The input string.
    * @param nStartPos Start position within aStr from where transliteration starts.
    * @param nCount Number of code points to be transliterated.
    */
  def transliterateString2String(aStr: String, nStartPos: Double, nCount: Double): String
}
object XExtendedTransliteration {
  
  inline def apply(
    Name: String,
    Type: Double,
    acquire: Callback,
    compareString: (String, String) => Double,
    compareSubstring: (String, Double, Double, String, Double, Double) => Double,
    equals_ : (String, Double, Double, js.Array[Double], String, Double, Double, js.Array[Double]) => Boolean,
    folding: (String, Double, Double, js.Array[SeqEquiv[Double]]) => String,
    getAvailableModules: (Locale, Double) => SafeArray[String],
    getName: CallbackTo[String],
    getType: CallbackTo[Double],
    loadModule: (TransliterationModules, Locale) => Callback,
    loadModuleByImplName: (String, Locale) => Callback,
    loadModuleNew: (SeqEquiv[TransliterationModulesNew], Locale) => Callback,
    loadModulesByImplNames: (SeqEquiv[String], Locale) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    transliterate: (String, Double, Double, js.Array[SeqEquiv[Double]]) => String,
    transliterateChar2Char: String => String,
    transliterateChar2String: String => String,
    transliterateRange: (String, String) => SafeArray[String],
    transliterateString2String: (String, Double, Double) => String
  ): XExtendedTransliteration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, compareString = js.Any.fromFunction2(compareString), compareSubstring = js.Any.fromFunction6(compareSubstring), folding = js.Any.fromFunction4(folding), getAvailableModules = js.Any.fromFunction2(getAvailableModules), getName = getName.toJsFn, getType = getType.toJsFn, loadModule = js.Any.fromFunction2((t0: TransliterationModules, t1: Locale) => (loadModule(t0, t1)).runNow()), loadModuleByImplName = js.Any.fromFunction2((t0: String, t1: Locale) => (loadModuleByImplName(t0, t1)).runNow()), loadModuleNew = js.Any.fromFunction2((t0: SeqEquiv[TransliterationModulesNew], t1: Locale) => (loadModuleNew(t0, t1)).runNow()), loadModulesByImplNames = js.Any.fromFunction2((t0: SeqEquiv[String], t1: Locale) => (loadModulesByImplNames(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, transliterate = js.Any.fromFunction4(transliterate), transliterateChar2Char = js.Any.fromFunction1(transliterateChar2Char), transliterateChar2String = js.Any.fromFunction1(transliterateChar2String), transliterateRange = js.Any.fromFunction2(transliterateRange), transliterateString2String = js.Any.fromFunction3(transliterateString2String))
    __obj.updateDynamic("equals")(js.Any.fromFunction8(equals_))
    __obj.asInstanceOf[XExtendedTransliteration]
  }
  
  extension [Self <: XExtendedTransliteration](x: Self) {
    
    inline def setTransliterateChar2Char(value: String => String): Self = StObject.set(x, "transliterateChar2Char", js.Any.fromFunction1(value))
    
    inline def setTransliterateChar2String(value: String => String): Self = StObject.set(x, "transliterateChar2String", js.Any.fromFunction1(value))
    
    inline def setTransliterateString2String(value: (String, Double, Double) => String): Self = StObject.set(x, "transliterateString2String", js.Any.fromFunction3(value))
  }
}

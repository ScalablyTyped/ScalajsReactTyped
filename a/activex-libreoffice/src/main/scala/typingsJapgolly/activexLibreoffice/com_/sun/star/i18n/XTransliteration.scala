package typingsJapgolly.activexLibreoffice.com_.sun.star.i18n

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Character conversions like case folding or Hiragana to Katakana.
  *
  * {@link Transliteration} is a character to character conversion but it is not always a one to one mapping between characters. {@link Transliteration}
  * modules are primarily used by collation, and search and replace modules to perform approximate search. It can also be used to format the numbers in
  * different numbering systems.
  *
  * In order to select transliteration modules for different purposes, they are classified with attributes of {@link TransliterationType} .
  *
  * For Western languages there would be three transliteration modules available to compare two mixed case strings: upper to lower, lower to upper, and
  * ignore case.
  *
  * A typical calling sequence of transliteration is  1. {@link getAvailableModules()} 2. {@link loadModulesByImplNames()} 3. {@link equals()} or another
  * one is  1. {@link loadModule()} 2. {@link transliterate()}
  */
trait XTransliteration
  extends StObject
     with XInterface {
  
  /**
    * Unique ASCII name to identify a module. This name is used to get its localized name for menus, dialogs etc. The behavior is undefined for {@link
    * TransliterationType.CASCADE} modules.
    */
  val Name: String
  
  /**
    * Return the attribute(s) associated with this transliteration object, as defined in {@link TransliterationType} . The value is determined by the
    * transliteration modules. For example, for UPPERCASE_LOWERCASE, a ONE_TO_ONE is returned, for IGNORE_CASE, IGNORE is returned.
    */
  val Type: Double
  
  /**
    * Compare 2 strings as per this transliteration. It translates both strings before comparing them.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareString(aStr1: String, aStr2: String): Double
  
  /**
    * Compare 2 substrings as per this transliteration. It translates both substrings before comparing them.
    * @param aStr1 First string.
    * @param nOff1 Offset (from 0) of the first substring.
    * @param nLen1 Length (from offset) of the first substring.
    * @param aStr2 Second string.
    * @param nOff2 Offset (from 0) of the second substring.
    * @param nLen2 Length (from offset) of the second substring.
    * @returns 1 if the first substring is greater than the second substring ;  0 if the first substring is equal to the second substring ;  -1 if the first sub
    */
  def compareSubstring(aStr1: String, nOff1: Double, nLen1: Double, aStr2: String, nOff2: Double, nLen2: Double): Double
  
  /**
    * Match two substrings and find if they are equivalent as per this transliteration.
    *
    * This method can be called if the object has {@link TransliterationType} IGNORE attribute.
    *
    * Returns the number of matched code points in any case, even if strings are not equal, for example: ;  equals( "a", 0, 1, nMatch1, "aaa", 0, 3, nMatch2
    * ) ;  returns `FALSE` and nMatch:=1 and nMatch2:=1 ;  equals( "aab", 0, 3, nMatch1, "aaa", 0, 3, nMatch2 ) ;  returns `FALSE` and nMatch:=2 and
    * nMatch2:=2 ;
    * @param aStr1 First string to match.
    * @param nPos1 Start position within aStr1.
    * @param nCount1 Number of code points to use of aStr1.
    * @param rMatch1 Returns number of matched code points in aStr1.
    * @param aStr2 Second string to match.
    * @param nPos2 Start position within aStr2.
    * @param nCount2 Number of code points to use of aStr2.
    * @param rMatch2 Returns number of matched code points in aStr2.
    * @returns `TRUE` if the substrings are equal per this transliteration ; `FALSE` else.
    */
  def equals(
    aStr1: String,
    nPos1: Double,
    nCount1: Double,
    rMatch1: js.Array[Double],
    aStr2: String,
    nPos2: Double,
    nCount2: Double,
    rMatch2: js.Array[Double]
  ): Boolean
  
  /** @deprecated DeprecatedFor internal use, this method is supported to get the "transliteration", which equals() is based on. */
  def folding(aInStr: String, nStartPos: Double, nCount: Double, rOffset: js.Array[SeqEquiv[Double]]): String
  
  /**
    * List the available transliteration modules for a given locale. It can be filtered based on its type.
    * @param nType A bitmask field of values defined in {@link TransliterationType}
    * @param aLocale The locale for which the modules are requested.
    */
  def getAvailableModules(aLocale: Locale, nType: Double): SafeArray[String]
  
  /**
    * Unique ASCII name to identify a module. This name is used to get its localized name for menus, dialogs etc. The behavior is undefined for {@link
    * TransliterationType.CASCADE} modules.
    */
  def getName(): String
  
  /**
    * Return the attribute(s) associated with this transliteration object, as defined in {@link TransliterationType} . The value is determined by the
    * transliteration modules. For example, for UPPERCASE_LOWERCASE, a ONE_TO_ONE is returned, for IGNORE_CASE, IGNORE is returned.
    */
  def getType(): Double
  
  /** Load instance of predefined module - old style method. */
  def loadModule(eModType: TransliterationModules, aLocale: Locale): Unit
  
  /**
    * Load instance of UNO registered module.
    *
    * Each transliteration module is registered under a different service name. The convention for the service name is
    * com.sun.star.i18n.Transliteration.l10n.{implName}. The {implName} is a unique name used to identify a module. The implName is used to get a localized
    * name for the transliteration module. The implName is used in locale data to list the available transliteration modules for the locale. There are some
    * transliteration modules that are always available. The names of those modules are listed as enum TransliterationModules names. For modules not listed
    * there it is possible to load them directly by their implName.
    * @param aImplName The module's {implName} under which it is registered with com.sun.star.i18n.Transliteration.l10n.{implName}.
    * @param aLocale The locale for which the module is requested.
    */
  def loadModuleByImplName(aImplName: String, aLocale: Locale): Unit
  
  /** Load a sequence of instances of predefined modules - supersedes method {@link XTransliteration.loadModule()} . */
  def loadModuleNew(aModType: SeqEquiv[TransliterationModulesNew], aLocale: Locale): Unit
  
  /**
    * Load a sequence of instances of transliteration modules. Output of one module is fed as input to the next module in the sequence. The object created
    * by this call has {@link TransliterationType} CASCADE and IGNORE types.
    * @param aImplNameList Only IGNORE type modules can be specified.
    * @param aLocale The locale for which the modules are requested.
    */
  def loadModulesByImplNames(aImplNameList: SeqEquiv[String], aLocale: Locale): Unit
  
  /**
    * Transliterate a substring. This method can be called if the object doesn't have {@link TransliterationType} IGNORE attribute.
    * @param aInStr The input string.
    * @param nStartPos Start position within aInStr from where transliteration starts.
    * @param nCount Number of code points to be transliterated.
    * @param rOffset To find the grapheme of input string corresponding to the grapheme of output string, rOffset provides the offset array whose index is the
    */
  def transliterate(aInStr: String, nStartPos: Double, nCount: Double, rOffset: js.Array[SeqEquiv[Double]]): String
  
  /**
    * Transliterate one set of characters to another.
    *
    * This method is intended for getting corresponding ranges and can be called if the object has {@link TransliterationType} IGNORE attribute.
    *
    * For example: generic CASE_IGNORE transliterateRange( "a", "i" ) returns {"A","I","a","i"}, transliterateRange( "a", "a" ) returns {"A","A","a","a"}.
    *
    * Use this transliteration to create regular expressions like [a-i]  -  > [A-Ia-i].
    * @returns String sequence containing corresponding transliterated pairs of characters to represent a range.
    */
  def transliterateRange(aStr1: String, aStr2: String): SafeArray[String]
}
object XTransliteration {
  
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
    transliterateRange: (String, String) => SafeArray[String]
  ): XTransliteration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, compareString = js.Any.fromFunction2(compareString), compareSubstring = js.Any.fromFunction6(compareSubstring), folding = js.Any.fromFunction4(folding), getAvailableModules = js.Any.fromFunction2(getAvailableModules), getName = getName.toJsFn, getType = getType.toJsFn, loadModule = js.Any.fromFunction2((t0: TransliterationModules, t1: Locale) => (loadModule(t0, t1)).runNow()), loadModuleByImplName = js.Any.fromFunction2((t0: String, t1: Locale) => (loadModuleByImplName(t0, t1)).runNow()), loadModuleNew = js.Any.fromFunction2((t0: SeqEquiv[TransliterationModulesNew], t1: Locale) => (loadModuleNew(t0, t1)).runNow()), loadModulesByImplNames = js.Any.fromFunction2((t0: SeqEquiv[String], t1: Locale) => (loadModulesByImplNames(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, transliterate = js.Any.fromFunction4(transliterate), transliterateRange = js.Any.fromFunction2(transliterateRange))
    __obj.updateDynamic("equals")(js.Any.fromFunction8(equals_))
    __obj.asInstanceOf[XTransliteration]
  }
  
  extension [Self <: XTransliteration](x: Self) {
    
    inline def setCompareString(value: (String, String) => Double): Self = StObject.set(x, "compareString", js.Any.fromFunction2(value))
    
    inline def setCompareSubstring(value: (String, Double, Double, String, Double, Double) => Double): Self = StObject.set(x, "compareSubstring", js.Any.fromFunction6(value))
    
    inline def setEquals_(
      value: (String, Double, Double, js.Array[Double], String, Double, Double, js.Array[Double]) => Boolean
    ): Self = StObject.set(x, "equals", js.Any.fromFunction8(value))
    
    inline def setFolding(value: (String, Double, Double, js.Array[SeqEquiv[Double]]) => String): Self = StObject.set(x, "folding", js.Any.fromFunction4(value))
    
    inline def setGetAvailableModules(value: (Locale, Double) => SafeArray[String]): Self = StObject.set(x, "getAvailableModules", js.Any.fromFunction2(value))
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setLoadModule(value: (TransliterationModules, Locale) => Callback): Self = StObject.set(x, "loadModule", js.Any.fromFunction2((t0: TransliterationModules, t1: Locale) => (value(t0, t1)).runNow()))
    
    inline def setLoadModuleByImplName(value: (String, Locale) => Callback): Self = StObject.set(x, "loadModuleByImplName", js.Any.fromFunction2((t0: String, t1: Locale) => (value(t0, t1)).runNow()))
    
    inline def setLoadModuleNew(value: (SeqEquiv[TransliterationModulesNew], Locale) => Callback): Self = StObject.set(x, "loadModuleNew", js.Any.fromFunction2((t0: SeqEquiv[TransliterationModulesNew], t1: Locale) => (value(t0, t1)).runNow()))
    
    inline def setLoadModulesByImplNames(value: (SeqEquiv[String], Locale) => Callback): Self = StObject.set(x, "loadModulesByImplNames", js.Any.fromFunction2((t0: SeqEquiv[String], t1: Locale) => (value(t0, t1)).runNow()))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTransliterate(value: (String, Double, Double, js.Array[SeqEquiv[Double]]) => String): Self = StObject.set(x, "transliterate", js.Any.fromFunction4(value))
    
    inline def setTransliterateRange(value: (String, String) => SafeArray[String]): Self = StObject.set(x, "transliterateRange", js.Any.fromFunction2(value))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}

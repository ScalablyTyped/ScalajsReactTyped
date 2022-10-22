package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * API for proofreading a text
  * @since OOo 3.0.1
  */
trait XProofreader
  extends StObject
     with XSupportedLocales {
  
  /**
    * start checking
    * @param aDocumentIdentifier the Document ID.
    * @param aText the flat text to be checked.
    * @param aLocale Language used in the text.
    * @param nStartOfSentencePosition Start Index of the text.
    * @param nSuggestedBehindEndOfSentencePosition Probable end position of the text.
    * @param aProperties additional properties of the text. Currently the following properties may be supported: {{table here, see documentation}}
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def doProofreading(
    aDocumentIdentifier: String,
    aText: String,
    aLocale: Locale,
    nStartOfSentencePosition: Double,
    nSuggestedBehindEndOfSentencePosition: Double,
    aProperties: SeqEquiv[PropertyValue]
  ): ProofreadingResult
  
  /**
    * disables a specific rule for a given locale.
    *
    * If the locale is empty the rule should be ignored for all languages.
    */
  def ignoreRule(aRuleIdentifier: String, aLocale: Locale): Unit
  
  /**
    * whether is the text checked by the spell checker
    * @returns true if it is also a spell checker
    */
  def isSpellChecker(): Boolean
  
  /** sets all rules back to their default settings. */
  def resetIgnoreRules(): Unit
}
object XProofreader {
  
  inline def apply(
    Locales: SafeArray[Locale],
    acquire: Callback,
    doProofreading: (String, String, Locale, Double, Double, SeqEquiv[PropertyValue]) => ProofreadingResult,
    getLocales: CallbackTo[SafeArray[Locale]],
    hasLocale: Locale => Boolean,
    ignoreRule: (String, Locale) => Callback,
    isSpellChecker: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    resetIgnoreRules: Callback
  ): XProofreader = {
    val __obj = js.Dynamic.literal(Locales = Locales.asInstanceOf[js.Any], acquire = acquire.toJsFn, doProofreading = js.Any.fromFunction6(doProofreading), getLocales = getLocales.toJsFn, hasLocale = js.Any.fromFunction1(hasLocale), ignoreRule = js.Any.fromFunction2((t0: String, t1: Locale) => (ignoreRule(t0, t1)).runNow()), isSpellChecker = isSpellChecker.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resetIgnoreRules = resetIgnoreRules.toJsFn)
    __obj.asInstanceOf[XProofreader]
  }
  
  extension [Self <: XProofreader](x: Self) {
    
    inline def setDoProofreading(value: (String, String, Locale, Double, Double, SeqEquiv[PropertyValue]) => ProofreadingResult): Self = StObject.set(x, "doProofreading", js.Any.fromFunction6(value))
    
    inline def setIgnoreRule(value: (String, Locale) => Callback): Self = StObject.set(x, "ignoreRule", js.Any.fromFunction2((t0: String, t1: Locale) => (value(t0, t1)).runNow()))
    
    inline def setIsSpellChecker(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSpellChecker", value.toJsFn)
    
    inline def setResetIgnoreRules(value: Callback): Self = StObject.set(x, "resetIgnoreRules", value.toJsFn)
  }
}

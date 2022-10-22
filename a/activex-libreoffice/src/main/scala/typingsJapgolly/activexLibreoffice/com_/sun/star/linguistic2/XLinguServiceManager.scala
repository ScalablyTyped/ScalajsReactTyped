package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the basic interface to be used to access linguistic functionality.
  *
  * This interface is used to access spell checker, hyphenator, and thesaurus functionality. Additionally, it can query what implementations of those
  * services are available (for specific languages or in general). It can select and query which of those implementations should be used for a specific
  * language.
  *
  * For spell checking and thesaurus, the order in the list defines the order of creation/usage of those services. That is, if the first spell checker
  * implementation does not recognize the given word as correct, the second service implementation for that language is created and gets queried. If that
  * one fails, the third one gets created and queried and so on. This chain stops if an implementation reports the word as correct or the end of the list
  * is reached, in which case the word is reported as incorrect.
  *
  * For the thesaurus, the behavior is the same when no meaning was found.
  * @see com.sun.star.linguistic2.SpellChecker
  * @see com.sun.star.linguistic2.Hyphenator
  * @see com.sun.star.linguistic2.Thesaurus
  */
trait XLinguServiceManager
  extends StObject
     with XInterface {
  
  /** @returns the {@link com.sun.star.linguistic2.XHyphenator} interface to be used for hyphenation. */
  val Hyphenator: XHyphenator
  
  /** @returns the {@link com.sun.star.linguistic2.XSpellChecker} interface to be used for spell checking. */
  val SpellChecker: XSpellChecker
  
  /** @returns the {@link com.sun.star.linguistic2.XThesaurus} interface to be used for thesaurus functionality. */
  val Thesaurus: XThesaurus
  
  /**
    * adds a listener to the list of event listeners.
    *
    * The listeners may support one or both of {@link com.sun.star.linguistic2.XDictionaryEventListener} and {@link
    * com.sun.star.linguistic2.XLinguServiceEventListener} interfaces.
    * @param xListener the listener to be added.
    * @returns `TRUE` if the listener was successfully added, `FALSE` otherwise.
    */
  def addLinguServiceManagerListener(xListener: XEventListener): Boolean
  
  /**
    * @param aServiceName the name of the service requesting the list of available implementations.
    * @param aLocale the language used to query the list of available implementations.
    * @returns the list of implementation names of the available services.
    */
  def getAvailableServices(aServiceName: String, aLocale: Locale): SafeArray[String]
  
  /**
    * queries the list of service implementations to be used for a given service and language.
    * @param aServiceName the name of the service to get queried.
    * @param aLocale the language to get queried.
    * @returns the list of implementation names of the services to be used.
    */
  def getConfiguredServices(aServiceName: String, aLocale: Locale): SafeArray[String]
  
  /** @returns the {@link com.sun.star.linguistic2.XHyphenator} interface to be used for hyphenation. */
  def getHyphenator(): XHyphenator
  
  /** @returns the {@link com.sun.star.linguistic2.XSpellChecker} interface to be used for spell checking. */
  def getSpellChecker(): XSpellChecker
  
  /** @returns the {@link com.sun.star.linguistic2.XThesaurus} interface to be used for thesaurus functionality. */
  def getThesaurus(): XThesaurus
  
  /**
    * removes a listener from the list of event listeners.
    * @param xListener the listener to be removed.
    * @returns `TRUE` if the listener was successfully removed, `FALSE` otherwise.
    */
  def removeLinguServiceManagerListener(xListener: XEventListener): Boolean
  
  /**
    * sets the list of service implementations to be used for a given service and language.
    * @param aServiceName the name of the service to set the list of implementations to be used.
    * @param aLocale the language to set the list.
    * @param aServiceImplNames the name of the service to set the list.
    */
  def setConfiguredServices(aServiceName: String, aLocale: Locale, aServiceImplNames: SeqEquiv[String]): Unit
}
object XLinguServiceManager {
  
  inline def apply(
    Hyphenator: XHyphenator,
    SpellChecker: XSpellChecker,
    Thesaurus: XThesaurus,
    acquire: Callback,
    addLinguServiceManagerListener: XEventListener => Boolean,
    getAvailableServices: (String, Locale) => SafeArray[String],
    getConfiguredServices: (String, Locale) => SafeArray[String],
    getHyphenator: CallbackTo[XHyphenator],
    getSpellChecker: CallbackTo[XSpellChecker],
    getThesaurus: CallbackTo[XThesaurus],
    queryInterface: `type` => Any,
    release: Callback,
    removeLinguServiceManagerListener: XEventListener => Boolean,
    setConfiguredServices: (String, Locale, SeqEquiv[String]) => Callback
  ): XLinguServiceManager = {
    val __obj = js.Dynamic.literal(Hyphenator = Hyphenator.asInstanceOf[js.Any], SpellChecker = SpellChecker.asInstanceOf[js.Any], Thesaurus = Thesaurus.asInstanceOf[js.Any], acquire = acquire.toJsFn, addLinguServiceManagerListener = js.Any.fromFunction1(addLinguServiceManagerListener), getAvailableServices = js.Any.fromFunction2(getAvailableServices), getConfiguredServices = js.Any.fromFunction2(getConfiguredServices), getHyphenator = getHyphenator.toJsFn, getSpellChecker = getSpellChecker.toJsFn, getThesaurus = getThesaurus.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLinguServiceManagerListener = js.Any.fromFunction1(removeLinguServiceManagerListener), setConfiguredServices = js.Any.fromFunction3((t0: String, t1: Locale, t2: SeqEquiv[String]) => (setConfiguredServices(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XLinguServiceManager]
  }
  
  extension [Self <: XLinguServiceManager](x: Self) {
    
    inline def setAddLinguServiceManagerListener(value: XEventListener => Boolean): Self = StObject.set(x, "addLinguServiceManagerListener", js.Any.fromFunction1(value))
    
    inline def setGetAvailableServices(value: (String, Locale) => SafeArray[String]): Self = StObject.set(x, "getAvailableServices", js.Any.fromFunction2(value))
    
    inline def setGetConfiguredServices(value: (String, Locale) => SafeArray[String]): Self = StObject.set(x, "getConfiguredServices", js.Any.fromFunction2(value))
    
    inline def setGetHyphenator(value: CallbackTo[XHyphenator]): Self = StObject.set(x, "getHyphenator", value.toJsFn)
    
    inline def setGetSpellChecker(value: CallbackTo[XSpellChecker]): Self = StObject.set(x, "getSpellChecker", value.toJsFn)
    
    inline def setGetThesaurus(value: CallbackTo[XThesaurus]): Self = StObject.set(x, "getThesaurus", value.toJsFn)
    
    inline def setHyphenator(value: XHyphenator): Self = StObject.set(x, "Hyphenator", value.asInstanceOf[js.Any])
    
    inline def setRemoveLinguServiceManagerListener(value: XEventListener => Boolean): Self = StObject.set(x, "removeLinguServiceManagerListener", js.Any.fromFunction1(value))
    
    inline def setSetConfiguredServices(value: (String, Locale, SeqEquiv[String]) => Callback): Self = StObject.set(x, "setConfiguredServices", js.Any.fromFunction3((t0: String, t1: Locale, t2: SeqEquiv[String]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSpellChecker(value: XSpellChecker): Self = StObject.set(x, "SpellChecker", value.asInstanceOf[js.Any])
    
    inline def setThesaurus(value: XThesaurus): Self = StObject.set(x, "Thesaurus", value.asInstanceOf[js.Any])
  }
}

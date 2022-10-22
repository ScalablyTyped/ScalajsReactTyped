package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to manage and maintain a list of dictionaries.
  *
  * A dictionary-list may be given to a spell checker or hyphenator service implementation on their creation in order to supply a set of dictionaries and
  * additional information to be used for those purposes.
  * @see com.sun.star.linguistic2.XDictionary
  * @see com.sun.star.uno.XInterface
  */
trait XDictionaryList
  extends StObject
     with XInterface {
  
  /** @returns the number of dictionaries in the list. */
  val Count: Double
  
  /**
    * @returns a sequence with an entry for every dictionary in the list.
    * @see com.sun.star.linguistic2.XDictionary
    */
  val Dictionaries: SafeArray[XDictionary]
  
  /**
    * adds a dictionary to the list.
    *
    * Additionally, the dictionary-list will add itself to the list of dictionary event listeners of that dictionary.
    * @param xDictionary the dictionary to be added.
    * @returns `TRUE` if the dictionary was added successfully, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def addDictionary(xDictionary: XDictionary): Boolean
  
  /**
    * adds an entry to the list of dictionary-list event listeners.
    *
    * On dictionary-list events, each entry in the listener list will be notified via a call to {@link
    * com.sun.star.linguistic2.XDictionaryListEventListener.processDictionaryListEvent()} .
    * @param xListener the object to be notified of dictionary-list events.
    * @param bReceiveVerbose `TRUE` if the listener requires more detailed event notification than usual.
    * @returns `TRUE` if the entry was made, `FALSE` otherwise. If {@link com.sun.star.lang.XEventListener.disposing()} was called before, it will always fail.
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    */
  def addDictionaryListEventListener(xListener: XDictionaryListEventListener, bReceiveVerbose: Boolean): Boolean
  
  /**
    * increases request level for event buffering by one.
    *
    * The request level for event buffering is an integer counter that is initially set to 0. As long as the request level is not 0, events will be buffered
    * until the next flushing of the buffer.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.endCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.flushEvents()
    */
  def beginCollectEvents(): Double
  
  /**
    * creates a new dictionary.
    * @param aName is the name of the dictionary (should be unique).
    * @param aLocale defines the language of the dictionary. Use an empty aLocale for dictionaries which may contain entries of all languages.
    * @param eDicType specifies the type of the dictionary.
    * @param aURL is the URL of the location where the dictionary is persistent, if the XStorable interface is supported. It may be empty, which means the dic
    * @returns an empty dictionary with the given name, language and type. `NULL` on failure.
    * @see com.sun.star.linguistic2.XDictionary
    * @see com.sun.star.lang.Locale
    * @see com.sun.star.linguistic2.DictionaryType
    */
  def createDictionary(aName: String, aLocale: Locale, eDicType: DictionaryType, aURL: String): XDictionary
  
  /**
    * flushes the event buffer and decreases the request level for event buffering by one.
    *
    * There should be one matching endCollectEvents call for every beginCollectEvents call. Usually you will group these around some code where you do not
    * wish to get notified of every single event.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.beginCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.flushEvents()
    */
  def endCollectEvents(): Double
  
  /**
    * notifies the listeners of all buffered events and then clears that buffer.
    * @returns the current request level for event buffering.
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryList.beginCollectEvents()
    * @see com.sun.star.linguistic2.XDictionaryList.endCollectEvents()
    */
  def flushEvents(): Double
  
  /** @returns the number of dictionaries in the list. */
  def getCount(): Double
  
  /**
    * @returns a sequence with an entry for every dictionary in the list.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def getDictionaries(): SafeArray[XDictionary]
  
  /**
    * searches the list for a dictionary with a given name.
    * @param aDictionaryName specifies the name of the dictionary to look for.
    * @returns the {@link XDictionary} with the specified name. If no such dictionary exists, `NULL` will be returned.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def getDictionaryByName(aDictionaryName: String): XDictionary
  
  /**
    * removes a single dictionary from the list.
    *
    * If the dictionary is still active, it will be deactivated first. The dictionary-list will remove itself from the list of dictionary event listeners of
    * the dictionary.
    * @param xDictionary dictionary to be removed from the list of dictionaries.
    * @returns `TRUE` if the dictionary was removed successfully, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionary
    */
  def removeDictionary(xDictionary: XDictionary): Boolean
  
  /**
    * removes an entry from the list of dictionary-list event listeners.
    * @param xListener the object to be removed from the listener list.
    * @returns `TRUE` if the object to be removed was found and removed, `FALSE` otherwise.
    * @see com.sun.star.linguistic2.XDictionaryListEventListener
    * @see com.sun.star.linguistic2.XDictionaryListEvent
    */
  def removeDictionaryListEventListener(xListener: XDictionaryListEventListener): Boolean
}
object XDictionaryList {
  
  inline def apply(
    Count: Double,
    Dictionaries: SafeArray[XDictionary],
    acquire: Callback,
    addDictionary: XDictionary => Boolean,
    addDictionaryListEventListener: (XDictionaryListEventListener, Boolean) => Boolean,
    beginCollectEvents: CallbackTo[Double],
    createDictionary: (String, Locale, DictionaryType, String) => XDictionary,
    endCollectEvents: CallbackTo[Double],
    flushEvents: CallbackTo[Double],
    getCount: CallbackTo[Double],
    getDictionaries: CallbackTo[SafeArray[XDictionary]],
    getDictionaryByName: String => XDictionary,
    queryInterface: `type` => Any,
    release: Callback,
    removeDictionary: XDictionary => Boolean,
    removeDictionaryListEventListener: XDictionaryListEventListener => Boolean
  ): XDictionaryList = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Dictionaries = Dictionaries.asInstanceOf[js.Any], acquire = acquire.toJsFn, addDictionary = js.Any.fromFunction1(addDictionary), addDictionaryListEventListener = js.Any.fromFunction2(addDictionaryListEventListener), beginCollectEvents = beginCollectEvents.toJsFn, createDictionary = js.Any.fromFunction4(createDictionary), endCollectEvents = endCollectEvents.toJsFn, flushEvents = flushEvents.toJsFn, getCount = getCount.toJsFn, getDictionaries = getDictionaries.toJsFn, getDictionaryByName = js.Any.fromFunction1(getDictionaryByName), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeDictionary = js.Any.fromFunction1(removeDictionary), removeDictionaryListEventListener = js.Any.fromFunction1(removeDictionaryListEventListener))
    __obj.asInstanceOf[XDictionaryList]
  }
  
  extension [Self <: XDictionaryList](x: Self) {
    
    inline def setAddDictionary(value: XDictionary => Boolean): Self = StObject.set(x, "addDictionary", js.Any.fromFunction1(value))
    
    inline def setAddDictionaryListEventListener(value: (XDictionaryListEventListener, Boolean) => Boolean): Self = StObject.set(x, "addDictionaryListEventListener", js.Any.fromFunction2(value))
    
    inline def setBeginCollectEvents(value: CallbackTo[Double]): Self = StObject.set(x, "beginCollectEvents", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreateDictionary(value: (String, Locale, DictionaryType, String) => XDictionary): Self = StObject.set(x, "createDictionary", js.Any.fromFunction4(value))
    
    inline def setDictionaries(value: SafeArray[XDictionary]): Self = StObject.set(x, "Dictionaries", value.asInstanceOf[js.Any])
    
    inline def setEndCollectEvents(value: CallbackTo[Double]): Self = StObject.set(x, "endCollectEvents", value.toJsFn)
    
    inline def setFlushEvents(value: CallbackTo[Double]): Self = StObject.set(x, "flushEvents", value.toJsFn)
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetDictionaries(value: CallbackTo[SafeArray[XDictionary]]): Self = StObject.set(x, "getDictionaries", value.toJsFn)
    
    inline def setGetDictionaryByName(value: String => XDictionary): Self = StObject.set(x, "getDictionaryByName", js.Any.fromFunction1(value))
    
    inline def setRemoveDictionary(value: XDictionary => Boolean): Self = StObject.set(x, "removeDictionary", js.Any.fromFunction1(value))
    
    inline def setRemoveDictionaryListEventListener(value: XDictionaryListEventListener => Boolean): Self = StObject.set(x, "removeDictionaryListEventListener", js.Any.fromFunction1(value))
  }
}

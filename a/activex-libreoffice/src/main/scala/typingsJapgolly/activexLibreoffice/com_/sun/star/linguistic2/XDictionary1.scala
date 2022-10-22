package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XDictionary1
  extends StObject
     with XNamed {
  
  val Count: Double
  
  val DictionaryType: typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType
  
  val Entries: SafeArray[XDictionaryEntry]
  
  var Language: Double
  
  def add(aWord: String, bIsNegative: Boolean, aRplcText: String): Boolean
  
  def addDictionaryEventListener(xListener: XDictionaryEventListener): Boolean
  
  def addEntry(xDicEntry: XDictionaryEntry): Boolean
  
  def clear(): Unit
  
  def getCount(): Double
  
  def getDictionaryType(): typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2.DictionaryType
  
  def getEntries(): SafeArray[XDictionaryEntry]
  
  def getEntry(aWord: String): XDictionaryEntry
  
  def getLanguage(): Double
  
  def isActive(): Boolean
  
  def isFull(): Boolean
  
  def remove(aWord: String): Boolean
  
  def removeDictionaryEventListener(xListener: XDictionaryEventListener): Boolean
  
  def setActive(bActivate: Boolean): Unit
  
  def setLanguage(nLang: Double): Unit
}
object XDictionary1 {
  
  inline def apply(
    Count: Double,
    DictionaryType: DictionaryType,
    Entries: SafeArray[XDictionaryEntry],
    Language: Double,
    Name: String,
    acquire: Callback,
    add: (String, Boolean, String) => Boolean,
    addDictionaryEventListener: XDictionaryEventListener => Boolean,
    addEntry: XDictionaryEntry => Boolean,
    clear: Callback,
    getCount: CallbackTo[Double],
    getDictionaryType: CallbackTo[DictionaryType],
    getEntries: CallbackTo[SafeArray[XDictionaryEntry]],
    getEntry: String => XDictionaryEntry,
    getLanguage: CallbackTo[Double],
    getName: CallbackTo[String],
    isActive: CallbackTo[Boolean],
    isFull: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: String => Boolean,
    removeDictionaryEventListener: XDictionaryEventListener => Boolean,
    setActive: Boolean => Callback,
    setLanguage: Double => Callback,
    setName: String => Callback
  ): XDictionary1 = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DictionaryType = DictionaryType.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction3(add), addDictionaryEventListener = js.Any.fromFunction1(addDictionaryEventListener), addEntry = js.Any.fromFunction1(addEntry), clear = clear.toJsFn, getCount = getCount.toJsFn, getDictionaryType = getDictionaryType.toJsFn, getEntries = getEntries.toJsFn, getEntry = js.Any.fromFunction1(getEntry), getLanguage = getLanguage.toJsFn, getName = getName.toJsFn, isActive = isActive.toJsFn, isFull = isFull.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1(remove), removeDictionaryEventListener = js.Any.fromFunction1(removeDictionaryEventListener), setActive = js.Any.fromFunction1((t0: Boolean) => setActive(t0).runNow()), setLanguage = js.Any.fromFunction1((t0: Double) => setLanguage(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[XDictionary1]
  }
  
  extension [Self <: XDictionary1](x: Self) {
    
    inline def setAdd(value: (String, Boolean, String) => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction3(value))
    
    inline def setAddDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = StObject.set(x, "addDictionaryEventListener", js.Any.fromFunction1(value))
    
    inline def setAddEntry(value: XDictionaryEntry => Boolean): Self = StObject.set(x, "addEntry", js.Any.fromFunction1(value))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDictionaryType(value: DictionaryType): Self = StObject.set(x, "DictionaryType", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: SafeArray[XDictionaryEntry]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setGetCount(value: CallbackTo[Double]): Self = StObject.set(x, "getCount", value.toJsFn)
    
    inline def setGetDictionaryType(value: CallbackTo[DictionaryType]): Self = StObject.set(x, "getDictionaryType", value.toJsFn)
    
    inline def setGetEntries(value: CallbackTo[SafeArray[XDictionaryEntry]]): Self = StObject.set(x, "getEntries", value.toJsFn)
    
    inline def setGetEntry(value: String => XDictionaryEntry): Self = StObject.set(x, "getEntry", js.Any.fromFunction1(value))
    
    inline def setGetLanguage(value: CallbackTo[Double]): Self = StObject.set(x, "getLanguage", value.toJsFn)
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setIsFull(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFull", value.toJsFn)
    
    inline def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveDictionaryEventListener(value: XDictionaryEventListener => Boolean): Self = StObject.set(x, "removeDictionaryEventListener", js.Any.fromFunction1(value))
    
    inline def setSetActive(value: Boolean => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetLanguage(value: Double => Callback): Self = StObject.set(x, "setLanguage", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}

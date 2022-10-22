package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XEmbedPersist2
  extends StObject
     with XEmbedPersist {
  
  /** Checks whether or not the object has created its persistent representation counterpart of its in-memory model. */
  def isStored(): Boolean
}
object XEmbedPersist2 {
  
  inline def apply(
    EntryName: String,
    acquire: Callback,
    getEntryName: CallbackTo[String],
    hasEntry: CallbackTo[Boolean],
    isReadonly: CallbackTo[Boolean],
    isStored: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    saveCompleted: Boolean => Callback,
    setPersistentEntry: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    storeAsEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    storeOwn: Callback,
    storeToEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback
  ): XEmbedPersist2 = {
    val __obj = js.Dynamic.literal(EntryName = EntryName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEntryName = getEntryName.toJsFn, hasEntry = hasEntry.toJsFn, isReadonly = isReadonly.toJsFn, isStored = isStored.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = js.Any.fromFunction2((t0: SeqEquiv[PropertyValue], t1: SeqEquiv[PropertyValue]) => (reload(t0, t1)).runNow()), saveCompleted = js.Any.fromFunction1((t0: Boolean) => saveCompleted(t0).runNow()), setPersistentEntry = js.Any.fromFunction5((t0: XStorage, t1: String, t2: Double, t3: SeqEquiv[PropertyValue], t4: SeqEquiv[PropertyValue]) => (setPersistentEntry(t0, t1, t2, t3, t4)).runNow()), storeAsEntry = js.Any.fromFunction4((t0: XStorage, t1: String, t2: SeqEquiv[PropertyValue], t3: SeqEquiv[PropertyValue]) => (storeAsEntry(t0, t1, t2, t3)).runNow()), storeOwn = storeOwn.toJsFn, storeToEntry = js.Any.fromFunction4((t0: XStorage, t1: String, t2: SeqEquiv[PropertyValue], t3: SeqEquiv[PropertyValue]) => (storeToEntry(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[XEmbedPersist2]
  }
  
  extension [Self <: XEmbedPersist2](x: Self) {
    
    inline def setIsStored(value: CallbackTo[Boolean]): Self = StObject.set(x, "isStored", value.toJsFn)
  }
}

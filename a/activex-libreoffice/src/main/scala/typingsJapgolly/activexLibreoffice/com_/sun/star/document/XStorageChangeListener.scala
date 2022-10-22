package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to be notified when a document is switched to a new storage. */
trait XStorageChangeListener
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /**
    * is called when document switches to another storage.
    * @param xDocument the document that has changed the storage it is based on
    * @param xStorage the new storage the document is based on
    */
  def notifyStorageChange(xDocument: XInterface, xStorage: XStorage): Unit
}
object XStorageChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    notifyStorageChange: (XInterface, XStorage) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XStorageChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => disposing(t0).runNow()), notifyStorageChange = js.Any.fromFunction2((t0: XInterface, t1: XStorage) => (notifyStorageChange(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStorageChangeListener]
  }
  
  extension [Self <: XStorageChangeListener](x: Self) {
    
    inline def setNotifyStorageChange(value: (XInterface, XStorage) => Callback): Self = StObject.set(x, "notifyStorageChange", js.Any.fromFunction2((t0: XInterface, t1: XStorage) => (value(t0, t1)).runNow()))
  }
}

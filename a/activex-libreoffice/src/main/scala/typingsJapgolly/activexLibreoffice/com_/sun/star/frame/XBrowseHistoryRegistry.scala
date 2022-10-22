package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XBrowseHistoryRegistry
  extends StObject
     with XInterface {
  
  /** @deprecated Deprecated */
  def createNewEntry(URL: String, Arguments: SeqEquiv[PropertyValue], Title: String): Unit
  
  /** @deprecated Deprecated */
  def updateViewData(Value: Any): Unit
}
object XBrowseHistoryRegistry {
  
  inline def apply(
    acquire: Callback,
    createNewEntry: (String, SeqEquiv[PropertyValue], String) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateViewData: Any => Callback
  ): XBrowseHistoryRegistry = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createNewEntry = js.Any.fromFunction3((t0: String, t1: SeqEquiv[PropertyValue], t2: String) => (createNewEntry(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateViewData = js.Any.fromFunction1((t0: Any) => updateViewData(t0).runNow()))
    __obj.asInstanceOf[XBrowseHistoryRegistry]
  }
  
  extension [Self <: XBrowseHistoryRegistry](x: Self) {
    
    inline def setCreateNewEntry(value: (String, SeqEquiv[PropertyValue], String) => Callback): Self = StObject.set(x, "createNewEntry", js.Any.fromFunction3((t0: String, t1: SeqEquiv[PropertyValue], t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateViewData(value: Any => Callback): Self = StObject.set(x, "updateViewData", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}

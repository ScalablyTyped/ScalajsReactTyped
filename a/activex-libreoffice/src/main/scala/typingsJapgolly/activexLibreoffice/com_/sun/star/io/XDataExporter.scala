package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to export data from a component into a data sink.
  *
  * Exporter objects are registered for specific components and data types.
  */
trait XDataExporter
  extends StObject
     with XInterface {
  
  /** cancels the export process. */
  def cancel(): Unit
  
  /** exports data for a component into an output stream. */
  def exportData(aOutputStream: XOutputStream, Component: XComponent, aListener: XDataTransferEventListener): Unit
}
object XDataExporter {
  
  inline def apply(
    acquire: Callback,
    cancel: Callback,
    exportData: (XOutputStream, XComponent, XDataTransferEventListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDataExporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, exportData = js.Any.fromFunction3((t0: XOutputStream, t1: XComponent, t2: XDataTransferEventListener) => (exportData(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataExporter]
  }
  
  extension [Self <: XDataExporter](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setExportData(value: (XOutputStream, XComponent, XDataTransferEventListener) => Callback): Self = StObject.set(x, "exportData", js.Any.fromFunction3((t0: XOutputStream, t1: XComponent, t2: XDataTransferEventListener) => (value(t0, t1, t2)).runNow()))
  }
}

package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to import data from a data source into a component.
  *
  * Importer objects are registered for specific components and data types.
  */
trait XDataImporter
  extends StObject
     with XInterface {
  
  /** cancels the import process. */
  def cancel(): Unit
  
  /** imports data for a component from an active data source. */
  def importData(aActiveSource: XActiveDataSource, Component: XComponent, aListener: XDataTransferEventListener): Unit
}
object XDataImporter {
  
  inline def apply(
    acquire: Callback,
    cancel: Callback,
    importData: (XActiveDataSource, XComponent, XDataTransferEventListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDataImporter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancel = cancel.toJsFn, importData = js.Any.fromFunction3((t0: XActiveDataSource, t1: XComponent, t2: XDataTransferEventListener) => (importData(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataImporter]
  }
  
  extension [Self <: XDataImporter](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setImportData(value: (XActiveDataSource, XComponent, XDataTransferEventListener) => Callback): Self = StObject.set(x, "importData", js.Any.fromFunction3((t0: XActiveDataSource, t1: XComponent, t2: XDataTransferEventListener) => (value(t0, t1, t2)).runNow()))
  }
}

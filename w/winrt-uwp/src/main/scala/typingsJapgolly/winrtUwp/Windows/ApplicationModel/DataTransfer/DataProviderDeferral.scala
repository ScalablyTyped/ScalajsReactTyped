package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used by a source app's deferral delegate to notify a DataPackage object that the source app will produce data from another asynchronous function. */
trait DataProviderDeferral extends StObject {
  
  /** Informs a DataPackage that it is ready for processing. */
  def complete(): Unit
}
object DataProviderDeferral {
  
  inline def apply(complete: Callback): DataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[DataProviderDeferral]
  }
  
  extension [Self <: DataProviderDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}

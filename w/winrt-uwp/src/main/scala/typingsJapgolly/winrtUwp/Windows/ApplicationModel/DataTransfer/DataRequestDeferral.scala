package typingsJapgolly.winrtUwp.Windows.ApplicationModel.DataTransfer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables you to exchange content with a target app asynchronously. */
trait DataRequestDeferral extends StObject {
  
  /** Indicates that the content for an asynchronous share is ready for a target app, or that an error in the sharing operation occurred. */
  def complete(): Unit
}
object DataRequestDeferral {
  
  inline def apply(complete: Callback): DataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[DataRequestDeferral]
  }
  
  extension [Self <: DataRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}

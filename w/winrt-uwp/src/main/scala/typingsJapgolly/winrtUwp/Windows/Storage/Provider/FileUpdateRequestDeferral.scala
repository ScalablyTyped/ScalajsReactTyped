package typingsJapgolly.winrtUwp.Windows.Storage.Provider

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Use to complete an update asynchronously. */
trait FileUpdateRequestDeferral extends StObject {
  
  /** Signals that the response to a FileUpdateRequested event is finished. */
  def complete(): Unit
}
object FileUpdateRequestDeferral {
  
  inline def apply(complete: Callback): FileUpdateRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[FileUpdateRequestDeferral]
  }
  
  extension [Self <: FileUpdateRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}

package typingsJapgolly.winrtUwp.Windows.Media.Core

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
trait MediaStreamSourceStartingRequestDeferral extends StObject {
  
  /** Reports that the application has completed processing the Starting event. */
  def complete(): Unit
}
object MediaStreamSourceStartingRequestDeferral {
  
  inline def apply(complete: Callback): MediaStreamSourceStartingRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[MediaStreamSourceStartingRequestDeferral]
  }
  
  extension [Self <: MediaStreamSourceStartingRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}

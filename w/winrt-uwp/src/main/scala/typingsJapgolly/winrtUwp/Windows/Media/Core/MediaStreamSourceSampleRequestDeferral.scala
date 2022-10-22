package typingsJapgolly.winrtUwp.Windows.Media.Core

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the application to asynchronously report that it has completed retrieving the MediaStreamSample . */
trait MediaStreamSourceSampleRequestDeferral extends StObject {
  
  /** Reports that the application has completed retrieving the MediaStreamSample . */
  def complete(): Unit
}
object MediaStreamSourceSampleRequestDeferral {
  
  inline def apply(complete: Callback): MediaStreamSourceSampleRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = complete.toJsFn)
    __obj.asInstanceOf[MediaStreamSourceSampleRequestDeferral]
  }
  
  extension [Self <: MediaStreamSourceSampleRequestDeferral](x: Self) {
    
    inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
  }
}

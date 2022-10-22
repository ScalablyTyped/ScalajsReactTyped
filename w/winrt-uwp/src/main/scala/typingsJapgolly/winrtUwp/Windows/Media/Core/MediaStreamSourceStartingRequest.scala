package typingsJapgolly.winrtUwp.Windows.Media.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request from the MediaStreamSource.Starting event for the application to start accumulating MediaStreamSample objects from a specific position in the media. */
trait MediaStreamSourceStartingRequest extends StObject {
  
  /**
    * Defers completing the MediaStreamSource.Starting event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceStartingRequestDeferral
  
  /**
    * Specifies the starting position in the media time-line for subsequent MediaStreamSamples that will be delivered to the MediaStreamSource .
    * @param position The actual starting point in the media time-line chosen by the application.
    */
  def setActualStartPosition(position: Double): Unit
  
  /** Specifies a reference to a TimeSpan object which represents a time position in the media time-line from which the application should return MediaStreamSample objects. */
  var startPosition: Double
}
object MediaStreamSourceStartingRequest {
  
  inline def apply(
    getDeferral: CallbackTo[MediaStreamSourceStartingRequestDeferral],
    setActualStartPosition: Double => Callback,
    startPosition: Double
  ): MediaStreamSourceStartingRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, setActualStartPosition = js.Any.fromFunction1((t0: Double) => setActualStartPosition(t0).runNow()), startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceStartingRequest]
  }
  
  extension [Self <: MediaStreamSourceStartingRequest](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[MediaStreamSourceStartingRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setSetActualStartPosition(value: Double => Callback): Self = StObject.set(x, "setActualStartPosition", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}

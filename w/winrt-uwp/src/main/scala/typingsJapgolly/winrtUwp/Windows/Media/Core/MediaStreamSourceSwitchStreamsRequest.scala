package typingsJapgolly.winrtUwp.Windows.Media.Core

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
trait MediaStreamSourceSwitchStreamsRequest extends StObject {
  
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral
  
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  var newStreamDescriptor: IMediaStreamDescriptor
  
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  var oldStreamDescriptor: IMediaStreamDescriptor
}
object MediaStreamSourceSwitchStreamsRequest {
  
  inline def apply(
    getDeferral: CallbackTo[MediaStreamSourceSwitchStreamsRequestDeferral],
    newStreamDescriptor: IMediaStreamDescriptor,
    oldStreamDescriptor: IMediaStreamDescriptor
  ): MediaStreamSourceSwitchStreamsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, newStreamDescriptor = newStreamDescriptor.asInstanceOf[js.Any], oldStreamDescriptor = oldStreamDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequest]
  }
  
  extension [Self <: MediaStreamSourceSwitchStreamsRequest](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[MediaStreamSourceSwitchStreamsRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setNewStreamDescriptor(value: IMediaStreamDescriptor): Self = StObject.set(x, "newStreamDescriptor", value.asInstanceOf[js.Any])
    
    inline def setOldStreamDescriptor(value: IMediaStreamDescriptor): Self = StObject.set(x, "oldStreamDescriptor", value.asInstanceOf[js.Any])
  }
}

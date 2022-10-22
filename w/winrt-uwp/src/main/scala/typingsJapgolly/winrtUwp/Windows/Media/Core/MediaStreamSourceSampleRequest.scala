package typingsJapgolly.winrtUwp.Windows.Media.Core

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an object to be used by the MediaStreamSource.SampleRequest event to provide information to the application. */
trait MediaStreamSourceSampleRequest extends StObject {
  
  /**
    * Defers assigning a MediaStreamSample to MediaStreamSourceSampleRequest object.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSampleRequestDeferral
  
  /**
    * Provides a status update to the MediaStreamSource while the application is temporarily unable to deliver a requested MediaStreamSample .
    * @param progress A value between 0 to 100 that indicates the progress towards being able to deliver the requested MediaStreamSample .
    */
  def reportSampleProgress(progress: Double): Unit
  
  /** Sets the MediaStreamSample requested by the MediaStreamSource . Applications deliver a MediaStreamSample to the MediaStreamSource by assigning a value to this property. */
  var sample: MediaStreamSample
  
  /** Gets the IMediaStreamDescriptor interface of the stream for which a MediaStreamSample is being requested. */
  var streamDescriptor: IMediaStreamDescriptor
}
object MediaStreamSourceSampleRequest {
  
  inline def apply(
    getDeferral: CallbackTo[MediaStreamSourceSampleRequestDeferral],
    reportSampleProgress: Double => Callback,
    sample: MediaStreamSample,
    streamDescriptor: IMediaStreamDescriptor
  ): MediaStreamSourceSampleRequest = {
    val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, reportSampleProgress = js.Any.fromFunction1((t0: Double) => reportSampleProgress(t0).runNow()), sample = sample.asInstanceOf[js.Any], streamDescriptor = streamDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSampleRequest]
  }
  
  extension [Self <: MediaStreamSourceSampleRequest](x: Self) {
    
    inline def setGetDeferral(value: CallbackTo[MediaStreamSourceSampleRequestDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setReportSampleProgress(value: Double => Callback): Self = StObject.set(x, "reportSampleProgress", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSample(value: MediaStreamSample): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    inline def setStreamDescriptor(value: IMediaStreamDescriptor): Self = StObject.set(x, "streamDescriptor", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Media.Core.AudioStreamDescriptor
import typingsJapgolly.winrtUwp.Windows.Media.Core.IMediaStreamDescriptor
import typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSample
import typingsJapgolly.winrtUwp.Windows.Media.Core.VideoStreamDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains methods that a stream parser plug-in uses to send notifications to a PlayReady-ND client. */
trait NDStreamParserNotifier extends StObject {
  
  /**
    * Called by the stream parser when it requests a setup decryptor.
    * @param descriptor The descriptor of the media stream being decrypted.
    * @param keyID The key identifier used for decryption.
    * @param proBytes The data for the setup decryptor.
    */
  def onBeginSetupDecryptor(descriptor: IMediaStreamDescriptor, keyID: String, proBytes: js.Array[Double]): Unit
  
  /**
    * Called by a stream parser when it receives the content identifier.
    * @param licenseFetchDescriptor The license fetch descriptor containing the content identifier.
    */
  def onContentIDReceived(licenseFetchDescriptor: INDLicenseFetchDescriptor): Unit
  
  /**
    * Called by the stream parser when the media stream descriptor is created.
    * @param audioStreamDescriptors An array of audio stream descriptors that are part of the media stream descriptor.
    * @param videoStreamDescriptors An array of video stream descriptors that are part of the media stream descriptor.
    */
  def onMediaStreamDescriptorCreated(
    audioStreamDescriptors: IVector[AudioStreamDescriptor],
    videoStreamDescriptors: IVector[VideoStreamDescriptor]
  ): Unit
  
  /**
    * Called when the stream parser parses a sample from the media stream.
    * @param streamID The identifier for the media stream that is being parsed.
    * @param streamType The type of the media stream. This value can be Audio or Video.
    * @param streamSample The array of stream samples.
    * @param pts The presentation timestamp that indicates when to play the sample, in milliseconds. This value is relative to previous samples in the presentation. For example, if a given sample has a presentation time stamp of 1000 and some later sample has a presentation time stamp of 2000, the later sample occurs one second (1000ms) after the given sample.
    * @param ccFormat The closed caption format. This value can be ATSC, SCTE20, or Unknown.
    * @param ccDataBytes An array that contains the closed caption data.
    */
  def onSampleParsed(
    streamID: Double,
    streamType: NDMediaStreamType,
    streamSample: MediaStreamSample,
    pts: Double,
    ccFormat: NDClosedCaptionFormat,
    ccDataBytes: js.Array[Double]
  ): Unit
}
object NDStreamParserNotifier {
  
  inline def apply(
    onBeginSetupDecryptor: (IMediaStreamDescriptor, String, js.Array[Double]) => Callback,
    onContentIDReceived: INDLicenseFetchDescriptor => Callback,
    onMediaStreamDescriptorCreated: (IVector[AudioStreamDescriptor], IVector[VideoStreamDescriptor]) => Callback,
    onSampleParsed: (Double, NDMediaStreamType, MediaStreamSample, Double, NDClosedCaptionFormat, js.Array[Double]) => Callback
  ): NDStreamParserNotifier = {
    val __obj = js.Dynamic.literal(onBeginSetupDecryptor = js.Any.fromFunction3((t0: IMediaStreamDescriptor, t1: String, t2: js.Array[Double]) => (onBeginSetupDecryptor(t0, t1, t2)).runNow()), onContentIDReceived = js.Any.fromFunction1((t0: INDLicenseFetchDescriptor) => onContentIDReceived(t0).runNow()), onMediaStreamDescriptorCreated = js.Any.fromFunction2((t0: IVector[AudioStreamDescriptor], t1: IVector[VideoStreamDescriptor]) => (onMediaStreamDescriptorCreated(t0, t1)).runNow()), onSampleParsed = js.Any.fromFunction6((t0: Double, t1: NDMediaStreamType, t2: MediaStreamSample, t3: Double, t4: NDClosedCaptionFormat, t5: js.Array[Double]) => (onSampleParsed(t0, t1, t2, t3, t4, t5)).runNow()))
    __obj.asInstanceOf[NDStreamParserNotifier]
  }
  
  extension [Self <: NDStreamParserNotifier](x: Self) {
    
    inline def setOnBeginSetupDecryptor(value: (IMediaStreamDescriptor, String, js.Array[Double]) => Callback): Self = StObject.set(x, "onBeginSetupDecryptor", js.Any.fromFunction3((t0: IMediaStreamDescriptor, t1: String, t2: js.Array[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnContentIDReceived(value: INDLicenseFetchDescriptor => Callback): Self = StObject.set(x, "onContentIDReceived", js.Any.fromFunction1((t0: INDLicenseFetchDescriptor) => value(t0).runNow()))
    
    inline def setOnMediaStreamDescriptorCreated(value: (IVector[AudioStreamDescriptor], IVector[VideoStreamDescriptor]) => Callback): Self = StObject.set(x, "onMediaStreamDescriptorCreated", js.Any.fromFunction2((t0: IVector[AudioStreamDescriptor], t1: IVector[VideoStreamDescriptor]) => (value(t0, t1)).runNow()))
    
    inline def setOnSampleParsed(
      value: (Double, NDMediaStreamType, MediaStreamSample, Double, NDClosedCaptionFormat, js.Array[Double]) => Callback
    ): Self = StObject.set(x, "onSampleParsed", js.Any.fromFunction6((t0: Double, t1: NDMediaStreamType, t2: MediaStreamSample, t3: Double, t4: NDClosedCaptionFormat, t5: js.Array[Double]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
  }
}

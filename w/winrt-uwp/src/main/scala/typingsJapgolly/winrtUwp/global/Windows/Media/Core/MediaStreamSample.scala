package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IInputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media sample used by the MediaStreamSource . */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaStreamSample")
@js.native
open class MediaStreamSample ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSample
object MediaStreamSample {
  
  @JSGlobal("Windows.Media.Core.MediaStreamSample")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MediaStreamSample from an IBuffer .
    * @param buffer The buffer that contains the media data used to create the MediaStreamSample .
    * @param timestamp The presentation time of this sample.
    * @return The sample created from the data in buffer.
    */
  /* static member */
  inline def createFromBuffer(buffer: IBuffer, timestamp: Double): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSample = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSample]
  
  /**
    * Asynchronously creates a MediaStreamSample from an IInputStream .
    * @param stream The stream that contains the media data used to create the MediaStreamSample .
    * @param count The length of the data in the sample. This is the number of bytes that will be read from stream.
    * @param timestamp The presentation time of this MediaStreamSample .
    * @return When this method completes, it returns the new file as a MediaStreamSample .
    */
  /* static member */
  inline def createFromStreamAsync(stream: IInputStream, count: Double, timestamp: Double): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSample] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any], count.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSample]]
}

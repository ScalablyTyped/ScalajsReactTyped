package typingsJapgolly.winrt.Windows.Media

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transcoding {
  
  @js.native
  sealed trait TranscodeFailureReason extends StObject
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    @js.native
    sealed trait codecNotFound
      extends StObject
         with TranscodeFailureReason
    
    @js.native
    sealed trait invalidProfile
      extends StObject
         with TranscodeFailureReason
    
    @js.native
    sealed trait none
      extends StObject
         with TranscodeFailureReason
    
    @js.native
    sealed trait unknown
      extends StObject
         with TranscodeFailureReason
  }
  
  @js.native
  trait IMediaTranscoder extends StObject {
    
    def addAudioEffect(activatableClassId: String): Unit = js.native
    def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    def addVideoEffect(activatableClassId: String): Unit = js.native
    def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    var alwaysReencode: Boolean = js.native
    
    def clearEffects(): Unit = js.native
    
    var hardwareAccelerationEnabled: Boolean = js.native
    
    def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
    
    def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
    
    var trimStartTime: Double = js.native
    
    var trimStopTime: Double = js.native
  }
  
  trait IPrepareTranscodeResult extends StObject {
    
    var canTranscode: Boolean
    
    var failureReason: TranscodeFailureReason
    
    def transcodeAsync(): IAsyncActionWithProgress[Double]
  }
  object IPrepareTranscodeResult {
    
    inline def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: CallbackTo[IAsyncActionWithProgress[Double]]
    ): IPrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = transcodeAsync.toJsFn)
      __obj.asInstanceOf[IPrepareTranscodeResult]
    }
    
    extension [Self <: IPrepareTranscodeResult](x: Self) {
      
      inline def setCanTranscode(value: Boolean): Self = StObject.set(x, "canTranscode", value.asInstanceOf[js.Any])
      
      inline def setFailureReason(value: TranscodeFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      inline def setTranscodeAsync(value: CallbackTo[IAsyncActionWithProgress[Double]]): Self = StObject.set(x, "transcodeAsync", value.toJsFn)
    }
  }
  
  @js.native
  trait MediaTranscoder
    extends StObject
       with IMediaTranscoder
  
  trait PrepareTranscodeResult
    extends StObject
       with IPrepareTranscodeResult
  object PrepareTranscodeResult {
    
    inline def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: CallbackTo[IAsyncActionWithProgress[Double]]
    ): PrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = transcodeAsync.toJsFn)
      __obj.asInstanceOf[PrepareTranscodeResult]
    }
  }
}

package typingsJapgolly.winrt.global.Windows.Media

import typingsJapgolly.winrt.Windows.Foundation.IAsyncActionWithProgress
import typingsJapgolly.winrt.Windows.Media.Transcoding.TranscodeFailureReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transcoding {
  
  @JSGlobal("Windows.Media.Transcoding.MediaTranscoder")
  @js.native
  open class MediaTranscoder ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Transcoding.MediaTranscoder
  
  @JSGlobal("Windows.Media.Transcoding.PrepareTranscodeResult")
  @js.native
  open class PrepareTranscodeResult ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.Transcoding.PrepareTranscodeResult {
    
    /* CompleteClass */
    var canTranscode: Boolean = js.native
    
    /* CompleteClass */
    var failureReason: TranscodeFailureReason = js.native
    
    /* CompleteClass */
    override def transcodeAsync(): IAsyncActionWithProgress[Double] = js.native
  }
  
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Media.Transcoding.TranscodeFailureReason & Double] = js.native
    
    /* 3 */ val codecNotFound: typingsJapgolly.winrt.Windows.Media.Transcoding.TranscodeFailureReason.codecNotFound & Double = js.native
    
    /* 2 */ val invalidProfile: typingsJapgolly.winrt.Windows.Media.Transcoding.TranscodeFailureReason.invalidProfile & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Media.Transcoding.TranscodeFailureReason.none & Double = js.native
    
    /* 1 */ val unknown: typingsJapgolly.winrt.Windows.Media.Transcoding.TranscodeFailureReason.unknown & Double = js.native
  }
}

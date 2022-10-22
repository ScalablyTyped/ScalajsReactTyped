package typingsJapgolly.winrtUwp.Windows.Media.Capture

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for taking a low shutter lag photo. */
trait LowLagPhotoCapture extends StObject {
  
  /**
    * Asynchronously captures a low shutter lag photo.
    * @return When this method completes, a CapturedPhoto object is returned which contains the captured photo.
    */
  def captureAsync(): IPromiseWithIAsyncOperation[CapturedPhoto]
  
  /**
    * Asynchronously releases the LowLagPhotoCapture object and resources used by the capture photo operation.
    * @return Object that is used to control the asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncAction
}
object LowLagPhotoCapture {
  
  inline def apply(
    captureAsync: CallbackTo[IPromiseWithIAsyncOperation[CapturedPhoto]],
    finishAsync: CallbackTo[IPromiseWithIAsyncAction]
  ): LowLagPhotoCapture = {
    val __obj = js.Dynamic.literal(captureAsync = captureAsync.toJsFn, finishAsync = finishAsync.toJsFn)
    __obj.asInstanceOf[LowLagPhotoCapture]
  }
  
  extension [Self <: LowLagPhotoCapture](x: Self) {
    
    inline def setCaptureAsync(value: CallbackTo[IPromiseWithIAsyncOperation[CapturedPhoto]]): Self = StObject.set(x, "captureAsync", value.toJsFn)
    
    inline def setFinishAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "finishAsync", value.toJsFn)
  }
}

package typingsJapgolly.winrt.global.Windows.Storage

import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.StreamedFileDataRequest")
@js.native
open class StreamedFileDataRequest ()
  extends StObject
     with typingsJapgolly.winrt.Windows.Storage.StreamedFileDataRequest {
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def failAndClose(failureMode: typingsJapgolly.winrt.Windows.Storage.StreamedFileFailureMode): Unit = js.native
  
  /* CompleteClass */
  override def flushAsync(): IAsyncOperation[Boolean] = js.native
  
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

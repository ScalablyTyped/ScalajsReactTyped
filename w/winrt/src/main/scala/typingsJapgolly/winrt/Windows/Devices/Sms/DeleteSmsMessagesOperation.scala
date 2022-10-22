package typingsJapgolly.winrt.Windows.Devices.Sms

import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IPromise
import typingsJapgolly.winrt.anon.CompletedGetResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSmsMessagesOperation
  extends StObject
     with IAsyncAction {
  
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: js.Function1[/* value */ Any, Any]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: js.Function1[/* value */ Any, Any], error: js.Function1[/* error */ Any, Any]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: js.Function1[/* value */ Any, Any],
    error: js.Function1[/* error */ Any, Any],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: js.Function1[/* value */ Any, Any],
    error: Unit,
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: Unit, error: js.Function1[/* error */ Any, Any]): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](
    success: Unit,
    error: js.Function1[/* error */ Any, Any],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MDeleteSmsMessagesOperation[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Unit = js.native
  
  var operation: CompletedGetResults = js.native
  
  def `then`[U](success: js.Function1[/* value */ Any, IPromise[U] | U]): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ Any, IPromise[U] | U],
    error: js.Function1[/* error */ Any, IPromise[U] | U]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ Any, IPromise[U] | U],
    error: js.Function1[/* error */ Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ Any, IPromise[U] | U],
    error: Unit,
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[U] = js.native
}

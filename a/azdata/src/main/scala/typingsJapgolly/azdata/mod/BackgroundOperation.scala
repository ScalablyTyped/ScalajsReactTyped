package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundOperation extends js.Object {
  /**
  		 * Operation Id
  		 */
  var id: String = js.native
  /**
  		 * Event raised when operation is canceled in UI
  		 */
  @JSName("onCanceled")
  var onCanceled_Original: Event[Unit] = js.native
  /**
  		 * Event raised when operation is canceled in UI
  		 */
  def onCanceled(listener: js.Function1[/* e */ Unit, _]): Disposable = js.native
  def onCanceled(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any): Disposable = js.native
  def onCanceled(listener: js.Function1[/* e */ Unit, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
  /**
  		 * Updates the operation status or adds progress message
  		 * @param status Operation Status
  		 * @param message Progress message
  		 */
  def updateStatus(status: TaskStatus): Unit = js.native
  def updateStatus(status: TaskStatus, message: String): Unit = js.native
}


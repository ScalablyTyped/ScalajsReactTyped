package typingsJapgolly.azdata.mod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundOperation extends StObject {
  
  /**
    * Operation Id
    */
  var id: String = js.native
  
  /**
    * Event raised when operation is canceled in UI
    */
  def onCanceled(listener: js.Function1[/* e */ Unit, Any]): Disposable = js.native
  def onCanceled(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any): Disposable = js.native
  def onCanceled(listener: js.Function1[/* e */ Unit, Any], thisArgs: Any, disposables: js.Array[Disposable]): Disposable = js.native
  def onCanceled(listener: js.Function1[/* e */ Unit, Any], thisArgs: Unit, disposables: js.Array[Disposable]): Disposable = js.native
  /**
    * Event raised when operation is canceled in UI
    */
  @JSName("onCanceled")
  var onCanceled_Original: Event[Unit] = js.native
  
  /**
    * Updates the operation status or adds progress message
    * @param status Operation Status
    * @param message Progress message
    */
  def updateStatus(status: TaskStatus): Unit = js.native
  def updateStatus(status: TaskStatus, message: String): Unit = js.native
}

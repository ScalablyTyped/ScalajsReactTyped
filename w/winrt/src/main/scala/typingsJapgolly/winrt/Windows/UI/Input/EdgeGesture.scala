package typingsJapgolly.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
class EdgeGesture () extends IEdgeGesture {
  /* CompleteClass */
  override var oncanceled: js.Any = js.native
  /* CompleteClass */
  override var oncompleted: js.Any = js.native
  /* CompleteClass */
  override var onstarting: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.EdgeGesture")
@js.native
object EdgeGesture extends js.Object {
  def getForCurrentView(): EdgeGesture = js.native
}


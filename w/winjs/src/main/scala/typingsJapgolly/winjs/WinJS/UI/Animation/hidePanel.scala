package typingsJapgolly.winjs.WinJS.UI.Animation

import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.hidePanel")
@js.native
object hidePanel extends js.Object {
  /**
    * Performs an animation that hides a panel.
    * @param element Element or elements that are being hidden.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements end the animation just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(element: js.Any): Promise[_] = js.native
  def apply(element: js.Any, offset: js.Any): Promise[_] = js.native
}


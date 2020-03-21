package typingsJapgolly.winjs.WinJS.UI.Animation

import typingsJapgolly.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.swipeReveal")
@js.native
object swipeReveal extends js.Object {
  /**
    * Performs an animation that reveals an item or items in response to a swipe interaction.
    * @param target Element or elements being revealed.
    * @param offset An initial offset where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(target: js.Any): Promise[_] = js.native
  def apply(target: js.Any, offset: js.Any): Promise[_] = js.native
}


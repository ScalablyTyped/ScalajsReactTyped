package typingsJapgolly.reactNativeModal.modalMod

import typingsJapgolly.reactNativeModal.typesMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSwipeCompleteParams extends js.Object {
  var swipingDirection: Direction
}

object OnSwipeCompleteParams {
  @scala.inline
  def apply(swipingDirection: Direction): OnSwipeCompleteParams = {
    val __obj = js.Dynamic.literal(swipingDirection = swipingDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnSwipeCompleteParams]
  }
}


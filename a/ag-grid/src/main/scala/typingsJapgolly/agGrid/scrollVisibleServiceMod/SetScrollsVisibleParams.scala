package typingsJapgolly.agGrid.scrollVisibleServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScrollsVisibleParams extends js.Object {
  var bodyHorizontalScrollShowing: Boolean
  var leftVerticalScrollShowing: Boolean
  var rightVerticalScrollShowing: Boolean
}

object SetScrollsVisibleParams {
  @scala.inline
  def apply(
    bodyHorizontalScrollShowing: Boolean,
    leftVerticalScrollShowing: Boolean,
    rightVerticalScrollShowing: Boolean
  ): SetScrollsVisibleParams = {
    val __obj = js.Dynamic.literal(bodyHorizontalScrollShowing = bodyHorizontalScrollShowing.asInstanceOf[js.Any], leftVerticalScrollShowing = leftVerticalScrollShowing.asInstanceOf[js.Any], rightVerticalScrollShowing = rightVerticalScrollShowing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetScrollsVisibleParams]
  }
}


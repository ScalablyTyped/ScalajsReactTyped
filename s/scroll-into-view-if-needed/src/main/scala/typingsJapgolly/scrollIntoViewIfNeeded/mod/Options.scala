package typingsJapgolly.scrollIntoViewIfNeeded.mod

import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.CustomScrollBoundary
import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.ScrollBehavior
import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.ScrollLogicalPosition
import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.ScrollMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T]
  extends typingsJapgolly.scrollIntoViewIfNeeded.typesMod.Options {
  var behavior: js.UndefOr[ScrollBehavior | CustomScrollBehaviorCallback[T]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    behavior: ScrollBehavior | CustomScrollBehaviorCallback[T] = null,
    block: ScrollLogicalPosition = null,
    boundary: CustomScrollBoundary = null,
    `inline`: ScrollLogicalPosition = null,
    scrollMode: ScrollMode = null,
    skipOverflowHiddenElements: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (block != null) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (scrollMode != null) __obj.updateDynamic("scrollMode")(scrollMode.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOverflowHiddenElements)) __obj.updateDynamic("skipOverflowHiddenElements")(skipOverflowHiddenElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}


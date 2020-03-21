package typingsJapgolly.jupyterlabStatusbar.tokensMod.IStatusBar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phosphorSignaling.mod.ISignal
import typingsJapgolly.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for status bar items.
  */
trait IItem extends js.Object {
  /**
    * A signal that is fired when the item active state changes.
    */
  var activeStateChanged: js.UndefOr[ISignal[_, Unit]] = js.undefined
  /**
    * Which side to place item.
    * Permanent items are intended for the right and left side,
    * with more transient items in the middle.
    */
  var align: js.UndefOr[Alignment] = js.undefined
  /**
    * Whether the item is shown or hidden.
    */
  var isActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The item to add to the status bar.
    */
  var item: Widget
  /**
    *  Ordering of Items -- higher rank items are closer to the middle.
    */
  var rank: js.UndefOr[Double] = js.undefined
}

object IItem {
  @scala.inline
  def apply(
    item: Widget,
    activeStateChanged: ISignal[_, Unit] = null,
    align: Alignment = null,
    isActive: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    rank: Int | Double = null
  ): IItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (activeStateChanged != null) __obj.updateDynamic("activeStateChanged")(activeStateChanged.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    isActive.foreach(p => __obj.updateDynamic("isActive")(p.toJsFn))
    if (rank != null) __obj.updateDynamic("rank")(rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItem]
  }
}


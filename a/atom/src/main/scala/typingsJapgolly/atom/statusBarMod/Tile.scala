package typingsJapgolly.atom.statusBarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile extends js.Object {
  /** Remove the Tile from the status bar. */
  def destroy(): Unit
  /** Retrieve the Tile's item. */
  def getItem(): js.Object
  /** Retrieve the priority that was assigned to the Tile when it was created. */
  def getPriority(): Double
}

object Tile {
  @scala.inline
  def apply(destroy: Callback, getItem: CallbackTo[js.Object], getPriority: CallbackTo[Double]): Tile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getItem")(getItem.toJsFn)
    __obj.updateDynamic("getPriority")(getPriority.toJsFn)
    __obj.asInstanceOf[Tile]
  }
}


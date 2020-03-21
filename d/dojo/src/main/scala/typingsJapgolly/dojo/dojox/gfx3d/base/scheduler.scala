package typingsJapgolly.dojo.dojox.gfx3d.base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.scheduler.html
  *
  *
  */
trait scheduler extends js.Object {
  /**
    *
    */
  def BinarySearchTree(): Unit
  /**
    *
    * @param buffer
    * @param outline
    */
  def bsp(buffer: js.Any, outline: js.Any): js.Any
  /**
    *
    * @param it
    */
  def order(it: js.Any): js.Any
  /**
    *
    * @param it
    */
  def outline(it: js.Any): js.Any
  /**
    *
    * @param buffer
    * @param order
    */
  def zOrder(buffer: js.Any, order: js.Any): js.Any
}

object scheduler {
  @scala.inline
  def apply(
    BinarySearchTree: Callback,
    bsp: (js.Any, js.Any) => CallbackTo[js.Any],
    order: js.Any => CallbackTo[js.Any],
    outline: js.Any => CallbackTo[js.Any],
    zOrder: (js.Any, js.Any) => CallbackTo[js.Any]
  ): scheduler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BinarySearchTree")(BinarySearchTree.toJsFn)
    __obj.updateDynamic("bsp")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => bsp(t0, t1).runNow()))
    __obj.updateDynamic("order")(js.Any.fromFunction1((t0: js.Any) => order(t0).runNow()))
    __obj.updateDynamic("outline")(js.Any.fromFunction1((t0: js.Any) => outline(t0).runNow()))
    __obj.updateDynamic("zOrder")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => zOrder(t0, t1).runNow()))
    __obj.asInstanceOf[scheduler]
  }
}


package typingsJapgolly.dojo.dijit.OnDijitClickMixin

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_OnDijitClickMixin.a11yclick.html
  *
  * Custom press, release, and click synthetic events
  * which trigger on a left mouse click, touch, or space/enter keyup.
  * 
  */
trait a11yclick extends js.Object {
  /**
    * Logical click operation for mouse, touch, or keyboard (space/enter key)
    * 
    * @param node             
    * @param listener             
    */
  def click(node: js.Any, listener: js.Any): Unit
  /**
    * Mouse cursor or a finger is dragged over the given node.
    * 
    * @param node             
    * @param listener             
    */
  def move(node: js.Any, listener: js.Any): Unit
  /**
    * Mousedown (left button), touchstart, or keydown (space or enter) corresponding to logical click operation.
    * 
    * @param node             
    * @param listener             
    */
  def press(node: js.Any, listener: js.Any): Unit
  /**
    * Mouseup (left button), touchend, or keyup (space or enter) corresponding to logical click operation.
    * 
    * @param node             
    * @param listener             
    */
  def release(node: js.Any, listener: js.Any): Unit
}

object a11yclick {
  @scala.inline
  def apply(
    click: (js.Any, js.Any) => Callback,
    move: (js.Any, js.Any) => Callback,
    press: (js.Any, js.Any) => Callback,
    release: (js.Any, js.Any) => Callback
  ): a11yclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("click")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => click(t0, t1).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => move(t0, t1).runNow()))
    __obj.updateDynamic("press")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => press(t0, t1).runNow()))
    __obj.updateDynamic("release")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => release(t0, t1).runNow()))
    __obj.asInstanceOf[a11yclick]
  }
}


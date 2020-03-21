package typingsJapgolly.dojo.dojo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/mouse.html
  *
  * This module provide mouse event handling utility functions and exports
  * mouseenter and mouseleave event emulation.
  *
  */
trait mouse extends js.Object {
  /**
    * This is an extension event for the mouseenter that IE provides, emulating the
    * behavior on other browsers.
    *
    */
  var enter: js.Object
  /**
    * This is an extension event for the mouseleave that IE provides, emulating the
    * behavior on other browsers.
    *
    */
  var leave: js.Object
  /**
    * Test an event object (from a mousedown event) to see if the left button was pressed.
    *
    */
  def isLeft(): Unit
  /**
    * Test an event object (from a mousedown event) to see if the middle button was pressed.
    *
    */
  def isMiddle(): Unit
  /**
    * Test an event object (from a mousedown event) to see if the right button was pressed.
    *
    */
  def isRight(): Unit
  /**
    * This is an extension event for the mousewheel that non-Mozilla browsers provide,
    * emulating the behavior on Mozilla based browsers.
    *
    * @param node
    * @param listener
    */
  def wheel(node: js.Any, listener: js.Any): js.Any
}

object mouse {
  @scala.inline
  def apply(
    enter: js.Object,
    isLeft: Callback,
    isMiddle: Callback,
    isRight: Callback,
    leave: js.Object,
    wheel: (js.Any, js.Any) => CallbackTo[js.Any]
  ): mouse = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], leave = leave.asInstanceOf[js.Any])
    __obj.updateDynamic("isLeft")(isLeft.toJsFn)
    __obj.updateDynamic("isMiddle")(isMiddle.toJsFn)
    __obj.updateDynamic("isRight")(isRight.toJsFn)
    __obj.updateDynamic("wheel")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => wheel(t0, t1).runNow()))
    __obj.asInstanceOf[mouse]
  }
}


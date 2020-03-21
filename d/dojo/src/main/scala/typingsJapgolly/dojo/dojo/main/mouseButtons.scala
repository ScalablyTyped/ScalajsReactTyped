package typingsJapgolly.dojo.dojo.main

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.mouseButtons.html
  *
  *
  */
trait mouseButtons extends js.Object {
  /**
    * Numeric value of the left mouse button for the platform.
    *
    */
  var LEFT: Double
  /**
    * Numeric value of the middle mouse button for the platform.
    *
    */
  var MIDDLE: Double
  /**
    * Numeric value of the right mouse button for the platform.
    *
    */
  var RIGHT: Double
  /**
    * Checks an event object for a pressed button
    *
    * @param e Event object to examine
    * @param button The button value (example: dojo.mouseButton.LEFT)
    */
  def isButton(e: Event_, button: Double): Boolean
  /**
    * Checks an event object for the pressed left button
    *
    * @param e Event object to examine
    */
  def isLeft(e: Event_): Boolean
  /**
    * Checks an event object for the pressed middle button
    *
    * @param e Event object to examine
    */
  def isMiddle(e: Event_): Boolean
  /**
    * Checks an event object for the pressed right button
    *
    * @param e Event object to examine
    */
  def isRight(e: Event_): Boolean
}

object mouseButtons {
  @scala.inline
  def apply(
    LEFT: Double,
    MIDDLE: Double,
    RIGHT: Double,
    isButton: (Event_, Double) => CallbackTo[Boolean],
    isLeft: Event_ => CallbackTo[Boolean],
    isMiddle: Event_ => CallbackTo[Boolean],
    isRight: Event_ => CallbackTo[Boolean]
  ): mouseButtons = {
    val __obj = js.Dynamic.literal(LEFT = LEFT.asInstanceOf[js.Any], MIDDLE = MIDDLE.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any])
    __obj.updateDynamic("isButton")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Double) => isButton(t0, t1).runNow()))
    __obj.updateDynamic("isLeft")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => isLeft(t0).runNow()))
    __obj.updateDynamic("isMiddle")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => isMiddle(t0).runNow()))
    __obj.updateDynamic("isRight")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => isRight(t0).runNow()))
    __obj.asInstanceOf[mouseButtons]
  }
}


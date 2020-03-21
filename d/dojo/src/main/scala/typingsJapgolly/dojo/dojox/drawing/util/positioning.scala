package typingsJapgolly.dojo.dojox.drawing.util

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/positioning.html
  *
  *
  */
trait positioning extends js.Object {
  /**
    * Returns the optimal position for annotations.Angle.
    *
    * @param start
    * @param end
    */
  def angle(start: js.Object, end: js.Object): js.Object
  /**
    * Returns the optimal text positions for annotations.Label.
    *
    * @param start
    * @param end
    */
  def label(start: js.Object, end: js.Object): js.Object
}

object positioning {
  @scala.inline
  def apply(
    angle: (js.Object, js.Object) => CallbackTo[js.Object],
    label: (js.Object, js.Object) => CallbackTo[js.Object]
  ): positioning = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => angle(t0, t1).runNow()))
    __obj.updateDynamic("label")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => label(t0, t1).runNow()))
    __obj.asInstanceOf[positioning]
  }
}


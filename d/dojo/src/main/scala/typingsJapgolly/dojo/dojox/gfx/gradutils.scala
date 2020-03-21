package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/gradutils.html
  *
  *
  */
trait gradutils extends js.Object {
  /**
    * sample a color from a gradient using a point
    *
    * @param fill fill object
    * @param pt point where to sample a color
    */
  def getColor(fill: js.Object, pt: js.Object): Unit
  /**
    * reverses a gradient
    *
    * @param fill fill object
    */
  def reverse(fill: js.Object): Unit
}

object gradutils {
  @scala.inline
  def apply(getColor: (js.Object, js.Object) => Callback, reverse: js.Object => Callback): gradutils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getColor")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => getColor(t0, t1).runNow()))
    __obj.updateDynamic("reverse")(js.Any.fromFunction1((t0: js.Object) => reverse(t0).runNow()))
    __obj.asInstanceOf[gradutils]
  }
}


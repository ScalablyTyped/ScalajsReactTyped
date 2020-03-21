package typingsJapgolly.dojo.dojox.gfx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/arc.html
  *
  * This module contains the core graphics Arc functions.
  *
  */
trait arc extends js.Object {
  /**
    * an object with properties of an arc around a unit circle from 0 to pi/4
    *
    */
  var curvePI4: js.Object
  /**
    * calculates an arc as a series of Bezier curves
    * given the last point and a standard set of SVG arc parameters,
    * it returns an array of arrays of parameters to form a series of
    * absolute Bezier curves.
    *
    * @param last a point-like object as a start of the arc
    * @param rx a horizontal radius for the virtual ellipse
    * @param ry a vertical radius for the virtual ellipse
    * @param xRotg a rotation of an x axis of the virtual ellipse in degrees
    * @param large which part of the ellipse will be used (the larger arc if true)
    * @param sweep direction of the arc (CW if true)
    * @param x the x coordinate of the end point of the arc
    * @param y the y coordinate of the end point of the arc
    */
  def arcAsBezier(
    last: js.Object,
    rx: Double,
    ry: Double,
    xRotg: Double,
    large: Boolean,
    sweep: Boolean,
    x: Double,
    y: Double
  ): js.Array[_]
  /**
    * return a start point, 1st and 2nd control points, and an end point of
    * a an arc, which is reflected on the x axis
    *
    * @param alpha angle in radians, the arc will be 2 * angle size
    */
  def unitArcAsBezier(alpha: Double): Unit
}

object arc {
  @scala.inline
  def apply(
    arcAsBezier: (js.Object, Double, Double, Double, Boolean, Boolean, Double, Double) => CallbackTo[js.Array[js.Any]],
    curvePI4: js.Object,
    unitArcAsBezier: Double => Callback
  ): arc = {
    val __obj = js.Dynamic.literal(curvePI4 = curvePI4.asInstanceOf[js.Any])
    __obj.updateDynamic("arcAsBezier")(js.Any.fromFunction8((t0: js.Object, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Boolean, t5: scala.Boolean, t6: scala.Double, t7: scala.Double) => arcAsBezier(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    __obj.updateDynamic("unitArcAsBezier")(js.Any.fromFunction1((t0: scala.Double) => unitArcAsBezier(t0).runNow()))
    __obj.asInstanceOf[arc]
  }
}


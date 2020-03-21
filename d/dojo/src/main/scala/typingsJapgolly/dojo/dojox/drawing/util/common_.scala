package typingsJapgolly.dojo.dojox.drawing.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/common.html
  *
  * A collection of common methods used for DojoX Drawing.
  * This singleton is accessible in most Drawing classes
  * as this.util
  *
  */
trait common_ extends js.Object {
  /**
    *
    */
  var objects: js.Object
  /**
    * Converts a namespace (typically a tool or a stencil) into
    * an abbreviation
    *
    * @param type
    */
  def abbr(`type`: js.Any): Double
  /**
    * Return angle based on mouse object
    *
    * @param obj Manager.Mouse event.
    * @param snap               OptionalReturns nearest angle within snap limits
    */
  def angle(obj: Event_, snap: Double): js.Any
  /**
    * Attempts to determine in a Mouse Object
    * was passed or indiviual numbers. Returns
    * an object.
    *
    */
  def argsToObj(): js.Any
  /**
    * Helper function to attach attributes to SVG and VML raw nodes.
    *
    * @param elem
    * @param prop
    * @param value
    * @param squelchErrors
    */
  def attr(elem: js.Object, prop: String, value: js.Any, squelchErrors: js.Any): Boolean
  /**
    * Get an object that was registered with util.register
    *
    * @param id
    */
  def byId(id: String): js.Any
  /**
    * Ensures the angle in the Mouse Object is within the
    * min and max limits. If not one of those limits is used.
    * Returns an x,y point for the angle used.
    *
    * @param obj
    * @param min
    * @param max
    */
  def constrainAngle(obj: Event_, min: Double, max: Double): Event_
  /**
    * Convert the passed number to radians.
    *
    * @param n
    */
  def degToRad(n: Double): Double
  /**
    * Return the length derived from the coordinates
    * in the Mouse object. Different from util.length
    * in that this always returns an absolute value.
    *
    */
  def distance(): js.Any
  /**
    *
    * @param num
    */
  def idSetStart(num: js.Any): Unit
  /**
    * Return the length derived from the coordinates
    * in the Mouse object.
    *
    * @param o
    */
  def length(o: Event_): js.Any
  /**
    * Subtract an amount from a line
    * x1,y1,x2,y2 represents the Line. 'amt' represents the amount
    * to subtract from it.
    *
    * @param x1
    * @param y1
    * @param x2
    * @param y2
    * @param amt
    */
  def lineSub(x1: Double, y1: Double, x2: Double, y2: Double, amt: Double): js.Object
  /**
    *
    * @param o1
    * @param o2
    */
  def mixin(o1: js.Any, o2: js.Any): Unit
  /**
    *
    * @param ang
    */
  def oppAngle(ang: Double): Double
  /**
    * A very helpful method. If you know the center
    * (or starting) point, length and angle, find the
    * x,y point at the end of that line.
    *
    * @param cx
    * @param cy
    * @param radius
    * @param angle
    */
  def pointOnCircle(cx: Double, cy: Double, radius: Double, angle: Double): js.Object
  /**
    * Convert the passed number to degrees.
    *
    * @param n
    */
  def radToDeg(n: Double): Double
  /**
    * Return the radians derived from the coordinates
    * in the Mouse object.
    *
    * @param o
    */
  def radians(o: Event_): js.Any
  /**
    * Since util is the only Singleton in Drawing (besides
    * keys) it is used to help connect the Drawing object
    * the Toolbar. Since multiple drawings can be on one
    * page, this function serves a little more use than
    * on first apearance.
    *
    * @param obj
    */
  def register(obj: js.Object): Unit
  /**
    * Given two poits of a line, returns the slope.
    *
    * @param p1
    * @param p2
    */
  def slope(p1: js.Object, p2: js.Object): Double
  /**
    * Snaps a line to the nearest angle
    *
    * @param obj
    * @param ca A decimal number fraction of a half circle..5 would snap to 90 degrees.25  would snap to 45 degrees.125 would snap to 22.5 degrees, etc.
    */
  def snapAngle(obj: Event_, ca: Double): js.Any
  /**
    * Creates a unique ID.
    *
    * @param str               OptionalIf provided, kept in a map, incrementedand used in the id. Otherwise 'shape' is used.
    */
  def uid(str: String): String
}

object common_ {
  @scala.inline
  def apply(
    abbr: js.Any => CallbackTo[Double],
    angle: (Event_, Double) => CallbackTo[js.Any],
    argsToObj: CallbackTo[js.Any],
    attr: (js.Object, String, js.Any, js.Any) => CallbackTo[Boolean],
    byId: String => CallbackTo[js.Any],
    constrainAngle: (Event_, Double, Double) => CallbackTo[Event_],
    degToRad: Double => CallbackTo[Double],
    distance: CallbackTo[js.Any],
    idSetStart: js.Any => Callback,
    length: Event_ => CallbackTo[js.Any],
    lineSub: (Double, Double, Double, Double, Double) => CallbackTo[js.Object],
    mixin: (js.Any, js.Any) => Callback,
    objects: js.Object,
    oppAngle: Double => CallbackTo[Double],
    pointOnCircle: (Double, Double, Double, Double) => CallbackTo[js.Object],
    radToDeg: Double => CallbackTo[Double],
    radians: Event_ => CallbackTo[js.Any],
    register: js.Object => Callback,
    slope: (js.Object, js.Object) => CallbackTo[Double],
    snapAngle: (Event_, Double) => CallbackTo[js.Any],
    uid: String => CallbackTo[String]
  ): common_ = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.updateDynamic("abbr")(js.Any.fromFunction1((t0: js.Any) => abbr(t0).runNow()))
    __obj.updateDynamic("angle")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Double) => angle(t0, t1).runNow()))
    __obj.updateDynamic("argsToObj")(argsToObj.toJsFn)
    __obj.updateDynamic("attr")(js.Any.fromFunction4((t0: js.Object, t1: java.lang.String, t2: js.Any, t3: js.Any) => attr(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("byId")(js.Any.fromFunction1((t0: java.lang.String) => byId(t0).runNow()))
    __obj.updateDynamic("constrainAngle")(js.Any.fromFunction3((t0: typingsJapgolly.std.Event_, t1: scala.Double, t2: scala.Double) => constrainAngle(t0, t1, t2).runNow()))
    __obj.updateDynamic("degToRad")(js.Any.fromFunction1((t0: scala.Double) => degToRad(t0).runNow()))
    __obj.updateDynamic("distance")(distance.toJsFn)
    __obj.updateDynamic("idSetStart")(js.Any.fromFunction1((t0: js.Any) => idSetStart(t0).runNow()))
    __obj.updateDynamic("length")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => length(t0).runNow()))
    __obj.updateDynamic("lineSub")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => lineSub(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("mixin")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => mixin(t0, t1).runNow()))
    __obj.updateDynamic("oppAngle")(js.Any.fromFunction1((t0: scala.Double) => oppAngle(t0).runNow()))
    __obj.updateDynamic("pointOnCircle")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => pointOnCircle(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("radToDeg")(js.Any.fromFunction1((t0: scala.Double) => radToDeg(t0).runNow()))
    __obj.updateDynamic("radians")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => radians(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: js.Object) => register(t0).runNow()))
    __obj.updateDynamic("slope")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => slope(t0, t1).runNow()))
    __obj.updateDynamic("snapAngle")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: scala.Double) => snapAngle(t0, t1).runNow()))
    __obj.updateDynamic("uid")(js.Any.fromFunction1((t0: java.lang.String) => uid(t0).runNow()))
    __obj.asInstanceOf[common_]
  }
}


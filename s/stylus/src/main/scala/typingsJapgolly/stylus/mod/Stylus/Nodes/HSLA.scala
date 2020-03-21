package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSLA extends Node {
  var a: Double
  var h: Double
  var hsla: HSLA
  var l: Double
  var rgba: RGBA
  var s: Double
  /**
    * Add h,s,l to the current component values
    */
  def add(h: Double, s: Double, l: Double): HSLA
  /**
    * djust hue by `deg`.
    */
  def adjustHue(deg: Double): HSLA
  /**
    * Adjust lightness by `percent`.
    */
  def adjustLightness(percent: Double): HSLA
  /**
    * Subtract h,s,l from the current component values
    */
  def substract(h: Double, s: Double, l: Double): HSLA
}

object HSLA {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double) => CallbackTo[HSLA],
    adjustHue: Double => CallbackTo[HSLA],
    adjustLightness: Double => CallbackTo[HSLA],
    coerce: Node => CallbackTo[Node],
    column: Double,
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    h: Double,
    hash: java.lang.String,
    hsla: HSLA,
    l: Double,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => CallbackTo[Node],
    rgba: RGBA,
    s: Double,
    shouldCoerce: java.lang.String => CallbackTo[scala.Boolean],
    substract: (Double, Double, Double) => CallbackTo[HSLA],
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[AnonColumn]
  ): HSLA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("adjustHue")(js.Any.fromFunction1((t0: scala.Double) => adjustHue(t0).runNow()))
    __obj.updateDynamic("adjustLightness")(js.Any.fromFunction1((t0: scala.Double) => adjustLightness(t0).runNow()))
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => coerce(t0).runNow()))
    __obj.updateDynamic("eval")(eval.toJsFn)
    __obj.updateDynamic("operate")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => operate(t0, t1).runNow()))
    __obj.updateDynamic("shouldCoerce")(js.Any.fromFunction1((t0: java.lang.String) => shouldCoerce(t0).runNow()))
    __obj.updateDynamic("substract")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => substract(t0, t1, t2).runNow()))
    __obj.updateDynamic("toBoolean")(toBoolean.toJsFn)
    __obj.updateDynamic("toExpression")(toExpression.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[HSLA]
  }
}


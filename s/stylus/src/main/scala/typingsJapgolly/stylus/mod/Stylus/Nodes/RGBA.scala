package typingsJapgolly.stylus.mod.Stylus.Nodes

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stylus.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGBA extends Node {
  var a: Double
  var b: Double
  var g: Double
  var hsla: HSLA
  var r: Double
  var rgba: RGBA
  /**
    * Add r,g,b,a to the current component values
    */
  def add(r: Double, g: Double, b: Double, a: Double): RGBA
  /**
    * Divide rgb components by `n`.
    */
  def divide(n: Double): RGBA
  /**
    * Multiply rgb components by `n`.
    */
  def multiply(n: Double): RGBA
  /**
    * Subtract r,g,b,a from the current component values
    */
  def substract(r: Double, g: Double, b: Double, a: Double): RGBA
}

object RGBA {
  @scala.inline
  def apply(
    a: Double,
    add: (Double, Double, Double, Double) => CallbackTo[RGBA],
    b: Double,
    coerce: Node => CallbackTo[Node],
    column: Double,
    divide: Double => CallbackTo[RGBA],
    eval: CallbackTo[Node],
    filename: java.lang.String,
    first: Node,
    g: Double,
    hash: java.lang.String,
    hsla: HSLA,
    lineno: Double,
    multiply: Double => CallbackTo[RGBA],
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => CallbackTo[Node],
    r: Double,
    rgba: RGBA,
    shouldCoerce: java.lang.String => CallbackTo[scala.Boolean],
    substract: (Double, Double, Double, Double) => CallbackTo[RGBA],
    toBoolean: CallbackTo[Boolean],
    toExpression: CallbackTo[Expression],
    toJSON: CallbackTo[AnonColumn]
  ): RGBA = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hsla = hsla.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rgba = rgba.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => add(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("coerce")(js.Any.fromFunction1((t0: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => coerce(t0).runNow()))
    __obj.updateDynamic("divide")(js.Any.fromFunction1((t0: scala.Double) => divide(t0).runNow()))
    __obj.updateDynamic("eval")(eval.toJsFn)
    __obj.updateDynamic("multiply")(js.Any.fromFunction1((t0: scala.Double) => multiply(t0).runNow()))
    __obj.updateDynamic("operate")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.stylus.mod.Stylus.Nodes.Node) => operate(t0, t1).runNow()))
    __obj.updateDynamic("shouldCoerce")(js.Any.fromFunction1((t0: java.lang.String) => shouldCoerce(t0).runNow()))
    __obj.updateDynamic("substract")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => substract(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("toBoolean")(toBoolean.toJsFn)
    __obj.updateDynamic("toExpression")(toExpression.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[RGBA]
  }
}


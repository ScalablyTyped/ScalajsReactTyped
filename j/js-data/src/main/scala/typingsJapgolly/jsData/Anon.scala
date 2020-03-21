package typingsJapgolly.jsData

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName("==")
  def EqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("===")
  def EqualssignEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("!=")
  def ExclamationmarkEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("!==")
  def ExclamationmarkEqualssignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName(">")
  def Greaterthansign(value: js.Any, predicate: js.Any): Boolean
  @JSName(">=")
  def GreaterthansignEqualssign(value: js.Any, predicate: js.Any): Boolean
  @JSName("<")
  def Lessthansign(value: js.Any, predicate: js.Any): Boolean
  @JSName("<=")
  def LessthansignEqualssign(value: js.Any, predicate: js.Any): Boolean
  def contains(value: js.Any, predicate: js.Any): Boolean
  def in(value: js.Any, predicate: js.Any): Boolean
  def isectEmpty(value: js.Any, predicate: js.Any): Boolean
  def isectNotEmpty(value: js.Any, predicate: js.Any): Double
  def notContains(value: js.Any, predicate: js.Any): Boolean
  def notIn(value: js.Any, predicate: js.Any): Boolean
}

object Anon {
  @scala.inline
  def apply(
    EqualssignEqualssign: (js.Any, js.Any) => CallbackTo[Boolean],
    EqualssignEqualssignEqualssign: (js.Any, js.Any) => CallbackTo[Boolean],
    ExclamationmarkEqualssign: (js.Any, js.Any) => CallbackTo[Boolean],
    ExclamationmarkEqualssignEqualssign: (js.Any, js.Any) => CallbackTo[Boolean],
    Greaterthansign: (js.Any, js.Any) => CallbackTo[Boolean],
    GreaterthansignEqualssign: (js.Any, js.Any) => CallbackTo[Boolean],
    Lessthansign: (js.Any, js.Any) => CallbackTo[Boolean],
    LessthansignEqualssign: (js.Any, js.Any) => CallbackTo[Boolean],
    contains: (js.Any, js.Any) => CallbackTo[Boolean],
    in: (js.Any, js.Any) => CallbackTo[Boolean],
    isectEmpty: (js.Any, js.Any) => CallbackTo[Boolean],
    isectNotEmpty: (js.Any, js.Any) => CallbackTo[Double],
    notContains: (js.Any, js.Any) => CallbackTo[Boolean],
    notIn: (js.Any, js.Any) => CallbackTo[Boolean]
  ): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EqualssignEqualssign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => EqualssignEqualssign(t0, t1).runNow()))
    __obj.updateDynamic("EqualssignEqualssignEqualssign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => EqualssignEqualssignEqualssign(t0, t1).runNow()))
    __obj.updateDynamic("ExclamationmarkEqualssign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ExclamationmarkEqualssign(t0, t1).runNow()))
    __obj.updateDynamic("ExclamationmarkEqualssignEqualssign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ExclamationmarkEqualssignEqualssign(t0, t1).runNow()))
    __obj.updateDynamic("Greaterthansign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => Greaterthansign(t0, t1).runNow()))
    __obj.updateDynamic("GreaterthansignEqualssign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => GreaterthansignEqualssign(t0, t1).runNow()))
    __obj.updateDynamic("Lessthansign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => Lessthansign(t0, t1).runNow()))
    __obj.updateDynamic("LessthansignEqualssign")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => LessthansignEqualssign(t0, t1).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => contains(t0, t1).runNow()))
    __obj.updateDynamic("in")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => in(t0, t1).runNow()))
    __obj.updateDynamic("isectEmpty")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => isectEmpty(t0, t1).runNow()))
    __obj.updateDynamic("isectNotEmpty")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => isectNotEmpty(t0, t1).runNow()))
    __obj.updateDynamic("notContains")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => notContains(t0, t1).runNow()))
    __obj.updateDynamic("notIn")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => notIn(t0, t1).runNow()))
    __obj.asInstanceOf[Anon]
  }
}


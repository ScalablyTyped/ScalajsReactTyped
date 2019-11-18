package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EasingStatic extends js.Object {
  var bounce: EasingFunction
  var circle: EasingFunction
  var cubic: EasingFunction
  var ease: EasingFunction
  var exp: EasingFunction
  var linear: EasingFunction
  var quad: EasingFunction
  var sin: EasingFunction
  var step0: EasingFunction
  var step1: EasingFunction
  def back(s: Double): EasingFunction
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction
  def elastic(bounciness: Double): EasingFunction
  def in(easing: EasingFunction): EasingFunction
  def inOut(easing: EasingFunction): EasingFunction
  def out(easing: EasingFunction): EasingFunction
  def poly(n: Double): EasingFunction
}

object EasingStatic {
  @scala.inline
  def apply(
    back: Double => CallbackTo[EasingFunction],
    bezier: (Double, Double, Double, Double) => CallbackTo[EasingFunction],
    bounce: /* value */ Double => CallbackTo[Double],
    circle: /* value */ Double => CallbackTo[Double],
    cubic: /* value */ Double => CallbackTo[Double],
    ease: /* value */ Double => CallbackTo[Double],
    elastic: Double => CallbackTo[EasingFunction],
    exp: /* value */ Double => CallbackTo[Double],
    in: EasingFunction => CallbackTo[EasingFunction],
    inOut: EasingFunction => CallbackTo[EasingFunction],
    linear: /* value */ Double => CallbackTo[Double],
    out: EasingFunction => CallbackTo[EasingFunction],
    poly: Double => CallbackTo[EasingFunction],
    quad: /* value */ Double => CallbackTo[Double],
    sin: /* value */ Double => CallbackTo[Double],
    step0: /* value */ Double => CallbackTo[Double],
    step1: /* value */ Double => CallbackTo[Double]
  ): EasingStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("back")(js.Any.fromFunction1((t0: scala.Double) => back(t0).runNow()))
    __obj.updateDynamic("bezier")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => bezier(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("bounce")(js.Any.fromFunction1((t0: /* value */ scala.Double) => bounce(t0).runNow()))
    __obj.updateDynamic("circle")(js.Any.fromFunction1((t0: /* value */ scala.Double) => circle(t0).runNow()))
    __obj.updateDynamic("cubic")(js.Any.fromFunction1((t0: /* value */ scala.Double) => cubic(t0).runNow()))
    __obj.updateDynamic("ease")(js.Any.fromFunction1((t0: /* value */ scala.Double) => ease(t0).runNow()))
    __obj.updateDynamic("elastic")(js.Any.fromFunction1((t0: scala.Double) => elastic(t0).runNow()))
    __obj.updateDynamic("exp")(js.Any.fromFunction1((t0: /* value */ scala.Double) => exp(t0).runNow()))
    __obj.updateDynamic("in")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.EasingFunction) => in(t0).runNow()))
    __obj.updateDynamic("inOut")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.EasingFunction) => inOut(t0).runNow()))
    __obj.updateDynamic("linear")(js.Any.fromFunction1((t0: /* value */ scala.Double) => linear(t0).runNow()))
    __obj.updateDynamic("out")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNative.reactDashNativeMod.EasingFunction) => out(t0).runNow()))
    __obj.updateDynamic("poly")(js.Any.fromFunction1((t0: scala.Double) => poly(t0).runNow()))
    __obj.updateDynamic("quad")(js.Any.fromFunction1((t0: /* value */ scala.Double) => quad(t0).runNow()))
    __obj.updateDynamic("sin")(js.Any.fromFunction1((t0: /* value */ scala.Double) => sin(t0).runNow()))
    __obj.updateDynamic("step0")(js.Any.fromFunction1((t0: /* value */ scala.Double) => step0(t0).runNow()))
    __obj.updateDynamic("step1")(js.Any.fromFunction1((t0: /* value */ scala.Double) => step1(t0).runNow()))
    __obj.asInstanceOf[EasingStatic]
  }
}


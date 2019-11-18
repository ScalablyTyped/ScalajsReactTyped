package typingsJapgolly.coreDashJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcoshAsinh extends js.Object {
  def acosh(x: Double): Double
  def asinh(x: Double): Double
  def atanh(x: Double): Double
  def cbrt(x: Double): Double
  def clz32(x: Double): Double
  def cosh(x: Double): Double
  def expm1(x: Double): Double
  def fround(x: Double): Double
  def hypot(values: Double*): Double
  def imul(x: Double, y: Double): Double
  def log10(x: Double): Double
  def log1p(x: Double): Double
  def log2(x: Double): Double
  def sign(x: Double): Double
  def sinh(x: Double): Double
  def tanh(x: Double): Double
  def trunc(x: Double): Double
}

object Anon_AcoshAsinh {
  @scala.inline
  def apply(
    acosh: Double => CallbackTo[Double],
    asinh: Double => CallbackTo[Double],
    atanh: Double => CallbackTo[Double],
    cbrt: Double => CallbackTo[Double],
    clz32: Double => CallbackTo[Double],
    cosh: Double => CallbackTo[Double],
    expm1: Double => CallbackTo[Double],
    fround: Double => CallbackTo[Double],
    hypot: /* repeated */ Double => CallbackTo[Double],
    imul: (Double, Double) => CallbackTo[Double],
    log10: Double => CallbackTo[Double],
    log1p: Double => CallbackTo[Double],
    log2: Double => CallbackTo[Double],
    sign: Double => CallbackTo[Double],
    sinh: Double => CallbackTo[Double],
    tanh: Double => CallbackTo[Double],
    trunc: Double => CallbackTo[Double]
  ): Anon_AcoshAsinh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acosh")(js.Any.fromFunction1((t0: scala.Double) => acosh(t0).runNow()))
    __obj.updateDynamic("asinh")(js.Any.fromFunction1((t0: scala.Double) => asinh(t0).runNow()))
    __obj.updateDynamic("atanh")(js.Any.fromFunction1((t0: scala.Double) => atanh(t0).runNow()))
    __obj.updateDynamic("cbrt")(js.Any.fromFunction1((t0: scala.Double) => cbrt(t0).runNow()))
    __obj.updateDynamic("clz32")(js.Any.fromFunction1((t0: scala.Double) => clz32(t0).runNow()))
    __obj.updateDynamic("cosh")(js.Any.fromFunction1((t0: scala.Double) => cosh(t0).runNow()))
    __obj.updateDynamic("expm1")(js.Any.fromFunction1((t0: scala.Double) => expm1(t0).runNow()))
    __obj.updateDynamic("fround")(js.Any.fromFunction1((t0: scala.Double) => fround(t0).runNow()))
    __obj.updateDynamic("hypot")(js.Any.fromFunction1((t0: /* repeated */ scala.Double) => hypot(t0).runNow()))
    __obj.updateDynamic("imul")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => imul(t0, t1).runNow()))
    __obj.updateDynamic("log10")(js.Any.fromFunction1((t0: scala.Double) => log10(t0).runNow()))
    __obj.updateDynamic("log1p")(js.Any.fromFunction1((t0: scala.Double) => log1p(t0).runNow()))
    __obj.updateDynamic("log2")(js.Any.fromFunction1((t0: scala.Double) => log2(t0).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction1((t0: scala.Double) => sign(t0).runNow()))
    __obj.updateDynamic("sinh")(js.Any.fromFunction1((t0: scala.Double) => sinh(t0).runNow()))
    __obj.updateDynamic("tanh")(js.Any.fromFunction1((t0: scala.Double) => tanh(t0).runNow()))
    __obj.updateDynamic("trunc")(js.Any.fromFunction1((t0: scala.Double) => trunc(t0).runNow()))
    __obj.asInstanceOf[Anon_AcoshAsinh]
  }
}


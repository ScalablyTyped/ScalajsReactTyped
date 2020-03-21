package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofappJsdt extends js.Object {
  def dofile(script: String): Double
  def dostring(script: String): Double
  def run(func: String): Double
  def run_p1(func: String, p1: String): Double
  def run_p2(func: String, p1: String, p2: String): Double
  def run_p3(func: String, p1: String, p2: String, p3: String): Double
  def runstring(script: String): Double
}

object TypeofappJsdt {
  @scala.inline
  def apply(
    dofile: String => CallbackTo[Double],
    dostring: String => CallbackTo[Double],
    run: String => CallbackTo[Double],
    run_p1: (String, String) => CallbackTo[Double],
    run_p2: (String, String, String) => CallbackTo[Double],
    run_p3: (String, String, String, String) => CallbackTo[Double],
    runstring: String => CallbackTo[Double]
  ): TypeofappJsdt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dofile")(js.Any.fromFunction1((t0: java.lang.String) => dofile(t0).runNow()))
    __obj.updateDynamic("dostring")(js.Any.fromFunction1((t0: java.lang.String) => dostring(t0).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction1((t0: java.lang.String) => run(t0).runNow()))
    __obj.updateDynamic("run_p1")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => run_p1(t0, t1).runNow()))
    __obj.updateDynamic("run_p2")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => run_p2(t0, t1, t2).runNow()))
    __obj.updateDynamic("run_p3")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => run_p3(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("runstring")(js.Any.fromFunction1((t0: java.lang.String) => runstring(t0).runNow()))
    __obj.asInstanceOf[TypeofappJsdt]
  }
}


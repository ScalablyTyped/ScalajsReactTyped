package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmtree extends js.Object {
  def mt_match(tname: String, tomatch: String, mval: Double): Double
}

object Typeofmtree {
  @scala.inline
  def apply(mt_match: (String, String, Double) => CallbackTo[Double]): Typeofmtree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mt_match")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => mt_match(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofmtree]
  }
}


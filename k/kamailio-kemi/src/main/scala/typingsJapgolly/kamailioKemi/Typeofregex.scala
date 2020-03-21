package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregex extends js.Object {
  def pcre_match(string: String, regex: String): Double
  def pcre_match_group(string: String, num_pcre: Double): Double
}

object Typeofregex {
  @scala.inline
  def apply(
    pcre_match: (String, String) => CallbackTo[Double],
    pcre_match_group: (String, Double) => CallbackTo[Double]
  ): Typeofregex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pcre_match")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => pcre_match(t0, t1).runNow()))
    __obj.updateDynamic("pcre_match_group")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => pcre_match_group(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofregex]
  }
}


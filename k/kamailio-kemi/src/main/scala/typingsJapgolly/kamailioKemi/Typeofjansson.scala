package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofjansson extends js.Object {
  def get(spath: String, sdoc: String, spv: String): Double
}

object Typeofjansson {
  @scala.inline
  def apply(get: (String, String, String) => CallbackTo[Double]): Typeofjansson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => get(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofjansson]
  }
}


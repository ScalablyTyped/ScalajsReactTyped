package typingsJapgolly.winrt.Windows.Networking

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostNameStatics extends js.Object {
  def compare(value1: String, value2: String): Double
}

object IHostNameStatics {
  @scala.inline
  def apply(compare: (String, String) => CallbackTo[Double]): IHostNameStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => compare(t0, t1).runNow()))
    __obj.asInstanceOf[IHostNameStatics]
  }
}


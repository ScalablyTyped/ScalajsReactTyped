package typingsJapgolly.fnandoSparkline.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineOptionsFetch[TEntry] extends SparklineNonNativeOptions[TEntry] {
  /**
    * Use this function to return the value if you have a different data structure that's not natively supported by sparkline.
    */
  def fetch(entry: TEntry): Double
}

object SparklineOptionsFetch {
  @scala.inline
  def apply[TEntry](fetch: TEntry => CallbackTo[Double]): SparklineOptionsFetch[TEntry] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: TEntry) => fetch(t0).runNow()))
    __obj.asInstanceOf[SparklineOptionsFetch[TEntry]]
  }
}


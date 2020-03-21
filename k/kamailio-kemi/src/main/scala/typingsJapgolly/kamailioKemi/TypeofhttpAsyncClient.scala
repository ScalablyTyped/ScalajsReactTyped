package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofhttpAsyncClient extends js.Object {
  def query(sdata: String, rn: String): Double
}

object TypeofhttpAsyncClient {
  @scala.inline
  def apply(query: (String, String) => CallbackTo[Double]): TypeofhttpAsyncClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => query(t0, t1).runNow()))
    __obj.asInstanceOf[TypeofhttpAsyncClient]
  }
}


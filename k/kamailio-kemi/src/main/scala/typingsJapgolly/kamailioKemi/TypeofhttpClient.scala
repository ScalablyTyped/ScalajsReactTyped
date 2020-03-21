package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofhttpClient extends js.Object {
  def curl_connect(con: String, url: String, dpv: String): Double
  def curl_connect_post(con: String, url: String, ctype: String, data: String, dpv: String): Double
  def query(url: String, dpv: String): Double
  def query_post(url: String, post: String, dpv: String): Double
  def query_post_hdrs(url: String, post: String, hdrs: String, dpv: String): Double
}

object TypeofhttpClient {
  @scala.inline
  def apply(
    curl_connect: (String, String, String) => CallbackTo[Double],
    curl_connect_post: (String, String, String, String, String) => CallbackTo[Double],
    query: (String, String) => CallbackTo[Double],
    query_post: (String, String, String) => CallbackTo[Double],
    query_post_hdrs: (String, String, String, String) => CallbackTo[Double]
  ): TypeofhttpClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("curl_connect")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => curl_connect(t0, t1, t2).runNow()))
    __obj.updateDynamic("curl_connect_post")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => curl_connect_post(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("query")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => query(t0, t1).runNow()))
    __obj.updateDynamic("query_post")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => query_post(t0, t1, t2).runNow()))
    __obj.updateDynamic("query_post_hdrs")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => query_post_hdrs(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[TypeofhttpClient]
  }
}


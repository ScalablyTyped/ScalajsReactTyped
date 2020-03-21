package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofndbMongodb extends js.Object {
  def exec(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def exec_simple(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def find(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def find_one(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double
  def free_reply(name: String): Double
  def next_reply(name: String): Double
}

object TypeofndbMongodb {
  @scala.inline
  def apply(
    exec: (String, String, String, String, String) => CallbackTo[Double],
    exec_simple: (String, String, String, String, String) => CallbackTo[Double],
    find: (String, String, String, String, String) => CallbackTo[Double],
    find_one: (String, String, String, String, String) => CallbackTo[Double],
    free_reply: String => CallbackTo[Double],
    next_reply: String => CallbackTo[Double]
  ): TypeofndbMongodb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => exec(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("exec_simple")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => exec_simple(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => find(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("find_one")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => find_one(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("free_reply")(js.Any.fromFunction1((t0: java.lang.String) => free_reply(t0).runNow()))
    __obj.updateDynamic("next_reply")(js.Any.fromFunction1((t0: java.lang.String) => next_reply(t0).runNow()))
    __obj.asInstanceOf[TypeofndbMongodb]
  }
}


package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofndbRedis extends js.Object {
  def redis_cmd(srv: String, rcmd: String, sres: String): Double
  def redis_cmd_p1(srv: String, rcmd: String, p1: String, sres: String): Double
  def redis_cmd_p2(srv: String, rcmd: String, p1: String, p2: String, sres: String): Double
  def redis_cmd_p3(srv: String, rcmd: String, p1: String, p2: String, p3: String, sres: String): Double
  def redis_free(name: String): Double
}

object TypeofndbRedis {
  @scala.inline
  def apply(
    redis_cmd: (String, String, String) => CallbackTo[Double],
    redis_cmd_p1: (String, String, String, String) => CallbackTo[Double],
    redis_cmd_p2: (String, String, String, String, String) => CallbackTo[Double],
    redis_cmd_p3: (String, String, String, String, String, String) => CallbackTo[Double],
    redis_free: String => CallbackTo[Double]
  ): TypeofndbRedis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redis_cmd")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => redis_cmd(t0, t1, t2).runNow()))
    __obj.updateDynamic("redis_cmd_p1")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => redis_cmd_p1(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("redis_cmd_p2")(js.Any.fromFunction5((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => redis_cmd_p2(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("redis_cmd_p3")(js.Any.fromFunction6((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String, t5: java.lang.String) => redis_cmd_p3(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("redis_free")(js.Any.fromFunction1((t0: java.lang.String) => redis_free(t0).runNow()))
    __obj.asInstanceOf[TypeofndbRedis]
  }
}


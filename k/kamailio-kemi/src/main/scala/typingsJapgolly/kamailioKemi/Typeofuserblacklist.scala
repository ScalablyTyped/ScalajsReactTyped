package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuserblacklist extends js.Object {
  def check_user_blacklist(suser: String, sdomain: String): Double
  def check_user_blacklist_number(suser: String, sdomain: String, snumber: String): Double
  def check_user_blacklist_table(suser: String, sdomain: String, snumber: String, stable: String): Double
  def check_user_whitelist(suser: String, sdomain: String): Double
  def check_user_whitelist_number(suser: String, sdomain: String, snumber: String): Double
  def check_user_whitelist_table(suser: String, sdomain: String, snumber: String, stable: String): Double
}

object Typeofuserblacklist {
  @scala.inline
  def apply(
    check_user_blacklist: (String, String) => CallbackTo[Double],
    check_user_blacklist_number: (String, String, String) => CallbackTo[Double],
    check_user_blacklist_table: (String, String, String, String) => CallbackTo[Double],
    check_user_whitelist: (String, String) => CallbackTo[Double],
    check_user_whitelist_number: (String, String, String) => CallbackTo[Double],
    check_user_whitelist_table: (String, String, String, String) => CallbackTo[Double]
  ): Typeofuserblacklist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check_user_blacklist")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => check_user_blacklist(t0, t1).runNow()))
    __obj.updateDynamic("check_user_blacklist_number")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => check_user_blacklist_number(t0, t1, t2).runNow()))
    __obj.updateDynamic("check_user_blacklist_table")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => check_user_blacklist_table(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("check_user_whitelist")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => check_user_whitelist(t0, t1).runNow()))
    __obj.updateDynamic("check_user_whitelist_number")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => check_user_whitelist_number(t0, t1, t2).runNow()))
    __obj.updateDynamic("check_user_whitelist_table")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => check_user_whitelist_table(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Typeofuserblacklist]
  }
}


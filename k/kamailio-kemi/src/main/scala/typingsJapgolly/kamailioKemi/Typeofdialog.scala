package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdialog extends js.Object {
  def dlg_bye(side: String): Double
  def dlg_db_load_callid(callid: String): Double
  def dlg_db_load_extra(): Double
  def dlg_get(sc: String, sf: String, st: String): Double
  def dlg_isflagset(`val`: Double): Double
  def dlg_manage(): Double
  def dlg_resetflag(`val`: Double): Double
  def dlg_set_property(pval: String): Double
  def dlg_set_timeout(to: Double): Double
  def dlg_set_timeout_id(to: Double, he: Double, hi: Double): Double
  def dlg_setflag(`val`: Double): Double
  def get_profile_size(sprofile: String, svalue: String, spv: String): Double
  def get_profile_size_static(sprofile: String, spv: String): Double
  def is_in_profile(sprofile: String, svalue: String): Double
  def is_in_profile_static(sprofile: String): Double
  def is_known_dlg(): Double
  def set_dlg_profile(sprofile: String, svalue: String): Double
  def set_dlg_profile_static(sprofile: String): Double
  def unset_dlg_profile(sprofile: String, svalue: String): Double
  def unset_dlg_profile_static(sprofile: String): Double
}

object Typeofdialog {
  @scala.inline
  def apply(
    dlg_bye: String => CallbackTo[Double],
    dlg_db_load_callid: String => CallbackTo[Double],
    dlg_db_load_extra: CallbackTo[Double],
    dlg_get: (String, String, String) => CallbackTo[Double],
    dlg_isflagset: Double => CallbackTo[Double],
    dlg_manage: CallbackTo[Double],
    dlg_resetflag: Double => CallbackTo[Double],
    dlg_set_property: String => CallbackTo[Double],
    dlg_set_timeout: Double => CallbackTo[Double],
    dlg_set_timeout_id: (Double, Double, Double) => CallbackTo[Double],
    dlg_setflag: Double => CallbackTo[Double],
    get_profile_size: (String, String, String) => CallbackTo[Double],
    get_profile_size_static: (String, String) => CallbackTo[Double],
    is_in_profile: (String, String) => CallbackTo[Double],
    is_in_profile_static: String => CallbackTo[Double],
    is_known_dlg: CallbackTo[Double],
    set_dlg_profile: (String, String) => CallbackTo[Double],
    set_dlg_profile_static: String => CallbackTo[Double],
    unset_dlg_profile: (String, String) => CallbackTo[Double],
    unset_dlg_profile_static: String => CallbackTo[Double]
  ): Typeofdialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dlg_bye")(js.Any.fromFunction1((t0: java.lang.String) => dlg_bye(t0).runNow()))
    __obj.updateDynamic("dlg_db_load_callid")(js.Any.fromFunction1((t0: java.lang.String) => dlg_db_load_callid(t0).runNow()))
    __obj.updateDynamic("dlg_db_load_extra")(dlg_db_load_extra.toJsFn)
    __obj.updateDynamic("dlg_get")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => dlg_get(t0, t1, t2).runNow()))
    __obj.updateDynamic("dlg_isflagset")(js.Any.fromFunction1((t0: scala.Double) => dlg_isflagset(t0).runNow()))
    __obj.updateDynamic("dlg_manage")(dlg_manage.toJsFn)
    __obj.updateDynamic("dlg_resetflag")(js.Any.fromFunction1((t0: scala.Double) => dlg_resetflag(t0).runNow()))
    __obj.updateDynamic("dlg_set_property")(js.Any.fromFunction1((t0: java.lang.String) => dlg_set_property(t0).runNow()))
    __obj.updateDynamic("dlg_set_timeout")(js.Any.fromFunction1((t0: scala.Double) => dlg_set_timeout(t0).runNow()))
    __obj.updateDynamic("dlg_set_timeout_id")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => dlg_set_timeout_id(t0, t1, t2).runNow()))
    __obj.updateDynamic("dlg_setflag")(js.Any.fromFunction1((t0: scala.Double) => dlg_setflag(t0).runNow()))
    __obj.updateDynamic("get_profile_size")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => get_profile_size(t0, t1, t2).runNow()))
    __obj.updateDynamic("get_profile_size_static")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get_profile_size_static(t0, t1).runNow()))
    __obj.updateDynamic("is_in_profile")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => is_in_profile(t0, t1).runNow()))
    __obj.updateDynamic("is_in_profile_static")(js.Any.fromFunction1((t0: java.lang.String) => is_in_profile_static(t0).runNow()))
    __obj.updateDynamic("is_known_dlg")(is_known_dlg.toJsFn)
    __obj.updateDynamic("set_dlg_profile")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set_dlg_profile(t0, t1).runNow()))
    __obj.updateDynamic("set_dlg_profile_static")(js.Any.fromFunction1((t0: java.lang.String) => set_dlg_profile_static(t0).runNow()))
    __obj.updateDynamic("unset_dlg_profile")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => unset_dlg_profile(t0, t1).runNow()))
    __obj.updateDynamic("unset_dlg_profile_static")(js.Any.fromFunction1((t0: java.lang.String) => unset_dlg_profile_static(t0).runNow()))
    __obj.asInstanceOf[Typeofdialog]
  }
}


package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcfgutils extends js.Object {
  def abort(): Double
  def core_hash(s1: String, s2: String, sz: Double): Double
  def lock(lkey: String): Double
  def pkg_status(): Double
  def pkg_summary(): Double
  def rand_event(): Double
  def rand_get_prob(): Double
  def rand_reset_prob(): Double
  def rand_set_prob(percent_par: Double): Double
  def shm_status(): Double
  def shm_summary(): Double
  def trylock(lkey: String): Double
  def unlock(lkey: String): Double
}

object Typeofcfgutils {
  @scala.inline
  def apply(
    abort: CallbackTo[Double],
    core_hash: (String, String, Double) => CallbackTo[Double],
    lock: String => CallbackTo[Double],
    pkg_status: CallbackTo[Double],
    pkg_summary: CallbackTo[Double],
    rand_event: CallbackTo[Double],
    rand_get_prob: CallbackTo[Double],
    rand_reset_prob: CallbackTo[Double],
    rand_set_prob: Double => CallbackTo[Double],
    shm_status: CallbackTo[Double],
    shm_summary: CallbackTo[Double],
    trylock: String => CallbackTo[Double],
    unlock: String => CallbackTo[Double]
  ): Typeofcfgutils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("core_hash")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => core_hash(t0, t1, t2).runNow()))
    __obj.updateDynamic("lock")(js.Any.fromFunction1((t0: java.lang.String) => lock(t0).runNow()))
    __obj.updateDynamic("pkg_status")(pkg_status.toJsFn)
    __obj.updateDynamic("pkg_summary")(pkg_summary.toJsFn)
    __obj.updateDynamic("rand_event")(rand_event.toJsFn)
    __obj.updateDynamic("rand_get_prob")(rand_get_prob.toJsFn)
    __obj.updateDynamic("rand_reset_prob")(rand_reset_prob.toJsFn)
    __obj.updateDynamic("rand_set_prob")(js.Any.fromFunction1((t0: scala.Double) => rand_set_prob(t0).runNow()))
    __obj.updateDynamic("shm_status")(shm_status.toJsFn)
    __obj.updateDynamic("shm_summary")(shm_summary.toJsFn)
    __obj.updateDynamic("trylock")(js.Any.fromFunction1((t0: java.lang.String) => trylock(t0).runNow()))
    __obj.updateDynamic("unlock")(js.Any.fromFunction1((t0: java.lang.String) => unlock(t0).runNow()))
    __obj.asInstanceOf[Typeofcfgutils]
  }
}


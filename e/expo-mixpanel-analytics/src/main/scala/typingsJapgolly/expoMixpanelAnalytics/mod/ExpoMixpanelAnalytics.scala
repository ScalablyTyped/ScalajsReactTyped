package typingsJapgolly.expoMixpanelAnalytics.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpoMixpanelAnalytics extends js.Object {
  var token: String
  def identify(userId: String): Unit
  def people_append(props: Props[_]): Unit
  def people_delete_user(): Unit
  def people_increment(props: Props[Double]): Unit
  def people_set(props: Props[_]): Unit
  def people_set_once(props: Props[_]): Unit
  def people_union(props: Props[js.Array[String]]): Unit
  def people_unset(keys: js.Array[String]): Unit
  def reset(): Unit
  def track(name: String, props: Props[_]): Unit
}

object ExpoMixpanelAnalytics {
  @scala.inline
  def apply(
    identify: String => Callback,
    people_append: Props[js.Any] => Callback,
    people_delete_user: Callback,
    people_increment: Props[Double] => Callback,
    people_set: Props[js.Any] => Callback,
    people_set_once: Props[js.Any] => Callback,
    people_union: Props[js.Array[String]] => Callback,
    people_unset: js.Array[String] => Callback,
    reset: Callback,
    token: String,
    track: (String, Props[js.Any]) => Callback
  ): ExpoMixpanelAnalytics = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("identify")(js.Any.fromFunction1((t0: java.lang.String) => identify(t0).runNow()))
    __obj.updateDynamic("people_append")(js.Any.fromFunction1((t0: typingsJapgolly.expoMixpanelAnalytics.mod.Props[js.Any]) => people_append(t0).runNow()))
    __obj.updateDynamic("people_delete_user")(people_delete_user.toJsFn)
    __obj.updateDynamic("people_increment")(js.Any.fromFunction1((t0: typingsJapgolly.expoMixpanelAnalytics.mod.Props[scala.Double]) => people_increment(t0).runNow()))
    __obj.updateDynamic("people_set")(js.Any.fromFunction1((t0: typingsJapgolly.expoMixpanelAnalytics.mod.Props[js.Any]) => people_set(t0).runNow()))
    __obj.updateDynamic("people_set_once")(js.Any.fromFunction1((t0: typingsJapgolly.expoMixpanelAnalytics.mod.Props[js.Any]) => people_set_once(t0).runNow()))
    __obj.updateDynamic("people_union")(js.Any.fromFunction1((t0: typingsJapgolly.expoMixpanelAnalytics.mod.Props[js.Array[java.lang.String]]) => people_union(t0).runNow()))
    __obj.updateDynamic("people_unset")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => people_unset(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("track")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.expoMixpanelAnalytics.mod.Props[js.Any]) => track(t0, t1).runNow()))
    __obj.asInstanceOf[ExpoMixpanelAnalytics]
  }
}


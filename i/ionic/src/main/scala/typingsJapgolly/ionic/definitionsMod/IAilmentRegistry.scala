package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAilmentRegistry extends js.Object {
  var ailments: js.Array[IAilment]
  def get(id: String): js.UndefOr[IAilment]
  def register(ailment: IAilment): Unit
}

object IAilmentRegistry {
  @scala.inline
  def apply(
    ailments: js.Array[IAilment],
    get: String => CallbackTo[js.UndefOr[IAilment]],
    register: IAilment => Callback
  ): IAilmentRegistry = {
    val __obj = js.Dynamic.literal(ailments = ailments.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.ionic.definitionsMod.IAilment) => register(t0).runNow()))
    __obj.asInstanceOf[IAilmentRegistry]
  }
}


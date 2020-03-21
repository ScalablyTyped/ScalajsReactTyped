package typingsJapgolly.lestate.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lestate.AnonForce
import typingsJapgolly.lestate.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeState extends js.Object {
  def createListener(options: AnonForce): Unit
  def get(): js.Any
  def getDescription(): js.Object
  def insert(newValue: js.Object): Unit
  def set(newValue: js.Object): js.Array[AnonId]
}

object LeState {
  @scala.inline
  def apply(
    createListener: AnonForce => Callback,
    get: CallbackTo[js.Any],
    getDescription: CallbackTo[js.Object],
    insert: js.Object => Callback,
    set: js.Object => CallbackTo[js.Array[AnonId]]
  ): LeState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createListener")(js.Any.fromFunction1((t0: typingsJapgolly.lestate.AnonForce) => createListener(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: js.Object) => insert(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: js.Object) => set(t0).runNow()))
    __obj.asInstanceOf[LeState]
  }
}


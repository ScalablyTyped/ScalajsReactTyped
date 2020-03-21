package typingsJapgolly.cypress.cypressMod.Cypress

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// $CommandQueue from `command_queue.coffee` - a lot to type. Might be more useful if it was written in TS
trait CommandQueue extends ObjectLike {
  def add(obj: js.Any): js.Any
  def create(): CommandQueue
  def get(): js.Any
  def logs(filters: js.Any): js.Any
  def toJSON(): js.Array[String]
}

object CommandQueue {
  @scala.inline
  def apply(
    add: js.Any => CallbackTo[js.Any],
    create: CallbackTo[CommandQueue],
    get: CallbackTo[js.Any],
    logs: js.Any => CallbackTo[js.Any],
    toJSON: CallbackTo[js.Array[String]],
    StringDictionary: StringDictionary[js.Any] = null
  ): CommandQueue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: js.Any) => add(t0).runNow()))
    __obj.updateDynamic("create")(create.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("logs")(js.Any.fromFunction1((t0: js.Any) => logs(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CommandQueue]
  }
}


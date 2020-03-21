package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionObject[TContext, TEvent /* <: EventObject */]
  extends /* other */ StringDictionary[js.Any]
     with _Action[TContext, TEvent] {
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TEvent]] = js.undefined
  /**
    * The type of action that is executed.
    */
  var `type`: String
}

object ActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    `type`: String,
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): ActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ActionObject[TContext, TEvent]]
  }
}


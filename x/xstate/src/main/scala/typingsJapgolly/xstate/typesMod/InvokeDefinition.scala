package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeDefinition[TContext, TEvent /* <: EventObject */] extends ActivityDefinition[TContext, TEvent] {
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var autoForward: js.UndefOr[Boolean] = js.undefined
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[(Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent])] = js.undefined
  /**
    * @deprecated
    *
    *  Use `autoForward` property instead of `forward`. Support for `forward` will get removed in the future.
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: String
}

object InvokeDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    id: String,
    src: String,
    `type`: String,
    autoForward: js.UndefOr[Boolean] = js.undefined,
    data: (Mapper[TContext, TEvent]) | (PropertyMapper[TContext, TEvent]) = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null,
    forward: js.UndefOr[Boolean] = js.undefined
  ): InvokeDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeDefinition[TContext, TEvent]]
  }
}


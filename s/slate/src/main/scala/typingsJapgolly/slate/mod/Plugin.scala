package typingsJapgolly.slate.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin[T /* <: Controller */] extends js.Object {
  var commands: js.UndefOr[StringDictionary[CommandFunc[T]]] = js.undefined
  var normalizeNode: js.UndefOr[
    js.Function3[
      /* node */ Node, 
      /* editor */ T, 
      /* next */ js.Function0[Unit], 
      (js.Function1[/* editor */ T, Unit]) | Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* editor */ T, /* next */ js.Function0[Unit], Unit]] = js.undefined
  var onCommand: js.UndefOr[
    js.Function3[/* command */ Command, /* editor */ T, /* next */ js.Function0[Unit], Unit]
  ] = js.undefined
  var onConstruct: js.UndefOr[js.Function2[/* editor */ T, /* next */ js.Function0[Unit], Unit]] = js.undefined
  var onQuery: js.UndefOr[
    js.Function3[/* query */ Query, /* editor */ T, /* next */ js.Function0[Unit], Unit]
  ] = js.undefined
  var queries: js.UndefOr[StringDictionary[QueryFunc[T]]] = js.undefined
  var schema: js.UndefOr[SchemaProperties] = js.undefined
  var validateNode: js.UndefOr[
    js.Function3[/* node */ Node, /* editor */ T, /* next */ js.Function0[Unit], SlateError | Unit]
  ] = js.undefined
}

object Plugin {
  @scala.inline
  def apply[T /* <: Controller */](
    commands: StringDictionary[CommandFunc[T]] = null,
    normalizeNode: (/* node */ Node, /* editor */ T, /* next */ js.Function0[Unit]) => CallbackTo[(js.Function1[/* editor */ T, Unit]) | Unit] = null,
    onChange: (/* editor */ T, /* next */ js.Function0[Unit]) => Callback = null,
    onCommand: (/* command */ Command, /* editor */ T, /* next */ js.Function0[Unit]) => Callback = null,
    onConstruct: (/* editor */ T, /* next */ js.Function0[Unit]) => Callback = null,
    onQuery: (/* query */ Query, /* editor */ T, /* next */ js.Function0[Unit]) => Callback = null,
    queries: StringDictionary[QueryFunc[T]] = null,
    schema: SchemaProperties = null,
    validateNode: (/* node */ Node, /* editor */ T, /* next */ js.Function0[Unit]) => CallbackTo[SlateError | Unit] = null
  ): Plugin[T] = {
    val __obj = js.Dynamic.literal()
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (normalizeNode != null) __obj.updateDynamic("normalizeNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: /* editor */ T, t2: /* next */ js.Function0[scala.Unit]) => normalizeNode(t0, t1, t2).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* editor */ T, t1: /* next */ js.Function0[scala.Unit]) => onChange(t0, t1).runNow()))
    if (onCommand != null) __obj.updateDynamic("onCommand")(js.Any.fromFunction3((t0: /* command */ typingsJapgolly.slate.mod.Command, t1: /* editor */ T, t2: /* next */ js.Function0[scala.Unit]) => onCommand(t0, t1, t2).runNow()))
    if (onConstruct != null) __obj.updateDynamic("onConstruct")(js.Any.fromFunction2((t0: /* editor */ T, t1: /* next */ js.Function0[scala.Unit]) => onConstruct(t0, t1).runNow()))
    if (onQuery != null) __obj.updateDynamic("onQuery")(js.Any.fromFunction3((t0: /* query */ typingsJapgolly.slate.mod.Query, t1: /* editor */ T, t2: /* next */ js.Function0[scala.Unit]) => onQuery(t0, t1, t2).runNow()))
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (validateNode != null) __obj.updateDynamic("validateNode")(js.Any.fromFunction3((t0: /* node */ typingsJapgolly.slate.mod.Node, t1: /* editor */ T, t2: /* next */ js.Function0[scala.Unit]) => validateNode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Plugin[T]]
  }
}


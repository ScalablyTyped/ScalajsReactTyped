package typingsJapgolly.reactMedia.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  queries  :Queries,   defaultMatches ? :std.Partial<react-media.react-media.QueryResults<Queries>>,   children ? :(matches : react-media.react-media.QueryResults<Queries>): react.react.ReactNode | react.react.ReactNode, onChange ? (matches : react-media.react-media.QueryResults<Queries>): void} */
trait MultiQueryProps[Queries] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], Node]) | Node] = js.undefined
  var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.undefined
  var queries: Queries
  var render: js.UndefOr[js.Function0[Node]] = js.undefined
  var targetWindow: js.UndefOr[Window_] = js.undefined
}

object MultiQueryProps {
  @scala.inline
  def apply[Queries](
    queries: Queries,
    children: (js.Function1[/* matches */ QueryResults[Queries], Node]) | Node = null,
    defaultMatches: Partial[QueryResults[Queries]] = null,
    onChange: /* matches */ QueryResults[Queries] => Callback = null,
    render: js.UndefOr[CallbackTo[Node]] = js.undefined,
    targetWindow: Window_ = null
  ): MultiQueryProps[Queries] = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultMatches != null) __obj.updateDynamic("defaultMatches")(defaultMatches.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* matches */ typingsJapgolly.reactMedia.mod.QueryResults[Queries]) => onChange(t0).runNow()))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiQueryProps[Queries]]
  }
}


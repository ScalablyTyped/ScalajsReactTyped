package typingsJapgolly.reactInspector.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMInspectorProps
  extends TreeViewProps
     with ThemedComponentProps {
  @JSName("data")
  var data_DOMInspectorProps: js.Object
}

object DOMInspectorProps {
  @scala.inline
  def apply(
    data: js.Object,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    name: String = null,
    nodeRenderer: /* params */ InspectorNodeParams => CallbackTo[Node] = null,
    theme: InspectorTheme = null
  ): DOMInspectorProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactInspector.mod.InspectorNodeParams) => nodeRenderer(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMInspectorProps]
  }
}


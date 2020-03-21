package typingsJapgolly.stormReactDiagrams.linkLayerWidgetMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.pointModelMod.PointModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkLayerProps extends BaseWidgetProps {
  var diagramEngine: DiagramEngine
  def pointAdded(point: PointModel, event: MouseEvent): js.Any
}

object LinkLayerProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    pointAdded: (PointModel, MouseEvent) => CallbackTo[js.Any],
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null
  ): LinkLayerProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("pointAdded")(js.Any.fromFunction2((t0: typingsJapgolly.stormReactDiagrams.pointModelMod.PointModel, t1: org.scalajs.dom.raw.MouseEvent) => pointAdded(t0, t1).runNow()))
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkLayerProps]
  }
}


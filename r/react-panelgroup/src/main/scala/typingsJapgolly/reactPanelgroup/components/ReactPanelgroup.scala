package typingsJapgolly.reactPanelgroup.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPanelgroup.mod.PanelWidth
import typingsJapgolly.reactPanelgroup.mod.PropTypes
import typingsJapgolly.reactPanelgroup.mod.default
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.column
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPanelgroup {
  def apply(
    borderColor: String = null,
    direction: row | column = null,
    onUpdate: /* data */ PanelWidth => Callback = null,
    panelColor: String = null,
    panelWidths: js.Array[PanelWidth | Null] = null,
    spacing: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropTypes, default, Unit, PropTypes] = {
    val __obj = js.Dynamic.literal()
  
      if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactPanelgroup.mod.PanelWidth) => onUpdate(t0).runNow()))
    if (panelColor != null) __obj.updateDynamic("panelColor")(panelColor.asInstanceOf[js.Any])
    if (panelWidths != null) __obj.updateDynamic("panelWidths")(panelWidths.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPanelgroup.mod.PropTypes, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPanelgroup.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPanelgroup.mod.PropTypes])(children: _*)
  }
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}


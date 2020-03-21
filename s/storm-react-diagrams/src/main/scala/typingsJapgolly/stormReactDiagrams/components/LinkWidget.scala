package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.linkModelMod.LinkModelListener
import typingsJapgolly.stormReactDiagrams.linkWidgetMod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinkWidget {
  def apply(
    diagramEngine: DiagramEngine,
    link: LinkModel[LinkModelListener],
    baseClass: String = null,
    className: String = null,
    extraProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any = null
  ): UnmountedWithRoot[LinkProps, typingsJapgolly.stormReactDiagrams.mod.LinkWidget, Unit, LinkProps] = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.stormReactDiagrams.linkWidgetMod.LinkProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.stormReactDiagrams.mod.LinkWidget](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.stormReactDiagrams.linkWidgetMod.LinkProps])
  }
  @JSImport("storm-react-diagrams", "LinkWidget")
  @js.native
  object componentImport extends js.Object
  
}


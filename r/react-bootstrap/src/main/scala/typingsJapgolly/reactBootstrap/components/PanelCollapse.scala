package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.panelCollapseMod.PanelCollapseProps
import typingsJapgolly.reactBootstrap.panelCollapseMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelCollapse {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.panelCollapseMod.PanelCollapse] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.panelCollapseMod.PanelCollapse] = null,
    bsClass: String = null,
    onEnter: js.Function = null,
    onEntered: js.Function = null,
    onEntering: js.Function = null,
    onExit: js.Function = null,
    onExited: js.Function = null,
    onExiting: js.Function = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PanelCollapseProps, ^, Unit, PanelCollapseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.panelCollapseMod.PanelCollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.panelCollapseMod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.panelCollapseMod.PanelCollapseProps])(children: _*)
  }
  @JSImport("react-bootstrap/lib/PanelCollapse", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}


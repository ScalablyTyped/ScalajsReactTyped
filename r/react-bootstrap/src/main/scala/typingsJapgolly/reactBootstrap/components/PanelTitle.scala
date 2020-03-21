package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.panelTitleMod.PanelTitleProps
import typingsJapgolly.reactBootstrap.panelTitleMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PanelTitle {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.panelTitleMod.PanelTitle] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.panelTitleMod.PanelTitle] = null,
    bsClass: String = null,
    componentClass: String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PanelTitleProps, ^, Unit, PanelTitleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.panelTitleMod.PanelTitleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.panelTitleMod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.panelTitleMod.PanelTitleProps])(children: _*)
  }
  @JSImport("react-bootstrap/lib/PanelTitle", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}


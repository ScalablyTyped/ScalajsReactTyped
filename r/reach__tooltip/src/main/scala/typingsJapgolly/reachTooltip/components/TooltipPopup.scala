package typingsJapgolly.reachTooltip.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachTooltip.mod.BaseTooltipProps
import typingsJapgolly.reachTooltip.mod.TooltipPopupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TooltipPopup {
  def apply(
    BaseTooltipProps: BaseTooltipProps,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TooltipPopupProps, 
    MountedWithRawType[TooltipPopupProps, js.Object, RawMounted[TooltipPopupProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, BaseTooltipProps)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reachTooltip.mod.TooltipPopupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachTooltip.mod.TooltipPopupProps])(children: _*)
  }
  @JSImport("@reach/tooltip", "TooltipPopup")
  @js.native
  object componentImport extends js.Object
  
}


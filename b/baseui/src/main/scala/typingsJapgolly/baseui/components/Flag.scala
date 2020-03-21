package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.phoneInputMod.FlagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Flag {
  def apply(
    iso: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 241 */ js.Any,
    width: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    FlagProps, 
    MountedWithRawType[FlagProps, js.Object, RawMounted[FlagProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(iso = iso.asInstanceOf[js.Any])
  
      if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.phoneInputMod.FlagProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.phoneInputMod.FlagProps])(children: _*)
  }
  @JSImport("baseui/phone-input", "Flag")
  @js.native
  object componentImport extends js.Object
  
}


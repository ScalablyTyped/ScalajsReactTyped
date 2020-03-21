package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.AnonChangeSetting
import typingsJapgolly.antDesignProLayout.PartialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LayoutChange {
  def apply(
    settings: PartialSettings,
    changeSetting: (String, js.Any, js.UndefOr[Boolean]) => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AnonChangeSetting, 
    MountedWithRawType[AnonChangeSetting, js.Object, RawMounted[AnonChangeSetting, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
  
      __obj.updateDynamic("changeSetting")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.UndefOr[scala.Boolean]) => changeSetting(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.AnonChangeSetting, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.AnonChangeSetting])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}


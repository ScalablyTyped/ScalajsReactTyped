package typingsJapgolly.storybookUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookUi.sidebarSearchMod.PureSidebarSearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PureSidebarSearchProps420616183 () {
  val componentImport: js.Any
  def apply(
    onChange: String => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PureSidebarSearchProps, 
    MountedWithRawType[PureSidebarSearchProps, js.Object, RawMounted[PureSidebarSearchProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookUi.sidebarSearchMod.PureSidebarSearchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookUi.sidebarSearchMod.PureSidebarSearchProps])(children: _*)
  }
}


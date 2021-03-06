package typingsJapgolly.storybookAddonBackgrounds.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridSelector {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    js.Object, 
    MountedWithRawType[js.Object, js.Object, RawMounted[js.Object, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[js.Object, japgolly.scalajs.react.Children.Varargs, js.Object](this.componentImport)
    f(__obj.asInstanceOf[js.Object])(children: _*)
  }
  @JSImport("@storybook/addon-backgrounds/dist/containers/GridSelector", "GridSelector")
  @js.native
  object componentImport extends js.Object
  
}


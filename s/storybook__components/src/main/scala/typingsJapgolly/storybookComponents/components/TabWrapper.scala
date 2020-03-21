package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.tabsMod.TabWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabWrapper {
  def apply(
    active: Boolean,
    render: js.UndefOr[CallbackTo[Element]] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TabWrapperProps, 
    MountedWithRawType[TabWrapperProps, js.Object, RawMounted[TabWrapperProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
  
      render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.tabsMod.TabWrapperProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.tabsMod.TabWrapperProps])(children: _*)
  }
  @JSImport("@storybook/components", "TabWrapper")
  @js.native
  object componentImport extends js.Object
  
}


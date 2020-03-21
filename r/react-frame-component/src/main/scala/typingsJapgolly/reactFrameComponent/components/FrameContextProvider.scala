package typingsJapgolly.reactFrameComponent.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactFrameComponent.mod.FrameContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FrameContextProvider {
  def apply(
    value: FrameContextProps,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProviderProps[FrameContextProps], 
    MountedWithRawType[
      ProviderProps[FrameContextProps], 
      js.Object, 
      RawMounted[ProviderProps[FrameContextProps], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.reactFrameComponent.mod.FrameContextProps], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.reactFrameComponent.mod.FrameContextProps]])(children: _*)
  }
  @JSImport("react-frame-component", "FrameContextProvider")
  @js.native
  object componentImport extends js.Object
  
}


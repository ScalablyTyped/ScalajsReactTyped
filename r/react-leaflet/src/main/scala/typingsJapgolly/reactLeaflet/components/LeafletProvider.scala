package typingsJapgolly.reactLeaflet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactLeaflet.mod.LeafletContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LeafletProvider {
  def apply(
    value: LeafletContext,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProviderProps[LeafletContext], 
    MountedWithRawType[
      ProviderProps[LeafletContext], 
      js.Object, 
      RawMounted[ProviderProps[LeafletContext], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.reactLeaflet.mod.LeafletContext], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.reactLeaflet.mod.LeafletContext]])(children: _*)
  }
  @JSImport("react-leaflet", "LeafletProvider")
  @js.native
  object componentImport extends js.Object
  
}


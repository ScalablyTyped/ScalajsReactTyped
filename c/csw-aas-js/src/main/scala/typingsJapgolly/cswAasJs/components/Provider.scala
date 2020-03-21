package typingsJapgolly.cswAasJs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cswAasJs.authContextMod.AuthContextType
import typingsJapgolly.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  def apply(
    value: AuthContextType,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ProviderProps[AuthContextType], 
    MountedWithRawType[
      ProviderProps[AuthContextType], 
      js.Object, 
      RawMounted[ProviderProps[AuthContextType], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.cswAasJs.authContextMod.AuthContextType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ProviderProps[typingsJapgolly.cswAasJs.authContextMod.AuthContextType]])(children: _*)
  }
  @JSImport("csw-aas-js/dist/components/context/AuthContext", "Provider")
  @js.native
  object componentImport extends js.Object
  
}


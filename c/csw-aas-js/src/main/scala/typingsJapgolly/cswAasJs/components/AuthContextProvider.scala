package typingsJapgolly.cswAasJs.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextConfig
import typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AuthContextProvider {
  def apply(
    config: AuthContextConfig,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    AuthContextProps, 
    MountedWithRawType[AuthContextProps, js.Object, RawMounted[AuthContextProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextProps])(children: _*)
  }
  @JSImport("csw-aas-js/dist/components/context/AuthContextProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}


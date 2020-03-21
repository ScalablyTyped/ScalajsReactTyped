package typingsJapgolly.reactQuery.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactQuery.AnonConfig
import typingsJapgolly.reactQuery.mod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactQueryConfigProvider {
  def apply(
    config: ReactQueryProviderConfig = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonConfig, typingsJapgolly.reactQuery.mod.ReactQueryConfigProvider, Unit, AnonConfig] = {
    val __obj = js.Dynamic.literal()
  
      if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactQuery.AnonConfig, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactQuery.mod.ReactQueryConfigProvider](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactQuery.AnonConfig])(children: _*)
  }
  @JSImport("react-query", "ReactQueryConfigProvider")
  @js.native
  object componentImport extends js.Object
  
}


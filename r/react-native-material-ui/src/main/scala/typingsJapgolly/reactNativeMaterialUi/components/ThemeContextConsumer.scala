package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.mod.ThemeConsumerProps
import typingsJapgolly.reactNativeMaterialUi.mod.ThemeContext.Consumer
import typingsJapgolly.reactNativeMaterialUi.mod.ThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeContextConsumer {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ThemeProps => CallbackTo[Element]
  ): UnmountedWithRoot[ThemeConsumerProps, Consumer, Unit, ThemeConsumerProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeMaterialUi.mod.ThemeProps) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.ThemeConsumerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeMaterialUi.mod.ThemeContext.Consumer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.ThemeConsumerProps])
  }
  @JSImport("react-native-material-ui", "ThemeContext.Consumer")
  @js.native
  object componentImport extends js.Object
  
}


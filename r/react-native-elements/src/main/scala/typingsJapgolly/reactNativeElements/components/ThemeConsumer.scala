package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeElements.mod.ThemeConsumerProps
import typingsJapgolly.reactNativeElements.mod.ThemeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeConsumer {
  def apply[T](
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ThemeProps[T] => CallbackTo[Node]
  ): UnmountedWithRoot[
    ThemeConsumerProps[T], 
    typingsJapgolly.reactNativeElements.mod.ThemeConsumer[T], 
    Unit, 
    ThemeConsumerProps[T]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeElements.mod.ThemeProps[T]) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.ThemeConsumerProps[T], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactNativeElements.mod.ThemeConsumer[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.ThemeConsumerProps[T]])
  }
  @JSImport("react-native-elements", "ThemeConsumer")
  @js.native
  object componentImport extends js.Object
  
}


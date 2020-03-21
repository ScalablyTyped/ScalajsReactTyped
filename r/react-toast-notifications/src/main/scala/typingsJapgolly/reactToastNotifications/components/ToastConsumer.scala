package typingsJapgolly.reactToastNotifications.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactToastNotifications.mod.ToastConsumerContext
import typingsJapgolly.reactToastNotifications.mod.ToastConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastConsumer {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ToastConsumerContext => CallbackTo[Node]
  ): UnmountedWithRoot[
    ToastConsumerProps, 
    typingsJapgolly.reactToastNotifications.mod.ToastConsumer, 
    Unit, 
    ToastConsumerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactToastNotifications.mod.ToastConsumerContext) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactToastNotifications.mod.ToastConsumerProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactToastNotifications.mod.ToastConsumer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactToastNotifications.mod.ToastConsumerProps])
  }
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  object componentImport extends js.Object
  
}


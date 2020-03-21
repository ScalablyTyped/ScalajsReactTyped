package typingsJapgolly.reactBroadcast.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBroadcast.mod.Subscriber.Props
import typingsJapgolly.reactBroadcast.mod.Subscriber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subscriber {
  def apply[T](
    channel: String,
    quiet: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: T => CallbackTo[Node] = null
  ): UnmountedWithRoot[Props[T], Subscriber_[T], Unit, Props[T]] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactBroadcast.mod.Subscriber_[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBroadcast.mod.Subscriber.Props[T]])
  }
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  object componentImport extends js.Object
  
}


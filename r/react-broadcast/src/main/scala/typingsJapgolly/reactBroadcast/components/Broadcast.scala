package typingsJapgolly.reactBroadcast.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBroadcast.mod.Broadcast.Props
import typingsJapgolly.reactBroadcast.mod.Broadcast_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Broadcast {
  def apply[T](
    channel: String,
    value: T,
    compareValues: (T, T) => CallbackTo[Boolean] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props[T], Broadcast_[T], Unit, Props[T]] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (compareValues != null) __obj.updateDynamic("compareValues")(js.Any.fromFunction2((t0: T, t1: T) => compareValues(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBroadcast.mod.Broadcast.Props[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBroadcast.mod.Broadcast_[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBroadcast.mod.Broadcast.Props[T]])(children: _*)
  }
  @JSImport("react-broadcast", "Broadcast")
  @js.native
  object componentImport extends js.Object
  
}


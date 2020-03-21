package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.messagesMod.MessagesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Messages {
  def apply(
    className: String = null,
    id: String = null,
    onClick: /* message */ typingsJapgolly.primereact.messagesMod.Message => Callback = null,
    onRemove: /* message */ typingsJapgolly.primereact.messagesMod.Message => Callback = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    MessagesProps, 
    typingsJapgolly.primereact.primereactMessagesMod.Messages, 
    Unit, 
    MessagesProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.messagesMod.Message) => onClick(t0).runNow()))
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.primereact.messagesMod.Message) => onRemove(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.messagesMod.MessagesProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactMessagesMod.Messages](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.messagesMod.MessagesProps])(children: _*)
  }
  @JSImport("primereact/messages", "Messages")
  @js.native
  object componentImport extends js.Object
  
}


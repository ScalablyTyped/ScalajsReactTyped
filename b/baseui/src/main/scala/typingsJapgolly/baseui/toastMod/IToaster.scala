package typingsJapgolly.baseui.toastMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.baseui.ReadonlyToastProps
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToaster extends js.Object {
  def clear(key: Key): Unit
  def getRef(): Ref
  def info(children: Node, props: ReadonlyToastProps): Key
  def negative(children: Node, props: ReadonlyToastProps): Key
  def positive(children: Node, props: ReadonlyToastProps): Key
  def show(children: Node, props: ReadonlyToastProps): Key
  def update(key: Key, props: ReadonlyToastProps): Unit
  def warning(children: Node, props: ReadonlyToastProps): Key
}

object IToaster {
  @scala.inline
  def apply(
    clear: Key => Callback,
    getRef: CallbackTo[Ref],
    info: (Node, ReadonlyToastProps) => CallbackTo[Key],
    negative: (Node, ReadonlyToastProps) => CallbackTo[Key],
    positive: (Node, ReadonlyToastProps) => CallbackTo[Key],
    show: (Node, ReadonlyToastProps) => CallbackTo[Key],
    update: (Key, ReadonlyToastProps) => Callback,
    warning: (Node, ReadonlyToastProps) => CallbackTo[Key]
  ): IToaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.Key) => clear(t0).runNow()))
    __obj.updateDynamic("getRef")(getRef.toJsFn)
    __obj.updateDynamic("info")(js.Any.fromFunction2((t0: japgolly.scalajs.react.raw.React.Node, t1: typingsJapgolly.baseui.ReadonlyToastProps) => info(t0, t1).runNow()))
    __obj.updateDynamic("negative")(js.Any.fromFunction2((t0: japgolly.scalajs.react.raw.React.Node, t1: typingsJapgolly.baseui.ReadonlyToastProps) => negative(t0, t1).runNow()))
    __obj.updateDynamic("positive")(js.Any.fromFunction2((t0: japgolly.scalajs.react.raw.React.Node, t1: typingsJapgolly.baseui.ReadonlyToastProps) => positive(t0, t1).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction2((t0: japgolly.scalajs.react.raw.React.Node, t1: typingsJapgolly.baseui.ReadonlyToastProps) => show(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: typingsJapgolly.react.mod.Key, t1: typingsJapgolly.baseui.ReadonlyToastProps) => update(t0, t1).runNow()))
    __obj.updateDynamic("warning")(js.Any.fromFunction2((t0: japgolly.scalajs.react.raw.React.Node, t1: typingsJapgolly.baseui.ReadonlyToastProps) => warning(t0, t1).runNow()))
    __obj.asInstanceOf[IToaster]
  }
}


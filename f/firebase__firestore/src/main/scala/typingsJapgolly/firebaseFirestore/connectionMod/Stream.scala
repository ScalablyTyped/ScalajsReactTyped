package typingsJapgolly.firebaseFirestore.connectionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.errorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream[I, O] extends js.Object {
  def close(): Unit
  def onClose(callback: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit]): Unit
  def onMessage(callback: js.Function1[/* msg */ O, Unit]): Unit
  def onOpen(callback: js.Function0[Unit]): Unit
  def send(msg: I): Unit
}

object Stream {
  @scala.inline
  def apply[I, O](
    close: Callback,
    onClose: js.Function1[/* err */ js.UndefOr[FirestoreError], Unit] => Callback,
    onMessage: js.Function1[/* msg */ O, Unit] => Callback,
    onOpen: js.Function0[Unit] => Callback,
    send: I => Callback
  ): Stream[I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: js.Function1[
  /* err */ js.UndefOr[typingsJapgolly.firebaseFirestore.errorMod.FirestoreError], 
  scala.Unit]) => onClose(t0).runNow()))
    __obj.updateDynamic("onMessage")(js.Any.fromFunction1((t0: js.Function1[/* msg */ O, scala.Unit]) => onMessage(t0).runNow()))
    __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => onOpen(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: I) => send(t0).runNow()))
    __obj.asInstanceOf[Stream[I, O]]
  }
}


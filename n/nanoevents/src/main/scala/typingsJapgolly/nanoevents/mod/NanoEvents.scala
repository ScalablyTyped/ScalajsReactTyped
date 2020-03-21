package typingsJapgolly.nanoevents.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NanoEvents[T /* <: js.Object */] extends js.Object {
  def emit[U /* <: String */](
    name: U,
    value: /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any
  ): Unit
  def on[U /* <: String */](
    name: U,
    callBack: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]
  ): js.Function0[Unit]
}

object NanoEvents {
  @scala.inline
  def apply[T /* <: js.Object */](
    emit: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => Callback,
    on: (js.Any, js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      js.Any
    ]) => CallbackTo[js.Function0[Unit]]
  ): NanoEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: js.Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ js.Any) => emit(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: js.Any, t1: js.Function1[
  /* import warning: importer.ImportType#apply Failed type conversion: T[U] */ /* arg */ js.Any, 
  js.Any]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[NanoEvents[T]]
  }
}


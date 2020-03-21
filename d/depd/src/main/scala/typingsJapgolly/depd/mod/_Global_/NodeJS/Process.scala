package typingsJapgolly.depd.mod._Global_.NodeJS

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.depd.depdStrings.deprecation
import typingsJapgolly.depd.mod.DeprecationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Process extends js.Object {
  @JSName("addListener")
  def addListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("emit")
  def emit_deprecation(event: deprecation, code: DeprecationError): Boolean
  @JSName("listeners")
  def listeners_deprecation(event: deprecation): js.Array[DeprecationError]
  @JSName("on")
  def on_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("once")
  def once_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("prependListener")
  def prependListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
  @JSName("prependOnceListener")
  def prependOnceListener_deprecation(event: deprecation, listener: js.Function1[/* deprecationError */ DeprecationError, Unit]): this.type
}

object Process {
  @scala.inline
  def apply(
    addListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => CallbackTo[Process],
    emit: (deprecation, DeprecationError) => CallbackTo[Boolean],
    listeners: deprecation => CallbackTo[js.Array[DeprecationError]],
    on: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => CallbackTo[Process],
    once: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => CallbackTo[Process],
    prependListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => CallbackTo[Process],
    prependOnceListener: (deprecation, js.Function1[/* deprecationError */ DeprecationError, Unit]) => CallbackTo[Process]
  ): Process = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.depd.depdStrings.deprecation, t1: js.Function1[/* deprecationError */ typingsJapgolly.depd.mod.DeprecationError, scala.Unit]) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: typingsJapgolly.depd.depdStrings.deprecation, t1: typingsJapgolly.depd.mod.DeprecationError) => emit(t0, t1).runNow()))
    __obj.updateDynamic("listeners")(js.Any.fromFunction1((t0: typingsJapgolly.depd.depdStrings.deprecation) => listeners(t0).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.depd.depdStrings.deprecation, t1: js.Function1[/* deprecationError */ typingsJapgolly.depd.mod.DeprecationError, scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("once")(js.Any.fromFunction2((t0: typingsJapgolly.depd.depdStrings.deprecation, t1: js.Function1[/* deprecationError */ typingsJapgolly.depd.mod.DeprecationError, scala.Unit]) => once(t0, t1).runNow()))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2((t0: typingsJapgolly.depd.depdStrings.deprecation, t1: js.Function1[/* deprecationError */ typingsJapgolly.depd.mod.DeprecationError, scala.Unit]) => prependListener(t0, t1).runNow()))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2((t0: typingsJapgolly.depd.depdStrings.deprecation, t1: js.Function1[/* deprecationError */ typingsJapgolly.depd.mod.DeprecationError, scala.Unit]) => prependOnceListener(t0, t1).runNow()))
    __obj.asInstanceOf[Process]
  }
}


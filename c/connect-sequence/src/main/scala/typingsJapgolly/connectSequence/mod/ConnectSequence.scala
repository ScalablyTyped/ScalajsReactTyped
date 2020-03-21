package typingsJapgolly.connectSequence.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSequence extends js.Object {
  def append(middleware: RequestHandler[ParamsDictionary]*): this.type
  def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary]): this.type
  def appendList(middleware: js.Array[RequestHandler[ParamsDictionary]]): this.type
  def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary]]): this.type
  def run(): Unit
}

object ConnectSequence {
  @scala.inline
  def apply(
    append: /* repeated */ RequestHandler[ParamsDictionary] => CallbackTo[ConnectSequence],
    appendIf: (Boolean, RequestHandler[ParamsDictionary]) => CallbackTo[ConnectSequence],
    appendList: js.Array[RequestHandler[ParamsDictionary]] => CallbackTo[ConnectSequence],
    appendListIf: (Boolean, js.Array[RequestHandler[ParamsDictionary]]) => CallbackTo[ConnectSequence],
    run: Callback
  ): ConnectSequence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => append(t0).runNow()))
    __obj.updateDynamic("appendIf")(js.Any.fromFunction2((t0: scala.Boolean, t1: typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => appendIf(t0, t1).runNow()))
    __obj.updateDynamic("appendList")(js.Any.fromFunction1((t0: js.Array[
  typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]]) => appendList(t0).runNow()))
    __obj.updateDynamic("appendListIf")(js.Any.fromFunction2((t0: scala.Boolean, t1: js.Array[
  typingsJapgolly.express.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]]) => appendListIf(t0, t1).runNow()))
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.asInstanceOf[ConnectSequence]
  }
}


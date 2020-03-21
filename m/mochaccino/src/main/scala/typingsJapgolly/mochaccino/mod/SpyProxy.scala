package typingsJapgolly.mochaccino.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mochaccino.mochaccinoBooleans.`true`
import typingsJapgolly.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpyProxy extends js.Object {
  var and: SpyProxy
  var spyProxy: `true`
  def callFake(fake: js.Function1[/* repeated */ js.Any, _]): Unit
  def callThrough(): Unit
  def getSubject(): SinonStub
  def returnValue(obj: js.Any): Unit
}

object SpyProxy {
  @scala.inline
  def apply(
    and: SpyProxy,
    callFake: js.Function1[/* repeated */ js.Any, js.Any] => Callback,
    callThrough: Callback,
    getSubject: CallbackTo[SinonStub],
    returnValue: js.Any => Callback,
    spyProxy: `true`
  ): SpyProxy = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], spyProxy = spyProxy.asInstanceOf[js.Any])
    __obj.updateDynamic("callFake")(js.Any.fromFunction1((t0: js.Function1[/* repeated */ js.Any, js.Any]) => callFake(t0).runNow()))
    __obj.updateDynamic("callThrough")(callThrough.toJsFn)
    __obj.updateDynamic("getSubject")(getSubject.toJsFn)
    __obj.updateDynamic("returnValue")(js.Any.fromFunction1((t0: js.Any) => returnValue(t0).runNow()))
    __obj.asInstanceOf[SpyProxy]
  }
}


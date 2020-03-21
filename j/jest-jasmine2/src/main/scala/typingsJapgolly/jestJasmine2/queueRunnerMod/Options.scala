package typingsJapgolly.jestJasmine2.queueRunnerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any
  var queueableFns: js.Array[QueueableFn]
  var setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any
  var userContext: js.Any
  def fail(error: js.Error): Unit
  def onException(error: js.Error): Unit
}

object Options {
  @scala.inline
  def apply(
    clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['clearTimeout'] */ js.Any,
    fail: js.Error => Callback,
    onException: js.Error => Callback,
    queueableFns: js.Array[QueueableFn],
    setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/queueRunner.Global['setTimeout'] */ js.Any,
    userContext: js.Any
  ): Options = {
    val __obj = js.Dynamic.literal(clearTimeout = clearTimeout.asInstanceOf[js.Any], queueableFns = queueableFns.asInstanceOf[js.Any], setTimeout = setTimeout.asInstanceOf[js.Any], userContext = userContext.asInstanceOf[js.Any])
    __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Error) => fail(t0).runNow()))
    __obj.updateDynamic("onException")(js.Any.fromFunction1((t0: js.Error) => onException(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}


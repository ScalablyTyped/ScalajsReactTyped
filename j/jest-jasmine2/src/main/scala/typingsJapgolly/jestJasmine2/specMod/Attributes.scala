package typingsJapgolly.jestJasmine2.specMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestJasmine2.AnonAfters
import typingsJapgolly.jestJasmine2.AnonCancel
import typingsJapgolly.jestJasmine2.queueRunnerMod.Options
import typingsJapgolly.jestJasmine2.queueRunnerMod.QueueableFn
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  var description: String
  var id: String
  var queueRunnerFactory: js.Function1[/* options */ Options, AnonCancel]
  var queueableFn: QueueableFn
  var throwOnExpectationFailure: js.Any
  def beforeAndAfterFns(): AnonAfters
  def getSpecName(spec: Spec): String
  def getTestPath(): Path
  def onStart(context: Spec): Unit
  def resultCallback(result: SpecResult): Unit
  def userContext(): js.Any
}

object Attributes {
  @scala.inline
  def apply(
    beforeAndAfterFns: CallbackTo[AnonAfters],
    description: String,
    getSpecName: Spec => CallbackTo[String],
    getTestPath: CallbackTo[Path],
    id: String,
    onStart: Spec => Callback,
    queueRunnerFactory: /* options */ Options => CallbackTo[AnonCancel],
    queueableFn: QueueableFn,
    resultCallback: SpecResult => Callback,
    throwOnExpectationFailure: js.Any,
    userContext: CallbackTo[js.Any]
  ): Attributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueableFn = queueableFn.asInstanceOf[js.Any], throwOnExpectationFailure = throwOnExpectationFailure.asInstanceOf[js.Any])
    __obj.updateDynamic("beforeAndAfterFns")(beforeAndAfterFns.toJsFn)
    __obj.updateDynamic("getSpecName")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.Spec) => getSpecName(t0).runNow()))
    __obj.updateDynamic("getTestPath")(getTestPath.toJsFn)
    __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.Spec) => onStart(t0).runNow()))
    __obj.updateDynamic("queueRunnerFactory")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.jestJasmine2.queueRunnerMod.Options) => queueRunnerFactory(t0).runNow()))
    __obj.updateDynamic("resultCallback")(js.Any.fromFunction1((t0: typingsJapgolly.jestJasmine2.specMod.SpecResult) => resultCallback(t0).runNow()))
    __obj.updateDynamic("userContext")(userContext.toJsFn)
    __obj.asInstanceOf[Attributes]
  }
}


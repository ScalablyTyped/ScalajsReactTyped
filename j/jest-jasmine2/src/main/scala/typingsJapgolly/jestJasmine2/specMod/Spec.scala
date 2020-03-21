package typingsJapgolly.jestJasmine2.specMod

import typingsJapgolly.jestJasmine2.AnonAfters
import typingsJapgolly.jestJasmine2.AnonCancel
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.disabled
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.failed
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.passed
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.pending
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.todo
import typingsJapgolly.jestJasmine2.queueRunnerMod.Options
import typingsJapgolly.jestJasmine2.queueRunnerMod.QueueableFn
import typingsJapgolly.jestJasmine2.typesMod.AssertionErrorWithStack
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec extends js.Object {
  var currentRun: js.UndefOr[ReturnType[js.Function1[/* options */ Options, AnonCancel]]] = js.native
  var description: String = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var expand: js.UndefOr[Boolean] = js.native
  var id: String = js.native
  var initError: js.Error = js.native
  var markedPending: js.UndefOr[Boolean] = js.native
  var markedTodo: js.UndefOr[Boolean] = js.native
  var queueRunnerFactory: js.Function1[/* options */ Options, AnonCancel] = js.native
  var queueableFn: QueueableFn = js.native
  var result: SpecResult = js.native
  var throwOnExpectationFailure: Boolean = js.native
  def addExpectationResult(passed: Boolean, data: typingsJapgolly.jestJasmine2.expectationResultFactoryMod.Options): Unit = js.native
  def addExpectationResult(
    passed: Boolean,
    data: typingsJapgolly.jestJasmine2.expectationResultFactoryMod.Options,
    isError: Boolean
  ): Unit = js.native
  def beforeAndAfterFns(): AnonAfters = js.native
  def cancel(): Unit = js.native
  def disable(): Unit = js.native
  def execute(onComplete: js.Function, enabled: Boolean): Unit = js.native
  def getFullName(): String = js.native
  def getResult(): SpecResult = js.native
  def getSpecName(spec: Spec): String = js.native
  def isAssertionError(error: js.Error): Boolean = js.native
  def isExecutable(): Boolean = js.native
  def onException(error: typingsJapgolly.jestJasmine2.expectationFailedMod.default): Unit = js.native
  def onException(error: AssertionErrorWithStack): Unit = js.native
  def onStart(spec: Spec): Unit = js.native
  def pend(): Unit = js.native
  def pend(message: String): Unit = js.native
  def resultCallback(result: SpecResult): Unit = js.native
  def status(): disabled | pending | failed | passed | todo = js.native
  def status(enabled: Boolean): disabled | pending | failed | passed | todo = js.native
  def todo(): Unit = js.native
  def userContext(): js.Any = js.native
}


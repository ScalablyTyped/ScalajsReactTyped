package typingsJapgolly.jestJasmine2.suiteMod

import typingsJapgolly.jestJasmine2.expectationResultFactoryMod.Options
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.disabled
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.failed
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.finished
import typingsJapgolly.jestJasmine2.jestJasmine2Strings.pending
import typingsJapgolly.jestJasmine2.queueRunnerMod.QueueableFn
import typingsJapgolly.jestJasmine2.typesMod.AssertionErrorWithStack
import typingsJapgolly.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suite extends js.Object {
  var afterAllFns: js.Array[QueueableFn] = js.native
  var afterFns: js.Array[QueueableFn] = js.native
  var beforeAllFns: js.Array[QueueableFn] = js.native
  var beforeFns: js.Array[QueueableFn] = js.native
  var children: js.Array[Suite | typingsJapgolly.jestJasmine2.specMod.default] = js.native
  var description: String = js.native
  var disabled: Boolean = js.native
  var id: String = js.native
  var isFocused: Boolean = js.native
  var markedPending: Boolean = js.native
  var markedTodo: Boolean = js.native
  var parentSuite: js.UndefOr[Suite] = js.native
  var result: SuiteResult = js.native
  var sharedContext: js.UndefOr[js.Object] = js.native
  var throwOnExpectationFailure: Boolean = js.native
  def addChild(child: typingsJapgolly.jestJasmine2.specMod.default): Unit = js.native
  def addChild(child: Suite): Unit = js.native
  def addExpectationResult(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Spec['addExpectationResult']> is not an array type */ args: Parameters[
      js.Function3[/* passed */ Boolean, /* data */ Options, /* isError */ js.UndefOr[Boolean], Unit]
    ]
  ): Unit = js.native
  def afterAll(fn: QueueableFn): Unit = js.native
  def afterEach(fn: QueueableFn): Unit = js.native
  def beforeAll(fn: QueueableFn): Unit = js.native
  def beforeEach(fn: QueueableFn): Unit = js.native
  def canBeReentered(): Boolean = js.native
  def clonedSharedUserContext(): js.Object = js.native
  def disable(): Unit = js.native
  def execute(_args: js.Any*): Unit = js.native
  def getFullName(): String = js.native
  def getResult(): SuiteResult = js.native
  def isExecutable(): Boolean = js.native
  def onException(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Spec['onException']> is not an array type */ args: Parameters[
      js.Function1[
        /* error */ typingsJapgolly.jestJasmine2.expectationFailedMod.default | AssertionErrorWithStack, 
        Unit
      ]
    ]
  ): Unit = js.native
  def pend(): Unit = js.native
  def pend(_message: String): Unit = js.native
  def sharedUserContext(): js.Object = js.native
  def status(): disabled | pending | failed | finished = js.native
}


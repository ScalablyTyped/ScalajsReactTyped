package typingsJapgolly.mocha.Mocha_

import typingsJapgolly.mocha.mochaStrings.`hook end`
import typingsJapgolly.mocha.mochaStrings.`suite end`
import typingsJapgolly.mocha.mochaStrings.`test end`
import typingsJapgolly.mocha.mochaStrings.end
import typingsJapgolly.mocha.mochaStrings.fail
import typingsJapgolly.mocha.mochaStrings.hook
import typingsJapgolly.mocha.mochaStrings.pass
import typingsJapgolly.mocha.mochaStrings.pending
import typingsJapgolly.mocha.mochaStrings.ready
import typingsJapgolly.mocha.mochaStrings.retry
import typingsJapgolly.mocha.mochaStrings.start
import typingsJapgolly.mocha.mochaStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerConstants extends js.Object {
  val EVENT_DELAY_BEGIN: waiting
  val EVENT_DELAY_END: ready
  val EVENT_HOOK_BEGIN: hook
  val EVENT_HOOK_END: `hook end`
  val EVENT_RUN_BEGIN: start
  val EVENT_RUN_END: end
  val EVENT_SUITE_BEGIN: typingsJapgolly.mocha.mochaStrings.suite
  val EVENT_SUITE_END: `suite end`
  val EVENT_TEST_BEGIN: typingsJapgolly.mocha.mochaStrings.test
  val EVENT_TEST_END: `test end`
  val EVENT_TEST_FAIL: fail
  val EVENT_TEST_PASS: pass
  val EVENT_TEST_PENDING: pending
  val EVENT_TEST_RETRY: retry
}

object RunnerConstants {
  @scala.inline
  def apply(
    EVENT_DELAY_BEGIN: waiting,
    EVENT_DELAY_END: ready,
    EVENT_HOOK_BEGIN: hook,
    EVENT_HOOK_END: `hook end`,
    EVENT_RUN_BEGIN: start,
    EVENT_RUN_END: end,
    EVENT_SUITE_BEGIN: typingsJapgolly.mocha.mochaStrings.suite,
    EVENT_SUITE_END: `suite end`,
    EVENT_TEST_BEGIN: typingsJapgolly.mocha.mochaStrings.test,
    EVENT_TEST_END: `test end`,
    EVENT_TEST_FAIL: fail,
    EVENT_TEST_PASS: pass,
    EVENT_TEST_PENDING: pending,
    EVENT_TEST_RETRY: retry
  ): RunnerConstants = {
    val __obj = js.Dynamic.literal(EVENT_DELAY_BEGIN = EVENT_DELAY_BEGIN.asInstanceOf[js.Any], EVENT_DELAY_END = EVENT_DELAY_END.asInstanceOf[js.Any], EVENT_HOOK_BEGIN = EVENT_HOOK_BEGIN.asInstanceOf[js.Any], EVENT_HOOK_END = EVENT_HOOK_END.asInstanceOf[js.Any], EVENT_RUN_BEGIN = EVENT_RUN_BEGIN.asInstanceOf[js.Any], EVENT_RUN_END = EVENT_RUN_END.asInstanceOf[js.Any], EVENT_SUITE_BEGIN = EVENT_SUITE_BEGIN.asInstanceOf[js.Any], EVENT_SUITE_END = EVENT_SUITE_END.asInstanceOf[js.Any], EVENT_TEST_BEGIN = EVENT_TEST_BEGIN.asInstanceOf[js.Any], EVENT_TEST_END = EVENT_TEST_END.asInstanceOf[js.Any], EVENT_TEST_FAIL = EVENT_TEST_FAIL.asInstanceOf[js.Any], EVENT_TEST_PASS = EVENT_TEST_PASS.asInstanceOf[js.Any], EVENT_TEST_PENDING = EVENT_TEST_PENDING.asInstanceOf[js.Any], EVENT_TEST_RETRY = EVENT_TEST_RETRY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunnerConstants]
  }
}


package typingsJapgolly.rxjs.rxMod

import typingsJapgolly.rxjs.subscriptionLogMod.SubscriptionLog
import typingsJapgolly.rxjs.testMessageMod.TestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "TestScheduler")
@js.native
class TestScheduler protected ()
  extends typingsJapgolly.rxjs.testSchedulerMod.TestScheduler {
  def this(assertDeepEqual: js.Function2[/* actual */ js.Any, /* expected */ js.Any, Boolean | Unit]) = this()
}

/* static members */
@JSImport("rxjs/internal/Rx", "TestScheduler")
@js.native
object TestScheduler extends js.Object {
  /** @nocollapse */
  def parseMarbles(marbles: String): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: js.Any): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any): js.Array[TestMessage] = js.native
  def parseMarbles(marbles: String, values: js.Any, errorValue: js.Any, materializeInnerObservables: Boolean): js.Array[TestMessage] = js.native
  def parseMarbles(
    marbles: String,
    values: js.Any,
    errorValue: js.Any,
    materializeInnerObservables: Boolean,
    runMode: Boolean
  ): js.Array[TestMessage] = js.native
  /** @nocollapse */
  def parseMarblesAsSubscriptions(marbles: String): SubscriptionLog = js.native
  def parseMarblesAsSubscriptions(marbles: String, runMode: Boolean): SubscriptionLog = js.native
}


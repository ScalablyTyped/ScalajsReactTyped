package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.internalTestingSubscriptionLogMod.SubscriptionLog
import typingsJapgolly.rxjs.internalTestingTestMessageMod.TestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class TestScheduler protected ()
    extends typingsJapgolly.rxjs.internalTestingTestSchedulerMod.TestScheduler {
    def this(assertDeepEqual: js.Function2[/* actual */ js.Any, /* expected */ js.Any, Boolean | Unit]) = this()
  }
  
  /* static members */
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
  
}


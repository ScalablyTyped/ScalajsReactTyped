package typingsJapgolly.proxyVerifier.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  var testUrl: String
  def testFn(data: String, status: Double, headers: Headers): Unit
}

object TestOptions {
  @scala.inline
  def apply(testFn: (String, Double, Headers) => Callback, testUrl: String): TestOptions = {
    val __obj = js.Dynamic.literal(testUrl = testUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("testFn")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: typingsJapgolly.proxyVerifier.mod.Headers) => testFn(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TestOptions]
  }
}


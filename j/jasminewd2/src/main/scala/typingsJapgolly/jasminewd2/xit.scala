package typingsJapgolly.jasminewd2

import typingsJapgolly.jasmine.DoneFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("xit")
@js.native
object xit extends js.Object {
  def apply(expectation: String): Unit = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def apply(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
}


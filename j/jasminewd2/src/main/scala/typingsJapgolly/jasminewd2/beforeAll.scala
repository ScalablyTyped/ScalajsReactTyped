package typingsJapgolly.jasminewd2

import typingsJapgolly.jasmine.DoneFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("beforeAll")
@js.native
object beforeAll extends js.Object {
  def apply(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  def apply(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
}


package typingsJapgolly.braintreeWebDropIn

import typingsJapgolly.braintreeWebDropIn.mod.Dropin
import typingsJapgolly.braintreeWebDropIn.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreate extends js.Object {
  def create(options: Options): js.Promise[Dropin] = js.native
  def create(
    options: Options,
    callback: js.Function2[/* error */ js.Object | Null, /* dropin */ js.UndefOr[Dropin], Unit]
  ): Unit = js.native
}


package typingsJapgolly.mongooseDelete

import typingsJapgolly.mongoose.mod.ModelUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallConditionsDocOptionsCallback extends js.Object {
  def apply(conditions: js.Any, doc: js.Any): Queryany = js.native
  def apply(conditions: js.Any, doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Queryany = js.native
  def apply(conditions: js.Any, doc: js.Any, options: ModelUpdateOptions): Queryany = js.native
  def apply(
    conditions: js.Any,
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
}


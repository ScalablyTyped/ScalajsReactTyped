package typingsJapgolly.apigeeAccess.mod.ApigeeAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaService extends js.Object {
  @JSName("apply")
  def apply(): Unit = js.native
  @JSName("apply")
  def apply(options: QuotaServiceApplyOptions): Unit = js.native
  @JSName("apply")
  def apply(
    options: QuotaServiceApplyOptions,
    callback: js.Function2[/* err */ js.Any, /* data */ QuotaServiceApplyCallbackData, Unit]
  ): Unit = js.native
}


package typingsJapgolly.connectAzuretables.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureTableStoreFactory extends js.Object {
  def create(options: AzureTableStoreOptions): AzureTableStore
}

object AzureTableStoreFactory {
  @scala.inline
  def apply(create: AzureTableStoreOptions => CallbackTo[AzureTableStore]): AzureTableStoreFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.connectAzuretables.mod.AzureTableStoreOptions) => create(t0).runNow()))
    __obj.asInstanceOf[AzureTableStoreFactory]
  }
}


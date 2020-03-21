package typingsJapgolly.plaidLink

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.plaidLink.mod.Plaid.CreateConfig
import typingsJapgolly.plaidLink.mod.Plaid.LinkHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var version: String
  def create(params: CreateConfig): LinkHandler
}

object AnonCreate {
  @scala.inline
  def apply(create: CreateConfig => CallbackTo[LinkHandler], version: String): AnonCreate = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.plaidLink.mod.Plaid.CreateConfig) => create(t0).runNow()))
    __obj.asInstanceOf[AnonCreate]
  }
}


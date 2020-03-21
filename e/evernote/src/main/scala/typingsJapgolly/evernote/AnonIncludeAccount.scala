package typingsJapgolly.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeAccount extends js.Object {
  var includeAccount: js.UndefOr[Boolean] = js.undefined
  var includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  var includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeAccount {
  @scala.inline
  def apply(
    includeAccount: js.UndefOr[Boolean] = js.undefined,
    includeBusinessLinkedNotebooks: js.UndefOr[Boolean] = js.undefined,
    includePersonalLinkedNotebooks: js.UndefOr[Boolean] = js.undefined
  ): AnonIncludeAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccount)) __obj.updateDynamic("includeAccount")(includeAccount.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBusinessLinkedNotebooks)) __obj.updateDynamic("includeBusinessLinkedNotebooks")(includeBusinessLinkedNotebooks.asInstanceOf[js.Any])
    if (!js.isUndefined(includePersonalLinkedNotebooks)) __obj.updateDynamic("includePersonalLinkedNotebooks")(includePersonalLinkedNotebooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeAccount]
  }
}


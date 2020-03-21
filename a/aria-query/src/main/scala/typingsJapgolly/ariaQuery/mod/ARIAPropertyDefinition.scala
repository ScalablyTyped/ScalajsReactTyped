package typingsJapgolly.ariaQuery.mod

import typingsJapgolly.ariaQuery.ariaQueryStrings.boolean
import typingsJapgolly.ariaQuery.ariaQueryStrings.id
import typingsJapgolly.ariaQuery.ariaQueryStrings.idlist
import typingsJapgolly.ariaQuery.ariaQueryStrings.integer
import typingsJapgolly.ariaQuery.ariaQueryStrings.number
import typingsJapgolly.ariaQuery.ariaQueryStrings.string
import typingsJapgolly.ariaQuery.ariaQueryStrings.token
import typingsJapgolly.ariaQuery.ariaQueryStrings.tokenlist
import typingsJapgolly.ariaQuery.ariaQueryStrings.tristate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARIAPropertyDefinition extends js.Object {
  var allowundefined: js.UndefOr[Boolean] = js.undefined
  var `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate
  var value: js.UndefOr[js.Array[String | Boolean]] = js.undefined
}

object ARIAPropertyDefinition {
  @scala.inline
  def apply(
    `type`: string | id | idlist | integer | number | boolean | token | tokenlist | tristate,
    allowundefined: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[String | Boolean] = null
  ): ARIAPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(allowundefined)) __obj.updateDynamic("allowundefined")(allowundefined.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARIAPropertyDefinition]
  }
}


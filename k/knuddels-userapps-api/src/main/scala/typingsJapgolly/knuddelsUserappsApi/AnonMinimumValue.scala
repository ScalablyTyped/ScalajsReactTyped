package typingsJapgolly.knuddelsUserappsApi

import typingsJapgolly.knuddelsUserappsApi.mod._Global_.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinimumValue extends js.Object {
  var maximumValue: js.UndefOr[Double] = js.undefined
  var minimumValue: js.UndefOr[Double] = js.undefined
  var targetUsers: js.UndefOr[js.Array[User]] = js.undefined
}

object AnonMinimumValue {
  @scala.inline
  def apply(
    maximumValue: Int | Double = null,
    minimumValue: Int | Double = null,
    targetUsers: js.Array[User] = null
  ): AnonMinimumValue = {
    val __obj = js.Dynamic.literal()
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (targetUsers != null) __obj.updateDynamic("targetUsers")(targetUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMinimumValue]
  }
}


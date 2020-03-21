package typingsJapgolly.googleAppsScript.GoogleAppsScript.Calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a guest of an event.
  */
trait EventGuest extends js.Object {
  def getAdditionalGuests(): Integer
  def getEmail(): String
  def getGuestStatus(): GuestStatus
  def getName(): String
  /** @deprecated DO NOT USE */ def getStatus(): String
}

object EventGuest {
  @scala.inline
  def apply(
    getAdditionalGuests: CallbackTo[Integer],
    getEmail: CallbackTo[String],
    getGuestStatus: CallbackTo[GuestStatus],
    getName: CallbackTo[String],
    getStatus: CallbackTo[String]
  ): EventGuest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdditionalGuests")(getAdditionalGuests.toJsFn)
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getGuestStatus")(getGuestStatus.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getStatus")(getStatus.toJsFn)
    __obj.asInstanceOf[EventGuest]
  }
}


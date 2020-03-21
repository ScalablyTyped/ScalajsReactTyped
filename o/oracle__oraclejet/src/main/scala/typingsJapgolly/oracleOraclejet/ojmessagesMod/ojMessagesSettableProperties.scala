package typingsJapgolly.oracleOraclejet.ojmessagesMod

import typingsJapgolly.oracleOraclejet.AnonAriaLiveRegion
import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.ojmessageMod.ojMessage.DisplayOptions
import typingsJapgolly.oracleOraclejet.ojmessageMod.ojMessage.Message
import typingsJapgolly.oracleOraclejet.ojmessagesMod.ojMessages.Position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.general
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojMessagesSettableProperties extends JetSettableProperties {
  var display: general | notification
  var displayOptions: DisplayOptions
  var messages: js.Array[Message] | Null | (DataProvider[_, Message])
  var position: Position | Null
  var translations: AnonAriaLiveRegion
}

object ojMessagesSettableProperties {
  @scala.inline
  def apply(
    display: general | notification,
    displayOptions: DisplayOptions,
    translations: AnonAriaLiveRegion,
    messages: js.Array[Message] | (DataProvider[_, Message]) = null,
    position: Position = null
  ): ojMessagesSettableProperties = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojMessagesSettableProperties]
  }
}


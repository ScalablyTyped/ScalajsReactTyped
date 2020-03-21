package typingsJapgolly.oracleOraclejet.ojpopupMod

import typingsJapgolly.oracleOraclejet.AnonAriaCloseSkipLink
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojpopupMod.ojPopup.Position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.default
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.firstFocusable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.focusLoss
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.popup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.simple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPopupSettableProperties extends baseComponentSettableProperties {
  var autoDismiss: none | focusLoss
  var chrome: default | none
  var initialFocus: auto | none | firstFocusable | popup
  var modality: modeless | modal
  var position: Position
  var tail: none | simple
  @JSName("translations")
  var translations_ojPopupSettableProperties: AnonAriaCloseSkipLink
}

object ojPopupSettableProperties {
  @scala.inline
  def apply(
    autoDismiss: none | focusLoss,
    chrome: default | none,
    initialFocus: auto | none | firstFocusable | popup,
    modality: modeless | modal,
    position: Position,
    tail: none | simple,
    translations: AnonAriaCloseSkipLink
  ): ojPopupSettableProperties = {
    val __obj = js.Dynamic.literal(autoDismiss = autoDismiss.asInstanceOf[js.Any], chrome = chrome.asInstanceOf[js.Any], initialFocus = initialFocus.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojPopupSettableProperties]
  }
}


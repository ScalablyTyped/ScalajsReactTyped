package typingsJapgolly.oracleOraclejet.ojdialogMod

import typingsJapgolly.oracleOraclejet.AnonLabelCloseIcon
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojdialogMod.ojDialog.Position
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.escape
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hide
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icon
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.modeless
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.resizable
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDialogSettableProperties extends baseComponentSettableProperties {
  var cancelBehavior: icon | escape | none
  var dialogTitle: String | Null
  var dragAffordance: `title-bar` | none
  var initialVisibility: hide | show
  var modality: modal | modeless
  var position: Position
  var resizeBehavior: resizable | none
  var role: String
  @JSName("translations")
  var translations_ojDialogSettableProperties: AnonLabelCloseIcon
}

object ojDialogSettableProperties {
  @scala.inline
  def apply(
    cancelBehavior: icon | escape | none,
    dragAffordance: `title-bar` | none,
    initialVisibility: hide | show,
    modality: modal | modeless,
    position: Position,
    resizeBehavior: resizable | none,
    role: String,
    translations: AnonLabelCloseIcon,
    dialogTitle: String = null
  ): ojDialogSettableProperties = {
    val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogSettableProperties]
  }
}


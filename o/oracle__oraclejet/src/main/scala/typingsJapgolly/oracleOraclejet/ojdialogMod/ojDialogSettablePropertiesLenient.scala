package typingsJapgolly.oracleOraclejet.ojdialogMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonLabelCloseIcon
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdialog.ojDialogSettableProperties> */
trait ojDialogSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var cancelBehavior: js.UndefOr[icon | escape | none] = js.undefined
  var dialogTitle: js.UndefOr[String] = js.undefined
  var dragAffordance: js.UndefOr[`title-bar` | none] = js.undefined
  var initialVisibility: js.UndefOr[hide | show] = js.undefined
  var modality: js.UndefOr[modal | modeless] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var resizeBehavior: js.UndefOr[resizable | none] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var translations: js.UndefOr[AnonLabelCloseIcon] = js.undefined
}

object ojDialogSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    cancelBehavior: icon | escape | none = null,
    dialogTitle: String = null,
    dragAffordance: `title-bar` | none = null,
    initialVisibility: hide | show = null,
    modality: modal | modeless = null,
    position: Position = null,
    resizeBehavior: resizable | none = null,
    role: String = null,
    translations: AnonLabelCloseIcon = null
  ): ojDialogSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cancelBehavior != null) __obj.updateDynamic("cancelBehavior")(cancelBehavior.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    if (dragAffordance != null) __obj.updateDynamic("dragAffordance")(dragAffordance.asInstanceOf[js.Any])
    if (initialVisibility != null) __obj.updateDynamic("initialVisibility")(initialVisibility.asInstanceOf[js.Any])
    if (modality != null) __obj.updateDynamic("modality")(modality.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (resizeBehavior != null) __obj.updateDynamic("resizeBehavior")(resizeBehavior.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojDialogSettablePropertiesLenient]
  }
}


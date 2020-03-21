package typingsJapgolly.ejWebAll.ej.Kanban

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditSettingsEditItem extends js.Object {
  /** It is used to specify defaultValue for the fields while adding new card.
    * @Default {null}
    */
  var defaultValue: js.UndefOr[String | Double] = js.undefined
  /** It is used to set the particular editparams in the card for editing.
    * @Default {Object}
    */
  var editParams: js.UndefOr[js.Any] = js.undefined
  /** It is used to set the particular editType in the card for editing.
    * @Default {ej.Kanban.EditingType.String}
    */
  var editType: js.UndefOr[EditingType | String] = js.undefined
  /** It is used to map editing field from the data source.
    * @Default {null}
    */
  var field: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to define constraints for saving data to the database.
    * @Default {Object}
    */
  var validationRules: js.UndefOr[js.Any] = js.undefined
}

object EditSettingsEditItem {
  @scala.inline
  def apply(
    defaultValue: String | Double = null,
    editParams: js.Any = null,
    editType: EditingType | String = null,
    field: String = null,
    validationRules: js.Any = null
  ): EditSettingsEditItem = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (editParams != null) __obj.updateDynamic("editParams")(editParams.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSettingsEditItem]
  }
}


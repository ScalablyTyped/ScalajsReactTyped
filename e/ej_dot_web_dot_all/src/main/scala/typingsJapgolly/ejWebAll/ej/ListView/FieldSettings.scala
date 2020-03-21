package typingsJapgolly.ejWebAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSettings extends js.Object {
  /** Defines the HTML attributes such as id, class, styles for the specific list item.
    */
  var attributes: js.UndefOr[js.Any] = js.undefined
  /** Defines the specific field name which contains Boolean values to specify whether the list items to be checked by default or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** Defines the specific field name which contains id values for the list items.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Defines the class name for image in that specific list items.
    */
  var imageClass: js.UndefOr[String] = js.undefined
  /** Defines the URL for the image to be displayed in the list item.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /** To trigger the mousedown event for specific list items.
    */
  var mouseDown: js.UndefOr[String] = js.undefined
  /** To trigger the mouseup event for specific list items.
    */
  var mouseUP: js.UndefOr[String] = js.undefined
  /** Defines the URL to be navigated while clicking the list item.
    */
  var navigateUrl: js.UndefOr[String] = js.undefined
  /** To define the child level of list items inside the parent items.
    */
  var parentPrimaryKey: js.UndefOr[String] = js.undefined
  /** Specifies whether to retain the selection of the list item.
    */
  var persistSelection: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to prevent the selection of the list item.
    */
  var preventSelection: js.UndefOr[Boolean] = js.undefined
  /** To define the first level of list items.
    */
  var primaryKey: js.UndefOr[String] = js.undefined
  /** Defines the specific field name in the data source to load the list with data.
    */
  var text: js.UndefOr[String] = js.undefined
}

object FieldSettings {
  @scala.inline
  def apply(
    attributes: js.Any = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageClass: String = null,
    imageUrl: String = null,
    mouseDown: String = null,
    mouseUP: String = null,
    navigateUrl: String = null,
    parentPrimaryKey: String = null,
    persistSelection: js.UndefOr[Boolean] = js.undefined,
    preventSelection: js.UndefOr[Boolean] = js.undefined,
    primaryKey: String = null,
    text: String = null
  ): FieldSettings = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageClass != null) __obj.updateDynamic("imageClass")(imageClass.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(mouseDown.asInstanceOf[js.Any])
    if (mouseUP != null) __obj.updateDynamic("mouseUP")(mouseUP.asInstanceOf[js.Any])
    if (navigateUrl != null) __obj.updateDynamic("navigateUrl")(navigateUrl.asInstanceOf[js.Any])
    if (parentPrimaryKey != null) __obj.updateDynamic("parentPrimaryKey")(parentPrimaryKey.asInstanceOf[js.Any])
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(preventSelection)) __obj.updateDynamic("preventSelection")(preventSelection.asInstanceOf[js.Any])
    if (primaryKey != null) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSettings]
  }
}


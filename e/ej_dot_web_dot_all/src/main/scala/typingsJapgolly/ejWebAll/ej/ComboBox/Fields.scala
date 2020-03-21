package typingsJapgolly.ejWebAll.ej.ComboBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Used to group the popup list items.
    * @Default {null}
    */
  var groupBy: js.UndefOr[String] = js.undefined
  /** Defines class for the item.
    * @Default {null}
    */
  var iconCss: js.UndefOr[String] = js.undefined
  /** Defines the specific field name in the data source to load the popup list with data.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Defines the specific field name which contains unique values for the list items.
    * @Default {null}
    */
  var value: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(groupBy: String = null, iconCss: String = null, text: String = null, value: String = null): Fields = {
    val __obj = js.Dynamic.literal()
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (iconCss != null) __obj.updateDynamic("iconCss")(iconCss.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}


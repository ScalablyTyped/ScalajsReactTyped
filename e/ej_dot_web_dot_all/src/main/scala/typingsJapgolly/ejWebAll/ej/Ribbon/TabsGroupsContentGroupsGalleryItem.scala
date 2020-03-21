package typingsJapgolly.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsGroupsContentGroupsGalleryItem extends js.Object {
  /** Specifies the Syncfusion button members, events by using buttonSettings.
    * @Default {Object}
    */
  var buttonSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the custom tooltip for gallery content. Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.undefined
  /** Sets text for the gallery content.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Sets tooltip for the gallery content.
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.undefined
}

object TabsGroupsContentGroupsGalleryItem {
  @scala.inline
  def apply(
    buttonSettings: js.Any = null,
    customToolTip: js.Any = null,
    text: String = null,
    toolTip: String = null
  ): TabsGroupsContentGroupsGalleryItem = {
    val __obj = js.Dynamic.literal()
    if (buttonSettings != null) __obj.updateDynamic("buttonSettings")(buttonSettings.asInstanceOf[js.Any])
    if (customToolTip != null) __obj.updateDynamic("customToolTip")(customToolTip.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (toolTip != null) __obj.updateDynamic("toolTip")(toolTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsGroupsContentGroupsGalleryItem]
  }
}


package typingsJapgolly.oracleOraclejet.ojnavigationlistMod

import typingsJapgolly.oracleOraclejet.AnonAccessibleReorderAfterItem
import typingsJapgolly.oracleOraclejet.AnonRendererSelectable
import typingsJapgolly.oracleOraclejet.mod.baseComponentSettableProperties
import typingsJapgolly.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.all
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.bottom
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.enabled
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hidden
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.icons
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.popup
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.progressive
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTabBarSettableProperties[K, D] extends baseComponentSettableProperties {
  var as: String
  var currentItem: js.Any
  var data: (DataProvider[K, D]) | Null
  var display: all | icons
  var edge: top | bottom | start | end
  var item: AnonRendererSelectable[K, D]
  var overflow: popup | hidden
  var reorderable: enabled | disabled
  var selection: js.Any
  @JSName("translations")
  var translations_ojTabBarSettableProperties: AnonAccessibleReorderAfterItem
  var truncation: none | progressive
}

object ojTabBarSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    currentItem: js.Any,
    display: all | icons,
    edge: top | bottom | start | end,
    item: AnonRendererSelectable[K, D],
    overflow: popup | hidden,
    reorderable: enabled | disabled,
    selection: js.Any,
    translations: AnonAccessibleReorderAfterItem,
    truncation: none | progressive,
    data: DataProvider[K, D] = null
  ): ojTabBarSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], currentItem = currentItem.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], reorderable = reorderable.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], truncation = truncation.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarSettableProperties[K, D]]
  }
}


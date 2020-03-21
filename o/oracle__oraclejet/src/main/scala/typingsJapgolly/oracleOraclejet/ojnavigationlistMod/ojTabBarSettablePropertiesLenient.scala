package typingsJapgolly.oracleOraclejet.ojnavigationlistMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.AnonAccessibleReorderAfterItem
import typingsJapgolly.oracleOraclejet.AnonRendererSelectable
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojnavigationlist.ojTabBarSettableProperties<K, D>> */
trait ojTabBarSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var as: js.UndefOr[String] = js.undefined
  var currentItem: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var display: js.UndefOr[all | icons] = js.undefined
  var edge: js.UndefOr[top | bottom | start | end] = js.undefined
  var item: js.UndefOr[AnonRendererSelectable[K, D]] = js.undefined
  var overflow: js.UndefOr[popup | hidden] = js.undefined
  var reorderable: js.UndefOr[enabled | disabled] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var translations: js.UndefOr[AnonAccessibleReorderAfterItem] = js.undefined
  var truncation: js.UndefOr[none | progressive] = js.undefined
}

object ojTabBarSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: String = null,
    currentItem: js.Any = null,
    data: DataProvider[K, D] = null,
    display: all | icons = null,
    edge: top | bottom | start | end = null,
    item: AnonRendererSelectable[K, D] = null,
    overflow: popup | hidden = null,
    reorderable: enabled | disabled = null,
    selection: js.Any = null,
    translations: AnonAccessibleReorderAfterItem = null,
    truncation: none | progressive = null
  ): ojTabBarSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (currentItem != null) __obj.updateDynamic("currentItem")(currentItem.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (reorderable != null) __obj.updateDynamic("reorderable")(reorderable.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (truncation != null) __obj.updateDynamic("truncation")(truncation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTabBarSettablePropertiesLenient[K, D]]
  }
}


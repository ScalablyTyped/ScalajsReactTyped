package typingsJapgolly.firebase

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebase.mod.analytics.Item
import typingsJapgolly.firebase.mod.analytics.Promotion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentid
  extends /* key */ StringDictionary[js.Any] {
  var content_id: js.UndefOr[String] = js.undefined
  var content_type: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object AnonContentid {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    content_id: String = null,
    content_type: String = null,
    items: js.Array[Item] = null,
    promotions: js.Array[Promotion] = null
  ): AnonContentid = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentid]
  }
}


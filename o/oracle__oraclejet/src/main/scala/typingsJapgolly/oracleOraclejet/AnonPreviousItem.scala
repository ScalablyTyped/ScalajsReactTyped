package typingsJapgolly.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreviousItem[K]
  extends /* propName */ StringDictionary[js.Any] {
  var item: Element
  var key: K
  var previousItem: Element
  var previousKey: K
}

object AnonPreviousItem {
  @scala.inline
  def apply[K](
    item: Element,
    key: K,
    previousItem: Element,
    previousKey: K,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): AnonPreviousItem[K] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], previousItem = previousItem.asInstanceOf[js.Any], previousKey = previousKey.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPreviousItem[K]]
  }
}


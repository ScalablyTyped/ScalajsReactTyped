package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.AnonHighlight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListRenderItemInfo[ItemT] extends ListRenderItemInfo[ItemT] {
  var section: SectionListData[ItemT]
}

object SectionListRenderItemInfo {
  @scala.inline
  def apply[ItemT](index: Double, item: ItemT, section: SectionListData[ItemT], separators: AnonHighlight): SectionListRenderItemInfo[ItemT] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], separators = separators.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SectionListRenderItemInfo[ItemT]]
  }
}


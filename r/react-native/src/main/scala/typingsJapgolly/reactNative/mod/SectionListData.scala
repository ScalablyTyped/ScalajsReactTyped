package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionListData[ItemT]
  extends SectionBase[ItemT]
     with /* key */ StringDictionary[js.Any]

object SectionListData {
  @scala.inline
  def apply[ItemT](
    data: js.Array[ItemT],
    ItemSeparatorComponent: ComponentType[_] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    key: String = null,
    keyExtractor: (ItemT, /* index */ Double) => CallbackTo[String] = null,
    renderItem: /* info */ SectionListRenderItemInfo[ItemT] => CallbackTo[Element | Null] = null
  ): SectionListData[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2((t0: ItemT, t1: /* index */ scala.Double) => keyExtractor(t0, t1).runNow()))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactNative.mod.SectionListRenderItemInfo[ItemT]) => renderItem(t0).runNow()))
    __obj.asInstanceOf[SectionListData[ItemT]]
  }
}


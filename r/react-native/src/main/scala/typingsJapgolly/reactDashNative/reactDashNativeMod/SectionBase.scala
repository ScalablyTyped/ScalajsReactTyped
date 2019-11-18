package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionBase[ItemT] extends js.Object {
  var ItemSeparatorComponent: js.UndefOr[ComponentType[_] | Null] = js.undefined
  var data: js.Array[ItemT]
  var key: js.UndefOr[String] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ Double, String]] = js.undefined
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.undefined
}

object SectionBase {
  @scala.inline
  def apply[ItemT](
    data: js.Array[ItemT],
    ItemSeparatorComponent: ComponentType[_] = null,
    key: String = null,
    keyExtractor: (/* item */ ItemT, /* index */ Double) => CallbackTo[String] = null,
    renderItem: /* info */ SectionListRenderItemInfo[ItemT] => CallbackTo[Element | Null] = null
  ): SectionBase[ItemT] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (ItemSeparatorComponent != null) __obj.updateDynamic("ItemSeparatorComponent")(ItemSeparatorComponent.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyExtractor != null) __obj.updateDynamic("keyExtractor")(js.Any.fromFunction2((t0: /* item */ ItemT, t1: /* index */ scala.Double) => keyExtractor(t0, t1).runNow()))
    if (renderItem != null) __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactDashNative.reactDashNativeMod.SectionListRenderItemInfo[ItemT]) => renderItem(t0).runNow()))
    __obj.asInstanceOf[SectionBase[ItemT]]
  }
}


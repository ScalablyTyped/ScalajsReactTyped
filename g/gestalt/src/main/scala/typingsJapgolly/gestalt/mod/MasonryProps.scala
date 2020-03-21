package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.gestalt.gestaltStrings.MasonryDefaultLayout
import typingsJapgolly.gestalt.gestaltStrings.MasonryUniformRowLayout
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[Double] = js.undefined
  var comp: ComponentType[js.Object]
  var flexible: js.UndefOr[Boolean] = js.undefined
  var gutterWidth: js.UndefOr[Double] = js.undefined
  var items: js.Array[_]
  var layout: js.UndefOr[MasonryDefaultLayout | MasonryUniformRowLayout] = js.undefined
  var loadItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  var measurementStore: js.UndefOr[js.Any] = js.undefined
  var minCols: js.UndefOr[Double] = js.undefined
  var scrollContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var virtualize: js.UndefOr[Boolean] = js.undefined
}

object MasonryProps {
  @scala.inline
  def apply(
    comp: ComponentType[js.Object],
    items: js.Array[_],
    columnWidth: Int | Double = null,
    flexible: js.UndefOr[Boolean] = js.undefined,
    gutterWidth: Int | Double = null,
    layout: MasonryDefaultLayout | MasonryUniformRowLayout = null,
    loadItems: js.UndefOr[Callback] = js.undefined,
    measurementStore: js.Any = null,
    minCols: Int | Double = null,
    scrollContainer: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    virtualize: js.UndefOr[Boolean] = js.undefined
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(comp = comp.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(flexible)) __obj.updateDynamic("flexible")(flexible.asInstanceOf[js.Any])
    if (gutterWidth != null) __obj.updateDynamic("gutterWidth")(gutterWidth.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    loadItems.foreach(p => __obj.updateDynamic("loadItems")(p.toJsFn))
    if (measurementStore != null) __obj.updateDynamic("measurementStore")(measurementStore.asInstanceOf[js.Any])
    if (minCols != null) __obj.updateDynamic("minCols")(minCols.asInstanceOf[js.Any])
    scrollContainer.foreach(p => __obj.updateDynamic("scrollContainer")(p.toJsFn))
    if (!js.isUndefined(virtualize)) __obj.updateDynamic("virtualize")(virtualize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
}


package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.gestalt.gestaltStrings.MasonryDefaultLayout
import typingsJapgolly.gestalt.gestaltStrings.MasonryUniformRowLayout
import typingsJapgolly.gestalt.mod.MasonryProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Masonry {
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
    virtualize: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MasonryProps, typingsJapgolly.gestalt.mod.Masonry, Unit, MasonryProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.MasonryProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Masonry](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.MasonryProps])(children: _*)
  }
  @JSImport("gestalt", "Masonry")
  @js.native
  object componentImport extends js.Object
  
}


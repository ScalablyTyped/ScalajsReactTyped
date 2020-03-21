package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellRendererParams
import typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellSizeAndPosition
import typingsJapgolly.reactVirtualized.esCollectionMod.CollectionProps
import typingsJapgolly.reactVirtualized.esGridMod.ScrollParams
import typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams
import typingsJapgolly.reactVirtualized.mod.Alignment
import typingsJapgolly.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collection {
  def apply(
    cellCount: Double,
    height: Double,
    width: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => CallbackTo[Node],
    cellSizeAndPositionGetter: /* params */ Index => CallbackTo[CollectionCellSizeAndPosition],
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => CallbackTo[js.Array[Node]] = null,
    className: String = null,
    horizontalOverscanSize: Int | Double = null,
    id: String = null,
    noContentRenderer: js.UndefOr[CallbackTo[Element]] = js.undefined,
    onScroll: /* params */ ScrollParams => CallbackTo[js.Any] = null,
    onSectionRendered: /* params */ SectionRenderedParams => CallbackTo[js.Any] = null,
    scrollLeft: Int | Double = null,
    scrollToAlignment: Alignment = null,
    scrollToCell: Int | Double = null,
    scrollTop: Int | Double = null,
    sectionSize: Int | Double = null,
    style: CSSProperties = null,
    verticalOverscanSize: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    CollectionProps, 
    typingsJapgolly.reactVirtualized.mod.Collection, 
    Unit, 
    CollectionProps
  ] = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellRendererParams) => cellRenderer(t0).runNow()))
    __obj.updateDynamic("cellSizeAndPositionGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.mod.Index) => cellSizeAndPositionGetter(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (cellGroupRenderer != null) __obj.updateDynamic("cellGroupRenderer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams) => cellGroupRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (horizontalOverscanSize != null) __obj.updateDynamic("horizontalOverscanSize")(horizontalOverscanSize.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    noContentRenderer.foreach(p => __obj.updateDynamic("noContentRenderer")(p.toJsFn))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.ScrollParams) => onScroll(t0).runNow()))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esGridMod.SectionRenderedParams) => onSectionRendered(t0).runNow()))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (scrollToCell != null) __obj.updateDynamic("scrollToCell")(scrollToCell.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalOverscanSize != null) __obj.updateDynamic("verticalOverscanSize")(verticalOverscanSize.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esCollectionMod.CollectionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualized.mod.Collection](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esCollectionMod.CollectionProps])(children: _*)
  }
  @JSImport("react-virtualized", "Collection")
  @js.native
  object componentImport extends js.Object
  
}


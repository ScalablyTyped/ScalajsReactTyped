package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.scrollableViewMod.ScrollableViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollableView {
  def apply(
    body: js.Any = null,
    footer: js.Any = null,
    frozen: js.UndefOr[Boolean] = js.undefined,
    frozenBody: js.Any = null,
    frozenWidth: String = null,
    header: js.Any = null,
    onVirtualScroll: /* page */ Double => Callback = null,
    rows: Int | Double = null,
    totalRcords: Int | Double = null,
    unfrozenWidth: String = null,
    virtualScroll: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ScrollableViewProps, 
    typingsJapgolly.primereact.scrollableViewMod.ScrollableView, 
    Unit, 
    ScrollableViewProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(frozen)) __obj.updateDynamic("frozen")(frozen.asInstanceOf[js.Any])
    if (frozenBody != null) __obj.updateDynamic("frozenBody")(frozenBody.asInstanceOf[js.Any])
    if (frozenWidth != null) __obj.updateDynamic("frozenWidth")(frozenWidth.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (onVirtualScroll != null) __obj.updateDynamic("onVirtualScroll")(js.Any.fromFunction1((t0: /* page */ scala.Double) => onVirtualScroll(t0).runNow()))
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (totalRcords != null) __obj.updateDynamic("totalRcords")(totalRcords.asInstanceOf[js.Any])
    if (unfrozenWidth != null) __obj.updateDynamic("unfrozenWidth")(unfrozenWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualScroll)) __obj.updateDynamic("virtualScroll")(virtualScroll.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.scrollableViewMod.ScrollableViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.scrollableViewMod.ScrollableView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.scrollableViewMod.ScrollableViewProps])(children: _*)
  }
  @JSImport("primereact/components/datatable/ScrollableView", "ScrollableView")
  @js.native
  object componentImport extends js.Object
  
}


package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.mod.TabbarRenderTab
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.auto
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.bottom
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.slide
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  index  :number, renderTabs (): std.Array<react-onsenui.react-onsenui.TabbarRenderTab>,   position ? :'bottom' | 'top' | 'auto',   swipeable ? :boolean,   ignoreEdgeWidth ? :number,   animation ? :'none' | 'slide',   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   tabBorder ? :boolean,   onPreChange ? :(): void,   onPostChange ? :(): void,   onReactive ? :(): void,   onSwipe ? :(index : number, animationOptions : react-onsenui.react-onsenui.AnimationOptions): void} */
trait HTMLAttributesidclassNameIgnoreEdgeWidth extends js.Object {
  var animation: js.UndefOr[none | slide] = js.undefined
  var animationOptions: js.UndefOr[AnimationOptions] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ignoreEdgeWidth: js.UndefOr[Double] = js.undefined
  var index: Double
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipe: js.UndefOr[js.Function2[/* index */ Double, /* animationOptions */ AnimationOptions, Unit]] = js.undefined
  var position: js.UndefOr[bottom | top | auto] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var swipeable: js.UndefOr[Boolean] = js.undefined
  var tabBorder: js.UndefOr[Boolean] = js.undefined
  def renderTabs(): js.Array[TabbarRenderTab]
}

object HTMLAttributesidclassNameIgnoreEdgeWidth {
  @scala.inline
  def apply(
    index: Double,
    renderTabs: CallbackTo[js.Array[TabbarRenderTab]],
    animation: none | slide = null,
    animationOptions: AnimationOptions = null,
    className: String = null,
    id: String = null,
    ignoreEdgeWidth: Int | Double = null,
    onPostChange: js.UndefOr[Callback] = js.undefined,
    onPreChange: js.UndefOr[Callback] = js.undefined,
    onReactive: js.UndefOr[Callback] = js.undefined,
    onSwipe: (/* index */ Double, /* animationOptions */ AnimationOptions) => Callback = null,
    position: bottom | top | auto = null,
    style: CSSProperties = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBorder: js.UndefOr[Boolean] = js.undefined
  ): HTMLAttributesidclassNameIgnoreEdgeWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("renderTabs")(renderTabs.toJsFn)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationOptions != null) __obj.updateDynamic("animationOptions")(animationOptions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignoreEdgeWidth != null) __obj.updateDynamic("ignoreEdgeWidth")(ignoreEdgeWidth.asInstanceOf[js.Any])
    onPostChange.foreach(p => __obj.updateDynamic("onPostChange")(p.toJsFn))
    onPreChange.foreach(p => __obj.updateDynamic("onPreChange")(p.toJsFn))
    onReactive.foreach(p => __obj.updateDynamic("onReactive")(p.toJsFn))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* animationOptions */ typingsJapgolly.reactOnsenui.mod.AnimationOptions) => onSwipe(t0, t1).runNow()))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable.asInstanceOf[js.Any])
    if (!js.isUndefined(tabBorder)) __obj.updateDynamic("tabBorder")(tabBorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameIgnoreEdgeWidth]
  }
}


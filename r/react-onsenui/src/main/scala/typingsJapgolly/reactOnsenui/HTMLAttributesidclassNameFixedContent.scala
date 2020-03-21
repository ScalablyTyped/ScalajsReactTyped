package typingsJapgolly.reactOnsenui

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.mod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  onChange ? :(e : react-onsenui.react-onsenui.PullHookChangeEvent): void,   onLoad ? :(done : (): void): void,   onPull ? :(): void,   disabled ? :boolean,   height ? :number,   thresholdHeight ? :number,   fixedContent ? :boolean} */
trait HTMLAttributesidclassNameFixedContent extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fixedContent: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ PullHookChangeEvent, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], Unit]] = js.undefined
  var onPull: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var thresholdHeight: js.UndefOr[Double] = js.undefined
}

object HTMLAttributesidclassNameFixedContent {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fixedContent: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: String = null,
    onChange: /* e */ PullHookChangeEvent => Callback = null,
    onLoad: /* done */ js.Function0[Unit] => Callback = null,
    onPull: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    thresholdHeight: Int | Double = null
  ): HTMLAttributesidclassNameFixedContent = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedContent)) __obj.updateDynamic("fixedContent")(fixedContent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactOnsenui.mod.PullHookChangeEvent) => onChange(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* done */ js.Function0[scala.Unit]) => onLoad(t0).runNow()))
    onPull.foreach(p => __obj.updateDynamic("onPull")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thresholdHeight != null) __obj.updateDynamic("thresholdHeight")(thresholdHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameFixedContent]
  }
}


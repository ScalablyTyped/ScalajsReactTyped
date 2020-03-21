package typingsJapgolly.reactOverlays.autoAffixMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import typingsJapgolly.reactOverlays.affixMod.AffixProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoAffixProps extends AffixProps {
  /**
    * Automatically set width when affixed
    */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * The logical container node or component for determining offset from bottom
    * of viewport, or a function that returns it
    */
  var container: js.UndefOr[ReactInstance | js.Function0[ReactInstance]] = js.undefined
}

object AutoAffixProps {
  @scala.inline
  def apply(
    affixClassName: String = null,
    affixStyle: CSSProperties = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    bottomClassName: String = null,
    bottomStyle: CSSProperties = null,
    container: ReactInstance | js.Function0[ReactInstance] = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onAffix: js.UndefOr[Callback] = js.undefined,
    onAffixBottom: js.UndefOr[Callback] = js.undefined,
    onAffixTop: js.UndefOr[Callback] = js.undefined,
    onAffixed: js.UndefOr[Callback] = js.undefined,
    onAffixedBottom: js.UndefOr[Callback] = js.undefined,
    onAffixedTop: js.UndefOr[Callback] = js.undefined,
    topClassName: String = null,
    topStyle: CSSProperties = null,
    viewportOffsetTop: Int | Double = null
  ): AutoAffixProps = {
    val __obj = js.Dynamic.literal()
    if (affixClassName != null) __obj.updateDynamic("affixClassName")(affixClassName.asInstanceOf[js.Any])
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (bottomClassName != null) __obj.updateDynamic("bottomClassName")(bottomClassName.asInstanceOf[js.Any])
    if (bottomStyle != null) __obj.updateDynamic("bottomStyle")(bottomStyle.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    onAffix.foreach(p => __obj.updateDynamic("onAffix")(p.toJsFn))
    onAffixBottom.foreach(p => __obj.updateDynamic("onAffixBottom")(p.toJsFn))
    onAffixTop.foreach(p => __obj.updateDynamic("onAffixTop")(p.toJsFn))
    onAffixed.foreach(p => __obj.updateDynamic("onAffixed")(p.toJsFn))
    onAffixedBottom.foreach(p => __obj.updateDynamic("onAffixedBottom")(p.toJsFn))
    onAffixedTop.foreach(p => __obj.updateDynamic("onAffixedTop")(p.toJsFn))
    if (topClassName != null) __obj.updateDynamic("topClassName")(topClassName.asInstanceOf[js.Any])
    if (topStyle != null) __obj.updateDynamic("topStyle")(topStyle.asInstanceOf[js.Any])
    if (viewportOffsetTop != null) __obj.updateDynamic("viewportOffsetTop")(viewportOffsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAffixProps]
  }
}


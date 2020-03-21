package typingsJapgolly.reactOverlays.affixMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// put AffixProps inside the exported namespace so it's importable in AutoAffix
trait AffixProps extends js.Object {
  /**
    * CSS class or classes to apply when affixed
    */
  var affixClassName: js.UndefOr[String] = js.undefined
  /**
    * Style to apply when affixed
    */
  var affixStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * CSS class or classes to apply when at bottom
    */
  var bottomClassName: js.UndefOr[String] = js.undefined
  /**
    * Style to apply when at bottom
    */
  var bottomStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Pixels to offset from bottom of screen when calculating position
    */
  var offsetBottom: js.UndefOr[Double] = js.undefined
  /**
    * Pixels to offset from top of screen when calculating position
    */
  var offsetTop: js.UndefOr[Double] = js.undefined
  /**
    * Callback fired when the right before the `affixStyle` and `affixStyle` props are rendered
    */
  var onAffix: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired when the right before the `bottomStyle` and `bottomClassName` props are rendered
    */
  var onAffixBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired when the right before the `topStyle` and `topClassName` props are rendered
    */
  var onAffixTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired after the component `affixStyle` and `affixClassName` props have been rendered.
    */
  var onAffixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired after the component `bottomStyle` and `bottomClassName` props have been rendered.
    */
  var onAffixedBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback fired after the component `topStyle` and `topClassName` props have been rendered.
    */
  var onAffixedTop: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * CSS class or classes to apply when at top
    */
  var topClassName: js.UndefOr[String] = js.undefined
  /**
    * Style to apply when at top
    */
  var topStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * When affixed, pixels to offset from top of viewport
    */
  var viewportOffsetTop: js.UndefOr[Double] = js.undefined
}

object AffixProps {
  @scala.inline
  def apply(
    affixClassName: String = null,
    affixStyle: CSSProperties = null,
    bottomClassName: String = null,
    bottomStyle: CSSProperties = null,
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
  ): AffixProps = {
    val __obj = js.Dynamic.literal()
    if (affixClassName != null) __obj.updateDynamic("affixClassName")(affixClassName.asInstanceOf[js.Any])
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle.asInstanceOf[js.Any])
    if (bottomClassName != null) __obj.updateDynamic("bottomClassName")(bottomClassName.asInstanceOf[js.Any])
    if (bottomStyle != null) __obj.updateDynamic("bottomStyle")(bottomStyle.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AffixProps]
  }
}


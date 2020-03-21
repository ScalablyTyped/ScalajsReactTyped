package typingsJapgolly.reactImageCrop.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsJapgolly.reactImageCrop.reactImageCropStrings.anonymous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCropProps extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var circularCrop: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var crop: js.UndefOr[Crop] = js.undefined
  var crossorigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var imageAlt: js.UndefOr[String] = js.undefined
  var imageStyle: js.UndefOr[CSSProperties] = js.undefined
  var keepSelection: js.UndefOr[Boolean] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var onComplete: js.UndefOr[js.Function2[/* crop */ Crop, /* percentCrop */ PercentCrop, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onImageError: js.UndefOr[js.Function1[/* event */ ReactEventFrom[HTMLImageElement], Unit]] = js.undefined
  var onImageLoaded: js.UndefOr[js.Function1[/* target */ HTMLImageElement, Unit]] = js.undefined
  var renderComponent: js.UndefOr[Node] = js.undefined
  var renderSelectionAddon: js.UndefOr[js.Function1[/* state */ js.Any, Node]] = js.undefined
  var ruleOfThirds: js.UndefOr[Boolean] = js.undefined
  var src: String
  var style: js.UndefOr[CSSProperties] = js.undefined
  def onChange(crop: Crop, percentCrop: PercentCrop): Unit
}

object ReactCropProps {
  @scala.inline
  def apply(
    onChange: (Crop, PercentCrop) => Callback,
    src: String,
    children: VdomNode = null,
    circularCrop: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    crop: Crop = null,
    crossorigin: anonymous | `use-credentials` = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    imageAlt: String = null,
    imageStyle: CSSProperties = null,
    keepSelection: js.UndefOr[Boolean] = js.undefined,
    locked: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onComplete: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Callback = null,
    onDragEnd: js.UndefOr[Callback] = js.undefined,
    onDragStart: js.UndefOr[Callback] = js.undefined,
    onImageError: /* event */ ReactEventFrom[HTMLImageElement] => Callback = null,
    onImageLoaded: /* target */ HTMLImageElement => Callback = null,
    renderComponent: VdomNode = null,
    renderSelectionAddon: /* state */ js.Any => CallbackTo[Node] = null,
    ruleOfThirds: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): ReactCropProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: typingsJapgolly.reactImageCrop.mod.Crop, t1: typingsJapgolly.reactImageCrop.mod.PercentCrop) => onChange(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(circularCrop)) __obj.updateDynamic("circularCrop")(circularCrop.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (crossorigin != null) __obj.updateDynamic("crossorigin")(crossorigin.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (imageAlt != null) __obj.updateDynamic("imageAlt")(imageAlt.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSelection)) __obj.updateDynamic("keepSelection")(keepSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction2((t0: /* crop */ typingsJapgolly.reactImageCrop.mod.Crop, t1: /* percentCrop */ typingsJapgolly.reactImageCrop.mod.PercentCrop) => onComplete(t0, t1).runNow()))
    onDragEnd.foreach(p => __obj.updateDynamic("onDragEnd")(p.toJsFn))
    onDragStart.foreach(p => __obj.updateDynamic("onDragStart")(p.toJsFn))
    if (onImageError != null) __obj.updateDynamic("onImageError")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLImageElement]) => onImageError(t0).runNow()))
    if (onImageLoaded != null) __obj.updateDynamic("onImageLoaded")(js.Any.fromFunction1((t0: /* target */ org.scalajs.dom.raw.HTMLImageElement) => onImageLoaded(t0).runNow()))
    if (renderComponent != null) __obj.updateDynamic("renderComponent")(renderComponent.rawNode.asInstanceOf[js.Any])
    if (renderSelectionAddon != null) __obj.updateDynamic("renderSelectionAddon")(js.Any.fromFunction1((t0: /* state */ js.Any) => renderSelectionAddon(t0).runNow()))
    if (!js.isUndefined(ruleOfThirds)) __obj.updateDynamic("ruleOfThirds")(ruleOfThirds.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCropProps]
  }
}


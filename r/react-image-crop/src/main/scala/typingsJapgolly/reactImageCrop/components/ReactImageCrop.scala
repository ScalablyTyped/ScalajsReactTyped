package typingsJapgolly.reactImageCrop.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageCrop.mod.Crop
import typingsJapgolly.reactImageCrop.mod.PercentCrop
import typingsJapgolly.reactImageCrop.mod.ReactCropProps
import typingsJapgolly.reactImageCrop.mod.^
import typingsJapgolly.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsJapgolly.reactImageCrop.reactImageCropStrings.anonymous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageCrop {
  def apply(
    src: String,
    onChange: (Crop, PercentCrop) => Callback,
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
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactCropProps, ^, Unit, ReactCropProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: typingsJapgolly.reactImageCrop.mod.Crop, t1: typingsJapgolly.reactImageCrop.mod.PercentCrop) => onChange(t0, t1).runNow()))
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactImageCrop.mod.ReactCropProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactImageCrop.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImageCrop.mod.ReactCropProps])(children: _*)
  }
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}


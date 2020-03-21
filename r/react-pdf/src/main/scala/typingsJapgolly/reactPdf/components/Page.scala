package typingsJapgolly.reactPdf.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.pdfjsDist.mod.PDFPageProxy
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactPdf.pageMod.LoadingProcessData
import typingsJapgolly.reactPdf.pageMod.Props
import typingsJapgolly.reactPdf.pageMod.RenderFunction
import typingsJapgolly.reactPdf.pageMod.TextItem
import typingsJapgolly.reactPdf.pageMod.TextLayerItemInternal
import typingsJapgolly.reactPdf.pageMod.default
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Page {
  def apply(
    className: String | js.Array[String] = null,
    customTextRenderer: /* layer */ TextLayerItemInternal => CallbackTo[Element] = null,
    error: String | Element | RenderFunction = null,
    height: Int | Double = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | Element | RenderFunction = null,
    noData: String | Element | RenderFunction = null,
    onGetAnnotationsError: /* error */ js.Error => Callback = null,
    onGetAnnotationsSuccess: /* annotations */ js.Any => Callback = null,
    onGetTextError: /* error */ js.Error => Callback = null,
    onGetTextSuccess: /* items */ js.Array[TextItem] => Callback = null,
    onLoadError: /* error */ js.Error => Callback = null,
    onLoadProgress: /* data */ LoadingProcessData => Callback = null,
    onLoadSuccess: /* page */ PDFPageProxy => Callback = null,
    onRenderError: /* error */ js.Error => Callback = null,
    onRenderSuccess: js.UndefOr[Callback] = js.undefined,
    pageIndex: Int | Double = null,
    pageNumber: Int | Double = null,
    renderAnnotationLayer: js.UndefOr[Boolean] = js.undefined,
    renderInteractiveForms: js.UndefOr[Boolean] = js.undefined,
    renderMode: canvas | svg | none = null,
    renderTextLayer: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    scale: Int | Double = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customTextRenderer != null) __obj.updateDynamic("customTextRenderer")(js.Any.fromFunction1((t0: /* layer */ typingsJapgolly.reactPdf.pageMod.TextLayerItemInternal) => customTextRenderer(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onGetAnnotationsError != null) __obj.updateDynamic("onGetAnnotationsError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onGetAnnotationsError(t0).runNow()))
    if (onGetAnnotationsSuccess != null) __obj.updateDynamic("onGetAnnotationsSuccess")(js.Any.fromFunction1((t0: /* annotations */ js.Any) => onGetAnnotationsSuccess(t0).runNow()))
    if (onGetTextError != null) __obj.updateDynamic("onGetTextError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onGetTextError(t0).runNow()))
    if (onGetTextSuccess != null) __obj.updateDynamic("onGetTextSuccess")(js.Any.fromFunction1((t0: /* items */ js.Array[typingsJapgolly.reactPdf.pageMod.TextItem]) => onGetTextSuccess(t0).runNow()))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onLoadError(t0).runNow()))
    if (onLoadProgress != null) __obj.updateDynamic("onLoadProgress")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactPdf.pageMod.LoadingProcessData) => onLoadProgress(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* page */ typingsJapgolly.pdfjsDist.mod.PDFPageProxy) => onLoadSuccess(t0).runNow()))
    if (onRenderError != null) __obj.updateDynamic("onRenderError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onRenderError(t0).runNow()))
    onRenderSuccess.foreach(p => __obj.updateDynamic("onRenderSuccess")(p.toJsFn))
    if (pageIndex != null) __obj.updateDynamic("pageIndex")(pageIndex.asInstanceOf[js.Any])
    if (pageNumber != null) __obj.updateDynamic("pageNumber")(pageNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAnnotationLayer)) __obj.updateDynamic("renderAnnotationLayer")(renderAnnotationLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(renderInteractiveForms)) __obj.updateDynamic("renderInteractiveForms")(renderInteractiveForms.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (!js.isUndefined(renderTextLayer)) __obj.updateDynamic("renderTextLayer")(renderTextLayer.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPdf.pageMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactPdf.pageMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPdf.pageMod.Props])(children: _*)
  }
  @JSImport("react-pdf/dist/Page", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}


package typingsJapgolly.reactPdf.pageMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.pdfjsDist.mod.PDFPageProxy
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Page'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * A function that customizes how a text layer is rendered.
    * Passes itext item and index for item.
    */
  var customTextRenderer: js.UndefOr[js.Function1[/* layer */ TextLayerItemInternal, Element]] = js.undefined
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | Element | RenderFunction] = js.undefined
  /**
    * Defines the height of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `height` and `scale` at the same time, the height will be multiplied by a given factor.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Page>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
  /**
    * Defines what the component should display while loading.
    * @default 'Loading page…'
    */
  var loading: js.UndefOr[String | Element | RenderFunction] = js.undefined
  /**
    * Defines what the component should display in case of no data.
    * @default 'No page specified.'
    */
  var noData: js.UndefOr[String | Element | RenderFunction] = js.undefined
  /**
    * Function called in case of an error while loading annotations.
    */
  var onGetAnnotationsError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called when annotations are successfully loaded.
    */
  var onGetAnnotationsSuccess: js.UndefOr[js.Function1[/* annotations */ js.Any, Unit]] = js.undefined
  /**
    * Function called in case of an error while loading text layer items.
    */
  var onGetTextError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called when text layer items are successfully loaded.
    */
  var onGetTextSuccess: js.UndefOr[js.Function1[/* items */ js.Array[TextItem], Unit]] = js.undefined
  /**
    * Function called in case of an error while loading the page.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called, potentially multiple times, as the loading progresses.
    */
  var onLoadProgress: js.UndefOr[js.Function1[/* data */ LoadingProcessData, Unit]] = js.undefined
  /**
    * Function called when the page is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* page */ PDFPageProxy, Unit]] = js.undefined
  /**
    * Function called in case of an error while rendering the page.
    */
  var onRenderError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called when the page is successfully rendered on the screen.
    */
  var onRenderSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Defines which page from PDF file should be displayed.
    * @default 0
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * Defines which page from PDF file should be displayed.
    * If provided, pageIndex prop will be ignored.
    * @default 1
    */
  var pageNumber: js.UndefOr[Double] = js.undefined
  /**
    * Defines whether annotations (e.g. links) should be rendered.
    * @default true
    */
  var renderAnnotationLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines whether interactive forms should be rendered.
    * `renderAnnotationLayer` prop must be set to true.
    * @default false
    */
  var renderInteractiveForms: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the rendering mode of the page.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.undefined
  /**
    * Defines whether a text layer should be rendered.
    * @default true
    */
  var renderTextLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the rotation of the page in degrees.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    * Defaults to page's default setting, usually 0.
    */
  var rotate: js.UndefOr[Double] = js.undefined
  /**
    * Defines the scale in which PDF file should be rendered.
    * @default 1.0
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Defines the width of the page.
    * If neither `height` nor `width` are defined, page will be rendered at the size defined in PDF.
    * If you define `width` and `height` at the same time, `height` will be ignored.
    * If you define `width` and `scale` at the same time, the width will be multiplied by a given factor.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
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
    width: Int | Double = null
  ): Props = {
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
    __obj.asInstanceOf[Props]
  }
}


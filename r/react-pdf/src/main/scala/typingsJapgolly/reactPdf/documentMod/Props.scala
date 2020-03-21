package typingsJapgolly.reactPdf.documentMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.pdfjsDist.mod.PDFDocumentProxy
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactPdf.AnonPageNumber
import typingsJapgolly.reactPdf.reactPdfStrings._blank
import typingsJapgolly.reactPdf.reactPdfStrings._parent
import typingsJapgolly.reactPdf.reactPdfStrings._self
import typingsJapgolly.reactPdf.reactPdfStrings._top
import typingsJapgolly.reactPdf.reactPdfStrings.canvas
import typingsJapgolly.reactPdf.reactPdfStrings.none
import typingsJapgolly.reactPdf.reactPdfStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  /**
    * Defines custom class name(s), that will be added to rendered element.
    * @default 'react-pdf__Document'
    */
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Defines what the component should display in case of an error.
    * @default 'Failed to load PDF file.'
    */
  var error: js.UndefOr[String | Element | RenderFunction] = js.undefined
  /**
    * Defines link target for external links rendered in annotations.
    * Defaults to unset, which means that default behavior will be used.
    */
  var externalLinkTarget: js.UndefOr[_self | _blank | _parent | _top] = js.undefined
  /**
    * Defines what PDF should be displayed.
    * Its value can be an URL,
    * a file (imported using import ... from ... or from file input form element),
    * or an object with parameters
    *  (
    *   url - URL;
    *   data - data, preferably Uint8Array;
    *   range - PDFDataRangeTransport;
    *   httpHeaders - custom request headers, e.g. for authorization
    *   withCredentials - a boolean to indicate whether or not to include cookies in the request (defaults to false)
    *  )
    */
  var file: js.Any
  /**
    * A function that behaves like ref,
    * but it's passed to main `<div>` rendered by `<Document>` component.
    */
  var inputRef: js.UndefOr[LegacyRef[HTMLDivElement]] = js.undefined
  /**
    * Defines what the component should display while loading.
    * @default 'Loading PDF…'
    */
  var loading: js.UndefOr[String | Element | RenderFunction] = js.undefined
  /**
    * Defines what the component should display in case of no data.
    * @default 'No PDF file specified.'
    */
  var noData: js.UndefOr[String | Element | RenderFunction] = js.undefined
  /**
    * Function called when an outline item has been clicked.
    * Usually, you would like to use this callback to move the user wherever they requested to.
    */
  var onItemClick: js.UndefOr[js.Function1[/* hasPageNumber */ AnonPageNumber, Unit]] = js.undefined
  /**
    * Function called in case of an error while loading a document.
    */
  var onLoadError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called when the document is successfully loaded.
    */
  var onLoadSuccess: js.UndefOr[js.Function1[/* pdf */ PDFDocumentProxy, Unit]] = js.undefined
  /**
    * Function called when a password-protected PDF is loaded.
    * Defaults to a function that prompts the user for password.
    */
  var onPassword: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, _], Unit]] = js.undefined
  /**
    * Function called in case of an error while retrieving document source from `file` prop.
    */
  var onSourceError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  /**
    * Function called when document source is successfully retrieved from `file` prop.
    */
  var onSourceSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * An object in which additional parameters to be passed to PDF.js can be defined.
    * For a full list of possible parameters, check PDF.js documentation on DocumentInitParameters.
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines the rendering mode of the document.
    * @default 'canvas'
    */
  var renderMode: js.UndefOr[canvas | svg | none] = js.undefined
  /**
    * Defines the rotation of the document in degrees.
    * If provided, will change rotation globally,
    * even for the pages which were given rotate prop of their own.
    * 90 = rotated to the right, 180 = upside down, 270 = rotated to the left.
    */
  var rotate: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    file: js.Any,
    children: VdomNode = null,
    className: String | js.Array[String] = null,
    error: String | Element | RenderFunction = null,
    externalLinkTarget: _self | _blank | _parent | _top = null,
    inputRef: LegacyRef[HTMLDivElement] = null,
    loading: String | Element | RenderFunction = null,
    noData: String | Element | RenderFunction = null,
    onItemClick: /* hasPageNumber */ AnonPageNumber => Callback = null,
    onLoadError: /* error */ js.Error => Callback = null,
    onLoadSuccess: /* pdf */ PDFDocumentProxy => Callback = null,
    onPassword: /* callback */ js.Function1[/* repeated */ js.Any, js.Any] => Callback = null,
    onSourceError: /* error */ js.Error => Callback = null,
    onSourceSuccess: js.UndefOr[Callback] = js.undefined,
    options: js.Any = null,
    renderMode: canvas | svg | none = null,
    rotate: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (externalLinkTarget != null) __obj.updateDynamic("externalLinkTarget")(externalLinkTarget.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction1((t0: /* hasPageNumber */ typingsJapgolly.reactPdf.AnonPageNumber) => onItemClick(t0).runNow()))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onLoadError(t0).runNow()))
    if (onLoadSuccess != null) __obj.updateDynamic("onLoadSuccess")(js.Any.fromFunction1((t0: /* pdf */ typingsJapgolly.pdfjsDist.mod.PDFDocumentProxy) => onLoadSuccess(t0).runNow()))
    if (onPassword != null) __obj.updateDynamic("onPassword")(js.Any.fromFunction1((t0: /* callback */ js.Function1[/* repeated */ js.Any, js.Any]) => onPassword(t0).runNow()))
    if (onSourceError != null) __obj.updateDynamic("onSourceError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onSourceError(t0).runNow()))
    onSourceSuccess.foreach(p => __obj.updateDynamic("onSourceSuccess")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderMode != null) __obj.updateDynamic("renderMode")(renderMode.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


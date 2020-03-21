package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageProxy extends js.Object {
  /**
    * Page index of the page.  First page is 0.
    */
  var pageIndex: Double
  /**
    * Page number of the page.  First page is 1.
    **/
  var pageNumber: Double
  /**
    * The reference that points to this page.
    **/
  var ref: PDFRef
  /**
    * The number of degrees the page is rotated clockwise.
    **/
  var rotate: Double
  /**
    * @return An array of the visible portion of the PDF page in the user space units - [x1, y1, x2, y2].
    **/
  var view: js.Array[Double]
  /**
    * marked as future feature
    **/
  //getOperationList(): PDFPromise<>;
  /**
    * Destroyes resources allocated by the page.
    **/
  def destroy(): Unit
  /**
    * A promise that is resolved with an array of the annotation objects.
    **/
  def getAnnotations(): PDFPromise[PDFAnnotations]
  /**
    * A promise that is resolved with the string that is the text content frm the page.
    **/
  def getTextContent(): PDFPromise[TextContent]
  /**
    * @param params viewport options
    * @return
    **/
  def getViewport(params: ViewportParameters): PDFPageViewport
  /**
    * Begins the process of rendering a page to the desired context.
    * @param params Rendering options.
    * @return An extended promise that is resolved when the page finishes rendering.
    **/
  def render(params: PDFRenderParams): PDFRenderTask
}

object PDFPageProxy {
  @scala.inline
  def apply(
    destroy: Callback,
    getAnnotations: CallbackTo[PDFPromise[PDFAnnotations]],
    getTextContent: CallbackTo[PDFPromise[TextContent]],
    getViewport: ViewportParameters => CallbackTo[PDFPageViewport],
    pageIndex: Double,
    pageNumber: Double,
    ref: PDFRef,
    render: PDFRenderParams => CallbackTo[PDFRenderTask],
    rotate: Double,
    view: js.Array[Double]
  ): PDFPageProxy = {
    val __obj = js.Dynamic.literal(pageIndex = pageIndex.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getAnnotations")(getAnnotations.toJsFn)
    __obj.updateDynamic("getTextContent")(getTextContent.toJsFn)
    __obj.updateDynamic("getViewport")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.ViewportParameters) => getViewport(t0).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.PDFRenderParams) => render(t0).runNow()))
    __obj.asInstanceOf[PDFPageProxy]
  }
}


package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFAnnotations extends js.Object {
  def getData(): PDFAnnotationData
   // throw new NotImplementedException()
  def getEmptyContainer(tagName: String, rect: js.Array[Double]): HTMLElement
   // always false
  def getHtmlElement(commonOjbs: js.Any): HTMLElement
  def getOperatorList(evaluator: js.Any): PDFPromise[_]
  def hasHtml(): Boolean
   // deprecated
  def isViewable(): Boolean
  def loadResources(keys: js.Any): PDFPromise[_]
}

object PDFAnnotations {
  @scala.inline
  def apply(
    getData: CallbackTo[PDFAnnotationData],
    getEmptyContainer: (String, js.Array[Double]) => CallbackTo[HTMLElement],
    getHtmlElement: js.Any => CallbackTo[HTMLElement],
    getOperatorList: js.Any => CallbackTo[PDFPromise[js.Any]],
    hasHtml: CallbackTo[Boolean],
    isViewable: CallbackTo[Boolean],
    loadResources: js.Any => CallbackTo[PDFPromise[js.Any]]
  ): PDFAnnotations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getEmptyContainer")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Array[scala.Double]) => getEmptyContainer(t0, t1).runNow()))
    __obj.updateDynamic("getHtmlElement")(js.Any.fromFunction1((t0: js.Any) => getHtmlElement(t0).runNow()))
    __obj.updateDynamic("getOperatorList")(js.Any.fromFunction1((t0: js.Any) => getOperatorList(t0).runNow()))
    __obj.updateDynamic("hasHtml")(hasHtml.toJsFn)
    __obj.updateDynamic("isViewable")(isViewable.toJsFn)
    __obj.updateDynamic("loadResources")(js.Any.fromFunction1((t0: js.Any) => loadResources(t0).runNow()))
    __obj.asInstanceOf[PDFAnnotations]
  }
}


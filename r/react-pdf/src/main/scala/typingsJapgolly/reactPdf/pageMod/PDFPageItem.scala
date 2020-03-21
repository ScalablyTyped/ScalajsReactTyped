package typingsJapgolly.reactPdf.pageMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageItem extends js.Object {
  var _transport: js.Object
  var commonObjs: js.Object
  def getAnnotations(args: js.Any*): js.Any
  def getTextContent(args: js.Any*): js.Any
  def getViewport(args: js.Any*): js.Any
  def render(args: js.Any*): js.Any
}

object PDFPageItem {
  @scala.inline
  def apply(
    _transport: js.Object,
    commonObjs: js.Object,
    getAnnotations: /* repeated */ js.Any => CallbackTo[js.Any],
    getTextContent: /* repeated */ js.Any => CallbackTo[js.Any],
    getViewport: /* repeated */ js.Any => CallbackTo[js.Any],
    render: /* repeated */ js.Any => CallbackTo[js.Any]
  ): PDFPageItem = {
    val __obj = js.Dynamic.literal(_transport = _transport.asInstanceOf[js.Any], commonObjs = commonObjs.asInstanceOf[js.Any])
    __obj.updateDynamic("getAnnotations")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getAnnotations(t0).runNow()))
    __obj.updateDynamic("getTextContent")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getTextContent(t0).runNow()))
    __obj.updateDynamic("getViewport")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getViewport(t0).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => render(t0).runNow()))
    __obj.asInstanceOf[PDFPageItem]
  }
}


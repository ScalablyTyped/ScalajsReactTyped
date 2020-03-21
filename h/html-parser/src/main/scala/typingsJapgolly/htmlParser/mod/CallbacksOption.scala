package typingsJapgolly.htmlParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksOption extends js.Object {
  var attribute: js.UndefOr[js.Function2[/* name */ String, /* value */ js.Any, Unit]] = js.undefined
  var cdata: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var closeElement: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  var closeOpenedElement: js.UndefOr[
    js.Function3[/* tagName */ String, /* token */ Token, /* isUnary */ Boolean, Unit]
  ] = js.undefined
  var comment: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var docType: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var openElement: js.UndefOr[js.Function1[/* tagName */ String, Unit]] = js.undefined
  var text: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var xmlProlog: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CallbacksOption {
  @scala.inline
  def apply(
    attribute: (/* name */ String, /* value */ js.Any) => japgolly.scalajs.react.Callback = null,
    cdata: /* content */ String => japgolly.scalajs.react.Callback = null,
    closeElement: /* name */ String => japgolly.scalajs.react.Callback = null,
    closeOpenedElement: (/* tagName */ String, /* token */ Token, /* isUnary */ Boolean) => japgolly.scalajs.react.Callback = null,
    comment: /* content */ String => japgolly.scalajs.react.Callback = null,
    docType: /* content */ String => japgolly.scalajs.react.Callback = null,
    openElement: /* tagName */ String => japgolly.scalajs.react.Callback = null,
    text: /* value */ String => japgolly.scalajs.react.Callback = null,
    xmlProlog: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): CallbacksOption = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* value */ js.Any) => attribute(t0, t1).runNow()))
    if (cdata != null) __obj.updateDynamic("cdata")(js.Any.fromFunction1((t0: /* content */ java.lang.String) => cdata(t0).runNow()))
    if (closeElement != null) __obj.updateDynamic("closeElement")(js.Any.fromFunction1((t0: /* name */ java.lang.String) => closeElement(t0).runNow()))
    if (closeOpenedElement != null) __obj.updateDynamic("closeOpenedElement")(js.Any.fromFunction3((t0: /* tagName */ java.lang.String, t1: /* token */ typingsJapgolly.htmlParser.mod.Token, t2: /* isUnary */ scala.Boolean) => closeOpenedElement(t0, t1, t2).runNow()))
    if (comment != null) __obj.updateDynamic("comment")(js.Any.fromFunction1((t0: /* content */ java.lang.String) => comment(t0).runNow()))
    if (docType != null) __obj.updateDynamic("docType")(js.Any.fromFunction1((t0: /* content */ java.lang.String) => docType(t0).runNow()))
    if (openElement != null) __obj.updateDynamic("openElement")(js.Any.fromFunction1((t0: /* tagName */ java.lang.String) => openElement(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => text(t0).runNow()))
    xmlProlog.foreach(p => __obj.updateDynamic("xmlProlog")(p.toJsFn))
    __obj.asInstanceOf[CallbacksOption]
  }
}


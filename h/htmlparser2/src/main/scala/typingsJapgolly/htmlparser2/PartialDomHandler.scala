package typingsJapgolly.htmlparser2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.domhandler.mod.DomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<domhandler.domhandler.DomHandler> */
trait PartialDomHandler extends js.Object {
  var constructor: js.UndefOr[
    js.Function1[
      /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], _], 
      js.Any
    ]
  ] = js.undefined
  var oncdatastart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onclosetag: js.UndefOr[js.Function0[Unit]] = js.undefined
  var oncomment: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  var oncommentend: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onend: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onopentag: js.UndefOr[js.Function2[/* name */ String, /* attribs */ StringDictionary[String], Unit]] = js.undefined
  var onparserinit: js.UndefOr[js.Function1[/* parser */ js.Any, Unit]] = js.undefined
  var onprocessinginstruction: js.UndefOr[js.Function2[/* name */ String, /* data */ String, Unit]] = js.undefined
  var onreset: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ontext: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
}

object PartialDomHandler {
  @scala.inline
  def apply(
    constructor: /* callback */ js.Function2[/* error */ js.Any, /* dom */ js.Array[DomElement], js.Any] => CallbackTo[js.Any] = null,
    oncdatastart: js.UndefOr[Callback] = js.undefined,
    onclosetag: js.UndefOr[Callback] = js.undefined,
    oncomment: /* data */ String => Callback = null,
    oncommentend: js.UndefOr[Callback] = js.undefined,
    onend: js.UndefOr[Callback] = js.undefined,
    onerror: /* error */ js.Error => Callback = null,
    onopentag: (/* name */ String, /* attribs */ StringDictionary[String]) => Callback = null,
    onparserinit: /* parser */ js.Any => Callback = null,
    onprocessinginstruction: (/* name */ String, /* data */ String) => Callback = null,
    onreset: js.UndefOr[Callback] = js.undefined,
    ontext: /* data */ String => Callback = null
  ): PartialDomHandler = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1((t0: /* callback */ js.Function2[
  /* error */ js.Any, 
  /* dom */ js.Array[typingsJapgolly.domhandler.mod.DomElement], 
  js.Any]) => constructor(t0).runNow()))
    oncdatastart.foreach(p => __obj.updateDynamic("oncdatastart")(p.toJsFn))
    onclosetag.foreach(p => __obj.updateDynamic("onclosetag")(p.toJsFn))
    if (oncomment != null) __obj.updateDynamic("oncomment")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => oncomment(t0).runNow()))
    oncommentend.foreach(p => __obj.updateDynamic("oncommentend")(p.toJsFn))
    onend.foreach(p => __obj.updateDynamic("onend")(p.toJsFn))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* error */ js.Error) => onerror(t0).runNow()))
    if (onopentag != null) __obj.updateDynamic("onopentag")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* attribs */ org.scalablytyped.runtime.StringDictionary[java.lang.String]) => onopentag(t0, t1).runNow()))
    if (onparserinit != null) __obj.updateDynamic("onparserinit")(js.Any.fromFunction1((t0: /* parser */ js.Any) => onparserinit(t0).runNow()))
    if (onprocessinginstruction != null) __obj.updateDynamic("onprocessinginstruction")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* data */ java.lang.String) => onprocessinginstruction(t0, t1).runNow()))
    onreset.foreach(p => __obj.updateDynamic("onreset")(p.toJsFn))
    if (ontext != null) __obj.updateDynamic("ontext")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => ontext(t0).runNow()))
    __obj.asInstanceOf[PartialDomHandler]
  }
}


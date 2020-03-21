package typingsJapgolly.serveIndex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filter: js.UndefOr[
    js.Function4[
      /* filename */ String, 
      /* index */ Double, 
      /* files */ js.Array[File], 
      /* dir */ String, 
      Boolean
    ]
  ] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[Boolean] = js.undefined
  var stylesheet: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[
    String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, Unit])
  ] = js.undefined
  var view: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    filter: (/* filename */ String, /* index */ Double, /* files */ js.Array[File], /* dir */ String) => CallbackTo[Boolean] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icons: js.UndefOr[Boolean] = js.undefined,
    stylesheet: String = null,
    template: String | (js.Function2[/* locals */ Locals, /* callback */ templateCallback, Unit]) = null,
    view: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* filename */ java.lang.String, t1: /* index */ scala.Double, t2: /* files */ js.Array[typingsJapgolly.serveIndex.mod.File], t3: /* dir */ java.lang.String) => filter(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


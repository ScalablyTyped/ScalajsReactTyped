package typingsJapgolly.handsontable.mod.Handsontable.search

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod.Handsontable
import typingsJapgolly.handsontable.mod.Handsontable.CellProperties
import typingsJapgolly.handsontable.mod.Handsontable.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[SearchCallback] = js.undefined
  var queryMethod: js.UndefOr[SearchQueryMethod] = js.undefined
  var searchResultClass: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    callback: (/* instance */ Handsontable, /* row */ Double, /* column */ Double, /* value */ CellValue, /* result */ Boolean) => Callback = null,
    queryMethod: (/* queryStr */ String, /* value */ CellValue, /* cellProperties */ CellProperties) => CallbackTo[Boolean] = null,
    searchResultClass: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction5((t0: /* instance */ typingsJapgolly.handsontable.mod.Handsontable, t1: /* row */ scala.Double, t2: /* column */ scala.Double, t3: /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, t4: /* result */ scala.Boolean) => callback(t0, t1, t2, t3, t4).runNow()))
    if (queryMethod != null) __obj.updateDynamic("queryMethod")(js.Any.fromFunction3((t0: /* queryStr */ java.lang.String, t1: /* value */ typingsJapgolly.handsontable.mod.Handsontable.CellValue, t2: /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties) => queryMethod(t0, t1, t2).runNow()))
    if (searchResultClass != null) __obj.updateDynamic("searchResultClass")(searchResultClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}


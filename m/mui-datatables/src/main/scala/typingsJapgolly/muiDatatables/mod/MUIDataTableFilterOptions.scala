package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFilterOptions extends js.Object {
  var display: js.UndefOr[
    js.Function4[
      /* filterList */ js.Array[String], 
      /* onChange */ js.Any, 
      /* index */ Double, 
      /* column */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var logic: js.UndefOr[js.Function2[/* prop */ String, /* filterValue */ js.Array[_], Boolean]] = js.undefined
  var names: js.UndefOr[js.Array[String]] = js.undefined
}

object MUIDataTableFilterOptions {
  @scala.inline
  def apply(
    display: (/* filterList */ js.Array[String], /* onChange */ js.Any, /* index */ Double, /* column */ js.Any) => Callback = null,
    logic: (/* prop */ String, /* filterValue */ js.Array[js.Any]) => CallbackTo[Boolean] = null,
    names: js.Array[String] = null
  ): MUIDataTableFilterOptions = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(js.Any.fromFunction4((t0: /* filterList */ js.Array[java.lang.String], t1: /* onChange */ js.Any, t2: /* index */ scala.Double, t3: /* column */ js.Any) => display(t0, t1, t2, t3).runNow()))
    if (logic != null) __obj.updateDynamic("logic")(js.Any.fromFunction2((t0: /* prop */ java.lang.String, t1: /* filterValue */ js.Array[js.Any]) => logic(t0, t1).runNow()))
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFilterOptions]
  }
}


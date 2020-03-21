package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceAssetCallback extends js.Object {
  var getRowData: js.UndefOr[
    js.Function3[/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String, _]
  ] = js.undefined
  var getSectionHeaderData: js.UndefOr[js.Function2[/* dataBlob */ js.Any, /* sectionID */ Double | String, _]] = js.undefined
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ js.Any, /* r2 */ js.Any, Boolean]] = js.undefined
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ js.Any, /* h2 */ js.Any, Boolean]] = js.undefined
}

object DataSourceAssetCallback {
  @scala.inline
  def apply(
    getRowData: (/* dataBlob */ js.Any, /* sectionID */ Double | String, /* rowID */ Double | String) => CallbackTo[js.Any] = null,
    getSectionHeaderData: (/* dataBlob */ js.Any, /* sectionID */ Double | String) => CallbackTo[js.Any] = null,
    rowHasChanged: (/* r1 */ js.Any, /* r2 */ js.Any) => CallbackTo[Boolean] = null,
    sectionHeaderHasChanged: (/* h1 */ js.Any, /* h2 */ js.Any) => CallbackTo[Boolean] = null
  ): DataSourceAssetCallback = {
    val __obj = js.Dynamic.literal()
    if (getRowData != null) __obj.updateDynamic("getRowData")(js.Any.fromFunction3((t0: /* dataBlob */ js.Any, t1: /* sectionID */ scala.Double | java.lang.String, t2: /* rowID */ scala.Double | java.lang.String) => getRowData(t0, t1, t2).runNow()))
    if (getSectionHeaderData != null) __obj.updateDynamic("getSectionHeaderData")(js.Any.fromFunction2((t0: /* dataBlob */ js.Any, t1: /* sectionID */ scala.Double | java.lang.String) => getSectionHeaderData(t0, t1).runNow()))
    if (rowHasChanged != null) __obj.updateDynamic("rowHasChanged")(js.Any.fromFunction2((t0: /* r1 */ js.Any, t1: /* r2 */ js.Any) => rowHasChanged(t0, t1).runNow()))
    if (sectionHeaderHasChanged != null) __obj.updateDynamic("sectionHeaderHasChanged")(js.Any.fromFunction2((t0: /* h1 */ js.Any, t1: /* h2 */ js.Any) => sectionHeaderHasChanged(t0, t1).runNow()))
    __obj.asInstanceOf[DataSourceAssetCallback]
  }
}


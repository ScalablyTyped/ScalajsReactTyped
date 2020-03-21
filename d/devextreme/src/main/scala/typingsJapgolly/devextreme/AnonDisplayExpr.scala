package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod.DevExpress.data.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayExpr extends js.Object {
  var allowClearing: js.UndefOr[Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Array[_] | DataSourceOptions | Store] = js.undefined
  var displayExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String])] = js.undefined
  var valueExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, String | Double | Boolean])] = js.undefined
}

object AnonDisplayExpr {
  @scala.inline
  def apply(
    allowClearing: js.UndefOr[Boolean] = js.undefined,
    dataSource: js.Array[_] | DataSourceOptions | Store = null,
    displayExpr: String | (js.Function1[/* data */ js.Any, String]) = null,
    valueExpr: String | (js.Function1[/* data */ js.Any, String | Double | Boolean]) = null
  ): AnonDisplayExpr = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClearing)) __obj.updateDynamic("allowClearing")(allowClearing.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (displayExpr != null) __obj.updateDynamic("displayExpr")(displayExpr.asInstanceOf[js.Any])
    if (valueExpr != null) __obj.updateDynamic("valueExpr")(valueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayExpr]
  }
}


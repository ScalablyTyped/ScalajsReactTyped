package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataExpressionMixin extends js.Object {
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource
}

object DataExpressionMixin {
  @scala.inline
  def apply(getDataSource: CallbackTo[DataSource]): DataExpressionMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDataSource")(getDataSource.toJsFn)
    __obj.asInstanceOf[DataExpressionMixin]
  }
}


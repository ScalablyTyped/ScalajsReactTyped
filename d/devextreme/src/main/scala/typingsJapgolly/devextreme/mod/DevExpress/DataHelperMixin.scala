package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataHelperMixin extends js.Object {
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource
}

object DataHelperMixin {
  @scala.inline
  def apply(getDataSource: CallbackTo[DataSource]): DataHelperMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDataSource")(getDataSource.toJsFn)
    __obj.asInstanceOf[DataHelperMixin]
  }
}


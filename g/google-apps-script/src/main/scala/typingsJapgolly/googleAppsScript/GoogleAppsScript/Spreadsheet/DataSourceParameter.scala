package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access existing data source parameters.
  */
trait DataSourceParameter extends js.Object {
  def getName(): String
  def getSourceCell(): String | Null
  def getType(): DataSourceParameterType
}

object DataSourceParameter {
  @scala.inline
  def apply(
    getName: CallbackTo[String],
    getSourceCell: CallbackTo[String | Null],
    getType: CallbackTo[DataSourceParameterType]
  ): DataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getSourceCell")(getSourceCell.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.asInstanceOf[DataSourceParameter]
  }
}


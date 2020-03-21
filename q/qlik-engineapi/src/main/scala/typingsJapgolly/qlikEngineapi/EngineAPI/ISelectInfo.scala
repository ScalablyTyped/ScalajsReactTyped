package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelectInfo...
  */
trait ISelectInfo extends js.Object {
  /**
    * List of information about ranges for selections.
    */
  var qContinuousRangeInfo: js.Array[IRange]
  /**
    * Gives information about the formatting of the range.
    * This parameter is used when performing range selections or text searches in dimensions.
    */
  var qNumberFormat: IFieldAttributes
  /**
    * Highest value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeHi: Double
  /**
    * This parameter is used when performing range selections or text searches in measures.
    * Gives information about the range of selections.
    * bool SoftLock = false;
    */
  var qRangeInfo: js.Array[INxRangeSelectInfo]
  /**
    * Lower value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeLo: Double
  /**
    * Text search string.
    * Everything that matches the text is selected.
    * >> This parameter is optional.
    */
  var qTextSearch: js.UndefOr[String] = js.undefined
}

object ISelectInfo {
  @scala.inline
  def apply(
    qContinuousRangeInfo: js.Array[IRange],
    qNumberFormat: IFieldAttributes,
    qRangeHi: Double,
    qRangeInfo: js.Array[INxRangeSelectInfo],
    qRangeLo: Double,
    qTextSearch: String = null
  ): ISelectInfo = {
    val __obj = js.Dynamic.literal(qContinuousRangeInfo = qContinuousRangeInfo.asInstanceOf[js.Any], qNumberFormat = qNumberFormat.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    if (qTextSearch != null) __obj.updateDynamic("qTextSearch")(qTextSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectInfo]
  }
}


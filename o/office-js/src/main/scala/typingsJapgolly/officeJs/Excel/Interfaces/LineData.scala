package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ArrowheadLength
import typingsJapgolly.officeJs.Excel.ArrowheadStyle
import typingsJapgolly.officeJs.Excel.ArrowheadWidth
import typingsJapgolly.officeJs.Excel.ConnectorType
import typingsJapgolly.officeJs.officeJsStrings.Curve
import typingsJapgolly.officeJs.officeJsStrings.Diamond
import typingsJapgolly.officeJs.officeJsStrings.Elbow
import typingsJapgolly.officeJs.officeJsStrings.Long
import typingsJapgolly.officeJs.officeJsStrings.Medium
import typingsJapgolly.officeJs.officeJsStrings.Narrow
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Open
import typingsJapgolly.officeJs.officeJsStrings.Oval
import typingsJapgolly.officeJs.officeJsStrings.Short
import typingsJapgolly.officeJs.officeJsStrings.Stealth
import typingsJapgolly.officeJs.officeJsStrings.Straight
import typingsJapgolly.officeJs.officeJsStrings.Triangle
import typingsJapgolly.officeJs.officeJsStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `line.toJSON()`. */
trait LineData extends js.Object {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Read-only. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.undefined
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.undefined
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.undefined
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.undefined
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Read-only. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies whether or not the beginning of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the end of the specified line is connected to a shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[Boolean] = js.undefined
}

object LineData {
  @scala.inline
  def apply(
    beginArrowheadLength: ArrowheadLength | Short | Medium | Long = null,
    beginArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = null,
    beginArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = null,
    beginConnectedSite: Int | Double = null,
    connectorType: ConnectorType | Straight | Elbow | Curve = null,
    endArrowheadLength: ArrowheadLength | Short | Medium | Long = null,
    endArrowheadStyle: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open = null,
    endArrowheadWidth: ArrowheadWidth | Narrow | Medium | Wide = null,
    endConnectedSite: Int | Double = null,
    id: String = null,
    isBeginConnected: js.UndefOr[Boolean] = js.undefined,
    isEndConnected: js.UndefOr[Boolean] = js.undefined
  ): LineData = {
    val __obj = js.Dynamic.literal()
    if (beginArrowheadLength != null) __obj.updateDynamic("beginArrowheadLength")(beginArrowheadLength.asInstanceOf[js.Any])
    if (beginArrowheadStyle != null) __obj.updateDynamic("beginArrowheadStyle")(beginArrowheadStyle.asInstanceOf[js.Any])
    if (beginArrowheadWidth != null) __obj.updateDynamic("beginArrowheadWidth")(beginArrowheadWidth.asInstanceOf[js.Any])
    if (beginConnectedSite != null) __obj.updateDynamic("beginConnectedSite")(beginConnectedSite.asInstanceOf[js.Any])
    if (connectorType != null) __obj.updateDynamic("connectorType")(connectorType.asInstanceOf[js.Any])
    if (endArrowheadLength != null) __obj.updateDynamic("endArrowheadLength")(endArrowheadLength.asInstanceOf[js.Any])
    if (endArrowheadStyle != null) __obj.updateDynamic("endArrowheadStyle")(endArrowheadStyle.asInstanceOf[js.Any])
    if (endArrowheadWidth != null) __obj.updateDynamic("endArrowheadWidth")(endArrowheadWidth.asInstanceOf[js.Any])
    if (endConnectedSite != null) __obj.updateDynamic("endConnectedSite")(endConnectedSite.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeginConnected)) __obj.updateDynamic("isBeginConnected")(isBeginConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(isEndConnected)) __obj.updateDynamic("isEndConnected")(isEndConnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineData]
  }
}


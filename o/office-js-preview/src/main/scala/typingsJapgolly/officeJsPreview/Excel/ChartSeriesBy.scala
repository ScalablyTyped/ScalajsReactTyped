package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartSeriesBy extends js.Object

/**
  *
  * Specifies whether the series are by rows or by columns. On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartSeriesBy")
@js.native
object ChartSeriesBy extends js.Object {
  /**
    *
    * On Desktop, the "auto" option will inspect the source data shape to automatically guess whether the data is by rows or columns; in Excel on the web, "auto" will simply default to "columns".
    *
    */
  @js.native
  sealed trait auto extends ChartSeriesBy
  
  @js.native
  sealed trait columns extends ChartSeriesBy
  
  @js.native
  sealed trait rows extends ChartSeriesBy
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChartSeriesBy with String] = js.native
  /* "Auto" */ @js.native
  object auto extends TopLevel[auto with String]
  
  /* "Columns" */ @js.native
  object columns extends TopLevel[columns with String]
  
  /* "Rows" */ @js.native
  object rows extends TopLevel[rows with String]
  
}


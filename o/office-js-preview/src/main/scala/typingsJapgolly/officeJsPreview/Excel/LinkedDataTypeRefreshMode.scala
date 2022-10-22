package typingsJapgolly.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LinkedDataTypeRefreshMode extends StObject
/**
  * Representation of a refresh mode.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.LinkedDataTypeRefreshMode")
@js.native
object LinkedDataTypeRefreshMode extends StObject {
  
  /**
    * Manual refresh. Refresh does not get triggered automatically.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait manual
    extends StObject
       with LinkedDataTypeRefreshMode
  
  /**
    * Refresh on workbook load only.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait onLoad
    extends StObject
       with LinkedDataTypeRefreshMode
  
  /**
    * Refresh periodically based on an interval. It will also trigger a refresh on workbook load.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait periodic
    extends StObject
       with LinkedDataTypeRefreshMode
  
  /**
    * Refresh mode is unknown or unsupported.
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  @js.native
  sealed trait unknown
    extends StObject
       with LinkedDataTypeRefreshMode
}

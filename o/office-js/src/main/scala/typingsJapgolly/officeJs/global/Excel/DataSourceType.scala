package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a command type of `DataConnection`.
  *
  * @remarks
  * [Api set: ExcelApi 1.15]
  */
@JSGlobal("Excel.DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.DataSourceType & String] = js.native
  
  /* "LocalRange" */ val localRange: typingsJapgolly.officeJs.Excel.DataSourceType.localRange & String = js.native
  
  /* "LocalTable" */ val localTable: typingsJapgolly.officeJs.Excel.DataSourceType.localTable & String = js.native
  
  /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Excel.DataSourceType.unknown & String = js.native
}

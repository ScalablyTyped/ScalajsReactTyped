package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the close behavior for `Workbook.close`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.CloseBehavior")
@js.native
object CloseBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.CloseBehavior & String] = js.native
  
  /* "Save" */ val save: typingsJapgolly.officeJs.Excel.CloseBehavior.save & String = js.native
  
  /* "SkipSave" */ val skipSave: typingsJapgolly.officeJs.Excel.CloseBehavior.skipSave & String = js.native
}

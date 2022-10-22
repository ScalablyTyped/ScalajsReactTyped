package typingsJapgolly.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the save behavior for `Workbook.save`.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.SaveBehavior")
@js.native
object SaveBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Excel.SaveBehavior & String] = js.native
  
  /* "Prompt" */ val prompt: typingsJapgolly.officeJsPreview.Excel.SaveBehavior.prompt & String = js.native
  
  /* "Save" */ val save: typingsJapgolly.officeJsPreview.Excel.SaveBehavior.save & String = js.native
}

package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlActionType
import typingsJapgolly.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Action")
@js.native
/* private */ open class Action ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.Action {
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Caption: String = js.native
  
  /* CompleteClass */
  override val Content: String = js.native
  
  /* CompleteClass */
  override val Coordinate: String = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Action_typekey")
  var ExcelDotAction_typekey: typingsJapgolly.activexExcel.Excel.Action = js.native
  
  /* CompleteClass */
  override def Execute(): Unit = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Type: XlActionType = js.native
}

package typingsJapgolly.activexExcel.Excel

import typingsJapgolly.activexExcel.activexExcelInts.`0`
import typingsJapgolly.activexExcel.activexExcelInts.`1`
import typingsJapgolly.activexExcel.activexExcelInts.`2`
import typingsJapgolly.activexExcel.activexExcelInts.`3`
import typingsJapgolly.activexExcel.activexExcelInts.`4`
import typingsJapgolly.activexExcel.activexExcelInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionValue extends StObject {
  
  val Application: typingsJapgolly.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.ConditionValue_typekey")
  var ExcelDotConditionValue_typekey: ConditionValue = js.native
  
  def Modify(newtype: `1` | `2`): Unit = js.native
  def Modify(newtype: `0` | `3` | `5`, newvalue: Double): Unit = js.native
  def Modify(newtype: XlConditionValueTypes): Unit = js.native
  def Modify(newtype: XlConditionValueTypes, newvalue: Any): Unit = js.native
  @JSName("Modify")
  def Modify_4(newtype: `4`, newvalue: String): Unit = js.native
  
  val Parent: Any = js.native
  
  val Type: XlConditionValueTypes = js.native
  
  var Value: Double | String = js.native
}

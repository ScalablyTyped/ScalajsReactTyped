package typingsJapgolly.activexExcel.global.Excel

import typingsJapgolly.activexExcel.Excel.XlConditionValueTypes
import typingsJapgolly.activexExcel.Excel.XlIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.IconCriterion")
@js.native
/* private */ open class IconCriterion ()
  extends StObject
     with typingsJapgolly.activexExcel.Excel.IconCriterion {
  
  /* private */ /* CompleteClass */
  @JSName("Excel.IconCriterion_typekey")
  var ExcelDotIconCriterion_typekey: typingsJapgolly.activexExcel.Excel.IconCriterion = js.native
  
  /* CompleteClass */
  var Icon: XlIcon = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var Operator: Double = js.native
  
  /* CompleteClass */
  var Type: XlConditionValueTypes = js.native
  
  /* CompleteClass */
  var Value: Double | String = js.native
}

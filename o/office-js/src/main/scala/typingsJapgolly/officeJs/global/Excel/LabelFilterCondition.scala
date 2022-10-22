package typingsJapgolly.officeJs.global.Excel

import typingsJapgolly.officeJs.Excel.LabelFilterCondition.equals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enum representing all accepted conditions by which a label filter can be applied.
  Used to configure the type of PivotFilter that is applied to the field.
  `PivotFilter.criteria.exclusive` can be set to `true` to invert many of these conditions.
  *
  * @remarks
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.LabelFilterCondition")
@js.native
object LabelFilterCondition extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.LabelFilterCondition & String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typingsJapgolly.officeJs.Excel.LabelFilterCondition.beginsWith & String = js.native
  
  /* "Between" */ val between: typingsJapgolly.officeJs.Excel.LabelFilterCondition.between & String = js.native
  
  /* "Contains" */ val contains: typingsJapgolly.officeJs.Excel.LabelFilterCondition.contains & String = js.native
  
  /* "EndsWith" */ val endsWith: typingsJapgolly.officeJs.Excel.LabelFilterCondition.endsWith & String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typingsJapgolly.officeJs.Excel.LabelFilterCondition.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typingsJapgolly.officeJs.Excel.LabelFilterCondition.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typingsJapgolly.officeJs.Excel.LabelFilterCondition.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typingsJapgolly.officeJs.Excel.LabelFilterCondition.lessThanOrEqualTo & String = js.native
  
  /* "Unknown" */ val unknown: typingsJapgolly.officeJs.Excel.LabelFilterCondition.unknown & String = js.native
}

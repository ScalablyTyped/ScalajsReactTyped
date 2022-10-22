package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.equals
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
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition & String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.beginsWith & String = js.native
  
  /* "Between" */ val between: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.between & String = js.native
  
  /* "Contains" */ val contains: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.contains & String = js.native
  
  /* "EndsWith" */ val endsWith: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.endsWith & String = js.native
  
  /* "Equals" */ @JSName("equals")
  val equals_ : equals & String = js.native
  
  /* "GreaterThan" */ val greaterThan: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.greaterThan & String = js.native
  
  /* "GreaterThanOrEqualTo" */ val greaterThanOrEqualTo: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.greaterThanOrEqualTo & String = js.native
  
  /* "LessThan" */ val lessThan: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.lessThan & String = js.native
  
  /* "LessThanOrEqualTo" */ val lessThanOrEqualTo: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.lessThanOrEqualTo & String = js.native
  
  /* "Unknown" */ val unknown: typingsJapgolly.officeJsPreview.Excel.LabelFilterCondition.unknown & String = js.native
}

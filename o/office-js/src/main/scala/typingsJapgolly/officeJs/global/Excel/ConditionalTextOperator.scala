package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the operator of the text conditional format type.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalTextOperator")
@js.native
object ConditionalTextOperator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.ConditionalTextOperator & String] = js.native
  
  /* "BeginsWith" */ val beginsWith: typingsJapgolly.officeJs.Excel.ConditionalTextOperator.beginsWith & String = js.native
  
  /* "Contains" */ val contains: typingsJapgolly.officeJs.Excel.ConditionalTextOperator.contains & String = js.native
  
  /* "EndsWith" */ val endsWith: typingsJapgolly.officeJs.Excel.ConditionalTextOperator.endsWith & String = js.native
  
  /* "Invalid" */ val invalid: typingsJapgolly.officeJs.Excel.ConditionalTextOperator.invalid & String = js.native
  
  /* "NotContains" */ val notContains: typingsJapgolly.officeJs.Excel.ConditionalTextOperator.notContains & String = js.native
}

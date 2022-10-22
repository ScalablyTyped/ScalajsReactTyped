package typingsJapgolly.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the way that an object is attached to its underlying cells.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.Placement")
@js.native
object Placement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Excel.Placement & String] = js.native
  
  /* "Absolute" */ val absolute: typingsJapgolly.officeJs.Excel.Placement.absolute & String = js.native
  
  /* "OneCell" */ val oneCell: typingsJapgolly.officeJs.Excel.Placement.oneCell & String = js.native
  
  /* "TwoCell" */ val twoCell: typingsJapgolly.officeJs.Excel.Placement.twoCell & String = js.native
}

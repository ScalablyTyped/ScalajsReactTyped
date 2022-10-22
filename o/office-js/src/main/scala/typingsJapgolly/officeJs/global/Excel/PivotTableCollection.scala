package typingsJapgolly.officeJs.global.Excel

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the PivotTables that are part of the workbook or worksheet.
  *
  * @remarks
  * [Api set: ExcelApi 1.3]
  */
@JSGlobal("Excel.PivotTableCollection")
@js.native
open class PivotTableCollection ()
  extends StObject
     with typingsJapgolly.officeJs.Excel.PivotTableCollection {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
}

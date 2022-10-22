package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `WorkbookCreated` object is the top level object created by `Application.CreateWorkbook`. A `WorkbookCreated` object is a special Workbook object.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.WorkbookCreated")
@js.native
open class WorkbookCreated ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Excel.WorkbookCreated {
  
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

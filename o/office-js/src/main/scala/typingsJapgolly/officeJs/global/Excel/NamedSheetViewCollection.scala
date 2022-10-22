package typingsJapgolly.officeJs.global.Excel

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of sheet views in the worksheet.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@JSGlobal("Excel.NamedSheetViewCollection")
@js.native
open class NamedSheetViewCollection ()
  extends StObject
     with typingsJapgolly.officeJs.Excel.NamedSheetViewCollection {
  
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

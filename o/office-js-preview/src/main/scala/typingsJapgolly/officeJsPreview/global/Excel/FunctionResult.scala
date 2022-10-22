package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing the result of a function-evaluation operation
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
@JSGlobal("Excel.FunctionResult")
@js.native
open class FunctionResult[T] ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Excel.FunctionResult[T] {
  
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

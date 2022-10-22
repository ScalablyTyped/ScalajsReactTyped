package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * @remarks
  * [Api set: ExcelApi 1.11]
  */
@JSGlobal("Excel.NumberFormatInfo")
@js.native
open class NumberFormatInfo ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Excel.NumberFormatInfo {
  
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

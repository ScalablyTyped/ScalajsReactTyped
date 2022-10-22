package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information based on current system culture settings. This includes the culture names, number formatting, and other culturally dependent settings.
  *
  * @remarks
  * [Api set: ExcelApi 1.11]
  */
@JSGlobal("Excel.CultureInfo")
@js.native
open class CultureInfo ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Excel.CultureInfo {
  
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

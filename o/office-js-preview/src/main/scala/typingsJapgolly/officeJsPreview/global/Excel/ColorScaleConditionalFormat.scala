package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the color scale criteria for conditional formatting.
  *
  * @remarks
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ColorScaleConditionalFormat")
@js.native
open class ColorScaleConditionalFormat ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Excel.ColorScaleConditionalFormat {
  
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

package typingsJapgolly.officeJs.global.Excel

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the format properties for the chart trendline.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartTrendlineFormat")
@js.native
open class ChartTrendlineFormat ()
  extends StObject
     with typingsJapgolly.officeJs.Excel.ChartTrendlineFormat {
  
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

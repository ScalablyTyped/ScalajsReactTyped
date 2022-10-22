package typingsJapgolly.officeJsPreview.global.Excel

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of change records for a task.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.DocumentTaskChangeCollection")
@js.native
open class DocumentTaskChangeCollection ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Excel.DocumentTaskChangeCollection {
  
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

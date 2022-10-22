package typingsJapgolly.officeJsPreview.global.OneNote

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents ink analysis data for an identified paragraph formed by ink strokes.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InkAnalysisParagraph")
@js.native
open class InkAnalysisParagraph ()
  extends StObject
     with typingsJapgolly.officeJsPreview.OneNote.InkAnalysisParagraph {
  
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

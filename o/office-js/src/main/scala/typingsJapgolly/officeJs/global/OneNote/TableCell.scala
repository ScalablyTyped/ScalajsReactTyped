package typingsJapgolly.officeJs.global.OneNote

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a cell in a OneNote table.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.TableCell")
@js.native
open class TableCell ()
  extends StObject
     with typingsJapgolly.officeJs.OneNote.TableCell {
  
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

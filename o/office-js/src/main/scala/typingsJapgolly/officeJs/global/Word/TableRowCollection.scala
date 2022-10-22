package typingsJapgolly.officeJs.global.Word

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the collection of the document's TableRow objects.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.TableRowCollection")
@js.native
open class TableRowCollection ()
  extends StObject
     with typingsJapgolly.officeJs.Word.TableRowCollection {
  
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

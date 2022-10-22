package typingsJapgolly.officeJsPreview.global.Word

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DocumentCreated object is the top level object created by Application.CreateDocument. A DocumentCreated object is a special Document object.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.DocumentCreated")
@js.native
open class DocumentCreated ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Word.DocumentCreated {
  
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

package typingsJapgolly.officeJs.global.Word

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.Comment} objects.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
@JSGlobal("Word.CommentCollection")
@js.native
open class CommentCollection ()
  extends StObject
     with typingsJapgolly.officeJs.Word.CommentCollection {
  
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

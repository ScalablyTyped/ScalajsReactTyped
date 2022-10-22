package typingsJapgolly.officeJsPreview.global.Word

import typingsJapgolly.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.InlinePicture} objects.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.InlinePictureCollection")
@js.native
open class InlinePictureCollection ()
  extends StObject
     with typingsJapgolly.officeJsPreview.Word.InlinePictureCollection {
  
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

package typingsJapgolly.officeJs.global.Word

import typingsJapgolly.officeJs.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Paragraph")
@js.native
open class Paragraph ()
  extends StObject
     with typingsJapgolly.officeJs.Word.Paragraph {
  
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

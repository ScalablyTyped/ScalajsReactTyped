package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRichEdit.ContentInserted event.
  */
@JSGlobal("ASPxClientRichEditContentInsertedEventArgs")
@js.native
open class ASPxClientRichEditContentInsertedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientRichEditContentInsertedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentInsertedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contains the inserted content.
    * @param interval An interval object that relates to the inserted content.
    */
  def this(subDocumentId: Double, interval: typingsJapgolly.devexpressWeb.Interval) = this()
  
  /**
    * Gets the text buffer interval related to the inserted content.
    */
  /* CompleteClass */
  var interval: typingsJapgolly.devexpressWeb.Interval = js.native
  
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  var subDocumentId: Double = js.native
}

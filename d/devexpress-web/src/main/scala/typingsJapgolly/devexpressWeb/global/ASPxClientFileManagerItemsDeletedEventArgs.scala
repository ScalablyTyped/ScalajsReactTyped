package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
@JSGlobal("ASPxClientFileManagerItemsDeletedEventArgs")
@js.native
open class ASPxClientFileManagerItemsDeletedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientFileManagerItemsDeletedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsDeletedEventArgs object.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  def this(items: js.Array[typingsJapgolly.devexpressWeb.ASPxClientFileManagerItem]) = this()
  
  /**
    * Gets an array of the currently processed items.
    */
  /* CompleteClass */
  var items: js.Array[typingsJapgolly.devexpressWeb.ASPxClientFileManagerItem] = js.native
}

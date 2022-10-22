package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemsCopied event.
  */
@JSGlobal("ASPxClientFileManagerItemsCopiedEventArgs")
@js.native
open class ASPxClientFileManagerItemsCopiedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientFileManagerItemsCopiedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsCopiedEventArgs object with the specified parameters.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    * @param oldFolderFullName A string value that specifies the folder's full name.
    */
  def this(
    items: js.Array[typingsJapgolly.devexpressWeb.ASPxClientFileManagerItem],
    oldFolderFullName: String
  ) = this()
  
  /**
    * Gets an array of the currently processed items.
    */
  /* CompleteClass */
  var items: js.Array[typingsJapgolly.devexpressWeb.ASPxClientFileManagerItem] = js.native
  
  /**
    * Gets the full name of the folder from which items are copied.
    */
  /* CompleteClass */
  var oldFolderFullName: String = js.native
}

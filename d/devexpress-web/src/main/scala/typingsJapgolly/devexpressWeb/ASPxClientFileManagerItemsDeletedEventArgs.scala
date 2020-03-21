package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ItemsDeleted event.
  */
@JSGlobal("ASPxClientFileManagerItemsDeletedEventArgs")
@js.native
class ASPxClientFileManagerItemsDeletedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemsDeletedEventArgs object.
    * @param items An array of ASPxClientFileManagerItem objects that are items currently being processed.
    */
  def this(items: js.Array[ASPxClientFileManagerItem]) = this()
  /**
    * Gets an array of the currently processed items.
    */
  var items: js.Array[ASPxClientFileManagerItem] = js.native
}


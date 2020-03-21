package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FolderCreated event.
  */
@JSGlobal("ASPxClientFileManagerItemCreatedEventArgs")
@js.native
class ASPxClientFileManagerItemCreatedEventArgs protected () extends ASPxClientFileManagerActionEventArgsBase {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemCreatedEventArgs object with the specified parameters.
    * @param fullName A string value that is the item's full name.
    * @param name A string value that specifies the item's name.
    * @param isFolder true if the current item is a folder; false if the current item is a file.
    */
  def this(fullName: String, name: String, isFolder: Boolean) = this()
}


package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.ItemDeleted event.
  */
@JSGlobal("ASPxClientFileManagerItemDeletedEventArgs")
@js.native
open class ASPxClientFileManagerItemDeletedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientFileManagerActionEventArgsBase {
  /**
    * Initializes a new instance of the ASPxClientFileManagerItemDeletedEventArgs object with the specified parameters.
    * @param fullName A string value that is the item's full name.
    * @param name A string value that specifies the item's name.
    * @param isFolder true if the processed item is a folder; false if the processed item is a file.
    */
  def this(fullName: String, name: String, isFolder: Boolean) = this()
  
  /**
    * Gets the full name of the item currently being processed.
    */
  /* CompleteClass */
  var fullName: String = js.native
  
  /**
    * Gets a value specifying whether the current processed item is a folder.
    */
  /* CompleteClass */
  var isFolder: Boolean = js.native
  
  /**
    * Gets the name of the currently processed item.
    */
  /* CompleteClass */
  var name: String = js.native
}

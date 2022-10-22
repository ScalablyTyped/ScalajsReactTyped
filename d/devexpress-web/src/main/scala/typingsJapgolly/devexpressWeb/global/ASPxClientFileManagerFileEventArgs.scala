package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.SelectedFileChanged and ASPxClientFileManager.SelectedFileOpened events.
  */
@JSGlobal("ASPxClientFileManagerFileEventArgs")
@js.native
open class ASPxClientFileManagerFileEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientFileManagerFileEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileEventArgs class.
    * @param file An ASPxClientFileManagerFile object representing the file related to the event.
    */
  def this(file: typingsJapgolly.devexpressWeb.ASPxClientFileManagerFile) = this()
  
  /**
    * Gets a file related to the event.
    */
  /* CompleteClass */
  var file: typingsJapgolly.devexpressWeb.ASPxClientFileManagerFile = js.native
}

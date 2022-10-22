package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a hyperlink at the current position in the document.
  */
@JSGlobal("InsertHyperlinkCommand")
@js.native
open class InsertHyperlinkCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.InsertHyperlinkCommand {
  
  /**
    * Executes the InsertHyperlinkCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A HyperlinkSettings object specifying hyperlink settings.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.HyperlinkSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.HyperlinkSettings] = js.native
}

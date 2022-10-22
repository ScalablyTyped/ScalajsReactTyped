package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font formatting of characters in a selected range.
  */
@JSGlobal("ChangeFontFormattingCommand")
@js.native
open class ChangeFontFormattingCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeFontFormattingCommand {
  
  /**
    * Executes the ChangeFontFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A  FontFormattingSettings object specifying font formatting settings.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.FontFormattingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.FontFormattingSettings] = js.native
}

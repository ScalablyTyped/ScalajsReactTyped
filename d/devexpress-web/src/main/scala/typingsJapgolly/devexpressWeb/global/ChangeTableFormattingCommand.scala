package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's formatting.
  */
@JSGlobal("ChangeTableFormattingCommand")
@js.native
open class ChangeTableFormattingCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeTableFormattingCommand {
  
  /**
    * Executes the ChangeTableFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object containing the settings to format a table.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.TableFormattingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.TableFormattingSettings] = js.native
}

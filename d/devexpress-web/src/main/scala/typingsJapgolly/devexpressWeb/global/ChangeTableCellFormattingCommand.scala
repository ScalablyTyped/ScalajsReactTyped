package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the cell formatting of the selected table elements.
  */
@JSGlobal("ChangeTableCellFormattingCommand")
@js.native
open class ChangeTableCellFormattingCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeTableCellFormattingCommand {
  
  /**
    * Executes the ChangeTableCellFormattingCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableFormattingSettings object specifying cell formatting of the selected table elements.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.TableCellFormattingSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.TableCellFormattingSettings] = js.native
}

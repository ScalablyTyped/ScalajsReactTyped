package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's preferred row height.
  */
@JSGlobal("ChangeTableRowPreferredHeightCommand")
@js.native
open class ChangeTableRowPreferredHeightCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeTableRowPreferredHeightCommand {
  
  /**
    * Executes the ChangeTableRowPreferredHeightCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredHeight A TableHeightUnit object specifying preferred height of the selected table rows.
    */
  /* CompleteClass */
  override def execute(preferredHeight: typingsJapgolly.devexpressWeb.TableHeightUnit): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.TableHeightUnit] = js.native
}

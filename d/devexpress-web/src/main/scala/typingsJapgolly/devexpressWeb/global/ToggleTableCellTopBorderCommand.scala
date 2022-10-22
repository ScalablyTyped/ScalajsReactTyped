package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle top borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellTopBorderCommand")
@js.native
open class ToggleTableCellTopBorderCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ToggleTableCellTopBorderCommand {
  
  /**
    * Executes the ToggleTableCellTopBorderCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[Boolean] = js.native
}

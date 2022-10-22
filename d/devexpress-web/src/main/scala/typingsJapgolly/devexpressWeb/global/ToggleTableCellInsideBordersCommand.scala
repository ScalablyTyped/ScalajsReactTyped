package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle inner borders for selected cells on/off.
  */
@JSGlobal("ToggleTableCellInsideBordersCommand")
@js.native
open class ToggleTableCellInsideBordersCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ToggleTableCellInsideBordersCommand {
  
  /**
    * Executes the ToggleTableCellInsideBordersCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[Boolean] = js.native
}

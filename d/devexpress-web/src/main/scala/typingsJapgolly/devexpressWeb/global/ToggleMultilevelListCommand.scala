package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the multilevel list style and normal text.
  */
@JSGlobal("ToggleMultilevelListCommand")
@js.native
open class ToggleMultilevelListCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ToggleMultilevelListCommand {
  
  /**
    * Executes the ToggleMultilevelListCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[Boolean] = js.native
}

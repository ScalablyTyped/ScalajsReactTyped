package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to toggle between the numbered paragraph and normal text.
  */
@JSGlobal("ToggleNumberingListCommand")
@js.native
open class ToggleNumberingListCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ToggleNumberingListCommand {
  
  /**
    * Executes the ToggleNumberingListCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[Boolean] = js.native
}

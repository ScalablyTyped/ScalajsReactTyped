package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to move the selected range to a specific position in the document.
  */
@JSGlobal("MoveContentCommand")
@js.native
open class MoveContentCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.MoveContentCommand {
  
  /**
    * Executes the MoveContentCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param position An integer value specifying position to insert selected text.
    */
  /* CompleteClass */
  override def execute(position: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.SimpleCommandState = js.native
}

package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to assign a shortcut to the specified client command.
  */
@JSGlobal("AssignShortcutCommand")
@js.native
open class AssignShortcutCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.AssignShortcutCommand {
  
  /**
    * Executes the AssignShortcutCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param keyCode A specifically generated code that uniquely identifies the combination of keys specified for a shortcut. This code is specified using the ASPxClientUtils.GetShortcutCode method.
    * @param callback A callback function to execute when a shortcut is activated.
    */
  /* CompleteClass */
  override def execute(keyCode: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.SimpleCommandState = js.native
}

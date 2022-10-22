package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the font name of characters in a selected range.
  */
@JSGlobal("ChangeFontNameCommand")
@js.native
open class ChangeFontNameCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeFontNameCommand {
  
  /**
    * Executes the ChangeFontNameCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fontName A string specifying the font name.
    */
  /* CompleteClass */
  override def execute(fontName: String): Boolean = js.native
  
  /**
    * Lists names of fonts available in the control.
    */
  /* CompleteClass */
  override val fontNames: js.Array[String] = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[String] = js.native
}

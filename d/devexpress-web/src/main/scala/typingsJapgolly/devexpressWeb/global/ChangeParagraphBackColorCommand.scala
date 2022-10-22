package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the background color of paragraphs in a selected range.
  */
@JSGlobal("ChangeParagraphBackColorCommand")
@js.native
open class ChangeParagraphBackColorCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeParagraphBackColorCommand {
  
  /**
    * Executes the ChangeParagraphBackColorCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param color A string specifying a background color of the paragraphs in a selected range. May be specified as a color name or a hex color value.
    */
  /* CompleteClass */
  override def execute(color: String): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[String] = js.native
}

package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to apply a paragraph level to the selected text
  */
@JSGlobal("SetParagraphLevelCommand")
@js.native
open class SetParagraphLevelCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.SetParagraphLevelCommand {
  
  /**
    * Executes the SetParagraphLevelCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param level An integer value specifying the applied style. The value should be in the range from 0 to 9.
    */
  /* CompleteClass */
  override def execute(level: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[Double] = js.native
}

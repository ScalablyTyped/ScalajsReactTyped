package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the number of section columns having the same width.
  */
@JSGlobal("ChangeSectionEqualColumnCountCommand")
@js.native
open class ChangeSectionEqualColumnCountCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeSectionEqualColumnCountCommand {
  
  /**
    * Executes the ChangeSectionEqualColumnCountCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columnCount An interger number specifying the number of section columns having the same width.
    */
  /* CompleteClass */
  override def execute(columnCount: Double): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[Double] = js.native
}

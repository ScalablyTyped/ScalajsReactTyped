package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to paste the text from the clipboard over the selection.
  */
@JSGlobal("PasteCommand")
@js.native
open class PasteCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.PasteCommand {
  
  /**
    * Executes the PasteCommand command.
    */
  /* CompleteClass */
  override def execute(): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.SimpleCommandState = js.native
}

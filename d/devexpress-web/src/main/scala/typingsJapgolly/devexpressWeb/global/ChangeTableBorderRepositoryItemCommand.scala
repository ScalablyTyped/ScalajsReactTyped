package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the repository item's table border style.
  */
@JSGlobal("ChangeTableBorderRepositoryItemCommand")
@js.native
open class ChangeTableBorderRepositoryItemCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeTableBorderRepositoryItemCommand {
  
  /**
    * Executes the ChangeTableBorderRepositoryItemCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param settings A TableBorderSettings object specifying the repository item's table border style.
    */
  /* CompleteClass */
  override def execute(settings: typingsJapgolly.devexpressWeb.TableBorderSettings): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.TableBorderSettings] = js.native
}

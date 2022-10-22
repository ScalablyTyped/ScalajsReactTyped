package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the selected table's preferred column width.
  */
@JSGlobal("ChangeTableColumnPreferredWidthCommand")
@js.native
open class ChangeTableColumnPreferredWidthCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeTableColumnPreferredWidthCommand {
  
  /**
    * Executes the ChangeTableColumnPreferredWidthCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param preferredWidth A TableWidthUnit object specifying preferred width of the selected table columns.
    */
  /* CompleteClass */
  override def execute(preferredWidth: typingsJapgolly.devexpressWeb.TableWidthUnit): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[typingsJapgolly.devexpressWeb.TableWidthUnit] = js.native
}

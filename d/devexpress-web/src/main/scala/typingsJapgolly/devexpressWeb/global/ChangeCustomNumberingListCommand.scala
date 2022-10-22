package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to customize the numbered list parameters.
  */
@JSGlobal("ChangeCustomNumberingListCommand")
@js.native
open class ChangeCustomNumberingListCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeCustomNumberingListCommand {
  
  /**
    * Executes the ChangeCustomNumberingListCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param abstractNumberingListIndex An integer value specifying the numbering list index.
    * @param listLevelSettings An array of ListLevelSettings objects defining settings for list levels.
    */
  /* CompleteClass */
  override def execute(
    abstractNumberingListIndex: Double,
    listLevelSettings: js.Array[typingsJapgolly.devexpressWeb.ListLevelSettings]
  ): Boolean = js.native
  
  /**
    * Gets information about the command's state. An object that contains the command's state.
    * @param abstractNumberingListIndex An integer value specifying the index of the abstract numbering list item whose state to return.
    */
  /* CompleteClass */
  override def getState(abstractNumberingListIndex: Double): typingsJapgolly.devexpressWeb.CommandState[js.Array[typingsJapgolly.devexpressWeb.ListLevelSettings]] = js.native
}

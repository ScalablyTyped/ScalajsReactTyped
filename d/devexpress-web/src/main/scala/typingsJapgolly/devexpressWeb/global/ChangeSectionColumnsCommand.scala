package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to change the settings of individual section columns.
  */
@JSGlobal("ChangeSectionColumnsCommand")
@js.native
open class ChangeSectionColumnsCommand ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ChangeSectionColumnsCommand {
  
  /**
    * Executes the ChangeSectionColumnsCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param columns An array of SectionColumn objects.
    */
  /* CompleteClass */
  override def execute(columns: js.Array[typingsJapgolly.devexpressWeb.SectionColumn]): Boolean = js.native
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.CommandState[js.Array[typingsJapgolly.devexpressWeb.SectionColumn]] = js.native
}

package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as a base for dialog-related commands with a simple common command state.
  */
/* note: abstract class */ @JSGlobal("CommandWithSimpleStateDialogBase")
@js.native
open class CommandWithSimpleStateDialogBase ()
  extends StObject
     with typingsJapgolly.devexpressWeb.CommandWithSimpleStateDialogBase {
  
  /**
    * Gets information about the command's state.
    */
  /* CompleteClass */
  override def getState(): typingsJapgolly.devexpressWeb.SimpleCommandState = js.native
}

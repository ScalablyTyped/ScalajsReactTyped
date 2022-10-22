package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.CustomCommand event.
  */
trait ASPxClientFileManagerCustomCommandEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
}
object ASPxClientFileManagerCustomCommandEventArgs {
  
  inline def apply(commandName: String): ASPxClientFileManagerCustomCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerCustomCommandEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerCustomCommandEventArgs](x: Self) {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
  }
}

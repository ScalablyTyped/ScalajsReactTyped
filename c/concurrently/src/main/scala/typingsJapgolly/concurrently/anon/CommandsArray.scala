package typingsJapgolly.concurrently.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsArray extends StObject {
  
  var commands: js.Array[typingsJapgolly.concurrently.distSrcCommandMod.Command]
}
object CommandsArray {
  
  inline def apply(commands: js.Array[typingsJapgolly.concurrently.distSrcCommandMod.Command]): CommandsArray = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandsArray]
  }
  
  extension [Self <: CommandsArray](x: Self) {
    
    inline def setCommands(value: js.Array[typingsJapgolly.concurrently.distSrcCommandMod.Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: typingsJapgolly.concurrently.distSrcCommandMod.Command*): Self = StObject.set(x, "commands", js.Array(value*))
  }
}

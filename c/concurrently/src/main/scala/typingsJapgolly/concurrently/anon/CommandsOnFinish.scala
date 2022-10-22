package typingsJapgolly.concurrently.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandsOnFinish extends StObject {
  
  var commands: js.Array[typingsJapgolly.concurrently.distSrcCommandMod.Command]
  
  def onFinish(): Unit
}
object CommandsOnFinish {
  
  inline def apply(commands: js.Array[typingsJapgolly.concurrently.distSrcCommandMod.Command], onFinish: Callback): CommandsOnFinish = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], onFinish = onFinish.toJsFn)
    __obj.asInstanceOf[CommandsOnFinish]
  }
  
  extension [Self <: CommandsOnFinish](x: Self) {
    
    inline def setCommands(value: js.Array[typingsJapgolly.concurrently.distSrcCommandMod.Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsVarargs(value: typingsJapgolly.concurrently.distSrcCommandMod.Command*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setOnFinish(value: Callback): Self = StObject.set(x, "onFinish", value.toJsFn)
  }
}

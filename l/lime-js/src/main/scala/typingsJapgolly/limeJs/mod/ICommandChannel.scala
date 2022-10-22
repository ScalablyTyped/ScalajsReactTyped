package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommandChannel extends StObject {
  
  def onCommand(command: Command): Any
  
  def sendCommand(command: Command): Unit
}
object ICommandChannel {
  
  inline def apply(onCommand: Command => Any, sendCommand: Command => Callback): ICommandChannel = {
    val __obj = js.Dynamic.literal(onCommand = js.Any.fromFunction1(onCommand), sendCommand = js.Any.fromFunction1((t0: Command) => sendCommand(t0).runNow()))
    __obj.asInstanceOf[ICommandChannel]
  }
  
  extension [Self <: ICommandChannel](x: Self) {
    
    inline def setOnCommand(value: Command => Any): Self = StObject.set(x, "onCommand", js.Any.fromFunction1(value))
    
    inline def setSendCommand(value: Command => Callback): Self = StObject.set(x, "sendCommand", js.Any.fromFunction1((t0: Command) => value(t0).runNow()))
  }
}

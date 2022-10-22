package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to insert a character into the document.
  */
trait InsertSymbolCommand extends StObject {
  
  /**
    * Executes the InsertSymbolCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param symbol A string value specifying symbols to insert.
    * @param fontName A string value specifying the font of symbols to insert.
    */
  def execute(symbol: String, fontName: String): Boolean
  
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState
}
object InsertSymbolCommand {
  
  inline def apply(execute: (String, String) => Boolean, getState: CallbackTo[SimpleCommandState]): InsertSymbolCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = getState.toJsFn)
    __obj.asInstanceOf[InsertSymbolCommand]
  }
  
  extension [Self <: InsertSymbolCommand](x: Self) {
    
    inline def setExecute(value: (String, String) => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
    
    inline def setGetState(value: CallbackTo[SimpleCommandState]): Self = StObject.set(x, "getState", value.toJsFn)
  }
}

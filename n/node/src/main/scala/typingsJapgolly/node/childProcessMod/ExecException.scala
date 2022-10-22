package typingsJapgolly.node.childProcessMod

import typingsJapgolly.node.processMod.global.NodeJS.Signals
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecException
  extends StObject
     with Error {
  
  var cmd: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[Double] = js.undefined
  
  var killed: js.UndefOr[Boolean] = js.undefined
  
  var signal: js.UndefOr[Signals] = js.undefined
}
object ExecException {
  
  inline def apply(message: String, name: String): ExecException = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecException]
  }
  
  extension [Self <: ExecException](x: Self) {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
    
    inline def setKilledUndefined: Self = StObject.set(x, "killed", js.undefined)
    
    inline def setSignal(value: Signals): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}

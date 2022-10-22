package typingsJapgolly.saucelabs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SauceConnectInstance extends StObject {
  
  /**
    * shutdown Sauce Connect
    */
  def close(): js.Promise[Unit]
  
  /**
    * Sauce Connect child process
    */
  var cp: ChildProcess
}
object SauceConnectInstance {
  
  inline def apply(close: CallbackTo[js.Promise[Unit]], cp: ChildProcess): SauceConnectInstance = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, cp = cp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SauceConnectInstance]
  }
  
  extension [Self <: SauceConnectInstance](x: Self) {
    
    inline def setClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setCp(value: ChildProcess): Self = StObject.set(x, "cp", value.asInstanceOf[js.Any])
  }
}

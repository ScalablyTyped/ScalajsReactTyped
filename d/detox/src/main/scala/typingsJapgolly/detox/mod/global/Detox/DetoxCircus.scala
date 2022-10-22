package typingsJapgolly.detox.mod.global.Detox

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.detox.anon.AddEventsListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxCircus extends StObject {
  
  /**
    * A get function that Enables access to this instance (single in each worker's scope)
    */
  def getEnv(): AddEventsListener
}
object DetoxCircus {
  
  inline def apply(getEnv: CallbackTo[AddEventsListener]): DetoxCircus = {
    val __obj = js.Dynamic.literal(getEnv = getEnv.toJsFn)
    __obj.asInstanceOf[DetoxCircus]
  }
  
  extension [Self <: DetoxCircus](x: Self) {
    
    inline def setGetEnv(value: CallbackTo[AddEventsListener]): Self = StObject.set(x, "getEnv", value.toJsFn)
  }
}

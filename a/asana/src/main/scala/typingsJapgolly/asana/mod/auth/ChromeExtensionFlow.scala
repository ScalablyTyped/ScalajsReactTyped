package typingsJapgolly.asana.mod.auth

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChromeExtensionFlow
  extends StObject
     with BaseBrowserFlow {
  
  /**
    * Runs the receiver code to send the Oauth result to the requesting tab.
    */
  def runReceiver(): Unit
}
object ChromeExtensionFlow {
  
  @JSImport("asana", "auth.ChromeExtensionFlow")
  @js.native
  val ^ : ChromeExtensionFlowStatic = js.native
  
  extension [Self <: ChromeExtensionFlow](x: Self) {
    
    inline def setRunReceiver(value: Callback): Self = StObject.set(x, "runReceiver", value.toJsFn)
  }
}

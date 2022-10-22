package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLLoseContext extends StObject {
  
  /* standard dom */
  def loseContext(): Unit
  
  /* standard dom */
  def restoreContext(): Unit
}
object WEBGLLoseContext {
  
  inline def apply(loseContext: Callback, restoreContext: Callback): WEBGLLoseContext = {
    val __obj = js.Dynamic.literal(loseContext = loseContext.toJsFn, restoreContext = restoreContext.toJsFn)
    __obj.asInstanceOf[WEBGLLoseContext]
  }
  
  extension [Self <: WEBGLLoseContext](x: Self) {
    
    inline def setLoseContext(value: Callback): Self = StObject.set(x, "loseContext", value.toJsFn)
    
    inline def setRestoreContext(value: Callback): Self = StObject.set(x, "restoreContext", value.toJsFn)
  }
}

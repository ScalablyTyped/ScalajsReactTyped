package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidebarContext extends StObject {
  
  def init(): Unit
}
object SidebarContext {
  
  inline def apply(init: Callback): SidebarContext = {
    val __obj = js.Dynamic.literal(init = init.toJsFn)
    __obj.asInstanceOf[SidebarContext]
  }
  
  extension [Self <: SidebarContext](x: Self) {
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
  }
}

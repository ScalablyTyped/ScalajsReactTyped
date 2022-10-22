package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeComponent
  extends StObject
     with Component {
  
  /**
    * Adds throttled `resize` event.
    */
  def bind(): Unit
  
  /**
    * Mounts and initializes a component. Creates event listeners at window object.
    */
  @JSName("mount")
  def mount_MResizeComponent(): Unit
  
  /**
    * Removes previously added `resize` event.
    */
  def unbind(): Unit
}
object ResizeComponent {
  
  inline def apply(bind: Callback, mount: Callback, unbind: Callback): ResizeComponent = {
    val __obj = js.Dynamic.literal(bind = bind.toJsFn, mount = mount.toJsFn, unbind = unbind.toJsFn)
    __obj.asInstanceOf[ResizeComponent]
  }
  
  extension [Self <: ResizeComponent](x: Self) {
    
    inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
  }
}

package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesComponent
  extends StObject
     with Component {
  
  /**
    * Binds `dragstart` event to prevent dragging on images.
    */
  def bind(): Unit
  
  /**
    * Event handler. Prevents dragging on images.
    */
  def dragstart(event: MouseEvent): Unit
  
  /**
    * Mounts and initializes a component. Creates event listeners for `<img>` elements.
    */
  @JSName("mount")
  def mount_MImagesComponent(): Unit
  
  /**
    * Removes previously added `dragstart` event.
    */
  def unbind(): Unit
}
object ImagesComponent {
  
  inline def apply(bind: Callback, dragstart: MouseEvent => Callback, mount: Callback, unbind: Callback): ImagesComponent = {
    val __obj = js.Dynamic.literal(bind = bind.toJsFn, dragstart = js.Any.fromFunction1((t0: MouseEvent) => dragstart(t0).runNow()), mount = mount.toJsFn, unbind = unbind.toJsFn)
    __obj.asInstanceOf[ImagesComponent]
  }
  
  extension [Self <: ImagesComponent](x: Self) {
    
    inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
    
    inline def setDragstart(value: MouseEvent => Callback): Self = StObject.set(x, "dragstart", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
  }
}

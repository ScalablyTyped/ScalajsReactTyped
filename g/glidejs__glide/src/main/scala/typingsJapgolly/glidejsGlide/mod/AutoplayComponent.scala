package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoplayComponent
  extends StObject
     with Component {
  
  /**
    * Registers listener for stopping auto-changing on mouseover.
    */
  def bind(): Unit
  
  @JSName("mount")
  def mount_MAutoplayComponent(): Unit
  
  /**
    * Starts auto-changing of slides on the instance.
    */
  def start(): Unit
  
  /**
    * Stops auto-changing of slides on the instance.
    */
  def stop(): Unit
  
  /**
    * Holds collection of `<a>` elements located inside slides.
    */
  val time: Double
  
  /**
    * Removes previously registered mouseover listener.
    */
  def unbind(): Unit
}
object AutoplayComponent {
  
  inline def apply(bind: Callback, mount: Callback, start: Callback, stop: Callback, time: Double, unbind: Callback): AutoplayComponent = {
    val __obj = js.Dynamic.literal(bind = bind.toJsFn, mount = mount.toJsFn, start = start.toJsFn, stop = stop.toJsFn, time = time.asInstanceOf[js.Any], unbind = unbind.toJsFn)
    __obj.asInstanceOf[AutoplayComponent]
  }
  
  extension [Self <: AutoplayComponent](x: Self) {
    
    inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
  }
}

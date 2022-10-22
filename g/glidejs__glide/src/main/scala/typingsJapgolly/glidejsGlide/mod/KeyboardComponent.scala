package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardComponent
  extends StObject
     with Component {
  
  /**
    * Binds `keyup` event listener for key presses.
    */
  def bind(): Unit
  
  /**
    * Mounts and initializes a component. Creates event listeners for keyboard key presses.
    */
  @JSName("mount")
  def mount_MKeyboardComponent(): Unit
  
  /**
    * `keyup` event handler. Makes Makes movement base on arrow key direction.
    */
  def press(event: KeyboardEvent): Unit
  
  /**
    * Removes previously added `keyup` event.
    */
  def unbind(): Unit
}
object KeyboardComponent {
  
  inline def apply(bind: Callback, mount: Callback, press: KeyboardEvent => Callback, unbind: Callback): KeyboardComponent = {
    val __obj = js.Dynamic.literal(bind = bind.toJsFn, mount = mount.toJsFn, press = js.Any.fromFunction1((t0: KeyboardEvent) => press(t0).runNow()), unbind = unbind.toJsFn)
    __obj.asInstanceOf[KeyboardComponent]
  }
  
  extension [Self <: KeyboardComponent](x: Self) {
    
    inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setPress(value: KeyboardEvent => Callback): Self = StObject.set(x, "press", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
  }
}

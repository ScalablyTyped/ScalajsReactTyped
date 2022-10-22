package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLCollection
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.std.HTMLCollectionOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlsComponent
  extends StObject
     with Component {
  
  /**
    * Adds click listeners to controls.
    */
  def addBindings(): Unit
  
  /**
    * Toggles an active class on a passed collection of HTML elements based on the current index.
    */
  def addClass(controls: HTMLElement): Unit
  
  /**
    * Toggles an active class on a passed collection of HTML elements based on the current index.
    */
  def bind(elements: HTMLCollection[Any]): Unit
  
  /**
    * Control's click event handler which makes movement based on its direction pattern.
    */
  def click(event: MouseEvent): Unit
  
  /**
    * Holds collection of `<a>` elements located inside slides.
    */
  val items: HTMLCollectionOf[HTMLAnchorElement]
  
  @JSName("mount")
  def mount_MControlsComponent(): Unit
  
  /**
    * Removes active class from navigation controls.
    */
  def removeActive(): Unit
  
  /**
    * Removes click listeners from controls.
    */
  def removeBindings(): Unit
  
  /**
    * Removes an active class from passed collection of HTML elements.
    */
  def removeClass(controls: HTMLElement): Unit
  
  /**
    * Sets an active class to navigation controls.
    */
  def setActive(): Unit
  
  /**
    * Removes an active class from passed collection of HTML elements.
    */
  def unbind(elements: HTMLCollection[Any]): Unit
}
object ControlsComponent {
  
  inline def apply(
    addBindings: Callback,
    addClass: HTMLElement => Callback,
    bind: HTMLCollection[Any] => Callback,
    click: MouseEvent => Callback,
    items: HTMLCollectionOf[HTMLAnchorElement],
    mount: Callback,
    removeActive: Callback,
    removeBindings: Callback,
    removeClass: HTMLElement => Callback,
    setActive: Callback,
    unbind: HTMLCollection[Any] => Callback
  ): ControlsComponent = {
    val __obj = js.Dynamic.literal(addBindings = addBindings.toJsFn, addClass = js.Any.fromFunction1((t0: HTMLElement) => addClass(t0).runNow()), bind = js.Any.fromFunction1((t0: HTMLCollection[Any]) => bind(t0).runNow()), click = js.Any.fromFunction1((t0: MouseEvent) => click(t0).runNow()), items = items.asInstanceOf[js.Any], mount = mount.toJsFn, removeActive = removeActive.toJsFn, removeBindings = removeBindings.toJsFn, removeClass = js.Any.fromFunction1((t0: HTMLElement) => removeClass(t0).runNow()), setActive = setActive.toJsFn, unbind = js.Any.fromFunction1((t0: HTMLCollection[Any]) => unbind(t0).runNow()))
    __obj.asInstanceOf[ControlsComponent]
  }
  
  extension [Self <: ControlsComponent](x: Self) {
    
    inline def setAddBindings(value: Callback): Self = StObject.set(x, "addBindings", value.toJsFn)
    
    inline def setAddClass(value: HTMLElement => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setBind(value: HTMLCollection[Any] => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction1((t0: HTMLCollection[Any]) => value(t0).runNow()))
    
    inline def setClick(value: MouseEvent => Callback): Self = StObject.set(x, "click", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setItems(value: HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setRemoveActive(value: Callback): Self = StObject.set(x, "removeActive", value.toJsFn)
    
    inline def setRemoveBindings(value: Callback): Self = StObject.set(x, "removeBindings", value.toJsFn)
    
    inline def setRemoveClass(value: HTMLElement => Callback): Self = StObject.set(x, "removeClass", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    
    inline def setSetActive(value: Callback): Self = StObject.set(x, "setActive", value.toJsFn)
    
    inline def setUnbind(value: HTMLCollection[Any] => Callback): Self = StObject.set(x, "unbind", js.Any.fromFunction1((t0: HTMLCollection[Any]) => value(t0).runNow()))
  }
}

package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GapsComponent
  extends StObject
     with Component {
  
  /**
    * Applies gaps between slides. First and last slides do not receive it's edge margins.
    */
  @JSName("apply")
  def apply(slides: HTMLCollection[Any]): Unit
  
  /**
    * Holds additional dimensions value caused by gaps. Used to increase the width of the slides wrapper.
    */
  val grow: Double
  
  @JSName("mount")
  def mount_MGapsComponent(): Unit
  
  /**
    * Holds reduction value caused by gaps. Used to subtract the width of the slides.
    */
  val reductor: Double
  
  /**
    * Removes gaps from the slides.
    */
  def remove(slides: HTMLCollection[Any]): Unit
  
  /**
    * Holds value of gaps.
    */
  val value: Double
}
object GapsComponent {
  
  inline def apply(
    apply: HTMLCollection[Any] => Callback,
    grow: Double,
    mount: Callback,
    reductor: Double,
    remove: HTMLCollection[Any] => Callback,
    value: Double
  ): GapsComponent = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: HTMLCollection[Any]) => apply(t0).runNow()), grow = grow.asInstanceOf[js.Any], mount = mount.toJsFn, reductor = reductor.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: HTMLCollection[Any]) => remove(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapsComponent]
  }
  
  extension [Self <: GapsComponent](x: Self) {
    
    inline def setApply(value: HTMLCollection[Any] => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: HTMLCollection[Any]) => value(t0).runNow()))
    
    inline def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setReductor(value: Double): Self = StObject.set(x, "reductor", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: HTMLCollection[Any] => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: HTMLCollection[Any]) => value(t0).runNow()))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildComponent
  extends StObject
     with Component {
  
  /**
    * Applies an active class to slides based on the current index.
    */
  def activeClass(): Unit
  
  @JSName("mount")
  def mount_MBuildComponent(): Unit
  
  /**
    * Removes all classes applied by component.
    */
  def removeClasses(): Unit
  
  /**
    * Applies type class based on the instance settings.
    */
  def typeClass(): Unit
}
object BuildComponent {
  
  inline def apply(activeClass: Callback, mount: Callback, removeClasses: Callback, typeClass: Callback): BuildComponent = {
    val __obj = js.Dynamic.literal(activeClass = activeClass.toJsFn, mount = mount.toJsFn, removeClasses = removeClasses.toJsFn, typeClass = typeClass.toJsFn)
    __obj.asInstanceOf[BuildComponent]
  }
  
  extension [Self <: BuildComponent](x: Self) {
    
    inline def setActiveClass(value: Callback): Self = StObject.set(x, "activeClass", value.toJsFn)
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setRemoveClasses(value: Callback): Self = StObject.set(x, "removeClasses", value.toJsFn)
    
    inline def setTypeClass(value: Callback): Self = StObject.set(x, "typeClass", value.toJsFn)
  }
}

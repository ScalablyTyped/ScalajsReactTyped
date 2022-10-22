package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.glidejsGlide.anon.Before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeekComponent
  extends StObject
     with Component {
  
  /**
    * Holds value of a peeking.
    */
  @JSName("mount")
  def mount_MPeekComponent(): Unit
  
  /**
    * Mounts and initializes a component. Setups an initial peeking value.
    */
  val reductor: Double
  
  /**
    * Holds value of a peeking.
    */
  var value: Double | Before
}
object PeekComponent {
  
  inline def apply(mount: Callback, reductor: Double, value: Double | Before): PeekComponent = {
    val __obj = js.Dynamic.literal(mount = mount.toJsFn, reductor = reductor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeekComponent]
  }
  
  extension [Self <: PeekComponent](x: Self) {
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setReductor(value: Double): Self = StObject.set(x, "reductor", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | Before): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

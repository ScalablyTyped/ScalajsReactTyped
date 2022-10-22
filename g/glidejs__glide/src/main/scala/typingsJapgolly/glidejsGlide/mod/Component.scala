package typingsJapgolly.glidejsGlide.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /**
    * Mounts and initializes a component.
    */
  var mount: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setMount(value: Callback): Self = StObject.set(x, "mount", value.toJsFn)
    
    inline def setMountUndefined: Self = StObject.set(x, "mount", js.undefined)
  }
}

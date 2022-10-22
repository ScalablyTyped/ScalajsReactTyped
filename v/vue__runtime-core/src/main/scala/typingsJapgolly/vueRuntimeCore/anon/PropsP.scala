package typingsJapgolly.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsP[P] extends StObject {
  
  @JSName("$props")
  var $props: P
}
object PropsP {
  
  inline def apply[P]($props: P): PropsP[P] = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsP[P]]
  }
  
  extension [Self <: PropsP[?], P](x: Self & PropsP[P]) {
    
    inline def set$props(value: P): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}

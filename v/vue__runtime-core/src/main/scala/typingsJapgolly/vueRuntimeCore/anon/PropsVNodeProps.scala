package typingsJapgolly.vueRuntimeCore.anon

import typingsJapgolly.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsVNodeProps extends StObject {
  
  @JSName("$props")
  var $props: VNodeProps
}
object PropsVNodeProps {
  
  inline def apply($props: VNodeProps): PropsVNodeProps = {
    val __obj = js.Dynamic.literal($props = $props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsVNodeProps]
  }
  
  extension [Self <: PropsVNodeProps](x: Self) {
    
    inline def set$props(value: VNodeProps): Self = StObject.set(x, "$props", value.asInstanceOf[js.Any])
  }
}

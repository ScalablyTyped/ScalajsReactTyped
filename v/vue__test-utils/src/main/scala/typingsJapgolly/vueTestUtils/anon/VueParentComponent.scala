package typingsJapgolly.vueTestUtils.anon

import typingsJapgolly.vueRuntimeCore.mod.ComponentInternalInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VueParentComponent extends StObject {
  
  var __vueParentComponent: js.UndefOr[ComponentInternalInstance] = js.undefined
  
  var __vue_app__ : js.UndefOr[Any] = js.undefined
}
object VueParentComponent {
  
  inline def apply(): VueParentComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueParentComponent]
  }
  
  extension [Self <: VueParentComponent](x: Self) {
    
    inline def set__vueParentComponent(value: ComponentInternalInstance): Self = StObject.set(x, "__vueParentComponent", value.asInstanceOf[js.Any])
    
    inline def set__vueParentComponentUndefined: Self = StObject.set(x, "__vueParentComponent", js.undefined)
    
    inline def set__vue_app__(value: Any): Self = StObject.set(x, "__vue_app__", value.asInstanceOf[js.Any])
    
    inline def set__vue_app__Undefined: Self = StObject.set(x, "__vue_app__", js.undefined)
  }
}

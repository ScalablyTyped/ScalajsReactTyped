package typingsJapgolly.vueRuntimeDom.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueRuntimeCore.mod.VNodeRef
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedProps extends StObject {
  
  var key: js.UndefOr[String | Double | js.Symbol] = js.undefined
  
  var ref: js.UndefOr[VNodeRef] = js.undefined
  
  var ref_for: js.UndefOr[Boolean] = js.undefined
  
  var ref_key: js.UndefOr[String] = js.undefined
}
object ReservedProps {
  
  inline def apply(): ReservedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedProps]
  }
  
  extension [Self <: ReservedProps](x: Self) {
    
    inline def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: VNodeRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction2(
      value: (/* ref */ Element | (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null, /* refs */ Record[String, Any]) => Callback
    ): Self = StObject.set(x, "ref", js.Any.fromFunction2((t0: /* ref */ Element | (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null, t1: /* refs */ Record[String, Any]) => (value(t0, t1)).runNow()))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRef_for(value: Boolean): Self = StObject.set(x, "ref_for", value.asInstanceOf[js.Any])
    
    inline def setRef_forUndefined: Self = StObject.set(x, "ref_for", js.undefined)
    
    inline def setRef_key(value: String): Self = StObject.set(x, "ref_key", value.asInstanceOf[js.Any])
    
    inline def setRef_keyUndefined: Self = StObject.set(x, "ref_key", js.undefined)
  }
}

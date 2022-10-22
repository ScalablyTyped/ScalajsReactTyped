package typingsJapgolly.vueRuntimeCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import typingsJapgolly.vueRuntimeCore.mod.RendererElement
import typingsJapgolly.vueRuntimeCore.mod.RendererNode
import typingsJapgolly.vueRuntimeCore.mod.VNode
import typingsJapgolly.vueRuntimeCore.mod.VNodeMountHook
import typingsJapgolly.vueRuntimeCore.mod.VNodeRef
import typingsJapgolly.vueRuntimeCore.mod.VNodeUpdateHook
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @vue/runtime-core.@vue/runtime-core.VNodeProps & {[key: string] : any} */
trait VNodePropskeystringany
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var key: js.UndefOr[String | Double | js.Symbol] = js.undefined
  
  var onVnodeBeforeMount: js.UndefOr[VNodeMountHook | js.Array[VNodeMountHook]] = js.undefined
  
  var onVnodeBeforeUnmount: js.UndefOr[VNodeMountHook | js.Array[VNodeMountHook]] = js.undefined
  
  var onVnodeBeforeUpdate: js.UndefOr[VNodeUpdateHook | js.Array[VNodeUpdateHook]] = js.undefined
  
  var onVnodeMounted: js.UndefOr[VNodeMountHook | js.Array[VNodeMountHook]] = js.undefined
  
  var onVnodeUnmounted: js.UndefOr[VNodeMountHook | js.Array[VNodeMountHook]] = js.undefined
  
  var onVnodeUpdated: js.UndefOr[VNodeUpdateHook | js.Array[VNodeUpdateHook]] = js.undefined
  
  var ref: js.UndefOr[VNodeRef] = js.undefined
  
  var ref_for: js.UndefOr[Boolean] = js.undefined
  
  var ref_key: js.UndefOr[String] = js.undefined
}
object VNodePropskeystringany {
  
  inline def apply(): VNodePropskeystringany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodePropskeystringany]
  }
  
  extension [Self <: VNodePropskeystringany](x: Self) {
    
    inline def setKey(value: String | Double | js.Symbol): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnVnodeBeforeMount(value: VNodeMountHook | js.Array[VNodeMountHook]): Self = StObject.set(x, "onVnodeBeforeMount", value.asInstanceOf[js.Any])
    
    inline def setOnVnodeBeforeMountFunction1(value: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]] => Callback): Self = StObject.set(x, "onVnodeBeforeMount", js.Any.fromFunction1((t0: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => value(t0).runNow()))
    
    inline def setOnVnodeBeforeMountUndefined: Self = StObject.set(x, "onVnodeBeforeMount", js.undefined)
    
    inline def setOnVnodeBeforeMountVarargs(value: VNodeMountHook*): Self = StObject.set(x, "onVnodeBeforeMount", js.Array(value*))
    
    inline def setOnVnodeBeforeUnmount(value: VNodeMountHook | js.Array[VNodeMountHook]): Self = StObject.set(x, "onVnodeBeforeUnmount", value.asInstanceOf[js.Any])
    
    inline def setOnVnodeBeforeUnmountFunction1(value: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]] => Callback): Self = StObject.set(x, "onVnodeBeforeUnmount", js.Any.fromFunction1((t0: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => value(t0).runNow()))
    
    inline def setOnVnodeBeforeUnmountUndefined: Self = StObject.set(x, "onVnodeBeforeUnmount", js.undefined)
    
    inline def setOnVnodeBeforeUnmountVarargs(value: VNodeMountHook*): Self = StObject.set(x, "onVnodeBeforeUnmount", js.Array(value*))
    
    inline def setOnVnodeBeforeUpdate(value: VNodeUpdateHook | js.Array[VNodeUpdateHook]): Self = StObject.set(x, "onVnodeBeforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnVnodeBeforeUpdateFunction2(
      value: (/* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]], /* oldVNode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => Callback
    ): Self = StObject.set(x, "onVnodeBeforeUpdate", js.Any.fromFunction2((t0: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]], t1: /* oldVNode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => (value(t0, t1)).runNow()))
    
    inline def setOnVnodeBeforeUpdateUndefined: Self = StObject.set(x, "onVnodeBeforeUpdate", js.undefined)
    
    inline def setOnVnodeBeforeUpdateVarargs(value: VNodeUpdateHook*): Self = StObject.set(x, "onVnodeBeforeUpdate", js.Array(value*))
    
    inline def setOnVnodeMounted(value: VNodeMountHook | js.Array[VNodeMountHook]): Self = StObject.set(x, "onVnodeMounted", value.asInstanceOf[js.Any])
    
    inline def setOnVnodeMountedFunction1(value: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]] => Callback): Self = StObject.set(x, "onVnodeMounted", js.Any.fromFunction1((t0: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => value(t0).runNow()))
    
    inline def setOnVnodeMountedUndefined: Self = StObject.set(x, "onVnodeMounted", js.undefined)
    
    inline def setOnVnodeMountedVarargs(value: VNodeMountHook*): Self = StObject.set(x, "onVnodeMounted", js.Array(value*))
    
    inline def setOnVnodeUnmounted(value: VNodeMountHook | js.Array[VNodeMountHook]): Self = StObject.set(x, "onVnodeUnmounted", value.asInstanceOf[js.Any])
    
    inline def setOnVnodeUnmountedFunction1(value: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]] => Callback): Self = StObject.set(x, "onVnodeUnmounted", js.Any.fromFunction1((t0: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => value(t0).runNow()))
    
    inline def setOnVnodeUnmountedUndefined: Self = StObject.set(x, "onVnodeUnmounted", js.undefined)
    
    inline def setOnVnodeUnmountedVarargs(value: VNodeMountHook*): Self = StObject.set(x, "onVnodeUnmounted", js.Array(value*))
    
    inline def setOnVnodeUpdated(value: VNodeUpdateHook | js.Array[VNodeUpdateHook]): Self = StObject.set(x, "onVnodeUpdated", value.asInstanceOf[js.Any])
    
    inline def setOnVnodeUpdatedFunction2(
      value: (/* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]], /* oldVNode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => Callback
    ): Self = StObject.set(x, "onVnodeUpdated", js.Any.fromFunction2((t0: /* vnode */ VNode[RendererNode, RendererElement, StringDictionary[Any]], t1: /* oldVNode */ VNode[RendererNode, RendererElement, StringDictionary[Any]]) => (value(t0, t1)).runNow()))
    
    inline def setOnVnodeUpdatedUndefined: Self = StObject.set(x, "onVnodeUpdated", js.undefined)
    
    inline def setOnVnodeUpdatedVarargs(value: VNodeUpdateHook*): Self = StObject.set(x, "onVnodeUpdated", js.Array(value*))
    
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

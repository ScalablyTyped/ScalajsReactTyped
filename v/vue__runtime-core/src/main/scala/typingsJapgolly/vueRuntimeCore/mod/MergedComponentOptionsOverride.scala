package typingsJapgolly.vueRuntimeCore.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.vueReactivity.mod.DebuggerEvent
import typingsJapgolly.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergedComponentOptionsOverride extends StObject {
  
  var activated: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var beforeCreate: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  /** @deprecated use `beforeUnmount` instead */
  var beforeDestroy: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var beforeMount: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var beforeUnmount: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var beforeUpdate: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var created: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var deactivated: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  /** @deprecated use `unmounted` instead */
  var destroyed: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var errorCaptured: js.UndefOr[MergedHook[ErrorCapturedHook[Any]]] = js.undefined
  
  var mounted: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var renderTracked: js.UndefOr[MergedHook[DebuggerHook]] = js.undefined
  
  var renderTriggered: js.UndefOr[MergedHook[DebuggerHook]] = js.undefined
  
  var unmounted: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
  
  var updated: js.UndefOr[MergedHook[js.Function0[Unit]]] = js.undefined
}
object MergedComponentOptionsOverride {
  
  inline def apply(): MergedComponentOptionsOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergedComponentOptionsOverride]
  }
  
  extension [Self <: MergedComponentOptionsOverride](x: Self) {
    
    inline def setActivated(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setActivatedCallback(value: Callback): Self = StObject.set(x, "activated", value.toJsFn)
    
    inline def setActivatedUndefined: Self = StObject.set(x, "activated", js.undefined)
    
    inline def setActivatedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "activated", js.Array(value*))
    
    inline def setBeforeCreate(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "beforeCreate", value.asInstanceOf[js.Any])
    
    inline def setBeforeCreateCallback(value: Callback): Self = StObject.set(x, "beforeCreate", value.toJsFn)
    
    inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    inline def setBeforeCreateVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "beforeCreate", js.Array(value*))
    
    inline def setBeforeDestroy(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "beforeDestroy", value.asInstanceOf[js.Any])
    
    inline def setBeforeDestroyCallback(value: Callback): Self = StObject.set(x, "beforeDestroy", value.toJsFn)
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setBeforeDestroyVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "beforeDestroy", js.Array(value*))
    
    inline def setBeforeMount(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "beforeMount", value.asInstanceOf[js.Any])
    
    inline def setBeforeMountCallback(value: Callback): Self = StObject.set(x, "beforeMount", value.toJsFn)
    
    inline def setBeforeMountUndefined: Self = StObject.set(x, "beforeMount", js.undefined)
    
    inline def setBeforeMountVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "beforeMount", js.Array(value*))
    
    inline def setBeforeUnmount(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "beforeUnmount", value.asInstanceOf[js.Any])
    
    inline def setBeforeUnmountCallback(value: Callback): Self = StObject.set(x, "beforeUnmount", value.toJsFn)
    
    inline def setBeforeUnmountUndefined: Self = StObject.set(x, "beforeUnmount", js.undefined)
    
    inline def setBeforeUnmountVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "beforeUnmount", js.Array(value*))
    
    inline def setBeforeUpdate(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "beforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setBeforeUpdateCallback(value: Callback): Self = StObject.set(x, "beforeUpdate", value.toJsFn)
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setBeforeUpdateVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "beforeUpdate", js.Array(value*))
    
    inline def setCreated(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedCallback(value: Callback): Self = StObject.set(x, "created", value.toJsFn)
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setCreatedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "created", js.Array(value*))
    
    inline def setDeactivated(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "deactivated", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedCallback(value: Callback): Self = StObject.set(x, "deactivated", value.toJsFn)
    
    inline def setDeactivatedUndefined: Self = StObject.set(x, "deactivated", js.undefined)
    
    inline def setDeactivatedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "deactivated", js.Array(value*))
    
    inline def setDestroyed(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
    
    inline def setDestroyedCallback(value: Callback): Self = StObject.set(x, "destroyed", value.toJsFn)
    
    inline def setDestroyedUndefined: Self = StObject.set(x, "destroyed", js.undefined)
    
    inline def setDestroyedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "destroyed", js.Array(value*))
    
    inline def setErrorCaptured(value: MergedHook[ErrorCapturedHook[Any]]): Self = StObject.set(x, "errorCaptured", value.asInstanceOf[js.Any])
    
    inline def setErrorCapturedFunction3(
      value: (Any, /* instance */ (ComponentPublicInstance[
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
        ]) | Null, /* info */ String) => Boolean | Unit
    ): Self = StObject.set(x, "errorCaptured", js.Any.fromFunction3(value))
    
    inline def setErrorCapturedUndefined: Self = StObject.set(x, "errorCaptured", js.undefined)
    
    inline def setErrorCapturedVarargs(value: ErrorCapturedHook[Any]*): Self = StObject.set(x, "errorCaptured", js.Array(value*))
    
    inline def setMounted(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
    
    inline def setMountedCallback(value: Callback): Self = StObject.set(x, "mounted", value.toJsFn)
    
    inline def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
    
    inline def setMountedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "mounted", js.Array(value*))
    
    inline def setRenderTracked(value: MergedHook[DebuggerHook]): Self = StObject.set(x, "renderTracked", value.asInstanceOf[js.Any])
    
    inline def setRenderTrackedFunction1(value: /* e */ DebuggerEvent => Callback): Self = StObject.set(x, "renderTracked", js.Any.fromFunction1((t0: /* e */ DebuggerEvent) => value(t0).runNow()))
    
    inline def setRenderTrackedUndefined: Self = StObject.set(x, "renderTracked", js.undefined)
    
    inline def setRenderTrackedVarargs(value: DebuggerHook*): Self = StObject.set(x, "renderTracked", js.Array(value*))
    
    inline def setRenderTriggered(value: MergedHook[DebuggerHook]): Self = StObject.set(x, "renderTriggered", value.asInstanceOf[js.Any])
    
    inline def setRenderTriggeredFunction1(value: /* e */ DebuggerEvent => Callback): Self = StObject.set(x, "renderTriggered", js.Any.fromFunction1((t0: /* e */ DebuggerEvent) => value(t0).runNow()))
    
    inline def setRenderTriggeredUndefined: Self = StObject.set(x, "renderTriggered", js.undefined)
    
    inline def setRenderTriggeredVarargs(value: DebuggerHook*): Self = StObject.set(x, "renderTriggered", js.Array(value*))
    
    inline def setUnmounted(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "unmounted", value.asInstanceOf[js.Any])
    
    inline def setUnmountedCallback(value: Callback): Self = StObject.set(x, "unmounted", value.toJsFn)
    
    inline def setUnmountedUndefined: Self = StObject.set(x, "unmounted", js.undefined)
    
    inline def setUnmountedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "unmounted", js.Array(value*))
    
    inline def setUpdated(value: MergedHook[js.Function0[Unit]]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedCallback(value: Callback): Self = StObject.set(x, "updated", value.toJsFn)
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUpdatedVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "updated", js.Array(value*))
  }
}

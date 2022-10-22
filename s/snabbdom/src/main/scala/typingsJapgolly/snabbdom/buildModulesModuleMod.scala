package typingsJapgolly.snabbdom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.snabbdom.buildHooksMod.CreateHook
import typingsJapgolly.snabbdom.buildHooksMod.DestroyHook
import typingsJapgolly.snabbdom.buildHooksMod.PostHook
import typingsJapgolly.snabbdom.buildHooksMod.PreHook
import typingsJapgolly.snabbdom.buildHooksMod.RemoveHook
import typingsJapgolly.snabbdom.buildHooksMod.UpdateHook
import typingsJapgolly.snabbdom.buildVnodeMod.VNode_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildModulesModuleMod {
  
  /* Inlined std.Partial<{  pre :snabbdom.snabbdom/build/hooks.PreHook,   create :snabbdom.snabbdom/build/hooks.CreateHook,   update :snabbdom.snabbdom/build/hooks.UpdateHook,   destroy :snabbdom.snabbdom/build/hooks.DestroyHook,   remove :snabbdom.snabbdom/build/hooks.RemoveHook,   post :snabbdom.snabbdom/build/hooks.PostHook}> */
  trait Module extends StObject {
    
    var create: js.UndefOr[CreateHook] = js.undefined
    
    var destroy: js.UndefOr[DestroyHook] = js.undefined
    
    var post: js.UndefOr[PostHook] = js.undefined
    
    var pre: js.UndefOr[PreHook] = js.undefined
    
    var remove: js.UndefOr[RemoveHook] = js.undefined
    
    var update: js.UndefOr[UpdateHook] = js.undefined
  }
  object Module {
    
    inline def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setCreate(value: (/* emptyVNode */ VNode_, /* vNode */ VNode_) => Any): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDestroy(value: /* vNode */ VNode_ => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setPost(value: CallbackTo[Any]): Self = StObject.set(x, "post", value.toJsFn)
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(value: CallbackTo[Any]): Self = StObject.set(x, "pre", value.toJsFn)
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      inline def setRemove(value: (/* vNode */ VNode_, /* removeCallback */ js.Function0[Unit]) => Any): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setUpdate(value: (/* oldVNode */ VNode_, /* vNode */ VNode_) => Any): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}

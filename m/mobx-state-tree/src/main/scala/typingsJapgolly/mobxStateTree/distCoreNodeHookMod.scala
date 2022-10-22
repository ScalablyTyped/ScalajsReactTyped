package typingsJapgolly.mobxStateTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreNodeHookMod {
  
  @js.native
  sealed trait Hook extends StObject
  @JSImport("mobx-state-tree/dist/core/node/Hook", "Hook")
  @js.native
  object Hook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Hook & String] = js.native
    
    @js.native
    sealed trait afterAttach
      extends StObject
         with Hook
    /* "afterAttach" */ val afterAttach: typingsJapgolly.mobxStateTree.distCoreNodeHookMod.Hook.afterAttach & String = js.native
    
    @js.native
    sealed trait afterCreate
      extends StObject
         with Hook
    /* "afterCreate" */ val afterCreate: typingsJapgolly.mobxStateTree.distCoreNodeHookMod.Hook.afterCreate & String = js.native
    
    @js.native
    sealed trait afterCreationFinalization
      extends StObject
         with Hook
    /* "afterCreationFinalization" */ val afterCreationFinalization: typingsJapgolly.mobxStateTree.distCoreNodeHookMod.Hook.afterCreationFinalization & String = js.native
    
    @js.native
    sealed trait beforeDestroy
      extends StObject
         with Hook
    /* "beforeDestroy" */ val beforeDestroy: typingsJapgolly.mobxStateTree.distCoreNodeHookMod.Hook.beforeDestroy & String = js.native
    
    @js.native
    sealed trait beforeDetach
      extends StObject
         with Hook
    /* "beforeDetach" */ val beforeDetach: typingsJapgolly.mobxStateTree.distCoreNodeHookMod.Hook.beforeDetach & String = js.native
  }
  
  @js.native
  trait IHooks extends StObject
  
  type IHooksGetter[T] = js.Function1[/* self */ T, IHooks]
}

package typingsJapgolly.immer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.immer.anon.DRAFTSTATE
import typingsJapgolly.immer.anon.DraftedAnyArrayProxyArray
import typingsJapgolly.immer.anon.DraftedAnyMapMapState
import typingsJapgolly.immer.anon.DraftedAnyObjectES5ArrayS
import typingsJapgolly.immer.anon.DraftedAnyObjectES5Object
import typingsJapgolly.immer.anon.DraftedAnyObjectProxyObje
import typingsJapgolly.immer.anon.DraftedAnySetSetState
import typingsJapgolly.immer.distCoreScopeMod.ImmerScope
import typingsJapgolly.immer.immerInts.`0`
import typingsJapgolly.immer.immerInts.`1`
import typingsJapgolly.immer.immerInts.`2`
import typingsJapgolly.immer.immerInts.`3`
import typingsJapgolly.immer.immerInts.`4`
import typingsJapgolly.immer.immerInts.`5`
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesInternalMod {
  
  type AnyArray = js.Array[Any]
  
  type AnyMap = Map[Any, Any]
  
  type AnyObject = StringDictionary[Any]
  
  type AnySet = Set[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.immer.immerInts.`0`
    - typingsJapgolly.immer.immerInts.`1`
    - typingsJapgolly.immer.immerInts.`2`
    - typingsJapgolly.immer.immerInts.`3`
  */
  trait Archtype extends StObject
  object Archtype {
    
    inline def Array: `1` = 1.asInstanceOf[`1`]
    
    inline def Map: `2` = 2.asInstanceOf[`2`]
    
    inline def Object: `0` = 0.asInstanceOf[`0`]
    
    inline def Set: `3` = 3.asInstanceOf[`3`]
  }
  
  type Drafted[Base, T /* <: ImmerState */] = DRAFTSTATE[T] & Base
  
  trait ImmerBaseState extends StObject {
    
    var finalized_ : Boolean
    
    var isManual_ : Boolean
    
    var modified_ : Boolean
    
    var parent_ : js.UndefOr[ImmerState] = js.undefined
    
    var scope_ : ImmerScope
  }
  object ImmerBaseState {
    
    inline def apply(finalized_ : Boolean, isManual_ : Boolean, modified_ : Boolean, scope_ : ImmerScope): ImmerBaseState = {
      val __obj = js.Dynamic.literal(finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImmerBaseState]
    }
    
    extension [Self <: ImmerBaseState](x: Self) {
      
      inline def setFinalized_(value: Boolean): Self = StObject.set(x, "finalized_", value.asInstanceOf[js.Any])
      
      inline def setIsManual_(value: Boolean): Self = StObject.set(x, "isManual_", value.asInstanceOf[js.Any])
      
      inline def setModified_(value: Boolean): Self = StObject.set(x, "modified_", value.asInstanceOf[js.Any])
      
      inline def setParent_(value: ImmerState): Self = StObject.set(x, "parent_", value.asInstanceOf[js.Any])
      
      inline def setParent_Undefined: Self = StObject.set(x, "parent_", js.undefined)
      
      inline def setScope_(value: ImmerScope): Self = StObject.set(x, "scope_", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.immer.distCoreProxyMod.ProxyObjectState
    - typingsJapgolly.immer.distCoreProxyMod.ProxyArrayState
    - typingsJapgolly.immer.distUtilsPluginsMod.ES5ObjectState
    - typingsJapgolly.immer.distUtilsPluginsMod.ES5ArrayState
    - typingsJapgolly.immer.distUtilsPluginsMod.MapState
    - typingsJapgolly.immer.distUtilsPluginsMod.SetState
  */
  trait ImmerState extends StObject
  object ImmerState {
    
    inline def ES5ArrayState(
      assigned_ : StringDictionary[Any],
      base_ : Any,
      copy_ : Any,
      draft_ : DraftedAnyObjectES5ArrayS,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): typingsJapgolly.immer.distUtilsPluginsMod.ES5ArrayState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], copy_ = copy_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 5)
      __obj.asInstanceOf[typingsJapgolly.immer.distUtilsPluginsMod.ES5ArrayState]
    }
    
    inline def ES5ObjectState(
      assigned_ : StringDictionary[Any],
      base_ : AnyObject,
      draft_ : DraftedAnyObjectES5Object,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): typingsJapgolly.immer.distUtilsPluginsMod.ES5ObjectState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 4, copy_ = null)
      __obj.asInstanceOf[typingsJapgolly.immer.distUtilsPluginsMod.ES5ObjectState]
    }
    
    inline def MapState(
      base_ : AnyMap,
      draft_ : DraftedAnyMapMapState,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): typingsJapgolly.immer.distUtilsPluginsMod.MapState = {
      val __obj = js.Dynamic.literal(base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 2)
      __obj.asInstanceOf[typingsJapgolly.immer.distUtilsPluginsMod.MapState]
    }
    
    inline def ProxyArrayState(
      assigned_ : StringDictionary[Boolean],
      base_ : AnyArray,
      draft_ : DraftedAnyArrayProxyArray,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : Callback,
      scope_ : ImmerScope
    ): typingsJapgolly.immer.distCoreProxyMod.ProxyArrayState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = revoke_.toJsFn, scope_ = scope_.asInstanceOf[js.Any], type_ = 1, copy_ = null)
      __obj.asInstanceOf[typingsJapgolly.immer.distCoreProxyMod.ProxyArrayState]
    }
    
    inline def ProxyObjectState(
      assigned_ : StringDictionary[Boolean],
      base_ : Any,
      copy_ : Any,
      draft_ : DraftedAnyObjectProxyObje,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : Callback,
      scope_ : ImmerScope
    ): typingsJapgolly.immer.distCoreProxyMod.ProxyObjectState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], copy_ = copy_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = revoke_.toJsFn, scope_ = scope_.asInstanceOf[js.Any], type_ = 0)
      __obj.asInstanceOf[typingsJapgolly.immer.distCoreProxyMod.ProxyObjectState]
    }
    
    inline def SetState(
      base_ : AnySet,
      draft_ : DraftedAnySetSetState,
      drafts_ : Map[Any, Drafted[Any, ImmerState]],
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): typingsJapgolly.immer.distUtilsPluginsMod.SetState = {
      val __obj = js.Dynamic.literal(base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], drafts_ = drafts_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 3)
      __obj.asInstanceOf[typingsJapgolly.immer.distUtilsPluginsMod.SetState]
    }
  }
  
  type Objectish = AnyObject | AnyArray | AnyMap | AnySet
  
  type ObjectishNoSet = AnyObject | AnyArray | AnyMap
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.immer.immerInts.`0`
    - typingsJapgolly.immer.immerInts.`1`
    - typingsJapgolly.immer.immerInts.`2`
    - typingsJapgolly.immer.immerInts.`3`
    - typingsJapgolly.immer.immerInts.`4`
    - typingsJapgolly.immer.immerInts.`5`
  */
  trait ProxyType extends StObject
  object ProxyType {
    
    inline def ES5Array: `5` = 5.asInstanceOf[`5`]
    
    inline def ES5Object: `4` = 4.asInstanceOf[`4`]
    
    inline def Map: `2` = 2.asInstanceOf[`2`]
    
    inline def ProxyArray: `1` = 1.asInstanceOf[`1`]
    
    inline def ProxyObject: `0` = 0.asInstanceOf[`0`]
    
    inline def Set: `3` = 3.asInstanceOf[`3`]
  }
}

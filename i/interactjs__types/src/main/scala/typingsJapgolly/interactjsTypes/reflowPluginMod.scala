package typingsJapgolly.interactjsTypes

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.anon.FnCallInteractableActionScope
import typingsJapgolly.interactjsTypes.anon.OmitDoAnyPhaseArgiEvent
import typingsJapgolly.interactjsTypes.coreInteractionMod.DoAnyPhaseArg
import typingsJapgolly.interactjsTypes.coreScopeMod.Plugin
import typingsJapgolly.interactjsTypes.coreScopeMod.Scope
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionProps
import typingsJapgolly.interactjsTypes.interactjsTypesBooleans.`true`
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drag
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.drop
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.gesture
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.resize
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflowPluginMod {
  
  @JSImport("@interactjs/reflow/plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@interactjs/reflow/plugin", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  inline def install(scope: Scope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* augmented module */
  object interactjsCoreInteractEventAugmentingMod {
    
    trait PhaseMap extends StObject {
      
      var reflow: js.UndefOr[`true`] = js.undefined
    }
    object PhaseMap {
      
      inline def apply(): PhaseMap = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PhaseMap]
      }
      
      extension [Self <: PhaseMap](x: Self) {
        
        inline def setReflow(value: `true`): Self = StObject.set(x, "reflow", value.asInstanceOf[js.Any])
        
        inline def setReflowUndefined: Self = StObject.set(x, "reflow", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractableAugmentingMod {
    
    @js.native
    trait Interactable extends StObject {
      
      @JSName("reflow")
      def reflow_drag(action: ActionProps[drag]): ReturnType[FnCallInteractableActionScope] = js.native
      @JSName("reflow")
      def reflow_drop(action: ActionProps[drop]): ReturnType[FnCallInteractableActionScope] = js.native
      @JSName("reflow")
      def reflow_gesture(action: ActionProps[gesture]): ReturnType[FnCallInteractableActionScope] = js.native
      @JSName("reflow")
      def reflow_resize(action: ActionProps[resize]): ReturnType[FnCallInteractableActionScope] = js.native
    }
  }
  
  /* augmented module */
  object interactjsCoreInteractionAugmentingMod {
    
    trait Interaction extends StObject {
      
      var _reflowPromise: js.Promise[Unit]
      
      def _reflowResolve(args: Any*): Unit
    }
    object Interaction {
      
      inline def apply(_reflowPromise: js.Promise[Unit], _reflowResolve: /* repeated */ Any => Callback): Interaction = {
        val __obj = js.Dynamic.literal(_reflowPromise = _reflowPromise.asInstanceOf[js.Any], _reflowResolve = js.Any.fromFunction1((t0: /* repeated */ Any) => _reflowResolve(t0).runNow()))
        __obj.asInstanceOf[Interaction]
      }
      
      extension [Self <: Interaction](x: Self) {
        
        inline def set_reflowPromise(value: js.Promise[Unit]): Self = StObject.set(x, "_reflowPromise", value.asInstanceOf[js.Any])
        
        inline def set_reflowResolve(value: /* repeated */ Any => Callback): Self = StObject.set(x, "_reflowResolve", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait SignalArgs extends StObject {
      
      @JSName("interactions:action-reflow")
      var `interactionsColonaction-reflow`: DoAnyPhaseArg
      
      @JSName("interactions:after-action-reflow")
      var `interactionsColonafter-action-reflow`: DoAnyPhaseArg
      
      @JSName("interactions:before-action-reflow")
      var `interactionsColonbefore-action-reflow`: OmitDoAnyPhaseArgiEvent
    }
    object SignalArgs {
      
      inline def apply(
        `interactionsColonaction-reflow`: DoAnyPhaseArg,
        `interactionsColonafter-action-reflow`: DoAnyPhaseArg,
        `interactionsColonbefore-action-reflow`: OmitDoAnyPhaseArgiEvent
      ): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("interactions:action-reflow")(`interactionsColonaction-reflow`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:after-action-reflow")(`interactionsColonafter-action-reflow`.asInstanceOf[js.Any])
        __obj.updateDynamic("interactions:before-action-reflow")(`interactionsColonbefore-action-reflow`.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      extension [Self <: SignalArgs](x: Self) {
        
        inline def `setInteractionsColonaction-reflow`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:action-reflow", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonafter-action-reflow`(value: DoAnyPhaseArg): Self = StObject.set(x, "interactions:after-action-reflow", value.asInstanceOf[js.Any])
        
        inline def `setInteractionsColonbefore-action-reflow`(value: OmitDoAnyPhaseArgiEvent): Self = StObject.set(x, "interactions:before-action-reflow", value.asInstanceOf[js.Any])
      }
    }
  }
}

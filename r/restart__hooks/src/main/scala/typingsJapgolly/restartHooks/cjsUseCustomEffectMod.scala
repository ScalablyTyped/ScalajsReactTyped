package typingsJapgolly.restartHooks

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.DependencyList
import typingsJapgolly.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseCustomEffectMod {
  
  @JSImport("@restart/hooks/cjs/useCustomEffect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * a useEffect() hook with customized depedency comparision
    *
    * @param effect The effect callback
    * @param dependencies A list of dependencies
    * @param isEqual A function comparing the next and previous dependencyLists
    */
  inline def default[TDeps /* <: DependencyList */](effect: EffectCallback, dependencies: TDeps, isEqual: IsEqual[TDeps]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], isEqual.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * a useEffect() hook with customized depedency comparision
    *
    * @param effect The effect callback
    * @param dependencies A list of dependencies
    * @param options
    * @param options.isEqual A function comparing the next and previous dependencyLists
    * @param options.effectHook the underlying effect hook used, defaults to useEffect
    */
  inline def default[TDeps /* <: DependencyList */](effect: EffectCallback, dependencies: TDeps, options: CustomEffectOptions[TDeps]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(effect.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CustomEffectOptions[TDeps /* <: DependencyList */] extends StObject {
    
    var effectHook: js.UndefOr[EffectHook] = js.undefined
    
    var isEqual: IsEqual[TDeps]
  }
  object CustomEffectOptions {
    
    inline def apply[TDeps /* <: DependencyList */](isEqual: (TDeps, TDeps) => Boolean): CustomEffectOptions[TDeps] = {
      val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction2(isEqual))
      __obj.asInstanceOf[CustomEffectOptions[TDeps]]
    }
    
    extension [Self <: CustomEffectOptions[?], TDeps /* <: DependencyList */](x: Self & CustomEffectOptions[TDeps]) {
      
      inline def setEffectHook(value: (/* effect */ EffectCallback, /* deps */ js.UndefOr[DependencyList]) => Callback): Self = StObject.set(x, "effectHook", js.Any.fromFunction2((t0: /* effect */ EffectCallback, t1: /* deps */ js.UndefOr[DependencyList]) => (value(t0, t1)).runNow()))
      
      inline def setEffectHookUndefined: Self = StObject.set(x, "effectHook", js.undefined)
      
      inline def setIsEqual(value: (TDeps, TDeps) => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction2(value))
    }
  }
  
  type EffectHook = js.Function2[/* effect */ EffectCallback, /* deps */ js.UndefOr[DependencyList], Unit]
  
  type IsEqual[TDeps /* <: DependencyList */] = js.Function2[/* nextDeps */ TDeps, /* prevDeps */ TDeps, Boolean]
}

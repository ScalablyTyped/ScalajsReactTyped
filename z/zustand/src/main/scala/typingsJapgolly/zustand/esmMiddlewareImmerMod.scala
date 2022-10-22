package typingsJapgolly.zustand

import typingsJapgolly.std.Omit
import typingsJapgolly.zustand.esmVanillaMod.StateCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMiddlewareImmerMod {
  
  @JSImport("zustand/esm/middleware/immer", "immer")
  @js.native
  val immer: Immer_ = js.native
  
  type Immer_ = js.Function1[
    /* initializer */ StateCreator[
      Any, 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      js.Array[Any], 
      Any
    ], 
    StateCreator[
      Any, 
      js.Array[Any], 
      /* import warning: importer.ImportType#apply c repeated non-array type: [] */ js.Array[js.Array[Any]], 
      Any
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [] ? [] : T extends [unknown] ? [] : T extends [unknown | undefined] ? [] : T extends [unknown, unknown, ...infer A] ? A : T extends [unknown, unknown | undefined, ...infer A] ? A : T extends [unknown | undefined, unknown | undefined, ...infer A] ? A : never
    }}}
    */
  @js.native
  trait SkipTwo[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends {getState (): infer T,   setState :infer SetState} ? SetState extends (a : infer A): infer Sr ? {setState (nextStateOrUpdater : T, shouldReplace : boolean, a : zustand.zustand/esm/middleware/immer.SkipTwo<A>): Sr, setState (nextStateOrUpdater : std.Partial<T>, shouldReplace : boolean, a : zustand.zustand/esm/middleware/immer.SkipTwo<A>): Sr, setState (nextStateOrUpdater : (state : immer.immer/dist/types/types-external.Draft<T>): void, shouldReplace : boolean, a : zustand.zustand/esm/middleware/immer.SkipTwo<A>): Sr, setState (nextStateOrUpdater : T, shouldReplace : undefined, a : zustand.zustand/esm/middleware/immer.SkipTwo<A>): Sr, setState (nextStateOrUpdater : std.Partial<T>, shouldReplace : undefined, a : zustand.zustand/esm/middleware/immer.SkipTwo<A>): Sr, setState (nextStateOrUpdater : (state : immer.immer/dist/types/types-external.Draft<T>): void, shouldReplace : undefined, a : zustand.zustand/esm/middleware/immer.SkipTwo<A>): Sr} : never : never
    }}}
    */
  @js.native
  trait StoreImmer[S] extends StObject
  
  type WithImmer[S] = Write[S, StoreImmer[S]]
  
  type Write[T, U] = (Omit[T, /* keyof U */ String]) & U
  
  /* augmented module */
  object zustandEsmVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/immer")
      var zustandSlashimmer: WithImmer[S]
    }
    object StoreMutators {
      
      inline def apply[S, A](zustandSlashimmer: WithImmer[S]): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/immer")(zustandSlashimmer.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      extension [Self <: StoreMutators[?, ?], S, A](x: Self & (StoreMutators[S, A])) {
        
        inline def setZustandSlashimmer(value: WithImmer[S]): Self = StObject.set(x, "zustand/immer", value.asInstanceOf[js.Any])
      }
    }
  }
}

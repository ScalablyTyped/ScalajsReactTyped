package typingsJapgolly.zustand

import typingsJapgolly.zustand.middlewareCombineMod.Combine_
import typingsJapgolly.zustand.middlewareDevtoolsMod.Devtools_
import typingsJapgolly.zustand.middlewareDevtoolsMod.WithDevtools
import typingsJapgolly.zustand.middlewarePersistMod.Persist_
import typingsJapgolly.zustand.middlewarePersistMod.WithPersist
import typingsJapgolly.zustand.middlewareReduxMod.Redux_
import typingsJapgolly.zustand.middlewareReduxMod.WithRedux
import typingsJapgolly.zustand.middlewareSubscribeWithSelectorMod.SubscribeWithSelector_
import typingsJapgolly.zustand.middlewareSubscribeWithSelectorMod.WithSelectorSubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("zustand/middleware", "combine")
  @js.native
  val combine: Combine_ = js.native
  
  @JSImport("zustand/middleware", "devtools")
  @js.native
  val devtools: Devtools_ = js.native
  
  @JSImport("zustand/middleware", "persist")
  @js.native
  val persist: Persist_ = js.native
  
  @JSImport("zustand/middleware", "redux")
  @js.native
  val redux: Redux_ = js.native
  
  @JSImport("zustand/middleware", "subscribeWithSelector")
  @js.native
  val subscribeWithSelector: SubscribeWithSelector_ = js.native
  
  /* augmented module */
  object zustandVanillaAugmentingMod {
    
    trait StoreMutators[S, A] extends StObject {
      
      @JSName("zustand/devtools")
      var zustandSlashdevtools: WithDevtools[S]
      
      @JSName("zustand/persist")
      var zustandSlashpersist: WithPersist[S, A]
      
      @JSName("zustand/redux")
      var zustandSlashredux: WithRedux[S, A]
      
      @JSName("zustand/subscribeWithSelector")
      var zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
    }
    object StoreMutators {
      
      inline def apply[S, A](
        zustandSlashdevtools: WithDevtools[S],
        zustandSlashpersist: WithPersist[S, A],
        zustandSlashredux: WithRedux[S, A],
        zustandSlashsubscribeWithSelector: WithSelectorSubscribe[S]
      ): StoreMutators[S, A] = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("zustand/devtools")(zustandSlashdevtools.asInstanceOf[js.Any])
        __obj.updateDynamic("zustand/persist")(zustandSlashpersist.asInstanceOf[js.Any])
        __obj.updateDynamic("zustand/redux")(zustandSlashredux.asInstanceOf[js.Any])
        __obj.updateDynamic("zustand/subscribeWithSelector")(zustandSlashsubscribeWithSelector.asInstanceOf[js.Any])
        __obj.asInstanceOf[StoreMutators[S, A]]
      }
      
      extension [Self <: StoreMutators[?, ?], S, A](x: Self & (StoreMutators[S, A])) {
        
        inline def setZustandSlashdevtools(value: WithDevtools[S]): Self = StObject.set(x, "zustand/devtools", value.asInstanceOf[js.Any])
        
        inline def setZustandSlashpersist(value: WithPersist[S, A]): Self = StObject.set(x, "zustand/persist", value.asInstanceOf[js.Any])
        
        inline def setZustandSlashredux(value: WithRedux[S, A]): Self = StObject.set(x, "zustand/redux", value.asInstanceOf[js.Any])
        
        inline def setZustandSlashsubscribeWithSelector(value: WithSelectorSubscribe[S]): Self = StObject.set(x, "zustand/subscribeWithSelector", value.asInstanceOf[js.Any])
      }
    }
  }
}

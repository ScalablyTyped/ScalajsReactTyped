package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.esTypesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateReconcilerAutoMergeLevel1Mod {
  
  @JSImport("redux-persist/lib/stateReconciler/autoMergeLevel1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S](inboundState: S, originalState: S, reducedState: S, config: PersistConfig[S, Any, Any, Any]): S = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(inboundState.asInstanceOf[js.Any], originalState.asInstanceOf[js.Any], reducedState.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[S]
}

package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/stateReconciler/autoMergeLevel2", JSImport.Namespace)
@js.native
object autoMergeLevel2Mod extends js.Object {
  def default[S](inboundState: S, originalState: S, reducedState: S, config: PersistConfig[S, _, _, _]): S = js.native
}


package typingsJapgolly.reduxPersist

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reduxPersist.integrationReactMod.PersistGateProps
import typingsJapgolly.reduxPersist.integrationReactMod.PersistorGateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/integration/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  /**
    * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
    * @see Persistor
    * @see PersistGateProps
    * @see PersistGateState
    */
  @js.native
  class PersistGate ()
    extends Component[PersistGateProps, PersistorGateState, js.Any]
  
}


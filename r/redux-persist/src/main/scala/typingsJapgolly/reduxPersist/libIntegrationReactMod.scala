package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.integrationReactMod.PersistGateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIntegrationReactMod {
  
  /**
    * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
    * @see Persistor
    * @see PersistGateProps
    * @see PersistGateState
    */
  @JSImport("redux-persist/lib/integration/react", "PersistGate")
  @js.native
  open class PersistGate protected ()
    extends typingsJapgolly.reduxPersist.integrationReactMod.PersistGate {
    def this(props: PersistGateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PersistGateProps, context: Any) = this()
  }
}

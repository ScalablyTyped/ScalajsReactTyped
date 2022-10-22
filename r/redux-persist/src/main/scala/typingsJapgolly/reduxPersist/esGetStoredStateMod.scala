package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.esTypesMod.PersistConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esGetStoredStateMod {
  
  @JSImport("redux-persist/es/getStoredState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: PersistConfig[Any, Any, Any, Any]): js.Promise[js.UndefOr[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Object]]]
}

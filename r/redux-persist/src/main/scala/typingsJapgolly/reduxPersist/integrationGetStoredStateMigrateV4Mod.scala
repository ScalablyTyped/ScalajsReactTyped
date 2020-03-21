package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.getStoredStateMigrateV4Mod.V4Config
import typingsJapgolly.reduxPersist.typesMod.PersistConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/integration/getStoredStateMigrateV4", JSImport.Namespace)
@js.native
object integrationGetStoredStateMigrateV4Mod extends js.Object {
  def default(v4Config: V4Config): js.Function1[/* config */ PersistConfig[_, _, _, _], js.Promise[js.UndefOr[js.Object]]] = js.native
}


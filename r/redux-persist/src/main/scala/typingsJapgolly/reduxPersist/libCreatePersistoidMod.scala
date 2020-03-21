package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.typesMod.PersistConfig
import typingsJapgolly.reduxPersist.typesMod.Persistoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/createPersistoid", JSImport.Namespace)
@js.native
object libCreatePersistoidMod extends js.Object {
  def default(config: PersistConfig[_, _, _, _]): Persistoid = js.native
}


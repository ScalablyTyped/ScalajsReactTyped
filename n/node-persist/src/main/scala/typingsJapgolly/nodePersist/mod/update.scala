package typingsJapgolly.nodePersist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-persist", "update")
@js.native
object update extends js.Object {
  def apply(key: String, value: js.Any): js.Promise[WriteFileResult] = js.native
  def apply(key: String, value: js.Any, options: DatumOptions): js.Promise[WriteFileResult] = js.native
}


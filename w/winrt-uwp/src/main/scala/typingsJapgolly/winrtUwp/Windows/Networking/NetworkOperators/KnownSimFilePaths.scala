package typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static class that provides known SIM file paths. */
@JSGlobal("Windows.Networking.NetworkOperators.KnownSimFilePaths")
@js.native
abstract class KnownSimFilePaths () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.KnownSimFilePaths")
@js.native
object KnownSimFilePaths extends js.Object {
  /** Static property that gets the EFONS path. */
  var efOns: IVectorView[Double] = js.native
  /** Static property that gets the EFSPN path. */
  var efSpn: IVectorView[Double] = js.native
  /** Static property that gets the GID1 path. */
  var gid1: IVectorView[Double] = js.native
  /** Static property that gets the GID2 path. */
  var gid2: IVectorView[Double] = js.native
}


package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Transport")
@js.native
class Transport ()
  extends typingsJapgolly.nodegit.transportMod.Transport

/* static members */
@JSImport("nodegit", "Transport")
@js.native
object Transport extends js.Object {
  def sshWithPaths(owner: typingsJapgolly.nodegit.remoteMod.Remote, payload: String): js.Promise[typingsJapgolly.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(owner: typingsJapgolly.nodegit.remoteMod.Remote, payload: js.Array[String]): js.Promise[typingsJapgolly.nodegit.transportMod.Transport] = js.native
  def sshWithPaths(
    owner: typingsJapgolly.nodegit.remoteMod.Remote,
    payload: typingsJapgolly.nodegit.strArrayMod.Strarray
  ): js.Promise[typingsJapgolly.nodegit.transportMod.Transport] = js.native
  def unregister(prefix: String): Double = js.native
}


package typingsJapgolly.nodeOsUtils

import typingsJapgolly.nodeOsUtils.cpuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val cpu: default = js.native
  val drive: typingsJapgolly.nodeOsUtils.driveMod.default = js.native
  val mem: typingsJapgolly.nodeOsUtils.memMod.default = js.native
  val netstat: typingsJapgolly.nodeOsUtils.netstatMod.default = js.native
  val openfiles: typingsJapgolly.nodeOsUtils.openfilesMod.default = js.native
  val os: typingsJapgolly.nodeOsUtils.osMod.default = js.native
  val oscmd: typingsJapgolly.nodeOsUtils.oscmdMod.default = js.native
  val proc: typingsJapgolly.nodeOsUtils.procMod.default = js.native
  val users: typingsJapgolly.nodeOsUtils.usersMod.default = js.native
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  def isNotSupported(res: js.Any): Boolean = js.native
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = js.native
  @js.native
  object options extends js.Object {
    var INTERVAL: Double = js.native
    var NOT_SUPPORTED_VALUE: String = js.native
  }
  
}


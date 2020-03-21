package typingsJapgolly.openfin.nixLaunchMod

import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.openfin.wireMod.ConfigWithRuntime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/launcher/nix-launch", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(config: ConfigWithRuntime, osConfig: OsConfig): js.Promise[ChildProcess] = js.native
}


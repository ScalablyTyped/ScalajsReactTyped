package typingsJapgolly.ionic.updatesMod

import typingsJapgolly.ionic.definitionsMod.IonicEnvironment
import typingsJapgolly.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/updates", "runUpdateNotify")
@js.native
object runUpdateNotify extends js.Object {
  def apply(env: IonicEnvironment, pkg: PackageJson): js.Promise[Unit] = js.native
}


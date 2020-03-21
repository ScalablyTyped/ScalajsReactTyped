package typingsJapgolly.ionic.npmMod

import typingsJapgolly.ionic.PartialPkgManagerOptions
import typingsJapgolly.ionic.definitionsMod.NpmClient
import typingsJapgolly.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/npm", "pkgFromRegistry")
@js.native
object pkgFromRegistry extends js.Object {
  def apply(npmClient: NpmClient, options: PartialPkgManagerOptions): js.Promise[js.UndefOr[PackageJson]] = js.native
}


package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.coreMod.Target
import typingsJapgolly.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/remoteBuilder/RemoteBuilder", JSImport.Namespace)
@js.native
object remoteBuilderMod extends js.Object {
  @js.native
  class RemoteBuilder protected () extends js.Object {
    def this(packager: PlatformPackager[_]) = this()
    var _build: js.Any = js.native
    var artifactInfoToArtifactCreatedEvent: js.Any = js.native
    var buildStarted: js.Any = js.native
    val packager: PlatformPackager[_] = js.native
    val toBuild: js.Any = js.native
    def build(): js.Promise[_] = js.native
    def scheduleBuild(target: Target, arch: Arch, unpackedDirectory: String): Unit = js.native
  }
  
}


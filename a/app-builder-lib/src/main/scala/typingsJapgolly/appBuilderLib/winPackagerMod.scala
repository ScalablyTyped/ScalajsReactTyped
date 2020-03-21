package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.packagerMod.Packager
import typingsJapgolly.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsJapgolly.appBuilderLib.vmMod.VmManager
import typingsJapgolly.appBuilderLib.winOptionsMod.RequestedExecutionLevel
import typingsJapgolly.appBuilderLib.winOptionsMod.WindowsConfiguration
import typingsJapgolly.appBuilderLib.windowsCodeSignMod.CertificateFromStoreInfo
import typingsJapgolly.appBuilderLib.windowsCodeSignMod.CertificateInfo
import typingsJapgolly.appBuilderLib.windowsCodeSignMod.FileCodeSigningInfo
import typingsJapgolly.builderUtil.archMod.Arch
import typingsJapgolly.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/winPackager", JSImport.Namespace)
@js.native
object winPackagerMod extends js.Object {
  @js.native
  class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
    def this(info: Packager) = this()
    var _iconPath: js.Any = js.native
    val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
    val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    var doSign: js.Any = js.native
    val isForceCodeSigningVerification: Boolean = js.native
    var isSignDlls: js.Any = js.native
    val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
    val vm: Lazy[VmManager] = js.native
    def sign(file: String): js.Promise[Unit] = js.native
    def sign(file: String, logMessagePrefix: String): js.Promise[Unit] = js.native
    def signAndEditResources(file: String, arch: Arch, outDir: String): js.Promise[Unit] = js.native
    def signAndEditResources(file: String, arch: Arch, outDir: String, internalName: String): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: String,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: Null,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
  }
  
}


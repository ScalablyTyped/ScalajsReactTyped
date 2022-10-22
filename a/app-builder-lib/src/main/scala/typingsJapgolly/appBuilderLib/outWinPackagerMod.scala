package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.outCodeSignWindowsCodeSignMod.CertificateFromStoreInfo
import typingsJapgolly.appBuilderLib.outCodeSignWindowsCodeSignMod.CertificateInfo
import typingsJapgolly.appBuilderLib.outCodeSignWindowsCodeSignMod.FileCodeSigningInfo
import typingsJapgolly.appBuilderLib.outOptionsWinOptionsMod.RequestedExecutionLevel
import typingsJapgolly.appBuilderLib.outOptionsWinOptionsMod.WindowsConfiguration
import typingsJapgolly.appBuilderLib.outPackagerMod.Packager
import typingsJapgolly.appBuilderLib.outPlatformPackagerMod.PlatformPackager
import typingsJapgolly.appBuilderLib.outVmVmMod.VmManager
import typingsJapgolly.builderUtil.outArchMod.Arch
import typingsJapgolly.lazyVal.mod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outWinPackagerMod {
  
  @JSImport("app-builder-lib/out/winPackager", "WinPackager")
  @js.native
  open class WinPackager protected () extends PlatformPackager[WindowsConfiguration] {
    def this(info: Packager) = this()
    
    /* private */ var _iconPath: Any = js.native
    
    val computedPublisherName: Lazy[js.Array[String] | Null] = js.native
    
    val cscInfo: Lazy[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
    
    /* private */ var doSign: Any = js.native
    
    def isForceCodeSigningVerification: Boolean = js.native
    
    /* private */ var isSignDlls: Any = js.native
    
    val lazyCertInfo: Lazy[CertificateInfo | Null] = js.native
    
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
    def signAndEditResources(
      file: String,
      arch: Arch,
      outDir: String,
      internalName: Unit,
      requestedExecutionLevel: RequestedExecutionLevel
    ): js.Promise[Unit] = js.native
    
    val vm: Lazy[VmManager] = js.native
  }
}

package typingsJapgolly.appBuilderLib

import typingsJapgolly.appBuilderLib.electronOsxSignMod.SignOptions
import typingsJapgolly.appBuilderLib.macCodeSignMod.CodeSigningInfo
import typingsJapgolly.appBuilderLib.macCodeSignMod.Identity
import typingsJapgolly.appBuilderLib.macOptionsMod.MacConfiguration
import typingsJapgolly.appBuilderLib.packagerMod.Packager
import typingsJapgolly.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsJapgolly.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/macPackager", JSImport.Namespace)
@js.native
object macPackagerMod extends js.Object {
  @js.native
  trait MacPackager extends PlatformPackager[MacConfiguration] {
    var _iconPath: js.Any = js.native
    var adjustSignOptions: js.Any = js.native
    val codeSigningInfo: Lazy[CodeSigningInfo] = js.native
    var sign: js.Any = js.native
    def applyCommonInfo(appPlist: js.Any, contentsPath: String): js.Promise[Unit] = js.native
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity): js.Promise[_] = js.native
    /* protected */ def doFlat(appPath: String, outFile: String, identity: Identity, keychain: String): js.Promise[_] = js.native
    /* protected */ def doSign(opts: SignOptions): js.Promise[_] = js.native
  }
  
  @js.native
  class default protected () extends MacPackager {
    def this(info: Packager) = this()
  }
  
}


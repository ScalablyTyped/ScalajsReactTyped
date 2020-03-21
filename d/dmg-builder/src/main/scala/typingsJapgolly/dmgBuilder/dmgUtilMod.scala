package typingsJapgolly.dmgBuilder

import typingsJapgolly.appBuilderLib.macPackagerMod.default
import typingsJapgolly.appBuilderLib.mod.PlatformPackager
import typingsJapgolly.tempFile.mod.TmpDir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dmg-builder/out/dmgUtil", JSImport.Namespace)
@js.native
object dmgUtilMod extends js.Object {
  @js.native
  class DmgTarget protected ()
    extends typingsJapgolly.dmgBuilder.mod.DmgTarget {
    def this(packager: default, outDir: String) = this()
  }
  
  def attachAndExecute(dmgPath: String, readWrite: Boolean, task: js.Function0[js.Promise[_]]): js.Promise[_] = js.native
  def computeBackground(packager: PlatformPackager[_]): js.Promise[String] = js.native
  def detach(name: String): js.Promise[Unit] = js.native
  def getDmgTemplatePath(): String = js.native
  def getDmgVendorPath(): String = js.native
  def transformBackgroundFileIfNeed(file: String, tmpDir: TmpDir): js.Promise[String] = js.native
}


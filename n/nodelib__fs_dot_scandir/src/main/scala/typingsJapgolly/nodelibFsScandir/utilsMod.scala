package typingsJapgolly.nodelibFsScandir

import typingsJapgolly.nodelibFsScandir.typesMod.Dirent
import typingsJapgolly.nodelibFsScandir.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  object fs extends js.Object {
    def createDirentFromStats(name: String, stats: Stats): Dirent = js.native
  }
  
}


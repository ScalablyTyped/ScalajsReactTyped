package typingsJapgolly.openfin

import typingsJapgolly.openfin.baseMod.EmitterBase
import typingsJapgolly.openfin.identityMod.Identity
import typingsJapgolly.openfin.transportMod.default
import typingsJapgolly.openfin.webcontentsMod.WebContentsEventMapping
import typingsJapgolly.openfin.windowWindowMod.FindInPageOptions
import typingsJapgolly.openfin.windowWindowMod.PrintOptions
import typingsJapgolly.openfin.windowWindowMod.PrinterInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/webcontents/webcontents", JSImport.Namespace)
@js.native
object webcontentsWebcontentsMod extends js.Object {
  @js.native
  class WebContents[T /* <: WebContentsEventMapping[String, String] */] protected () extends EmitterBase[T] {
    def this(wire: default, identity: Identity, entityType: String) = this()
    var entityType: String = js.native
    def executeJavaScript(code: String): js.Promise[Unit] = js.native
    def findInPage(searchTerm: String): js.Promise[Unit] = js.native
    def findInPage(searchTerm: String, options: FindInPageOptions): js.Promise[Unit] = js.native
    def getPrinters(): js.Promise[PrinterInfo] = js.native
    def getZoomLevel(): js.Promise[Double] = js.native
    def navigate(url: String): js.Promise[Unit] = js.native
    def navigateBack(): js.Promise[Unit] = js.native
    def navigateForward(): js.Promise[Unit] = js.native
    def print(): js.Promise[Unit] = js.native
    def print(options: PrintOptions): js.Promise[Unit] = js.native
    def reload(): js.Promise[Unit] = js.native
    def reload(ignoreCache: Boolean): js.Promise[Unit] = js.native
    def setZoomLevel(level: Double): js.Promise[Unit] = js.native
    def stopFindInPage(action: String): js.Promise[Unit] = js.native
    def stopNavigation(): js.Promise[Unit] = js.native
  }
  
}


package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeLanguageserver.mod.Feature
import typingsJapgolly.vscodeLanguageserver.mod._RemoteWorkspace
import typingsJapgolly.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver/lib/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  @js.native
  trait Configuration extends js.Object {
    def getConfiguration(): Thenable[_] = js.native
    def getConfiguration(items: js.Array[ConfigurationItem]): Thenable[js.Array[_]] = js.native
    def getConfiguration(item: ConfigurationItem): Thenable[_] = js.native
    def getConfiguration(section: String): Thenable[_] = js.native
  }
  
  val ConfigurationFeature: Feature[_RemoteWorkspace, Configuration] = js.native
}


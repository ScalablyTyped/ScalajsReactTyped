package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.Feature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod._RemoteWorkspace
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotconfigurationMod.ConfigurationItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonConfigurationMod {
  
  @JSImport("vscode-languageserver/lib/common/configuration", "ConfigurationFeature")
  @js.native
  val ConfigurationFeature: Feature[_RemoteWorkspace, Configuration] = js.native
  
  @js.native
  trait Configuration extends StObject {
    
    def getConfiguration(): js.Promise[Any] = js.native
    def getConfiguration(items: js.Array[ConfigurationItem]): js.Promise[js.Array[Any]] = js.native
    def getConfiguration(item: ConfigurationItem): js.Promise[Any] = js.native
    def getConfiguration(section: String): js.Promise[Any] = js.native
  }
}

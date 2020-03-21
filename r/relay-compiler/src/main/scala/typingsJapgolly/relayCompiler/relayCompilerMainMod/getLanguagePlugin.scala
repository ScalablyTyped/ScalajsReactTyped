package typingsJapgolly.relayCompiler.relayCompilerMainMod

import typingsJapgolly.relayCompiler.relayLanguagePluginInterfaceMod.PluginInitializer
import typingsJapgolly.relayCompiler.relayLanguagePluginInterfaceMod.PluginInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/bin/RelayCompilerMain", "getLanguagePlugin")
@js.native
object getLanguagePlugin extends js.Object {
  def apply(language: String): PluginInterface = js.native
  def apply(language: PluginInitializer): PluginInterface = js.native
}


package typingsJapgolly.expoConfigPlugins.buildMod

import typingsJapgolly.expoConfigPlugins.buildUtilsErrorsMod.PluginErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/config-plugins/build", "PluginError")
@js.native
open class PluginError protected ()
  extends typingsJapgolly.expoConfigPlugins.buildUtilsErrorsMod.PluginError {
  def this(message: String, code: PluginErrorCode) = this()
  def this(message: String, code: PluginErrorCode, cause: js.Error) = this()
}

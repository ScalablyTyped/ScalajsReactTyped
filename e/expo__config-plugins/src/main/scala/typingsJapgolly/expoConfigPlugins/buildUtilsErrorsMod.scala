package typingsJapgolly.expoConfigPlugins

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsErrorsMod {
  
  @JSImport("@expo/config-plugins/build/utils/errors", "PluginError")
  @js.native
  open class PluginError protected ()
    extends StObject
       with Error {
    def this(message: String, code: PluginErrorCode) = this()
    def this(message: String, code: PluginErrorCode, cause: js.Error) = this()
    
    @JSName("cause")
    var cause_PluginError: js.UndefOr[js.Error] = js.native
    
    var code: PluginErrorCode = js.native
    
    val isPluginError: /* true */ Boolean = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@expo/config-plugins/build/utils/errors", "UnexpectedError")
  @js.native
  open class UnexpectedError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_PLUGIN_TYPE
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_PLUGIN_IMPORT
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.PLUGIN_NOT_FOUND
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.CONFLICTING_PROVIDER
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_MOD_ORDER
    - typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.MISSING_PROVIDER
  */
  trait PluginErrorCode extends StObject
  object PluginErrorCode {
    
    inline def CONFLICTING_PROVIDER: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.CONFLICTING_PROVIDER = "CONFLICTING_PROVIDER".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.CONFLICTING_PROVIDER]
    
    inline def INVALID_MOD_ORDER: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_MOD_ORDER = "INVALID_MOD_ORDER".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_MOD_ORDER]
    
    inline def INVALID_PLUGIN_IMPORT: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_PLUGIN_IMPORT = "INVALID_PLUGIN_IMPORT".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_PLUGIN_IMPORT]
    
    inline def INVALID_PLUGIN_TYPE: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_PLUGIN_TYPE = "INVALID_PLUGIN_TYPE".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.INVALID_PLUGIN_TYPE]
    
    inline def MISSING_PROVIDER: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.MISSING_PROVIDER = "MISSING_PROVIDER".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.MISSING_PROVIDER]
    
    inline def PLUGIN_NOT_FOUND: typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.PLUGIN_NOT_FOUND = "PLUGIN_NOT_FOUND".asInstanceOf[typingsJapgolly.expoConfigPlugins.expoConfigPluginsStrings.PLUGIN_NOT_FOUND]
  }
}

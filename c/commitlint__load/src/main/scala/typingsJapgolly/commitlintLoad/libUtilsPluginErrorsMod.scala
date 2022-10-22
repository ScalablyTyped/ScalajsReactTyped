package typingsJapgolly.commitlintLoad

import typingsJapgolly.std.Error
import typingsJapgolly.std.ErrorConstructor
import typingsJapgolly.std.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPluginErrorsMod {
  
  @JSImport("@commitlint/load/lib/utils/plugin-errors", "MissingPluginError")
  @js.native
  open class MissingPluginError ()
    extends StObject
       with Error {
    def this(pluginName: String) = this()
    def this(pluginName: String, errorMessage: String) = this()
    def this(pluginName: Unit, errorMessage: String) = this()
    def this(pluginName: String, errorMessage: String, data: Any) = this()
    def this(pluginName: String, errorMessage: Unit, data: Any) = this()
    def this(pluginName: Unit, errorMessage: String, data: Any) = this()
    def this(pluginName: Unit, errorMessage: Unit, data: Any) = this()
    
    /* standard es5 */
    def __proto__(): js.Error = js.native
    def __proto__(message: String): js.Error = js.native
    def __proto__(message: String, options: ErrorOptions): js.Error = js.native
    def __proto__(message: Unit, options: ErrorOptions): js.Error = js.native
    @JSName("__proto__")
    var __proto___Original: ErrorConstructor = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    var messageData: Any = js.native
    
    var messageTemplate: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@commitlint/load/lib/utils/plugin-errors", "WhitespacePluginError")
  @js.native
  open class WhitespacePluginError ()
    extends StObject
       with Error {
    def this(pluginName: String) = this()
    def this(pluginName: String, data: Any) = this()
    def this(pluginName: Unit, data: Any) = this()
    
    /* standard es5 */
    def __proto__(): js.Error = js.native
    def __proto__(message: String): js.Error = js.native
    def __proto__(message: String, options: ErrorOptions): js.Error = js.native
    def __proto__(message: Unit, options: ErrorOptions): js.Error = js.native
    @JSName("__proto__")
    var __proto___Original: ErrorConstructor = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    var messageData: Any = js.native
    
    var messageTemplate: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
}

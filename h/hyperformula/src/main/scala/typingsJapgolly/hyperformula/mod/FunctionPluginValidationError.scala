package typingsJapgolly.hyperformula.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hyperformula", "FunctionPluginValidationError")
@js.native
open class FunctionPluginValidationError ()
  extends typingsJapgolly.hyperformula.typingsErrorsMod.FunctionPluginValidationError
/* static members */
object FunctionPluginValidationError {
  
  @JSImport("hyperformula", "FunctionPluginValidationError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def functionMethodNotFound(functionName: String, pluginName: String): typingsJapgolly.hyperformula.typingsErrorsMod.FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionMethodNotFound")(functionName.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsErrorsMod.FunctionPluginValidationError]
  
  inline def functionNotDeclaredInPlugin(functionId: String, pluginName: String): typingsJapgolly.hyperformula.typingsErrorsMod.FunctionPluginValidationError = (^.asInstanceOf[js.Dynamic].applyDynamic("functionNotDeclaredInPlugin")(functionId.asInstanceOf[js.Any], pluginName.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hyperformula.typingsErrorsMod.FunctionPluginValidationError]
}

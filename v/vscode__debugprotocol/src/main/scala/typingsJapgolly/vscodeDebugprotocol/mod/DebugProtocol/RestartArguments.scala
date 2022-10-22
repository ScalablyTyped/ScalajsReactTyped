package typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `restart` request. */
trait RestartArguments extends StObject {
  
  /** The latest version of the `launch` or `attach` configuration. */
  var arguments: js.UndefOr[LaunchRequestArguments | AttachRequestArguments] = js.undefined
}
object RestartArguments {
  
  inline def apply(): RestartArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestartArguments]
  }
  
  extension [Self <: RestartArguments](x: Self) {
    
    inline def setArguments(value: LaunchRequestArguments | AttachRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}

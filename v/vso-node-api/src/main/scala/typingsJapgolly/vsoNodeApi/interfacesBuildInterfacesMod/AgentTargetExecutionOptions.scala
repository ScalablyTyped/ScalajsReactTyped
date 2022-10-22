package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentTargetExecutionOptions extends StObject {
  
  /**
    * Indicates the type of execution options.
    */
  var `type`: Double
}
object AgentTargetExecutionOptions {
  
  inline def apply(`type`: Double): AgentTargetExecutionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentTargetExecutionOptions]
  }
  
  extension [Self <: AgentTargetExecutionOptions](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

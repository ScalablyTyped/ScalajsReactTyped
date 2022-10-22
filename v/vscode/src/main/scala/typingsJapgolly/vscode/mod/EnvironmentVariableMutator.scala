package typingsJapgolly.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentVariableMutator extends StObject {
  
  /**
    * The type of mutation that will occur to the variable.
    */
  val `type`: EnvironmentVariableMutatorType
  
  /**
    * The value to use for the variable.
    */
  val value: String
}
object EnvironmentVariableMutator {
  
  inline def apply(`type`: EnvironmentVariableMutatorType, value: String): EnvironmentVariableMutator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentVariableMutator]
  }
  
  extension [Self <: EnvironmentVariableMutator](x: Self) {
    
    inline def setType(value: EnvironmentVariableMutatorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

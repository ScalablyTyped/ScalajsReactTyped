package typingsJapgolly.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecInfo extends StObject {
  
  /** The command line to be executed. */
  var command: String
}
object ExecInfo {
  
  inline def apply(command: String): ExecInfo = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecInfo]
  }
  
  extension [Self <: ExecInfo](x: Self) {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}

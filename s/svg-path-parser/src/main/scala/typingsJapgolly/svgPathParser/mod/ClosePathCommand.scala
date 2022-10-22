package typingsJapgolly.svgPathParser.mod

import typingsJapgolly.svgPathParser.svgPathParserStrings.Z
import typingsJapgolly.svgPathParser.svgPathParserStrings.closepath
import typingsJapgolly.svgPathParser.svgPathParserStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosePathCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_ClosePathCommand: z_ | Z
  
  @JSName("command")
  var command_ClosePathCommand: closepath
}
object ClosePathCommand {
  
  inline def apply(code: z_ | Z): ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "closepath")
    __obj.asInstanceOf[ClosePathCommand]
  }
  
  extension [Self <: ClosePathCommand](x: Self) {
    
    inline def setCode(value: z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: closepath): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}

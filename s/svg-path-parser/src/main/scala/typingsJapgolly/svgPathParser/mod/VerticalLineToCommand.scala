package typingsJapgolly.svgPathParser.mod

import typingsJapgolly.svgPathParser.svgPathParserStrings.V
import typingsJapgolly.svgPathParser.svgPathParserStrings.`vertical lineto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.v_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalLineToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_VerticalLineToCommand: v_ | V
  
  @JSName("command")
  var command_VerticalLineToCommand: `vertical lineto`
  
  var y: Double
}
object VerticalLineToCommand {
  
  inline def apply(code: v_ | V, y: Double): VerticalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "vertical lineto", y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerticalLineToCommand]
  }
  
  extension [Self <: VerticalLineToCommand](x: Self) {
    
    inline def setCode(value: v_ | V): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `vertical lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

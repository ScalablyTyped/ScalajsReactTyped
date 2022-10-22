package typingsJapgolly.svgPathParser.mod

import typingsJapgolly.svgPathParser.svgPathParserStrings.T
import typingsJapgolly.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.t_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmoothQuadraticCurveToCommand
  extends StObject
     with BaseCommand
     with Command {
  
  @JSName("code")
  var code_SmoothQuadraticCurveToCommand: t_ | T
  
  @JSName("command")
  var command_SmoothQuadraticCurveToCommand: `smooth quadratic curveto`
  
  var x: Double
  
  var y: Double
}
object SmoothQuadraticCurveToCommand {
  
  inline def apply(code: t_ | T, x: Double, y: Double): SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth quadratic curveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothQuadraticCurveToCommand]
  }
  
  extension [Self <: SmoothQuadraticCurveToCommand](x: Self) {
    
    inline def setCode(value: t_ | T): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `smooth quadratic curveto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

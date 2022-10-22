package typingsJapgolly.svgPathParser.mod

import typingsJapgolly.svgPathParser.svgPathParserBooleans.`false`
import typingsJapgolly.svgPathParser.svgPathParserStrings.H
import typingsJapgolly.svgPathParser.svgPathParserStrings.`horizontal lineto`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalLineToCommandMadeAbsolute
  extends StObject
     with BaseCommand
     with CommandMadeAbsolute {
  
  @JSName("code")
  var code_HorizontalLineToCommandMadeAbsolute: H
  
  @JSName("command")
  var command_HorizontalLineToCommandMadeAbsolute: `horizontal lineto`
  
  @JSName("relative")
  var relative_HorizontalLineToCommandMadeAbsolute: `false`
  
  var x: Double
  
  var x0: Double
  
  var y: Double
  
  var y0: Double
}
object HorizontalLineToCommandMadeAbsolute {
  
  inline def apply(x: Double, x0: Double, y: Double, y0: Double): HorizontalLineToCommandMadeAbsolute = {
    val __obj = js.Dynamic.literal(code = "H", command = "horizontal lineto", relative = false, x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalLineToCommandMadeAbsolute]
  }
  
  extension [Self <: HorizontalLineToCommandMadeAbsolute](x: Self) {
    
    inline def setCode(value: H): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: `horizontal lineto`): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: `false`): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
  }
}

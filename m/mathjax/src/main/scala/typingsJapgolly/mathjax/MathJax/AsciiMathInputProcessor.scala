package typingsJapgolly.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsciiMathInputProcessor extends StObject {
  
  /*This is the character to be used for decimal points in numbers. if you change this to ",", then you need to be
    * careful about entering points or intervals. E.g., use (1, 2) rather than (1,2) in that case.
    */
  var decimal: js.UndefOr[String] = js.undefined
  
  /*Determines whether operators like summation symbols will have their limits above and below the operators
    * (true) or to their right (false). The former is how they would appear in displayed equations that appear on
    * their own lines, while the latter is better suited to in-line equations so that they don’t interfere with the
    * line spacing so much.
    */
  var displaystyle: js.UndefOr[Boolean] = js.undefined
}
object AsciiMathInputProcessor {
  
  inline def apply(): AsciiMathInputProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsciiMathInputProcessor]
  }
  
  extension [Self <: AsciiMathInputProcessor](x: Self) {
    
    inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
    
    inline def setDisplaystyle(value: Boolean): Self = StObject.set(x, "displaystyle", value.asInstanceOf[js.Any])
    
    inline def setDisplaystyleUndefined: Self = StObject.set(x, "displaystyle", js.undefined)
  }
}

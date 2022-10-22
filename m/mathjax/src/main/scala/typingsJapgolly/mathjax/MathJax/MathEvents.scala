package typingsJapgolly.mathjax.MathJax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathEvents extends StObject {
  
  /*This value is the time (in milliseconds) that a user must hold the mouse still over a math element before it
    * is considered to be hovering over the math.
    */
  var hover: js.UndefOr[Double] = js.undefined
  
  /*This is a list of CSS declarations for styling the zoomed mathematics. See the definitions in
    * extensions/MathEvents.js for details of what are defined by default. See CSS Style Objects for details on how
    * to specify CSS style in a JavaScript object.
    */
  var styles: js.UndefOr[Any] = js.undefined
}
object MathEvents {
  
  inline def apply(): MathEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathEvents]
  }
  
  extension [Self <: MathEvents](x: Self) {
    
    inline def setHover(value: Double): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}

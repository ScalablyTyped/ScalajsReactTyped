package typingsJapgolly.protonNative.mod

import typingsJapgolly.protonNative.protonNativeStrings.evenodd
import typingsJapgolly.protonNative.protonNativeStrings.nonzero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaPathProps
  extends StObject
     with AreaBaseProps {
  
  /**
    * A string describing the path (uses SVG's path syntax, explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths).
    *
    * A warning is displayed whan an unimplemented shaped are used (Quadratic Beziers and Arcs).
    */
  var d: String
  
  /**
    * Sets the methods how to determine wheter to fill a path. Explanation @see https://developer.mozilla.org/en-US/docs/Web/SVG/Attribute/fill-rule.
    */
  var fillMode: nonzero | evenodd
}
object AreaPathProps {
  
  inline def apply(d: String, fillMode: nonzero | evenodd): AreaPathProps = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaPathProps]
  }
  
  extension [Self <: AreaPathProps](x: Self) {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setFillMode(value: nonzero | evenodd): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
  }
}

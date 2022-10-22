package typingsJapgolly.reactNativeSvg.anon

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.Array[Element]
  
  var gradient: js.Array[Double]
  
  var gradientTransform: js.Array[Double] | Null
  
  var gradientUnits: Double
  
  var name: String
}
object Children {
  
  inline def apply(children: js.Array[Element], gradient: js.Array[Double], gradientUnits: Double, name: String): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], gradientUnits = gradientUnits.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], gradientTransform = null)
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setGradient(value: js.Array[Double]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientTransform(value: js.Array[Double]): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setGradientTransformNull: Self = StObject.set(x, "gradientTransform", null)
    
    inline def setGradientTransformVarargs(value: Double*): Self = StObject.set(x, "gradientTransform", js.Array(value*))
    
    inline def setGradientUnits(value: Double): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    inline def setGradientVarargs(value: Double*): Self = StObject.set(x, "gradient", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

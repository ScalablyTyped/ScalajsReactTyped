package typingsJapgolly.jsClipper.ClipperLib

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExPolygon extends StObject {
  
  var holes: ArrayLike[ArrayLike[IntPoint]]
  
  var outer: ArrayLike[IntPoint]
}
object ExPolygon {
  
  inline def apply(holes: ArrayLike[ArrayLike[IntPoint]], outer: ArrayLike[IntPoint]): ExPolygon = {
    val __obj = js.Dynamic.literal(holes = holes.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExPolygon]
  }
  
  extension [Self <: ExPolygon](x: Self) {
    
    inline def setHoles(value: ArrayLike[ArrayLike[IntPoint]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    inline def setOuter(value: ArrayLike[IntPoint]): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
  }
}

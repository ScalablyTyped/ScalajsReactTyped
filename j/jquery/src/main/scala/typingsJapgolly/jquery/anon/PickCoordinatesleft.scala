package typingsJapgolly.jquery.anon

import typingsJapgolly.jquery.JQuery._CoordinatesPartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<jquery.JQuery.Coordinates, 'left'> */
trait PickCoordinatesleft
  extends StObject
     with _CoordinatesPartial {
  
  var left: Double
}
object PickCoordinatesleft {
  
  inline def apply(left: Double): PickCoordinatesleft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCoordinatesleft]
  }
  
  extension [Self <: PickCoordinatesleft](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
  }
}

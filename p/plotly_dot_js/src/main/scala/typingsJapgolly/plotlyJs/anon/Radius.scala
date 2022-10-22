package typingsJapgolly.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var radius: Double
}
object Radius {
  
  inline def apply(radius: Double): Radius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radius]
  }
  
  extension [Self <: Radius](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}

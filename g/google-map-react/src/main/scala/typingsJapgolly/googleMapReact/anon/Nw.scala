package typingsJapgolly.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nw extends StObject {
  
  var nw: typingsJapgolly.googleMapReact.mod.Coords
  
  var se: typingsJapgolly.googleMapReact.mod.Coords
}
object Nw {
  
  inline def apply(nw: typingsJapgolly.googleMapReact.mod.Coords, se: typingsJapgolly.googleMapReact.mod.Coords): Nw = {
    val __obj = js.Dynamic.literal(nw = nw.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nw]
  }
  
  extension [Self <: Nw](x: Self) {
    
    inline def setNw(value: typingsJapgolly.googleMapReact.mod.Coords): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
    
    inline def setSe(value: typingsJapgolly.googleMapReact.mod.Coords): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
  }
}

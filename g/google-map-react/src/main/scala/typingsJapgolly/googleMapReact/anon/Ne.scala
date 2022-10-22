package typingsJapgolly.googleMapReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ne extends StObject {
  
  @JSName("ne")
  var ne_FNe: typingsJapgolly.googleMapReact.mod.Coords
  
  var sw: typingsJapgolly.googleMapReact.mod.Coords
}
object Ne {
  
  inline def apply(ne_ : typingsJapgolly.googleMapReact.mod.Coords, sw: typingsJapgolly.googleMapReact.mod.Coords): Ne = {
    val __obj = js.Dynamic.literal(sw = sw.asInstanceOf[js.Any])
    __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ne]
  }
  
  extension [Self <: Ne](x: Self) {
    
    inline def setNe_(value: typingsJapgolly.googleMapReact.mod.Coords): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
    
    inline def setSw(value: typingsJapgolly.googleMapReact.mod.Coords): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
  }
}

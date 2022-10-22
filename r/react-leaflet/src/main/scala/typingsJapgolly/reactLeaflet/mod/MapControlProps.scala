package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.leaflet.mod.ControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapControlProps
  extends StObject
     with ControlOptions {
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}
object MapControlProps {
  
  inline def apply(): MapControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapControlProps]
  }
  
  extension [Self <: MapControlProps](x: Self) {
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
  }
}

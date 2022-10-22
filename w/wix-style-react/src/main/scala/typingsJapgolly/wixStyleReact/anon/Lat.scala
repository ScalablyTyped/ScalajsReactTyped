package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lat extends StObject {
  
  def lat(): Double
  
  def lng(): Double
}
object Lat {
  
  inline def apply(lat: CallbackTo[Double], lng: CallbackTo[Double]): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.toJsFn, lng = lng.toJsFn)
    __obj.asInstanceOf[Lat]
  }
  
  extension [Self <: Lat](x: Self) {
    
    inline def setLat(value: CallbackTo[Double]): Self = StObject.set(x, "lat", value.toJsFn)
    
    inline def setLng(value: CallbackTo[Double]): Self = StObject.set(x, "lng", value.toJsFn)
  }
}

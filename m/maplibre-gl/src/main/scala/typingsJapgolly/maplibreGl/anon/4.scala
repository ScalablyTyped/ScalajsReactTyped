package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  def cameraAnimation(map: Map): Map
}
object `4` {
  
  inline def apply(cameraAnimation: Map => Map): `4` = {
    val __obj = js.Dynamic.literal(cameraAnimation = js.Any.fromFunction1(cameraAnimation))
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setCameraAnimation(value: Map => Map): Self = StObject.set(x, "cameraAnimation", js.Any.fromFunction1(value))
  }
}

package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.mod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def cameraAnimation(map: Map): Unit
}
object `0` {
  
  inline def apply(cameraAnimation: Map => japgolly.scalajs.react.Callback): `0` = {
    val __obj = js.Dynamic.literal(cameraAnimation = js.Any.fromFunction1((t0: Map) => cameraAnimation(t0).runNow()))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setCameraAnimation(value: Map => japgolly.scalajs.react.Callback): Self = StObject.set(x, "cameraAnimation", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
  }
}

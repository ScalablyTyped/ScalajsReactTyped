package typingsJapgolly.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  /** 方向度数 */
  var direction: Double
}
object Direction {
  
  inline def apply(direction: Double): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}

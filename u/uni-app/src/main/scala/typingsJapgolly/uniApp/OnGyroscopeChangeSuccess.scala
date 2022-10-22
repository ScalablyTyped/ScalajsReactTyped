package typingsJapgolly.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGyroscopeChangeSuccess extends StObject {
  
  /**
    * x 轴方向角速度
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * y 轴方向角速度
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * z 轴方向角速度
    */
  var z: js.UndefOr[Double] = js.undefined
}
object OnGyroscopeChangeSuccess {
  
  inline def apply(): OnGyroscopeChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnGyroscopeChangeSuccess]
  }
  
  extension [Self <: OnGyroscopeChangeSuccess](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}

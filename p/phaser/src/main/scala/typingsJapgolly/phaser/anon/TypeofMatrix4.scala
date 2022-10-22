package typingsJapgolly.phaser.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMatrix4 extends StObject {
  
  /* static member */
  def initTemps(): Unit
  
  /* static member */
  var tmpMatrix: Any
  
  /* static member */
  var xAxis: Any
  
  /* static member */
  var yAxis: Any
  
  /* static member */
  var zAxis: Any
}
object TypeofMatrix4 {
  
  inline def apply(initTemps: Callback, tmpMatrix: Any, xAxis: Any, yAxis: Any, zAxis: Any): TypeofMatrix4 = {
    val __obj = js.Dynamic.literal(initTemps = initTemps.toJsFn, tmpMatrix = tmpMatrix.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any], zAxis = zAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMatrix4]
  }
  
  extension [Self <: TypeofMatrix4](x: Self) {
    
    inline def setInitTemps(value: Callback): Self = StObject.set(x, "initTemps", value.toJsFn)
    
    inline def setTmpMatrix(value: Any): Self = StObject.set(x, "tmpMatrix", value.asInstanceOf[js.Any])
    
    inline def setXAxis(value: Any): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: Any): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    inline def setZAxis(value: Any): Self = StObject.set(x, "zAxis", value.asInstanceOf[js.Any])
  }
}

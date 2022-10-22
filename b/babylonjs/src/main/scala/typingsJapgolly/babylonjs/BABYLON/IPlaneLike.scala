package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlaneLike extends StObject {
  
  var d: float
  
  var normal: IVector3Like
  
  def normalize(): Unit
}
object IPlaneLike {
  
  inline def apply(d: float, normal: IVector3Like, normalize: Callback): IPlaneLike = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalize = normalize.toJsFn)
    __obj.asInstanceOf[IPlaneLike]
  }
  
  extension [Self <: IPlaneLike](x: Self) {
    
    inline def setD(value: float): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: IVector3Like): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: Callback): Self = StObject.set(x, "normalize", value.toJsFn)
  }
}

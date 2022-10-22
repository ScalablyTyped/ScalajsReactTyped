package typingsJapgolly.waterline.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelInstance extends StObject {
  
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  var id: js.UndefOr[Double | String] = js.undefined
  
  def save(): WaterlinePromise[this.type]
  
  def toJSON(): Any
  
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object ModelInstance {
  
  inline def apply(save: CallbackTo[WaterlinePromise[ModelInstance]], toJSON: CallbackTo[Any]): ModelInstance = {
    val __obj = js.Dynamic.literal(save = save.toJsFn, toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[ModelInstance]
  }
  
  extension [Self <: ModelInstance](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSave(value: CallbackTo[WaterlinePromise[ModelInstance]]): Self = StObject.set(x, "save", value.toJsFn)
    
    inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}

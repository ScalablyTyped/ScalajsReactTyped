package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeTargetForBrowsing extends StObject {
  
  def Clone(): IObjectTypeTargetForBrowsing
  
  var TargetObjectType: Double
  
  var ViewCollection: Double
}
object IObjectTypeTargetForBrowsing {
  
  inline def apply(Clone: CallbackTo[IObjectTypeTargetForBrowsing], TargetObjectType: Double, ViewCollection: Double): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, TargetObjectType = TargetObjectType.asInstanceOf[js.Any], ViewCollection = ViewCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
  
  extension [Self <: IObjectTypeTargetForBrowsing](x: Self) {
    
    inline def setClone(value: CallbackTo[IObjectTypeTargetForBrowsing]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setTargetObjectType(value: Double): Self = StObject.set(x, "TargetObjectType", value.asInstanceOf[js.Any])
    
    inline def setViewCollection(value: Double): Self = StObject.set(x, "ViewCollection", value.asInstanceOf[js.Any])
  }
}

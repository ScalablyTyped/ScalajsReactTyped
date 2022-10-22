package typingsJapgolly.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkServicePoints
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var servicePoints: js.Array[IsGenerator]
}
object DictkServicePoints {
  
  inline def apply(servicePoints: js.Array[IsGenerator]): DictkServicePoints = {
    val __obj = js.Dynamic.literal(servicePoints = servicePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkServicePoints]
  }
  
  extension [Self <: DictkServicePoints](x: Self) {
    
    inline def setServicePoints(value: js.Array[IsGenerator]): Self = StObject.set(x, "servicePoints", value.asInstanceOf[js.Any])
    
    inline def setServicePointsVarargs(value: IsGenerator*): Self = StObject.set(x, "servicePoints", js.Array(value*))
  }
}

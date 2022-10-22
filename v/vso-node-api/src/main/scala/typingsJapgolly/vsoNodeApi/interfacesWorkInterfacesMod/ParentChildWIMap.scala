package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentChildWIMap extends StObject {
  
  var childWorkItemIds: js.Array[Double]
  
  var id: Double
  
  var title: String
}
object ParentChildWIMap {
  
  inline def apply(childWorkItemIds: js.Array[Double], id: Double, title: String): ParentChildWIMap = {
    val __obj = js.Dynamic.literal(childWorkItemIds = childWorkItemIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentChildWIMap]
  }
  
  extension [Self <: ParentChildWIMap](x: Self) {
    
    inline def setChildWorkItemIds(value: js.Array[Double]): Self = StObject.set(x, "childWorkItemIds", value.asInstanceOf[js.Any])
    
    inline def setChildWorkItemIdsVarargs(value: Double*): Self = StObject.set(x, "childWorkItemIds", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

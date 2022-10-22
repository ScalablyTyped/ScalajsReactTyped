package typingsJapgolly.winrtUwp.anon

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Resources.Core.ResourceMap
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstIMapView extends StObject {
  
  /** One half of the original map. */ var first: IMapView[String, ResourceMap]
  
  /** The second half of the original map. */ var second: IMapView[String, ResourceMap]
}
object FirstIMapView {
  
  inline def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): FirstIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstIMapView]
  }
  
  extension [Self <: FirstIMapView](x: Self) {
    
    inline def setFirst(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: IMapView[String, ResourceMap]): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.winrt.anon

import typingsJapgolly.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstIMapView extends StObject {
  
  var first: IMapView[String, ResourceMap]
  
  var second: IMapView[String, ResourceMap]
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

package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceEventMap extends StObject {
  
  /* standard dom */
  var resourcetimingbufferfull: org.scalajs.dom.Event
}
object PerformanceEventMap {
  
  inline def apply(resourcetimingbufferfull: org.scalajs.dom.Event): PerformanceEventMap = {
    val __obj = js.Dynamic.literal(resourcetimingbufferfull = resourcetimingbufferfull.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceEventMap]
  }
  
  extension [Self <: PerformanceEventMap](x: Self) {
    
    inline def setResourcetimingbufferfull(value: org.scalajs.dom.Event): Self = StObject.set(x, "resourcetimingbufferfull", value.asInstanceOf[js.Any])
  }
}

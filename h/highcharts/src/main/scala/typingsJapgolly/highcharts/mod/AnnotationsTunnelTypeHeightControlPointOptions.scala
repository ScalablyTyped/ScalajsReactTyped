package typingsJapgolly.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationsTunnelTypeHeightControlPointOptions extends StObject {
  
  var events: js.UndefOr[Any] = js.undefined
}
object AnnotationsTunnelTypeHeightControlPointOptions {
  
  inline def apply(): AnnotationsTunnelTypeHeightControlPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsTunnelTypeHeightControlPointOptions]
  }
  
  extension [Self <: AnnotationsTunnelTypeHeightControlPointOptions](x: Self) {
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}

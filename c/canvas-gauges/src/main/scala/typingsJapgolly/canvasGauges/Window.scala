package typingsJapgolly.canvasGauges

import typingsJapgolly.canvasGauges.CanvasGauges.BaseGauge
import typingsJapgolly.canvasGauges.CanvasGauges.LinearGauge
import typingsJapgolly.canvasGauges.CanvasGauges.RadialGauge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var BaseGauge: typingsJapgolly.canvasGauges.CanvasGauges.BaseGauge
  
  var LinearGauge: typingsJapgolly.canvasGauges.CanvasGauges.LinearGauge
  
  var RadialGauge: typingsJapgolly.canvasGauges.CanvasGauges.RadialGauge
}
object Window {
  
  inline def apply(BaseGauge: BaseGauge, LinearGauge: LinearGauge, RadialGauge: RadialGauge): Window = {
    val __obj = js.Dynamic.literal(BaseGauge = BaseGauge.asInstanceOf[js.Any], LinearGauge = LinearGauge.asInstanceOf[js.Any], RadialGauge = RadialGauge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setBaseGauge(value: BaseGauge): Self = StObject.set(x, "BaseGauge", value.asInstanceOf[js.Any])
    
    inline def setLinearGauge(value: LinearGauge): Self = StObject.set(x, "LinearGauge", value.asInstanceOf[js.Any])
    
    inline def setRadialGauge(value: RadialGauge): Self = StObject.set(x, "RadialGauge", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background_ extends StObject {
  
  var app: String
  
  var bar: String
  
  var content: String
  
  var critical: String
  
  var gridCellSize: Double
  
  var hoverable: String
  
  var negative: String
  
  var positive: String
  
  var warning: String
}
object Background_ {
  
  inline def apply(
    app: String,
    bar: String,
    content: String,
    critical: String,
    gridCellSize: Double,
    hoverable: String,
    negative: String,
    positive: String,
    warning: String
  ): Background_ = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], gridCellSize = gridCellSize.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background_]
  }
  
  extension [Self <: Background_](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setBar(value: String): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setCritical(value: String): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setGridCellSize(value: Double): Self = StObject.set(x, "gridCellSize", value.asInstanceOf[js.Any])
    
    inline def setHoverable(value: String): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    inline def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.anon.PartialFont
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.bottom
import typingsJapgolly.plotlyJs.plotlyJsStrings.center
import typingsJapgolly.plotlyJs.plotlyJsStrings.grouped
import typingsJapgolly.plotlyJs.plotlyJsStrings.h
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.middle
import typingsJapgolly.plotlyJs.plotlyJsStrings.normal
import typingsJapgolly.plotlyJs.plotlyJsStrings.reversed
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import typingsJapgolly.plotlyJs.plotlyJsStrings.top
import typingsJapgolly.plotlyJs.plotlyJsStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend
  extends StObject
     with Label {
  
  var borderwidth: Double
  
  var orientation: v | h
  
  var tracegroupgap: Double
  
  var traceorder: grouped | normal | reversed
  
  var x: Double
  
  var xanchor: auto | left | center | right
  
  var y: Double
  
  var yanchor: auto | top | middle | bottom
}
object Legend {
  
  inline def apply(
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    font: PartialFont,
    orientation: v | h,
    tracegroupgap: Double,
    traceorder: grouped | normal | reversed,
    x: Double,
    xanchor: auto | left | center | right,
    y: Double,
    yanchor: auto | top | middle | bottom
  ): Legend = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], tracegroupgap = tracegroupgap.asInstanceOf[js.Any], traceorder = traceorder.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xanchor = xanchor.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yanchor = yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  extension [Self <: Legend](x: Self) {
    
    inline def setBorderwidth(value: Double): Self = StObject.set(x, "borderwidth", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setTracegroupgap(value: Double): Self = StObject.set(x, "tracegroupgap", value.asInstanceOf[js.Any])
    
    inline def setTraceorder(value: grouped | normal | reversed): Self = StObject.set(x, "traceorder", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXanchor(value: auto | left | center | right): Self = StObject.set(x, "xanchor", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYanchor(value: auto | top | middle | bottom): Self = StObject.set(x, "yanchor", value.asInstanceOf[js.Any])
  }
}

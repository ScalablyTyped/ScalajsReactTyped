package typingsJapgolly.plotlyJs

import typingsJapgolly.plotlyJs.anon.ColorColor
import typingsJapgolly.plotlyJs.anon.Partialopacitynumbercolor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTracesScatterMod {
  
  trait ScatterSelectedMarker extends StObject {
    
    var marker: Partialopacitynumbercolor
    
    var textfont: ColorColor
  }
  object ScatterSelectedMarker {
    
    inline def apply(marker: Partialopacitynumbercolor, textfont: ColorColor): ScatterSelectedMarker = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], textfont = textfont.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterSelectedMarker]
    }
    
    extension [Self <: ScatterSelectedMarker](x: Self) {
      
      inline def setMarker(value: Partialopacitynumbercolor): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setTextfont(value: ColorColor): Self = StObject.set(x, "textfont", value.asInstanceOf[js.Any])
    }
  }
}

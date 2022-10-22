package typingsJapgolly.qrcodeSvg

import typingsJapgolly.qrcodeSvg.qrcodeSvgStrings.g
import typingsJapgolly.qrcodeSvg.qrcodeSvgStrings.none
import typingsJapgolly.qrcodeSvg.qrcodeSvgStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Container extends StObject {
    
    var container: svg | g | none
  }
  object Container {
    
    inline def apply(container: svg | g | none): Container = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[Container]
    }
    
    extension [Self <: Container](x: Self) {
      
      inline def setContainer(value: svg | g | none): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: String
    
    var mode: Double
    
    var parsedData: js.Array[Double]
  }
  object Data {
    
    inline def apply(data: String, mode: Double, parsedData: js.Array[Double]): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], parsedData = parsedData.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParsedData(value: js.Array[Double]): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
      
      inline def setParsedDataVarargs(value: Double*): Self = StObject.set(x, "parsedData", js.Array(value*))
    }
  }
}

package typingsJapgolly.arcgisRestApi.mod

import typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriPFS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureFillSymbol
  extends StObject
     with Symbol
     with PictureSourced {
  
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  
  @JSName("type")
  var type_PictureFillSymbol: esriPFS
  
  // if outline has been specified
  var xscale: js.UndefOr[Double] = js.undefined
  
  var yscale: js.UndefOr[Double] = js.undefined
}
object PictureFillSymbol {
  
  inline def apply(): PictureFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriPFS")
    __obj.asInstanceOf[PictureFillSymbol]
  }
  
  extension [Self <: PictureFillSymbol](x: Self) {
    
    inline def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setType(value: esriPFS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXscale(value: Double): Self = StObject.set(x, "xscale", value.asInstanceOf[js.Any])
    
    inline def setXscaleUndefined: Self = StObject.set(x, "xscale", js.undefined)
    
    inline def setYscale(value: Double): Self = StObject.set(x, "yscale", value.asInstanceOf[js.Any])
    
    inline def setYscaleUndefined: Self = StObject.set(x, "yscale", js.undefined)
  }
}

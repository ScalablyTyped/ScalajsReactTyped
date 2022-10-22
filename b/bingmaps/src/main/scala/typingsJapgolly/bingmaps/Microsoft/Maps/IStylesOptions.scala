package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStylesOptions extends StObject {
  
  /** Sets the options for all polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  
  /** Sets the options for all polylines. */
  var polylineOptions: js.UndefOr[IPolylineOptions] = js.undefined
  
  /** Sets the options for all pushpins. */
  var pushpinOptions: js.UndefOr[IPushpinOptions] = js.undefined
}
object IStylesOptions {
  
  inline def apply(): IStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStylesOptions]
  }
  
  extension [Self <: IStylesOptions](x: Self) {
    
    inline def setPolygonOptions(value: IPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    inline def setPolylineOptions(value: IPolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    inline def setPushpinOptions(value: IPushpinOptions): Self = StObject.set(x, "pushpinOptions", value.asInstanceOf[js.Any])
    
    inline def setPushpinOptionsUndefined: Self = StObject.set(x, "pushpinOptions", js.undefined)
  }
}

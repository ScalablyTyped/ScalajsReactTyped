package typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAxisViewWindowOptions extends StObject {
  
  /** The maximum numeric value to be shown in this view window. If unset, will automatically determine a maximum value that looks good for the data. */
  var viewWindowMax: js.UndefOr[Double] = js.undefined
  
  /** The minimum numeric value to be shown in this view window. If unset, will automatically determine a minimum value that looks good for the data. */
  var viewWindowMin: js.UndefOr[Double] = js.undefined
  
  /** The view window's mode. */
  var viewWindowMode: js.UndefOr[String] = js.undefined
}
object ChartAxisViewWindowOptions {
  
  inline def apply(): ChartAxisViewWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisViewWindowOptions]
  }
  
  extension [Self <: ChartAxisViewWindowOptions](x: Self) {
    
    inline def setViewWindowMax(value: Double): Self = StObject.set(x, "viewWindowMax", value.asInstanceOf[js.Any])
    
    inline def setViewWindowMaxUndefined: Self = StObject.set(x, "viewWindowMax", js.undefined)
    
    inline def setViewWindowMin(value: Double): Self = StObject.set(x, "viewWindowMin", value.asInstanceOf[js.Any])
    
    inline def setViewWindowMinUndefined: Self = StObject.set(x, "viewWindowMin", js.undefined)
    
    inline def setViewWindowMode(value: String): Self = StObject.set(x, "viewWindowMode", value.asInstanceOf[js.Any])
    
    inline def setViewWindowModeUndefined: Self = StObject.set(x, "viewWindowMode", js.undefined)
  }
}

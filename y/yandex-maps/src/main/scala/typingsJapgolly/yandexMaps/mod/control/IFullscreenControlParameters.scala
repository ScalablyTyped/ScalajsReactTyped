package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.anon.Expanded
import typingsJapgolly.yandexMaps.anon.IBaseButtonParametersOptiAdjustMapMargin
import typingsJapgolly.yandexMaps.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFullscreenControlParameters extends StObject {
  
  var data: js.UndefOr[Title] = js.undefined
  
  var options: js.UndefOr[IBaseButtonParametersOptiAdjustMapMargin] = js.undefined
  
  var state: js.UndefOr[Expanded] = js.undefined
}
object IFullscreenControlParameters {
  
  inline def apply(): IFullscreenControlParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFullscreenControlParameters]
  }
  
  extension [Self <: IFullscreenControlParameters](x: Self) {
    
    inline def setData(value: Title): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOptions(value: IBaseButtonParametersOptiAdjustMapMargin): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: Expanded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

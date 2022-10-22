package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.anon.Content
import typingsJapgolly.yandexMaps.anon.Enabled
import typingsJapgolly.yandexMaps.anon.IBaseButtonParametersOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IButtonParameters extends StObject {
  
  var data: js.UndefOr[Content] = js.undefined
  
  var options: js.UndefOr[IBaseButtonParametersOpti] = js.undefined
  
  var state: js.UndefOr[Enabled] = js.undefined
}
object IButtonParameters {
  
  inline def apply(): IButtonParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonParameters]
  }
  
  extension [Self <: IButtonParameters](x: Self) {
    
    inline def setData(value: Content): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setOptions(value: IBaseButtonParametersOpti): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setState(value: Enabled): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

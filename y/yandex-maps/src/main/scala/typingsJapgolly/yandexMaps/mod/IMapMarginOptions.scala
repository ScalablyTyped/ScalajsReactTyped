package typingsJapgolly.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMapMarginOptions extends StObject {
  
  var useMapMargin: js.UndefOr[Boolean] = js.undefined
}
object IMapMarginOptions {
  
  inline def apply(): IMapMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapMarginOptions]
  }
  
  extension [Self <: IMapMarginOptions](x: Self) {
    
    inline def setUseMapMargin(value: Boolean): Self = StObject.set(x, "useMapMargin", value.asInstanceOf[js.Any])
    
    inline def setUseMapMarginUndefined: Self = StObject.set(x, "useMapMargin", js.undefined)
  }
}

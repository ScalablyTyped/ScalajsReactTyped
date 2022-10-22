package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.common.charts.PaletteColorSet
import typingsJapgolly.devextreme.mod.DevExpress.common.charts.PaletteExtensionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseColorSet extends StObject {
  
  var baseColorSet: js.UndefOr[PaletteColorSet] = js.undefined
  
  var paletteExtensionMode: js.UndefOr[PaletteExtensionMode] = js.undefined
}
object BaseColorSet {
  
  inline def apply(): BaseColorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseColorSet]
  }
  
  extension [Self <: BaseColorSet](x: Self) {
    
    inline def setBaseColorSet(value: PaletteColorSet): Self = StObject.set(x, "baseColorSet", value.asInstanceOf[js.Any])
    
    inline def setBaseColorSetUndefined: Self = StObject.set(x, "baseColorSet", js.undefined)
    
    inline def setPaletteExtensionMode(value: PaletteExtensionMode): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    inline def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
  }
}

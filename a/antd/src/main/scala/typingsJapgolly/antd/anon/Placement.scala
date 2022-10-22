package typingsJapgolly.antd.anon

import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.DataPickerPlacement
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerLocale
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[PickerLocale] = js.undefined
  
  var placement: js.UndefOr[DataPickerPlacement] = js.undefined
  
  var size: js.UndefOr[SizeType] = js.undefined
  
  var status: js.UndefOr[InputStatus] = js.undefined
}
object Placement {
  
  inline def apply(): Placement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setLocale(value: PickerLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPlacement(value: DataPickerPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}

package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogElse
  extends StObject
     with ModalProps {
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  @JSName("onShow")
  var onShow_DialogElse: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DialogElse {
  
  inline def apply(): DialogElse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogElse]
  }
  
  extension [Self <: DialogElse](x: Self) {
    
    inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}

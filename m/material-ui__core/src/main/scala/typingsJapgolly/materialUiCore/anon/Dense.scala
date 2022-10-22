package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dense extends StObject {
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  var disablePadding: js.UndefOr[Boolean] = js.undefined
  
  var subheader: js.UndefOr[Element] = js.undefined
}
object Dense {
  
  inline def apply(): Dense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dense]
  }
  
  extension [Self <: Dense](x: Self) {
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
    
    inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
    
    inline def setSubheader(value: VdomElement): Self = StObject.set(x, "subheader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
  }
}

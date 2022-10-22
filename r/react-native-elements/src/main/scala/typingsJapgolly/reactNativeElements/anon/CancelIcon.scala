package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNativeElements.distIconsIconMod.IconNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelIcon extends StObject {
  
  var cancelIcon: js.UndefOr[IconNode] = js.undefined
}
object CancelIcon {
  
  inline def apply(): CancelIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelIcon]
  }
  
  extension [Self <: CancelIcon](x: Self) {
    
    inline def setCancelIcon(value: IconNode): Self = StObject.set(x, "cancelIcon", value.asInstanceOf[js.Any])
    
    inline def setCancelIconUndefined: Self = StObject.set(x, "cancelIcon", js.undefined)
    
    inline def setCancelIconVdomElement(value: VdomElement): Self = StObject.set(x, "cancelIcon", value.rawElement.asInstanceOf[js.Any])
  }
}

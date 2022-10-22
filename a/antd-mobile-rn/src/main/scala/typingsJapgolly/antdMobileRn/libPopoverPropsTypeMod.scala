package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverPropsTypeMod {
  
  trait PopoverPropsType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* node */ Any, /* index */ js.UndefOr[Double], Unit]] = js.undefined
    
    var overlay: Node
  }
  object PopoverPropsType {
    
    inline def apply(): PopoverPropsType = {
      val __obj = js.Dynamic.literal(overlay = null)
      __obj.asInstanceOf[PopoverPropsType]
    }
    
    extension [Self <: PopoverPropsType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnSelect(value: (/* node */ Any, /* index */ js.UndefOr[Double]) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* node */ Any, t1: /* index */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOverlay(value: VdomNode): Self = StObject.set(x, "overlay", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

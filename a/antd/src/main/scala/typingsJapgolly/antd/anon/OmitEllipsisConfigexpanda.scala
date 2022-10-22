package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd/lib/typography/Base.EllipsisConfig, 'expandable' | 'rows' | 'onExpand'> */
trait OmitEllipsisConfigexpanda extends StObject {
  
  var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var symbol: js.UndefOr[Node] = js.undefined
  
  var tooltip: js.UndefOr[Node | TooltipProps] = js.undefined
}
object OmitEllipsisConfigexpanda {
  
  inline def apply(): OmitEllipsisConfigexpanda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitEllipsisConfigexpanda]
  }
  
  extension [Self <: OmitEllipsisConfigexpanda](x: Self) {
    
    inline def setOnEllipsis(value: /* ellipsis */ Boolean => Callback): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1((t0: /* ellipsis */ Boolean) => value(t0).runNow()))
    
    inline def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSymbol(value: VdomNode): Self = StObject.set(x, "symbol", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSymbolNull: Self = StObject.set(x, "symbol", null)
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setSymbolVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "symbol", js.Array(value*))
    
    inline def setSymbolVdomElement(value: VdomElement): Self = StObject.set(x, "symbol", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Node | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipNull: Self = StObject.set(x, "tooltip", null)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTooltipVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tooltip", js.Array(value*))
    
    inline def setTooltipVdomElement(value: VdomElement): Self = StObject.set(x, "tooltip", value.rawElement.asInstanceOf[js.Any])
  }
}

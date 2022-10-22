package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.children
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.optionType
import typingsJapgolly.antDesignProUtils.esTypingMod.RequestOptionsType
import typingsJapgolly.react.mod.ReactText
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@ant-design/pro-utils.@ant-design/pro-utils/es/typing.RequestOptionsType, 'children' | 'optionType'> */
trait OmitRequestOptionsTypechi extends StObject {
  
  var label: js.UndefOr[Node] = js.undefined
  
  var options: js.UndefOr[js.Array[Omit[RequestOptionsType, children | optionType]]] = js.undefined
  
  var value: js.UndefOr[ReactText] = js.undefined
}
object OmitRequestOptionsTypechi {
  
  inline def apply(): OmitRequestOptionsTypechi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitRequestOptionsTypechi]
  }
  
  extension [Self <: OmitRequestOptionsTypechi](x: Self) {
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOptions(value: js.Array[Omit[RequestOptionsType, children | optionType]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: (Omit[RequestOptionsType, children | optionType])*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setValue(value: ReactText): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

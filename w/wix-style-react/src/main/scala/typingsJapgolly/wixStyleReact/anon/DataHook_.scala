package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.wixStyleReact.distTypesAddressInputItemMod.AddressInputItemLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHook_ extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var displayLabel: js.UndefOr[String] = js.undefined
  
  var id: String | Double
  
  var mainLabel: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  
  var optionLayout: js.UndefOr[AddressInputItemLayout] = js.undefined
  
  var prefix: js.UndefOr[Node] = js.undefined
  
  var secondaryLabel: js.UndefOr[String] = js.undefined
  
  var suffix: js.UndefOr[Node] = js.undefined
}
object DataHook_ {
  
  inline def apply(id: String | Double): DataHook_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHook_]
  }
  
  extension [Self <: DataHook_](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMainLabel(value: String): Self = StObject.set(x, "mainLabel", value.asInstanceOf[js.Any])
    
    inline def setMainLabelUndefined: Self = StObject.set(x, "mainLabel", js.undefined)
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOptionLayout(value: AddressInputItemLayout): Self = StObject.set(x, "optionLayout", value.asInstanceOf[js.Any])
    
    inline def setOptionLayoutUndefined: Self = StObject.set(x, "optionLayout", js.undefined)
    
    inline def setPrefix(value: VdomNode): Self = StObject.set(x, "prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setPrefixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "prefix", js.Array(value*))
    
    inline def setPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSecondaryLabel(value: String): Self = StObject.set(x, "secondaryLabel", value.asInstanceOf[js.Any])
    
    inline def setSecondaryLabelUndefined: Self = StObject.set(x, "secondaryLabel", js.undefined)
    
    inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSuffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
    
    inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
  }
}

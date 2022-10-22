package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.DataHook_
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAddressInputItemMod {
  
  @JSImport("wix-style-react/dist/types/AddressInputItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/AddressInputItem", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AddressInputItemProps, js.Object, Any]
  
  inline def addressInputItemBuilder(data: DataHook_): DropdownLayoutValueOption = ^.asInstanceOf[js.Dynamic].applyDynamic("addressInputItemBuilder")(data.asInstanceOf[js.Any]).asInstanceOf[DropdownLayoutValueOption]
  
  type AddressInputItem = PureComponent[AddressInputItemProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`single-line`
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`double-line`
  */
  trait AddressInputItemLayout extends StObject
  object AddressInputItemLayout {
    
    inline def `double-line`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`double-line` = "double-line".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`double-line`]
    
    inline def `single-line`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`single-line` = "single-line".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`single-line`]
  }
  
  trait AddressInputItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var highlighted: js.UndefOr[Boolean] = js.undefined
    
    var mainLabel: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var optionLayout: js.UndefOr[AddressInputItemLayout] = js.undefined
    
    var prefix: js.UndefOr[Node] = js.undefined
    
    var secondaryLabel: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var suffix: js.UndefOr[Node] = js.undefined
  }
  object AddressInputItemProps {
    
    inline def apply(): AddressInputItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddressInputItemProps]
    }
    
    extension [Self <: AddressInputItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
      
      inline def setHighlightedUndefined: Self = StObject.set(x, "highlighted", js.undefined)
      
      inline def setMainLabel(value: String): Self = StObject.set(x, "mainLabel", value.asInstanceOf[js.Any])
      
      inline def setMainLabelUndefined: Self = StObject.set(x, "mainLabel", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
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
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSuffix(value: VdomNode): Self = StObject.set(x, "suffix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

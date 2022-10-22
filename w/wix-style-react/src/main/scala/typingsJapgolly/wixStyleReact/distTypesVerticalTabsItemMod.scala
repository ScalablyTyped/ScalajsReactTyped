package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsItemMod {
  
  @JSImport("wix-style-react/dist/types/VerticalTabsItem", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[VerticalTabsItemProps, js.Object, Any]
  
  type VerticalTabsItem = PureComponent[VerticalTabsItemProps, js.Object, Any]
  
  trait VerticalTabsItemProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var prefixIcon: js.UndefOr[Element] = js.undefined
    
    var suffixIcon: js.UndefOr[Element] = js.undefined
    
    var `type`: js.UndefOr[VerticalTabsItemType] = js.undefined
  }
  object VerticalTabsItemProps {
    
    inline def apply(): VerticalTabsItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerticalTabsItemProps]
    }
    
    extension [Self <: VerticalTabsItemProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPrefixIcon(value: VdomElement): Self = StObject.set(x, "prefixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setSuffixIcon(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setType(value: VerticalTabsItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tab
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.action
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.title
  */
  trait VerticalTabsItemType extends StObject
  object VerticalTabsItemType {
    
    inline def action: typingsJapgolly.wixStyleReact.wixStyleReactStrings.action = "action".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.action]
    
    inline def tab: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tab = "tab".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tab]
    
    inline def title: typingsJapgolly.wixStyleReact.wixStyleReactStrings.title = "title".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.title]
  }
}

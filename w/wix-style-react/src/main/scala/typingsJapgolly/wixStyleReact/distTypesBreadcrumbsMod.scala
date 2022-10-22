package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsMod {
  
  @JSImport("wix-style-react/dist/types/Breadcrumbs", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[BreadcrumbsProps, js.Object, Any]
  
  type Breadcrumbs = PureComponent[BreadcrumbsProps, js.Object, Any]
  
  trait BreadcrumbsItem extends StObject {
    
    var customElement: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var link: js.UndefOr[String] = js.undefined
    
    var value: Node
  }
  object BreadcrumbsItem {
    
    inline def apply(id: String | Double): BreadcrumbsItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[BreadcrumbsItem]
    }
    
    extension [Self <: BreadcrumbsItem](x: Self) {
      
      inline def setCustomElement(value: Any): Self = StObject.set(x, "customElement", value.asInstanceOf[js.Any])
      
      inline def setCustomElementUndefined: Self = StObject.set(x, "customElement", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setValue(value: VdomNode): Self = StObject.set(x, "value", value.rawNode.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "value", js.Array(value*))
      
      inline def setValueVdomElement(value: VdomElement): Self = StObject.set(x, "value", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait BreadcrumbsProps extends StObject {
    
    var activeId: js.UndefOr[String | Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var itemMaxWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    var items: js.Array[BreadcrumbsItem]
    
    var onClick: js.UndefOr[js.Function1[/* item */ BreadcrumbsItem, Any]] = js.undefined
    
    var size: js.UndefOr[BreadcrumbsSize] = js.undefined
    
    var theme: js.UndefOr[BreadcrumbsTheme] = js.undefined
  }
  object BreadcrumbsProps {
    
    inline def apply(items: js.Array[BreadcrumbsItem]): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    extension [Self <: BreadcrumbsProps](x: Self) {
      
      inline def setActiveId(value: String | Double): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItemMaxWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "itemMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setItemMaxWidthUndefined: Self = StObject.set(x, "itemMaxWidth", js.undefined)
      
      inline def setItems(value: js.Array[BreadcrumbsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: BreadcrumbsItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnClick(value: /* item */ BreadcrumbsItem => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: BreadcrumbsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: BreadcrumbsTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait BreadcrumbsSize extends StObject
  object BreadcrumbsSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.onWhiteBackground
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.onGrayBackground
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.onDarkBackground
  */
  trait BreadcrumbsTheme extends StObject
  object BreadcrumbsTheme {
    
    inline def onDarkBackground: typingsJapgolly.wixStyleReact.wixStyleReactStrings.onDarkBackground = "onDarkBackground".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.onDarkBackground]
    
    inline def onGrayBackground: typingsJapgolly.wixStyleReact.wixStyleReactStrings.onGrayBackground = "onGrayBackground".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.onGrayBackground]
    
    inline def onWhiteBackground: typingsJapgolly.wixStyleReact.wixStyleReactStrings.onWhiteBackground = "onWhiteBackground".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.onWhiteBackground]
  }
}

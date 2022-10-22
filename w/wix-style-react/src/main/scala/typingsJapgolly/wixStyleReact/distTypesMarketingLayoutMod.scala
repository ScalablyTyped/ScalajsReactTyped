package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.stretch
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutMod {
  
  @JSImport("wix-style-react/dist/types/MarketingLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[MarketingLayoutProps, js.Object, Any]
  
  type MarketingLayout = PureComponent[MarketingLayoutProps, js.Object, Any]
  
  trait MarketingLayoutProps extends StObject {
    
    var actions: js.UndefOr[Node] = js.undefined
    
    var alignItems: js.UndefOr[center | stretch] = js.undefined
    
    var badge: js.UndefOr[Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[Node] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var hiddenBadge: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[Node] = js.undefined
    
    var imageBackgroundColor: js.UndefOr[String] = js.undefined
    
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[tiny | small | medium] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object MarketingLayoutProps {
    
    inline def apply(): MarketingLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketingLayoutProps]
    }
    
    extension [Self <: MarketingLayoutProps](x: Self) {
      
      inline def setActions(value: VdomNode): Self = StObject.set(x, "actions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActionsVdomElement(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAlignItems(value: center | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setBadge(value: VdomNode): Self = StObject.set(x, "badge", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBadgeNull: Self = StObject.set(x, "badge", null)
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setBadgeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "badge", js.Array(value*))
      
      inline def setBadgeVdomElement(value: VdomElement): Self = StObject.set(x, "badge", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setHiddenBadge(value: Boolean): Self = StObject.set(x, "hiddenBadge", value.asInstanceOf[js.Any])
      
      inline def setHiddenBadgeUndefined: Self = StObject.set(x, "hiddenBadge", js.undefined)
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageBackgroundColor(value: String): Self = StObject.set(x, "imageBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setImageBackgroundColorUndefined: Self = StObject.set(x, "imageBackgroundColor", js.undefined)
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setSize(value: tiny | small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

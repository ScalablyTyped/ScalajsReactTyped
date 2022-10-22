package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingPageLayoutContentMod {
  
  @JSImport("wix-style-react/dist/types/MarketingPageLayoutContent", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[MarketingPageLayoutContentProps, js.Object, Any]
  
  type MarketingPageLayoutContent = PureComponent[MarketingPageLayoutContentProps, js.Object, Any]
  
  trait MarketingPageLayoutContentProps extends StObject {
    
    var actions: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var overline: js.UndefOr[Node] = js.undefined
    
    var size: js.UndefOr[MarketingPageLayoutContentSize] = js.undefined
    
    var subtitle: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object MarketingPageLayoutContentProps {
    
    inline def apply(): MarketingPageLayoutContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketingPageLayoutContentProps]
    }
    
    extension [Self <: MarketingPageLayoutContentProps](x: Self) {
      
      inline def setActions(value: VdomNode): Self = StObject.set(x, "actions", value.rawNode.asInstanceOf[js.Any])
      
      inline def setActionsNull: Self = StObject.set(x, "actions", null)
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setActionsVdomElement(value: VdomElement): Self = StObject.set(x, "actions", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setOverline(value: VdomNode): Self = StObject.set(x, "overline", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOverlineNull: Self = StObject.set(x, "overline", null)
      
      inline def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
      
      inline def setOverlineVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overline", js.Array(value*))
      
      inline def setOverlineVdomElement(value: VdomElement): Self = StObject.set(x, "overline", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: MarketingPageLayoutContentSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSubtitle(value: VdomNode): Self = StObject.set(x, "subtitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setSubtitleVdomElement(value: VdomElement): Self = StObject.set(x, "subtitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait MarketingPageLayoutContentSize extends StObject
  object MarketingPageLayoutContentSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
  }
}

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

object distTypesMarketingPageLayoutMod {
  
  @JSImport("wix-style-react/dist/types/MarketingPageLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[MarketingPageLayoutProps, js.Object, Any]
  
  type MarketingPageLayout = PureComponent[MarketingPageLayoutProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait MarketingPageLayoutHorizontalSize extends StObject
  object MarketingPageLayoutHorizontalSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
  }
  
  trait MarketingPageLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[Node] = js.undefined
    
    var horizontalSize: js.UndefOr[MarketingPageLayoutHorizontalSize] = js.undefined
    
    var image: js.UndefOr[Node] = js.undefined
    
    var removeImageHorizontalPadding: js.UndefOr[Boolean] = js.undefined
    
    var removeImageVerticalPadding: js.UndefOr[Boolean] = js.undefined
    
    var verticalSize: js.UndefOr[MarketingPageLayoutVerticalSize] = js.undefined
  }
  object MarketingPageLayoutProps {
    
    inline def apply(): MarketingPageLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarketingPageLayoutProps]
    }
    
    extension [Self <: MarketingPageLayoutProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHorizontalSize(value: MarketingPageLayoutHorizontalSize): Self = StObject.set(x, "horizontalSize", value.asInstanceOf[js.Any])
      
      inline def setHorizontalSizeUndefined: Self = StObject.set(x, "horizontalSize", js.undefined)
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRemoveImageHorizontalPadding(value: Boolean): Self = StObject.set(x, "removeImageHorizontalPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveImageHorizontalPaddingUndefined: Self = StObject.set(x, "removeImageHorizontalPadding", js.undefined)
      
      inline def setRemoveImageVerticalPadding(value: Boolean): Self = StObject.set(x, "removeImageVerticalPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveImageVerticalPaddingUndefined: Self = StObject.set(x, "removeImageVerticalPadding", js.undefined)
      
      inline def setVerticalSize(value: MarketingPageLayoutVerticalSize): Self = StObject.set(x, "verticalSize", value.asInstanceOf[js.Any])
      
      inline def setVerticalSizeUndefined: Self = StObject.set(x, "verticalSize", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
  */
  trait MarketingPageLayoutVerticalSize extends StObject
  object MarketingPageLayoutVerticalSize {
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
  }
}

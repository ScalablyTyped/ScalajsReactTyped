package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesMarketingPageLayoutMod.MarketingPageLayoutHorizontalSize
import typingsJapgolly.wixStyleReact.distTypesMarketingPageLayoutMod.MarketingPageLayoutProps
import typingsJapgolly.wixStyleReact.distTypesMarketingPageLayoutMod.MarketingPageLayoutVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarketingPageLayout {
  
  @JSImport("wix-style-react", "MarketingPageLayout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.MarketingPageLayout] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def horizontalSize(value: MarketingPageLayoutHorizontalSize): this.type = set("horizontalSize", value.asInstanceOf[js.Any])
    
    inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def removeImageHorizontalPadding(value: Boolean): this.type = set("removeImageHorizontalPadding", value.asInstanceOf[js.Any])
    
    inline def removeImageVerticalPadding(value: Boolean): this.type = set("removeImageVerticalPadding", value.asInstanceOf[js.Any])
    
    inline def verticalSize(value: MarketingPageLayoutVerticalSize): this.type = set("verticalSize", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MarketingPageLayout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarketingPageLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

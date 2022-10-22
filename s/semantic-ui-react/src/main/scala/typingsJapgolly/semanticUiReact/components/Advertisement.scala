package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsViewsAdvertisementAdvertisementMod.AdvertisementProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`half banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`half page`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`large leaderboard`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`large rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`medium rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`mobile banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`mobile leaderboard`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small button`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`small square`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`square button`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`top banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`vertical banner`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`vertical rectangle`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.`wide skyscraper`
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.banner
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.billboard
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.button
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.leaderboard
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.netboard
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.panorama
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.skyscraper
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Advertisement {
  
  inline def apply(
    unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
  ): Builder = {
    val __props = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AdvertisementProps]))
  }
  
  @JSImport("semantic-ui-react", "Advertisement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def centered(value: Boolean): this.type = set("centered", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def test(value: Boolean | String | Double): this.type = set("test", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AdvertisementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.semanticUiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.FC
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
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

object distCommonjsViewsAdvertisementAdvertisementMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Advertisement/Advertisement", JSImport.Default)
  @js.native
  val default: FC[AdvertisementProps] = js.native
  
  trait AdvertisementProps
    extends StObject
       with StrictAdvertisementProps
       with /* key */ StringDictionary[Any]
  object AdvertisementProps {
    
    inline def apply(
      unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
    ): AdvertisementProps = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvertisementProps]
    }
  }
  
  trait StrictAdvertisementProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** Center the advertisement. */
    var centered: js.UndefOr[Boolean] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** Text to be displayed on the advertisement. */
    var test: js.UndefOr[Boolean | String | Double] = js.undefined
    
    /** Varies the size of the advertisement. */
    var unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
  }
  object StrictAdvertisementProps {
    
    inline def apply(
      unit: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
    ): StrictAdvertisementProps = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictAdvertisementProps]
    }
    
    extension [Self <: StrictAdvertisementProps](x: Self) {
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTest(value: Boolean | String | Double): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setUnit(
        value: (`medium rectangle`) | (`large rectangle`) | (`vertical rectangle`) | (`small rectangle`) | (`mobile banner`) | banner | (`vertical banner`) | (`top banner`) | (`half banner`) | button | (`square button`) | (`small button`) | skyscraper | (`wide skyscraper`) | leaderboard | (`large leaderboard`) | (`mobile leaderboard`) | billboard | panorama | netboard | (`half page`) | square | (`small square`)
      ): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[AdvertisementProps]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsViewsAdvertisementAdvertisementMod.foo` */
  override def _to: FC[AdvertisementProps] = default
}

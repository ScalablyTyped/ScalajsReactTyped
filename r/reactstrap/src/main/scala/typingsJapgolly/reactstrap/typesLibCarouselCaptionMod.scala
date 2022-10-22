package typingsJapgolly.reactstrap

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCarouselCaptionMod {
  
  @JSImport("reactstrap/types/lib/CarouselCaption", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselCaptionProps, js.Object, Any]
  
  type CarouselCaption = japgolly.scalajs.react.facade.React.Component[CarouselCaptionProps & js.Object, js.Object]
  
  trait CarouselCaptionProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var captionHeader: js.UndefOr[Node] = js.undefined
    
    var captionText: Node
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
  }
  object CarouselCaptionProps {
    
    inline def apply(): CarouselCaptionProps = {
      val __obj = js.Dynamic.literal(captionText = null)
      __obj.asInstanceOf[CarouselCaptionProps]
    }
    
    extension [Self <: CarouselCaptionProps](x: Self) {
      
      inline def setCaptionHeader(value: VdomNode): Self = StObject.set(x, "captionHeader", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCaptionHeaderNull: Self = StObject.set(x, "captionHeader", null)
      
      inline def setCaptionHeaderUndefined: Self = StObject.set(x, "captionHeader", js.undefined)
      
      inline def setCaptionHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "captionHeader", js.Array(value*))
      
      inline def setCaptionHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "captionHeader", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCaptionText(value: VdomNode): Self = StObject.set(x, "captionText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCaptionTextNull: Self = StObject.set(x, "captionText", null)
      
      inline def setCaptionTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "captionText", js.Array(value*))
      
      inline def setCaptionTextVdomElement(value: VdomElement): Self = StObject.set(x, "captionText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
    }
  }
}

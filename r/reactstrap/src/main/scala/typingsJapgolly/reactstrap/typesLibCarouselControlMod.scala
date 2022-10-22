package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.reactstrapStrings.next
import typingsJapgolly.reactstrap.reactstrapStrings.prev
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCarouselControlMod {
  
  @JSImport("reactstrap/types/lib/CarouselControl", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselControlProps, js.Object, Any]
  
  type CarouselControl = japgolly.scalajs.react.facade.React.Component[CarouselControlProps & js.Object, js.Object]
  
  trait CarouselControlProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var direction: prev | next
    
    var directionText: js.UndefOr[String] = js.undefined
    
    def onClickHandler(): Unit
  }
  object CarouselControlProps {
    
    inline def apply(direction: prev | next, onClickHandler: Callback): CarouselControlProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onClickHandler = onClickHandler.toJsFn)
      __obj.asInstanceOf[CarouselControlProps]
    }
    
    extension [Self <: CarouselControlProps](x: Self) {
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setDirection(value: prev | next): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionText(value: String): Self = StObject.set(x, "directionText", value.asInstanceOf[js.Any])
      
      inline def setDirectionTextUndefined: Self = StObject.set(x, "directionText", js.undefined)
      
      inline def setOnClickHandler(value: Callback): Self = StObject.set(x, "onClickHandler", value.toJsFn)
    }
  }
}

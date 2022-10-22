package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibCarouselIndicatorsMod {
  
  @JSImport("reactstrap/types/lib/CarouselIndicators", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselIndicatorsProps, js.Object, Any]
  
  type CarouselIndicators = japgolly.scalajs.react.facade.React.Component[CarouselIndicatorsProps & js.Object, js.Object]
  
  trait CarouselIndicatorsProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var activeIndex: Double
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var items: js.Array[js.Object]
    
    def onClickHandler(idx: Double): Unit
  }
  object CarouselIndicatorsProps {
    
    inline def apply(activeIndex: Double, items: js.Array[js.Object], onClickHandler: Double => Callback): CarouselIndicatorsProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onClickHandler = js.Any.fromFunction1((t0: Double) => onClickHandler(t0).runNow()))
      __obj.asInstanceOf[CarouselIndicatorsProps]
    }
    
    extension [Self <: CarouselIndicatorsProps](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnClickHandler(value: Double => Callback): Self = StObject.set(x, "onClickHandler", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
}

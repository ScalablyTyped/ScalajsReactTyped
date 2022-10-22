package typingsJapgolly.reactAliceCarousel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactAliceCarousel.anon.IsActive
import typingsJapgolly.reactAliceCarousel.libTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsDotsNavigationMod {
  
  @JSImport("react-alice-carousel/lib/views/DotsNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DotsNavigation(hasStateOnClickOnMouseEnterOnMouseLeaveControlsStrategyRenderDotsItem: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DotsNavigation")(hasStateOnClickOnMouseEnterOnMouseLeaveControlsStrategyRenderDotsItem.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var controlsStrategy: js.UndefOr[String] = js.undefined
    
    def onClick(index: Double): Unit
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[org.scalajs.dom.Element]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[org.scalajs.dom.Element]] = js.undefined
    
    var renderDotsItem: js.UndefOr[js.Function1[/* hasIsActiveActiveIndex */ IsActive, Any]] = js.undefined
    
    var state: State
  }
  object Props {
    
    inline def apply(onClick: Double => Callback, state: State): Props = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: Double) => onClick(t0).runNow()), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setControlsStrategy(value: String): Self = StObject.set(x, "controlsStrategy", value.asInstanceOf[js.Any])
      
      inline def setControlsStrategyUndefined: Self = StObject.set(x, "controlsStrategy", js.undefined)
      
      inline def setOnClick(value: Double => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[org.scalajs.dom.Element & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setRenderDotsItem(value: /* hasIsActiveActiveIndex */ IsActive => Any): Self = StObject.set(x, "renderDotsItem", js.Any.fromFunction1(value))
      
      inline def setRenderDotsItemUndefined: Self = StObject.set(x, "renderDotsItem", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}

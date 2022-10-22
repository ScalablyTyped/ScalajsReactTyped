package typingsJapgolly.reactAliceCarousel

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactAliceCarousel.anon.IsDisabled
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.next
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewsPrevNextButtonMod {
  
  @JSImport("react-alice-carousel/lib/views/PrevNextButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def PrevNextButton(hasNameIsDisabledOnClickRenderPrevButtonRenderNextButton: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PrevNextButton")(hasNameIsDisabledOnClickRenderPrevButtonRenderNextButton.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var isDisabled: Boolean
    
    var name: prev | next
    
    def onClick(e: Any): Unit
    
    var renderNextButton: js.UndefOr[js.Function1[/* hasIsDisabled */ IsDisabled, Any]] = js.undefined
    
    var renderPrevButton: js.UndefOr[js.Function1[/* hasIsDisabled */ IsDisabled, Any]] = js.undefined
  }
  object Props {
    
    inline def apply(isDisabled: Boolean, name: prev | next, onClick: Any => Callback): Props = {
      val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setName(value: prev | next): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRenderNextButton(value: /* hasIsDisabled */ IsDisabled => Any): Self = StObject.set(x, "renderNextButton", js.Any.fromFunction1(value))
      
      inline def setRenderNextButtonUndefined: Self = StObject.set(x, "renderNextButton", js.undefined)
      
      inline def setRenderPrevButton(value: /* hasIsDisabled */ IsDisabled => Any): Self = StObject.set(x, "renderPrevButton", js.Any.fromFunction1(value))
      
      inline def setRenderPrevButtonUndefined: Self = StObject.set(x, "renderPrevButton", js.undefined)
    }
  }
}

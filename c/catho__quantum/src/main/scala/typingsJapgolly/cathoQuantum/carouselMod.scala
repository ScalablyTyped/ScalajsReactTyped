package typingsJapgolly.cathoQuantum

import typingsJapgolly.cathoQuantum.anon.BaseFontSizeBreakpoints
import typingsJapgolly.cathoQuantum.anon.Description
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("@catho/quantum/Carousel", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CarouselProps, js.Object, Any]
  
  type Carousel = japgolly.scalajs.react.facade.React.Component[CarouselProps & js.Object, js.Object]
  
  trait CarouselProps extends StObject {
    
    var arrowColor: js.UndefOr[primary | success | error | neutral | warning] = js.undefined
    
    var cardSize: js.UndefOr[small | medium | large] = js.undefined
    
    var cards: NonEmptyArray[Description]
    
    var dotsPagination: js.UndefOr[Boolean] = js.undefined
    
    var slidesToScroll: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeBreakpoints] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(cards: NonEmptyArray[Description]): CarouselProps = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setArrowColor(value: primary | success | error | neutral | warning): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
      
      inline def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
      
      inline def setCardSize(value: small | medium | large): Self = StObject.set(x, "cardSize", value.asInstanceOf[js.Any])
      
      inline def setCardSizeUndefined: Self = StObject.set(x, "cardSize", js.undefined)
      
      inline def setCards(value: NonEmptyArray[Description]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setDotsPagination(value: Boolean): Self = StObject.set(x, "dotsPagination", value.asInstanceOf[js.Any])
      
      inline def setDotsPaginationUndefined: Self = StObject.set(x, "dotsPagination", js.undefined)
      
      inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTheme(value: BaseFontSizeBreakpoints): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type NonEmptyArray[T] = Array[T]
}

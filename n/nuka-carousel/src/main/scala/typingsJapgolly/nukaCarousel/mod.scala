package typingsJapgolly.nukaCarousel

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.nukaCarousel.libTypesMod.CarouselProps
import typingsJapgolly.nukaCarousel.libTypesMod.ControlProps
import typingsJapgolly.nukaCarousel.libTypesMod.InternalCarouselProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nuka-carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(rawProps: CarouselProps): Element = ^.asInstanceOf[js.Dynamic].apply(rawProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("nuka-carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nuka-carousel", "default.defaultProps")
    @js.native
    def defaultProps: InternalCarouselProps = js.native
    inline def defaultProps_=(x: InternalCarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nuka-carousel", "Alignment")
  @js.native
  object Alignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.nukaCarousel.libTypesMod.Alignment & String] = js.native
    
    /* "center" */ val Center: typingsJapgolly.nukaCarousel.libTypesMod.Alignment.Center & String = js.native
    
    /* "left" */ val Left: typingsJapgolly.nukaCarousel.libTypesMod.Alignment.Left & String = js.native
    
    /* "right" */ val Right: typingsJapgolly.nukaCarousel.libTypesMod.Alignment.Right & String = js.native
  }
  
  @JSImport("nuka-carousel", "Directions")
  @js.native
  object Directions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.nukaCarousel.libTypesMod.Directions & String] = js.native
    
    /* "down" */ val Down: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Down & String = js.native
    
    /* "next" */ val Next: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Next & String = js.native
    
    /* "prev" */ val Prev: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Prev & String = js.native
    
    /* "up" */ val Up: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Up & String = js.native
  }
  
  inline def NextButton(
    hasNextSlideHasNextButtonClassNameNextButtonStyleNextButtonTextNextButtonOnClickDisabledOnUserNavigation: ControlProps
  ): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NextButton")(hasNextSlideHasNextButtonClassNameNextButtonStyleNextButtonTextNextButtonOnClickDisabledOnUserNavigation.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  inline def PagingDots(
    hasPagingDotsIndicesHasPagingDotsContainerClassNamePagingDotsClassNamePagingDotsStylePagingDotsOnClickCurrentSlideOnUserNavigationSlideCountGoToSlide: ControlProps
  ): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PagingDots")(hasPagingDotsIndicesHasPagingDotsContainerClassNamePagingDotsClassNamePagingDotsStylePagingDotsOnClickCurrentSlideOnUserNavigationSlideCountGoToSlide.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  @JSImport("nuka-carousel", "Positions")
  @js.native
  object Positions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.nukaCarousel.libTypesMod.Positions & String] = js.native
    
    /* "BottomCenter" */ val BottomCenter: typingsJapgolly.nukaCarousel.libTypesMod.Positions.BottomCenter & String = js.native
    
    /* "BottomLeft" */ val BottomLeft: typingsJapgolly.nukaCarousel.libTypesMod.Positions.BottomLeft & String = js.native
    
    /* "BottomRight" */ val BottomRight: typingsJapgolly.nukaCarousel.libTypesMod.Positions.BottomRight & String = js.native
    
    /* "CenterCenter" */ val CenterCenter: typingsJapgolly.nukaCarousel.libTypesMod.Positions.CenterCenter & String = js.native
    
    /* "CenterLeft" */ val CenterLeft: typingsJapgolly.nukaCarousel.libTypesMod.Positions.CenterLeft & String = js.native
    
    /* "CenterRight" */ val CenterRight: typingsJapgolly.nukaCarousel.libTypesMod.Positions.CenterRight & String = js.native
    
    /* "TopCenter" */ val TopCenter: typingsJapgolly.nukaCarousel.libTypesMod.Positions.TopCenter & String = js.native
    
    /* "TopLeft" */ val TopLeft: typingsJapgolly.nukaCarousel.libTypesMod.Positions.TopLeft & String = js.native
    
    /* "TopRight" */ val TopRight: typingsJapgolly.nukaCarousel.libTypesMod.Positions.TopRight & String = js.native
  }
  
  inline def PreviousButton(
    hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled: ControlProps
  ): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PreviousButton")(hasPreviousSlideHasPrevButtonClassNamePrevButtonStylePrevButtonTextPrevButtonOnClickOnUserNavigationDisabled.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  @JSImport("nuka-carousel", "ScrollMode")
  @js.native
  object ScrollMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode & String] = js.native
    
    /* "page" */ val page: typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode.page & String = js.native
    
    /* "remainder" */ val remainder: typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode.remainder & String = js.native
  }
}

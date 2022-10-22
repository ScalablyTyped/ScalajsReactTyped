package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.HeightType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.WidthType
import typingsJapgolly.grommet.grommetStrings.arrows
import typingsJapgolly.grommet.grommetStrings.selectors
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsCarouselMod {
  
  @JSImport("grommet/es6/components/Carousel", "Carousel")
  @js.native
  val Carousel: FC[CarouselExtendedProps] = js.native
  
  trait CarouselExtendedProps
    extends StObject
       with CarouselProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object CarouselExtendedProps {
    
    inline def apply(): CarouselExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselExtendedProps]
    }
  }
  
  trait CarouselProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var activeChild: js.UndefOr[Double] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var controls: js.UndefOr[Boolean | arrows | selectors] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var height: js.UndefOr[HeightType] = js.undefined
    
    var initialChild: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onChild: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var play: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[WidthType] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setActiveChild(value: Double): Self = StObject.set(x, "activeChild", value.asInstanceOf[js.Any])
      
      inline def setActiveChildUndefined: Self = StObject.set(x, "activeChild", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setControls(value: Boolean | arrows | selectors): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHeight(value: HeightType): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialChild(value: Double): Self = StObject.set(x, "initialChild", value.asInstanceOf[js.Any])
      
      inline def setInitialChildUndefined: Self = StObject.set(x, "initialChild", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnChild(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onChild", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setOnChildUndefined: Self = StObject.set(x, "onChild", js.undefined)
      
      inline def setPlay(value: Double): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      inline def setWidth(value: WidthType): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type divType = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}

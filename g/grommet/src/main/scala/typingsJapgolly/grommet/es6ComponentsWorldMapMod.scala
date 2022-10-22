package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import typingsJapgolly.grommet.anon.Content
import typingsJapgolly.grommet.anon.Dark
import typingsJapgolly.grommet.anon.Name
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsWorldMapMod {
  
  @JSImport("grommet/es6/components/WorldMap", "WorldMap")
  @js.native
  val WorldMap: FC[WorldMapExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.SVGProps<std.SVGSVGElement>, 'color' | 'fill'> ]: react.react.SVGProps<std.SVGSVGElement>[P]} */ trait WorldMapExtendedProps
    extends StObject
       with WorldMapProps
  object WorldMapExtendedProps {
    
    inline def apply(): WorldMapExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorldMapExtendedProps]
    }
  }
  
  trait WorldMapProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var continents: js.UndefOr[js.Array[Name]] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var hoverColor: js.UndefOr[String | Dark] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onSelectPlace: js.UndefOr[js.Function1[/* place */ js.Tuple2[Double, Double], Unit]] = js.undefined
    
    var places: js.UndefOr[js.Array[Content]] = js.undefined
  }
  object WorldMapProps {
    
    inline def apply(): WorldMapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorldMapProps]
    }
    
    extension [Self <: WorldMapProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContinents(value: js.Array[Name]): Self = StObject.set(x, "continents", value.asInstanceOf[js.Any])
      
      inline def setContinentsUndefined: Self = StObject.set(x, "continents", js.undefined)
      
      inline def setContinentsVarargs(value: Name*): Self = StObject.set(x, "continents", js.Array(value*))
      
      inline def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHoverColor(value: String | Dark): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnSelectPlace(value: /* place */ js.Tuple2[Double, Double] => Callback): Self = StObject.set(x, "onSelectPlace", js.Any.fromFunction1((t0: /* place */ js.Tuple2[Double, Double]) => value(t0).runNow()))
      
      inline def setOnSelectPlaceUndefined: Self = StObject.set(x, "onSelectPlace", js.undefined)
      
      inline def setPlaces(value: js.Array[Content]): Self = StObject.set(x, "places", value.asInstanceOf[js.Any])
      
      inline def setPlacesUndefined: Self = StObject.set(x, "places", js.undefined)
      
      inline def setPlacesVarargs(value: Content*): Self = StObject.set(x, "places", js.Array(value*))
    }
  }
}

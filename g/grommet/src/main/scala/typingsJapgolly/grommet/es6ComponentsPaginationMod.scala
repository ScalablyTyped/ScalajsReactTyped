package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsPaginationMod {
  
  @JSImport("grommet/es6/components/Pagination", "Pagination")
  @js.native
  val Pagination: FC[PaginationProps] = js.native
  
  trait PaginationProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var numberEdgePages: js.UndefOr[Double] = js.undefined
    
    var numberItems: js.UndefOr[Double] = js.undefined
    
    var numberMiddlePages: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(): PaginationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setNumberEdgePages(value: Double): Self = StObject.set(x, "numberEdgePages", value.asInstanceOf[js.Any])
      
      inline def setNumberEdgePagesUndefined: Self = StObject.set(x, "numberEdgePages", js.undefined)
      
      inline def setNumberItems(value: Double): Self = StObject.set(x, "numberItems", value.asInstanceOf[js.Any])
      
      inline def setNumberItemsUndefined: Self = StObject.set(x, "numberItems", js.undefined)
      
      inline def setNumberMiddlePages(value: Double): Self = StObject.set(x, "numberMiddlePages", value.asInstanceOf[js.Any])
      
      inline def setNumberMiddlePagesUndefined: Self = StObject.set(x, "numberMiddlePages", js.undefined)
      
      inline def setOnChange(value: /* repeated */ Any => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type PaginationType = PaginationProps
}

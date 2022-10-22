package typingsJapgolly.grommet

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.anon.ColorValue
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.BasisType
import typingsJapgolly.grommet.es6UtilsMod.GapType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetStrings.children
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsDistributionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/es6/components/Distribution", "Distribution")
  @js.native
  open class Distribution protected ()
    extends Component[DistributionExtendedProps, js.Object, Any] {
    def this(props: DistributionExtendedProps) = this()
    def this(props: DistributionExtendedProps, context: Any) = this()
  }
  @JSImport("grommet/es6/components/Distribution", "Distribution")
  @js.native
  val Distribution: ComponentClassP[DistributionExtendedProps & js.Object] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>, 'children'> ]: react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLDivElement>, std.HTMLDivElement>[P]} */ trait DistributionExtendedProps
    extends StObject
       with DistributionProps
  object DistributionExtendedProps {
    
    inline def apply(values: js.Array[ColorValue]): DistributionExtendedProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionExtendedProps]
    }
  }
  
  trait DistributionProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var basis: js.UndefOr[BasisType] = js.undefined
    
    var children: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[GapType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var values: js.Array[ColorValue]
  }
  object DistributionProps {
    
    inline def apply(values: js.Array[ColorValue]): DistributionProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionProps]
    }
    
    extension [Self <: DistributionProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBasis(value: BasisType): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
      
      inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
      
      inline def setChildren(value: /* repeated */ Any => Any): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setValues(value: js.Array[ColorValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: ColorValue*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type divProps = Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], children]
}

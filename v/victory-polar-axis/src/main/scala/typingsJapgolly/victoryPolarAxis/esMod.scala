package typingsJapgolly.victoryPolarAxis

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-polar-axis/es", "VictoryPolarAxis")
  @js.native
  open class VictoryPolarAxis protected () extends Component[VictoryPolarAxisProps, Any, Any] {
    def this(props: VictoryPolarAxisProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryPolarAxisProps, context: Any) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryAxisCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictorySingleLabelableProps * / any */ trait VictoryPolarAxisProps extends StObject {
    
    var axisAngle: js.UndefOr[Double] = js.undefined
    
    var axisValue: js.UndefOr[Double | String | js.Date] = js.undefined
    
    var circularAxisComponent: js.UndefOr[Element] = js.undefined
    
    var circularGridComponent: js.UndefOr[Element] = js.undefined
    
    var domain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ] = js.undefined
    
    var endAngle: js.UndefOr[Double] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryPolarAxisTTargetType, string | number> */ Any
        ]
      ] = js.undefined
    
    var gridComponent: js.UndefOr[Element] = js.undefined
    
    var innerRadius: js.UndefOr[Double] = js.undefined
    
    var labelOrientation: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelOrientationType */ Any
      ] = js.undefined
    
    var labelPlacement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelOrientationType */ Any
      ] = js.undefined
    
    var startAngle: js.UndefOr[Double] = js.undefined
  }
  object VictoryPolarAxisProps {
    
    inline def apply(): VictoryPolarAxisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryPolarAxisProps]
    }
    
    extension [Self <: VictoryPolarAxisProps](x: Self) {
      
      inline def setAxisAngle(value: Double): Self = StObject.set(x, "axisAngle", value.asInstanceOf[js.Any])
      
      inline def setAxisAngleUndefined: Self = StObject.set(x, "axisAngle", js.undefined)
      
      inline def setAxisValue(value: Double | String | js.Date): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
      
      inline def setAxisValueUndefined: Self = StObject.set(x, "axisValue", js.undefined)
      
      inline def setCircularAxisComponent(value: VdomElement): Self = StObject.set(x, "circularAxisComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircularAxisComponentUndefined: Self = StObject.set(x, "circularAxisComponent", js.undefined)
      
      inline def setCircularGridComponent(value: VdomElement): Self = StObject.set(x, "circularGridComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircularGridComponentUndefined: Self = StObject.set(x, "circularGridComponent", js.undefined)
      
      inline def setDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryPolarAxisTTargetType, string | number> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryPolarAxisTTargetType, string | number> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setGridComponent(value: VdomElement): Self = StObject.set(x, "gridComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGridComponentUndefined: Self = StObject.set(x, "gridComponent", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setLabelOrientation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelOrientationType */ Any
      ): Self = StObject.set(x, "labelOrientation", value.asInstanceOf[js.Any])
      
      inline def setLabelOrientationUndefined: Self = StObject.set(x, "labelOrientation", js.undefined)
      
      inline def setLabelPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LabelOrientationType */ Any
      ): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.axis
    - typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.axisLabel
    - typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.grid
    - typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.ticks
    - typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.tickLabels
  */
  trait VictoryPolarAxisTTargetType extends StObject
  object VictoryPolarAxisTTargetType {
    
    inline def axis: typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.axis = "axis".asInstanceOf[typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.axis]
    
    inline def axisLabel: typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.axisLabel = "axisLabel".asInstanceOf[typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.axisLabel]
    
    inline def grid: typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.grid = "grid".asInstanceOf[typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.grid]
    
    inline def tickLabels: typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.tickLabels = "tickLabels".asInstanceOf[typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.tickLabels]
    
    inline def ticks: typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.ticks = "ticks".asInstanceOf[typingsJapgolly.victoryPolarAxis.victoryPolarAxisStrings.ticks]
  }
}

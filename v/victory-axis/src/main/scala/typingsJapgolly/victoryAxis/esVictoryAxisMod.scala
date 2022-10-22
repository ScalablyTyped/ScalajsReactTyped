package typingsJapgolly.victoryAxis

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.victoryAxis.anon.AddGlobalListener
import typingsJapgolly.victoryAxis.anon.AxisLabelComponent
import typingsJapgolly.victoryAxis.anon.Instantiable
import typingsJapgolly.victoryAxis.anon.Key
import typingsJapgolly.victoryAxis.anon.TypeofVictoryAxisBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryAxisMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-axis/es/victory-axis", "VictoryAxis")
  @js.native
  open class VictoryAxis protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-axis/es/victory-axis", "VictoryAxis")
  @js.native
  val VictoryAxis: Instantiable & TypeofVictoryAxisBase & Instantiable0[VictoryAxisBase] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsMixinClass<VictoryAxisProps> * / any */ @js.native
  trait VictoryAxisBase
    extends Component[VictoryAxisProps, js.Object, Any] {
    
    def fixLabelOverlap(gridAndTicks: Any, props: Any): Any = js.native
    
    def renderGridAndTicks(props: Any): js.Array[FunctionComponentElement[Key]] = js.native
    
    def renderLabel(props: Any): FunctionComponentElement[AxisLabelComponent] | Null = js.native
    
    def renderLine(props: Any): FunctionComponentElement[AxisLabelComponent] = js.native
    
    def shouldAnimate(): Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryAxisCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictorySingleLabelableProps * / any */ trait VictoryAxisProps extends StObject {
    
    var crossAxis: js.UndefOr[Boolean] = js.undefined
    
    var domain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, number | string> */ Any
        ]
      ] = js.undefined
    
    var fixLabelOverlap: js.UndefOr[Boolean] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
  }
  object VictoryAxisProps {
    
    inline def apply(): VictoryAxisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryAxisProps]
    }
    
    extension [Self <: VictoryAxisProps](x: Self) {
      
      inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
      
      inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
      
      inline def setDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainPropType */ Any
      ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, number | string> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, number | string> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setFixLabelOverlap(value: Boolean): Self = StObject.set(x, "fixLabelOverlap", value.asInstanceOf[js.Any])
      
      inline def setFixLabelOverlapUndefined: Self = StObject.set(x, "fixLabelOverlap", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setOrientation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryAxis.victoryAxisStrings.axis
    - typingsJapgolly.victoryAxis.victoryAxisStrings.axisLabel
    - typingsJapgolly.victoryAxis.victoryAxisStrings.grid
    - typingsJapgolly.victoryAxis.victoryAxisStrings.ticks
    - typingsJapgolly.victoryAxis.victoryAxisStrings.tickLabels
    - typingsJapgolly.victoryAxis.victoryAxisStrings.parent
  */
  trait VictoryAxisTTargetType extends StObject
  object VictoryAxisTTargetType {
    
    inline def axis: typingsJapgolly.victoryAxis.victoryAxisStrings.axis = "axis".asInstanceOf[typingsJapgolly.victoryAxis.victoryAxisStrings.axis]
    
    inline def axisLabel: typingsJapgolly.victoryAxis.victoryAxisStrings.axisLabel = "axisLabel".asInstanceOf[typingsJapgolly.victoryAxis.victoryAxisStrings.axisLabel]
    
    inline def grid: typingsJapgolly.victoryAxis.victoryAxisStrings.grid = "grid".asInstanceOf[typingsJapgolly.victoryAxis.victoryAxisStrings.grid]
    
    inline def parent: typingsJapgolly.victoryAxis.victoryAxisStrings.parent = "parent".asInstanceOf[typingsJapgolly.victoryAxis.victoryAxisStrings.parent]
    
    inline def tickLabels: typingsJapgolly.victoryAxis.victoryAxisStrings.tickLabels = "tickLabels".asInstanceOf[typingsJapgolly.victoryAxis.victoryAxisStrings.tickLabels]
    
    inline def ticks: typingsJapgolly.victoryAxis.victoryAxisStrings.ticks = "ticks".asInstanceOf[typingsJapgolly.victoryAxis.victoryAxisStrings.ticks]
  }
}

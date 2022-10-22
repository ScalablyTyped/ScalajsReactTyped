package typingsJapgolly.victoryErrorbar

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.victoryErrorbar.anon.AddGlobalListener
import typingsJapgolly.victoryErrorbar.anon.Instantiable
import typingsJapgolly.victoryErrorbar.anon.TypeofVictoryErrorBarBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryErrorbarMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("victory-errorbar/es/victory-errorbar", "VictoryErrorBar")
  @js.native
  open class VictoryErrorBar protected ()
    extends StObject
       with AddGlobalListener {
    def this(props: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventMixinCommonProps */ Any) = this()
  }
  @JSImport("victory-errorbar/es/victory-errorbar", "VictoryErrorBar")
  @js.native
  val VictoryErrorBar: Instantiable & TypeofVictoryErrorBarBase & Instantiable0[VictoryErrorBarBase] = js.native
  
  type ErrorType = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrList */ Any) | (js.Function1[
    /* repeated */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrList */ Any
  ])
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventsMixinClass<VictoryErrorBarProps> * / any */ @js.native
  trait VictoryErrorBarBase
    extends Component[VictoryErrorBarProps, js.Object, Any] {
    
    def shouldAnimate(): Boolean = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any, 'polar'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryErrorBarProps extends StObject {
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var errorX: js.UndefOr[ErrorType] = js.undefined
    
    var errorY: js.UndefOr[ErrorType] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryErrorBarTTargetType, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
  }
  object VictoryErrorBarProps {
    
    inline def apply(): VictoryErrorBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryErrorBarProps]
    }
    
    extension [Self <: VictoryErrorBarProps](x: Self) {
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setErrorX(value: ErrorType): Self = StObject.set(x, "errorX", value.asInstanceOf[js.Any])
      
      inline def setErrorXFunction1(
        value: /* repeated */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrList */ Any
      ): Self = StObject.set(x, "errorX", js.Any.fromFunction1(value))
      
      inline def setErrorXUndefined: Self = StObject.set(x, "errorX", js.undefined)
      
      inline def setErrorY(value: ErrorType): Self = StObject.set(x, "errorY", value.asInstanceOf[js.Any])
      
      inline def setErrorYFunction1(
        value: /* repeated */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrList */ Any
      ): Self = StObject.set(x, "errorY", js.Any.fromFunction1(value))
      
      inline def setErrorYUndefined: Self = StObject.set(x, "errorY", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryErrorBarTTargetType, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryErrorBarTTargetType, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.data
    - typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.labels
    - typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.parent
  */
  trait VictoryErrorBarTTargetType extends StObject
  object VictoryErrorBarTTargetType {
    
    inline def data: typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.data = "data".asInstanceOf[typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.data]
    
    inline def labels: typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.labels = "labels".asInstanceOf[typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.labels]
    
    inline def parent: typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.parent = "parent".asInstanceOf[typingsJapgolly.victoryErrorbar.victoryErrorbarStrings.parent]
  }
}

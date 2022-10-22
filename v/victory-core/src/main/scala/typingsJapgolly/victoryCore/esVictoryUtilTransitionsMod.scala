package typingsJapgolly.victoryCore

import typingsJapgolly.victoryCore.anon.ChildrenTransitions
import typingsJapgolly.victoryCore.esTypesPropTypesMod.AnimatePropTypeInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryUtilTransitionsMod {
  
  @JSImport("victory-core/es/victory-util/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInitialTransitionState(oldChildren: Any, nextChildren: Any): ChildrenTransitions = (^.asInstanceOf[js.Dynamic].applyDynamic("getInitialTransitionState")(oldChildren.asInstanceOf[js.Any], nextChildren.asInstanceOf[js.Any])).asInstanceOf[ChildrenTransitions]
  
  inline def getTransitionPropsFactory(props: Any, state: Any, setState: Any): js.Function2[/* child */ Any, /* index */ Any, TransitionProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionPropsFactory")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], setState.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* child */ Any, /* index */ Any, TransitionProps]]
  
  trait TransitionProps extends StObject {
    
    var animate: js.UndefOr[AnimatePropTypeInterface] = js.undefined
    
    var clipWidth: js.UndefOr[Double] = js.undefined
    
    var data: Any
  }
  object TransitionProps {
    
    inline def apply(data: Any): TransitionProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionProps]
    }
    
    extension [Self <: TransitionProps](x: Self) {
      
      inline def setAnimate(value: AnimatePropTypeInterface): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setClipWidth(value: Double): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
      
      inline def setClipWidthUndefined: Self = StObject.set(x, "clipWidth", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}

package typingsJapgolly.naturalDragAnimationRbdnd

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot
import typingsJapgolly.reactBeautifulDnd.mod.DraggingStyle
import typingsJapgolly.reactBeautifulDnd.mod.NotDraggingStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("natural-drag-animation-rbdnd", JSImport.Default)
  @js.native
  open class default ()
    extends Component[NaturalDragAnimationType, js.Object, Any]
  
  type NaturalDragAnimation = japgolly.scalajs.react.facade.React.Component[NaturalDragAnimationType & js.Object, js.Object]
  
  trait NaturalDragAnimationType extends StObject {
    
    var animationRotationFade: js.UndefOr[Double] = js.undefined
    
    def children(style: CSSProperties): Node
    
    var rotationMultiplier: js.UndefOr[Double] = js.undefined
    
    var sigmoidFunction: js.UndefOr[js.Function1[/* x */ Double, Double]] = js.undefined
    
    var snapshot: DraggableStateSnapshot
    
    var style: js.UndefOr[DraggingStyle | NotDraggingStyle] = js.undefined
  }
  object NaturalDragAnimationType {
    
    inline def apply(children: CSSProperties => Node, snapshot: DraggableStateSnapshot): NaturalDragAnimationType = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[NaturalDragAnimationType]
    }
    
    extension [Self <: NaturalDragAnimationType](x: Self) {
      
      inline def setAnimationRotationFade(value: Double): Self = StObject.set(x, "animationRotationFade", value.asInstanceOf[js.Any])
      
      inline def setAnimationRotationFadeUndefined: Self = StObject.set(x, "animationRotationFade", js.undefined)
      
      inline def setChildren(value: CSSProperties => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setRotationMultiplier(value: Double): Self = StObject.set(x, "rotationMultiplier", value.asInstanceOf[js.Any])
      
      inline def setRotationMultiplierUndefined: Self = StObject.set(x, "rotationMultiplier", js.undefined)
      
      inline def setSigmoidFunction(value: /* x */ Double => Double): Self = StObject.set(x, "sigmoidFunction", js.Any.fromFunction1(value))
      
      inline def setSigmoidFunctionUndefined: Self = StObject.set(x, "sigmoidFunction", js.undefined)
      
      inline def setSnapshot(value: DraggableStateSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: DraggingStyle | NotDraggingStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

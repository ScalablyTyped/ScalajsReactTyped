package typingsJapgolly.victoryCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.victoryCore.anon.AnimationTimer
import typingsJapgolly.victoryCore.anon.Delay
import typingsJapgolly.victoryCore.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryAnimationVictoryAnimationMod {
  
  @JSImport("victory-core/es/victory-animation/victory-animation", "VictoryAnimation")
  @js.native
  open class VictoryAnimation protected () extends Component[VictoryAnimationProps, VictoryAnimationState, Any] {
    def this(props: Any, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MVictoryAnimation(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVictoryAnimation(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVictoryAnimation(): Unit = js.native
    
    @JSName("context")
    var context_VictoryAnimation: ContextType[Context[AnimationTimer]] = js.native
    
    /* private */ var ease: Any = js.native
    
    def functionToBeRunEachFrame(elapsed: Any, duration: Any): Unit = js.native
    
    /* private */ var interpolator: Any = js.native
    
    /* private */ var loopID: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var timer: Any = js.native
    
    def toNewName(ease: Any): String = js.native
    
    def traverseQueue(): Unit = js.native
  }
  /* static members */
  object VictoryAnimation {
    
    @JSImport("victory-core/es/victory-animation/victory-animation", "VictoryAnimation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-animation/victory-animation", "VictoryAnimation.contextType")
    @js.native
    def contextType: Context[AnimationTimer] = js.native
    inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-animation/victory-animation", "VictoryAnimation.defaultProps")
    @js.native
    def defaultProps: Duration = js.native
    inline def defaultProps_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-animation/victory-animation", "VictoryAnimation.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-animation/victory-animation", "VictoryAnimation.propTypes")
    @js.native
    def propTypes: Delay = js.native
    inline def propTypes_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type AnimationData = AnimationStyle | js.Array[AnimationStyle]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCore.victoryCoreStrings.back
    - typingsJapgolly.victoryCore.victoryCoreStrings.backIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.backOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.backInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.bounce
    - typingsJapgolly.victoryCore.victoryCoreStrings.bounceIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.bounceOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.bounceInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.circle
    - typingsJapgolly.victoryCore.victoryCoreStrings.circleIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.circleOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.circleInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.linear
    - typingsJapgolly.victoryCore.victoryCoreStrings.linearIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.linearOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.linearInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.cubic
    - typingsJapgolly.victoryCore.victoryCoreStrings.cubicIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.cubicOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.cubicInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.elastic
    - typingsJapgolly.victoryCore.victoryCoreStrings.elasticIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.elasticOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.elasticInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.exp
    - typingsJapgolly.victoryCore.victoryCoreStrings.expIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.expOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.expInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.poly
    - typingsJapgolly.victoryCore.victoryCoreStrings.polyIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.polyOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.polyInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.quad
    - typingsJapgolly.victoryCore.victoryCoreStrings.quadIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.quadOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.quadInOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.sin
    - typingsJapgolly.victoryCore.victoryCoreStrings.sinIn
    - typingsJapgolly.victoryCore.victoryCoreStrings.sinOut
    - typingsJapgolly.victoryCore.victoryCoreStrings.sinInOut
  */
  trait AnimationEasing extends StObject
  object AnimationEasing {
    
    inline def back: typingsJapgolly.victoryCore.victoryCoreStrings.back = "back".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.back]
    
    inline def backIn: typingsJapgolly.victoryCore.victoryCoreStrings.backIn = "backIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.backIn]
    
    inline def backInOut: typingsJapgolly.victoryCore.victoryCoreStrings.backInOut = "backInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.backInOut]
    
    inline def backOut: typingsJapgolly.victoryCore.victoryCoreStrings.backOut = "backOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.backOut]
    
    inline def bounce: typingsJapgolly.victoryCore.victoryCoreStrings.bounce = "bounce".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bounce]
    
    inline def bounceIn: typingsJapgolly.victoryCore.victoryCoreStrings.bounceIn = "bounceIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bounceIn]
    
    inline def bounceInOut: typingsJapgolly.victoryCore.victoryCoreStrings.bounceInOut = "bounceInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bounceInOut]
    
    inline def bounceOut: typingsJapgolly.victoryCore.victoryCoreStrings.bounceOut = "bounceOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.bounceOut]
    
    inline def circle: typingsJapgolly.victoryCore.victoryCoreStrings.circle = "circle".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.circle]
    
    inline def circleIn: typingsJapgolly.victoryCore.victoryCoreStrings.circleIn = "circleIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.circleIn]
    
    inline def circleInOut: typingsJapgolly.victoryCore.victoryCoreStrings.circleInOut = "circleInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.circleInOut]
    
    inline def circleOut: typingsJapgolly.victoryCore.victoryCoreStrings.circleOut = "circleOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.circleOut]
    
    inline def cubic: typingsJapgolly.victoryCore.victoryCoreStrings.cubic = "cubic".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cubic]
    
    inline def cubicIn: typingsJapgolly.victoryCore.victoryCoreStrings.cubicIn = "cubicIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cubicIn]
    
    inline def cubicInOut: typingsJapgolly.victoryCore.victoryCoreStrings.cubicInOut = "cubicInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cubicInOut]
    
    inline def cubicOut: typingsJapgolly.victoryCore.victoryCoreStrings.cubicOut = "cubicOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.cubicOut]
    
    inline def elastic: typingsJapgolly.victoryCore.victoryCoreStrings.elastic = "elastic".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.elastic]
    
    inline def elasticIn: typingsJapgolly.victoryCore.victoryCoreStrings.elasticIn = "elasticIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.elasticIn]
    
    inline def elasticInOut: typingsJapgolly.victoryCore.victoryCoreStrings.elasticInOut = "elasticInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.elasticInOut]
    
    inline def elasticOut: typingsJapgolly.victoryCore.victoryCoreStrings.elasticOut = "elasticOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.elasticOut]
    
    inline def exp: typingsJapgolly.victoryCore.victoryCoreStrings.exp = "exp".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.exp]
    
    inline def expIn: typingsJapgolly.victoryCore.victoryCoreStrings.expIn = "expIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.expIn]
    
    inline def expInOut: typingsJapgolly.victoryCore.victoryCoreStrings.expInOut = "expInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.expInOut]
    
    inline def expOut: typingsJapgolly.victoryCore.victoryCoreStrings.expOut = "expOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.expOut]
    
    inline def linear: typingsJapgolly.victoryCore.victoryCoreStrings.linear = "linear".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linear]
    
    inline def linearIn: typingsJapgolly.victoryCore.victoryCoreStrings.linearIn = "linearIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linearIn]
    
    inline def linearInOut: typingsJapgolly.victoryCore.victoryCoreStrings.linearInOut = "linearInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linearInOut]
    
    inline def linearOut: typingsJapgolly.victoryCore.victoryCoreStrings.linearOut = "linearOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.linearOut]
    
    inline def poly: typingsJapgolly.victoryCore.victoryCoreStrings.poly = "poly".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.poly]
    
    inline def polyIn: typingsJapgolly.victoryCore.victoryCoreStrings.polyIn = "polyIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.polyIn]
    
    inline def polyInOut: typingsJapgolly.victoryCore.victoryCoreStrings.polyInOut = "polyInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.polyInOut]
    
    inline def polyOut: typingsJapgolly.victoryCore.victoryCoreStrings.polyOut = "polyOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.polyOut]
    
    inline def quad: typingsJapgolly.victoryCore.victoryCoreStrings.quad = "quad".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.quad]
    
    inline def quadIn: typingsJapgolly.victoryCore.victoryCoreStrings.quadIn = "quadIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.quadIn]
    
    inline def quadInOut: typingsJapgolly.victoryCore.victoryCoreStrings.quadInOut = "quadInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.quadInOut]
    
    inline def quadOut: typingsJapgolly.victoryCore.victoryCoreStrings.quadOut = "quadOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.quadOut]
    
    inline def sin: typingsJapgolly.victoryCore.victoryCoreStrings.sin = "sin".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.sin]
    
    inline def sinIn: typingsJapgolly.victoryCore.victoryCoreStrings.sinIn = "sinIn".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.sinIn]
    
    inline def sinInOut: typingsJapgolly.victoryCore.victoryCoreStrings.sinInOut = "sinInOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.sinInOut]
    
    inline def sinOut: typingsJapgolly.victoryCore.victoryCoreStrings.sinOut = "sinOut".asInstanceOf[typingsJapgolly.victoryCore.victoryCoreStrings.sinOut]
  }
  
  trait AnimationInfo extends StObject {
    
    var animating: Boolean
    
    var progress: Double
    
    var terminating: js.UndefOr[Boolean] = js.undefined
  }
  object AnimationInfo {
    
    inline def apply(animating: Boolean, progress: Double): AnimationInfo = {
      val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationInfo]
    }
    
    extension [Self <: AnimationInfo](x: Self) {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTerminating(value: Boolean): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
      
      inline def setTerminatingUndefined: Self = StObject.set(x, "terminating", js.undefined)
    }
  }
  
  type AnimationStyle = StringDictionary[String | Double]
  
  trait VictoryAnimationProps extends StObject {
    
    def children(style: AnimationStyle, info: AnimationInfo): Node
    
    var data: AnimationData
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[AnimationEasing] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object VictoryAnimationProps {
    
    inline def apply(children: (AnimationStyle, AnimationInfo) => Node, data: AnimationData): VictoryAnimationProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[VictoryAnimationProps]
    }
    
    extension [Self <: VictoryAnimationProps](x: Self) {
      
      inline def setChildren(value: (AnimationStyle, AnimationInfo) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setData(value: AnimationData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: AnimationStyle*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: AnimationEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    }
  }
  
  trait VictoryAnimationState extends StObject {
    
    var animationInfo: AnimationInfo
    
    var data: AnimationStyle
  }
  object VictoryAnimationState {
    
    inline def apply(animationInfo: AnimationInfo, data: AnimationStyle): VictoryAnimationState = {
      val __obj = js.Dynamic.literal(animationInfo = animationInfo.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[VictoryAnimationState]
    }
    
    extension [Self <: VictoryAnimationState](x: Self) {
      
      inline def setAnimationInfo(value: AnimationInfo): Self = StObject.set(x, "animationInfo", value.asInstanceOf[js.Any])
      
      inline def setData(value: AnimationStyle): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}

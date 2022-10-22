package typingsJapgolly.atlaskitMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.anon.ClassName
import typingsJapgolly.atlaskitMotion.distTypesEnteringKeyframesMotionMod.InternalKeyframesMotionProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyframesMotion {
  
  inline def apply(
    animationTimingFunction: Transition => String,
    children: (ClassName, Transition) => Node,
    duration: Double,
    enteringAnimation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(animationTimingFunction = js.Any.fromFunction1(animationTimingFunction), children = js.Any.fromFunction2(children), duration = duration.asInstanceOf[js.Any], enteringAnimation = enteringAnimation.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InternalKeyframesMotionProps]))
  }
  
  @JSImport("@atlaskit/motion/dist/types/entering/keyframes-motion", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def exitingAnimation(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectInterpolation<undefined> */ Any
    ): this.type = set("exitingAnimation", value.asInstanceOf[js.Any])
    
    inline def isPaused(value: Boolean): this.type = set("isPaused", value.asInstanceOf[js.Any])
    
    inline def onFinish(value: /* state */ Transition => Callback): this.type = set("onFinish", js.Any.fromFunction1((t0: /* state */ Transition) => value(t0).runNow()))
  }
  
  def withProps(p: InternalKeyframesMotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

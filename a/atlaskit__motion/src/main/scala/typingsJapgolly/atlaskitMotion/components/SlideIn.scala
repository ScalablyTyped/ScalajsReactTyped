package typingsJapgolly.atlaskitMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.anon.ClassName
import typingsJapgolly.atlaskitMotion.distTypesEnteringSlideInMod.SlideInProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Fade
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import typingsJapgolly.atlaskitMotion.distTypesUtilsCurvesMod.AnimationCurve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideIn {
  
  inline def apply(children: (ClassName, Transition) => Node, enterFrom: Direction): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), enterFrom = enterFrom.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SlideInProps]))
  }
  
  @JSImport("@atlaskit/motion", "SlideIn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animationTimingFunction(value: /* state */ Transition => AnimationCurve): this.type = set("animationTimingFunction", js.Any.fromFunction1(value))
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def exitTo(value: Direction): this.type = set("exitTo", value.asInstanceOf[js.Any])
    
    inline def fade(value: Fade): this.type = set("fade", value.asInstanceOf[js.Any])
    
    inline def isPaused(value: Boolean): this.type = set("isPaused", value.asInstanceOf[js.Any])
    
    inline def onFinish(value: /* state */ Transition => Callback): this.type = set("onFinish", js.Any.fromFunction1((t0: /* state */ Transition) => value(t0).runNow()))
  }
  
  def withProps(p: SlideInProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

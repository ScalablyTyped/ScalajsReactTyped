package typingsJapgolly.atlaskitMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.anon.ClassName
import typingsJapgolly.atlaskitMotion.distTypesEnteringFadeInMod.FadeKeyframesMotionProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Direction
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Distance
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FadeIn {
  
  inline def apply(children: (ClassName, Transition) => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[FadeKeyframesMotionProps]))
  }
  
  @JSImport("@atlaskit/motion", "FadeIn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def distance(value: Distance): this.type = set("distance", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def entranceDirection(value: Direction): this.type = set("entranceDirection", value.asInstanceOf[js.Any])
    
    inline def exitDirection(value: Direction): this.type = set("exitDirection", value.asInstanceOf[js.Any])
    
    inline def isPaused(value: Boolean): this.type = set("isPaused", value.asInstanceOf[js.Any])
    
    inline def onFinish(value: /* state */ Transition => Callback): this.type = set("onFinish", js.Any.fromFunction1((t0: /* state */ Transition) => value(t0).runNow()))
  }
  
  def withProps(p: FadeKeyframesMotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

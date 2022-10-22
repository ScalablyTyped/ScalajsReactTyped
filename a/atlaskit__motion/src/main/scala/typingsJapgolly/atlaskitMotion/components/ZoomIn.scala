package typingsJapgolly.atlaskitMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.anon.ClassName
import typingsJapgolly.atlaskitMotion.distTypesEnteringKeyframesMotionMod.KeyframesMotionProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZoomIn {
  
  inline def apply(children: (ClassName, Transition) => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[KeyframesMotionProps]))
  }
  
  @JSImport("@atlaskit/motion", "ZoomIn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def isPaused(value: Boolean): this.type = set("isPaused", value.asInstanceOf[js.Any])
    
    inline def onFinish(value: /* state */ Transition => Callback): this.type = set("onFinish", js.Any.fromFunction1((t0: /* state */ Transition) => value(t0).runNow()))
  }
  
  def withProps(p: KeyframesMotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

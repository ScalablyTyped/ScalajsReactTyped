package typingsJapgolly.atlaskitMotion.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.anon.Ref
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.MotionProps
import typingsJapgolly.atlaskitMotion.distTypesEnteringTypesMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShrinkOut {
  
  inline def apply(children: (Ref, Transition) => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[MotionProps[Ref]]))
  }
  
  @JSImport("@atlaskit/motion", "ShrinkOut")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def onFinish(value: /* state */ Transition => Callback): this.type = set("onFinish", js.Any.fromFunction1((t0: /* state */ Transition) => value(t0).runNow()))
  }
  
  def withProps(p: MotionProps[Ref]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

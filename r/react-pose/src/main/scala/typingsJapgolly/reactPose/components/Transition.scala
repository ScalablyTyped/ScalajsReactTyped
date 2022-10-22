package typingsJapgolly.reactPose.components

import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.Props
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.TransitionChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transition {
  
  inline def apply(children: TransitionChildren[Any]): SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.Transition] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.Transition](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-pose", "Transition")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.Transition] = new SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.Transition](js.Array(this.component, p.asInstanceOf[js.Any]))
}

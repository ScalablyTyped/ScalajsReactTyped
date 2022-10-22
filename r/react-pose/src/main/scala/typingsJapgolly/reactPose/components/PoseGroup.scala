package typingsJapgolly.reactPose.components

import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.Props
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.TransitionChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PoseGroup {
  
  inline def apply(children: TransitionChildren[Any]): SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.PoseGroup] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.PoseGroup](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-pose", "PoseGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.PoseGroup] = new SharedBuilder_Props1901599350[typingsJapgolly.reactPose.mod.PoseGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}

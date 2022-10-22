package typingsJapgolly.reactPose

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactPose.anon.FlipMove
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTransitionPoseGroupMod {
  
  @JSImport("react-pose/lib/components/Transition/PoseGroup", JSImport.Default)
  @js.native
  open class default () extends PoseGroup
  /* static members */
  object default {
    
    @JSImport("react-pose/lib/components/Transition/PoseGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-pose/lib/components/Transition/PoseGroup", "default.defaultProps")
    @js.native
    def defaultProps: FlipMove = js.native
    inline def defaultProps_=(x: FlipMove): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PoseGroup
    extends Component[Props, js.Object, Any]
}

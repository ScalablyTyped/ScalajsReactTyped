package typingsJapgolly.reactPose

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactPose.anon.FlipMove
import typingsJapgolly.reactPose.anon.PartialState
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.Props
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.State
import typingsJapgolly.reactPose.libPosedMod.Posed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-pose", JSImport.Default)
  @js.native
  val default: Posed = js.native
  
  @JSImport("react-pose", "PoseGroup")
  @js.native
  open class PoseGroup ()
    extends typingsJapgolly.reactPose.libComponentsTransitionPoseGroupMod.default
  /* static members */
  object PoseGroup {
    
    @JSImport("react-pose", "PoseGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-pose", "PoseGroup.defaultProps")
    @js.native
    def defaultProps: FlipMove = js.native
    inline def defaultProps_=(x: FlipMove): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-pose", "Transition")
  @js.native
  open class Transition ()
    extends typingsJapgolly.reactPose.libComponentsTransitionMod.default
  object Transition {
    
    @JSImport("react-pose", "Transition")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-pose", "Transition.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pose", "Transition.defaultProps.enterAfterExit")
      @js.native
      def enterAfterExit: Boolean = js.native
      inline def enterAfterExit_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterAfterExit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose", "Transition.defaultProps.enterPose")
      @js.native
      def enterPose: String = js.native
      inline def enterPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterPose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose", "Transition.defaultProps.exitPose")
      @js.native
      def exitPose: String = js.native
      inline def exitPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exitPose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose", "Transition.defaultProps.flipMove")
      @js.native
      def flipMove: Boolean = js.native
      inline def flipMove_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose", "Transition.defaultProps.preEnterPose")
      @js.native
      def preEnterPose: String = js.native
      inline def preEnterPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preEnterPose")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-pose", "Transition.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.Function2[/* props */ Props, /* state */ State, PartialState] = js.native
    inline def getDerivedStateFromProps_=(x: js.Function2[/* props */ Props, /* state */ State, PartialState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  type _To = Posed
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Posed = default
}

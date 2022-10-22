package typingsJapgolly.reactPose

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactPose.anon.PartialState
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.Props
import typingsJapgolly.reactPose.libComponentsTransitionTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTransitionMod {
  
  @JSImport("react-pose/lib/components/Transition", JSImport.Default)
  @js.native
  open class default () extends Transition
  object default {
    
    @JSImport("react-pose/lib/components/Transition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.enterAfterExit")
      @js.native
      def enterAfterExit: Boolean = js.native
      inline def enterAfterExit_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterAfterExit")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.enterPose")
      @js.native
      def enterPose: String = js.native
      inline def enterPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterPose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.exitPose")
      @js.native
      def exitPose: String = js.native
      inline def exitPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exitPose")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.flipMove")
      @js.native
      def flipMove: Boolean = js.native
      inline def flipMove_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pose/lib/components/Transition", "default.defaultProps.preEnterPose")
      @js.native
      def preEnterPose: String = js.native
      inline def preEnterPose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preEnterPose")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("react-pose/lib/components/Transition", "default.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.Function2[/* props */ Props, /* state */ State, PartialState] = js.native
    inline def getDerivedStateFromProps_=(x: js.Function2[/* props */ Props, /* state */ State, PartialState]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Transition extends Component[Props, State, Any] {
    
    def removeChild(key: String): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTransition(nextProps: Props, nextState: State): Boolean = js.native
  }
}

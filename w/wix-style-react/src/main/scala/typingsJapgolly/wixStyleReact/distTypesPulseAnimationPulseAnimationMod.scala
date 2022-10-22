package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.ReactNodeArray
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.anon.AnimationSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPulseAnimationPulseAnimationMod {
  
  /** PulseAnimation*/
  @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", JSImport.Default)
  @js.native
  open class default protected () extends PulseAnimation {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.defaultProps.fluid_1")
      @js.native
      val fluid1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.defaultProps.loop_1")
      @js.native
      val loop1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.active")
      @js.native
      val active: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.borderRadius")
      @js.native
      val borderRadius: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.children")
      @js.native
      val children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.color")
      @js.native
      val color: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.delay")
      @js.native
      val delay: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.fluid")
      @js.native
      val fluid: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.loop")
      @js.native
      val loop: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.onEnd")
      @js.native
      val onEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/PulseAnimation/PulseAnimation", "default.propTypes.onStart")
      @js.native
      val onStart: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
  
  /** PulseAnimation*/
  @js.native
  trait PulseAnimation extends PureComponent[Any, Any, Any] {
    
    def _getAnimationSize(): String = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPulseAnimation(): Unit = js.native
    
    var rootRef: RefHandle[Any] = js.native
    
    @JSName("state")
    var state_PulseAnimation: AnimationSize = js.native
  }
}

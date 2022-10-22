package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.OnChange
import typingsJapgolly.baseui.pinCodeTypesMod.ChangeEvent
import typingsJapgolly.baseui.pinCodeTypesMod.StatefulPinCodeContainerProps
import typingsJapgolly.baseui.pinCodeTypesMod.StatefulPinCodeContainerState
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinCodeStatefulPinCodeContainerMod {
  
  @JSImport("baseui/pin-code/stateful-pin-code-container", JSImport.Default)
  @js.native
  open class default () extends StatefulPinCodeContainer
  /* static members */
  object default {
    
    @JSImport("baseui/pin-code/stateful-pin-code-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pin-code/stateful-pin-code-container", "default.defaultProps")
    @js.native
    def defaultProps: OnChange = js.native
    inline def defaultProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulPinCodeContainer extends Component[StatefulPinCodeContainerProps, StatefulPinCodeContainerState, Any] {
    
    def handleChange(hasValuesEvent: ChangeEvent): Unit = js.native
  }
}

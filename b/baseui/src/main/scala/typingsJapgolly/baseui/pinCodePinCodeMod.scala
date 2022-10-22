package typingsJapgolly.baseui

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.anon.Arialabel
import typingsJapgolly.baseui.anon.HasFocus
import typingsJapgolly.baseui.pinCodeTypesMod.PinCodeProps
import typingsJapgolly.baseui.pinCodeTypesMod.State
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinCodePinCodeMod {
  
  @JSImport("baseui/pin-code/pin-code", JSImport.Default)
  @js.native
  open class default () extends PinCode
  /* static members */
  object default {
    
    @JSImport("baseui/pin-code/pin-code", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pin-code/pin-code", "default.defaultProps")
    @js.native
    def defaultProps: Arialabel = js.native
    inline def defaultProps_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PinCode extends Component[PinCodeProps, State, Any] {
    
    var _inputRefs: typingsJapgolly.reactMultiRef.mod.default[Double, HTMLInputElement] = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPinCode(): Unit = js.native
    
    def getMaskStyle(i: Double): String = js.native
    
    @JSName("state")
    var state_PinCode: HasFocus = js.native
  }
}

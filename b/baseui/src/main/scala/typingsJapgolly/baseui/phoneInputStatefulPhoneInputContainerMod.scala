package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.anon.OnCountryChange
import typingsJapgolly.baseui.anon.PartialState
import typingsJapgolly.baseui.phoneInputTypesMod.State
import typingsJapgolly.baseui.phoneInputTypesMod.StateChange
import typingsJapgolly.baseui.phoneInputTypesMod.StatefulPhoneInputContainerProps
import typingsJapgolly.baseui.selectTypesMod.OnChangeParams
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputStatefulPhoneInputContainerMod {
  
  @JSImport("baseui/phone-input/stateful-phone-input-container", JSImport.Default)
  @js.native
  open class default () extends StatefulPhoneInputContainer
  /* static members */
  object default {
    
    @JSImport("baseui/phone-input/stateful-phone-input-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/phone-input/stateful-phone-input-container", "default.defaultProps")
    @js.native
    def defaultProps: OnCountryChange = js.native
    inline def defaultProps_=(x: OnCountryChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulPhoneInputContainer extends Component[StatefulPhoneInputContainerProps, State, Any] {
    
    def internalSetState(`type`: StateChange, nextState: PartialState): Unit = js.native
    
    def onCountryChange(event: OnChangeParams): Unit = js.native
    
    def onTextChange(event: ReactEventFrom[HTMLInputElement]): Unit = js.native
  }
}

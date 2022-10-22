package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.anon.FocusedRadioIndex
import typingsJapgolly.baseui.radioTypesMod.DefaultProps
import typingsJapgolly.baseui.radioTypesMod.RadioGroupProps
import typingsJapgolly.baseui.radioTypesMod.StatelessState
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioRadiogroupMod {
  
  @JSImport("baseui/radio/radiogroup", JSImport.Default)
  @js.native
  open class default () extends StatelessRadioGroup
  object default {
    
    @JSImport("baseui/radio/radiogroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/radio/radiogroup", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatelessRadioGroup extends Component[RadioGroupProps, StatelessState, Any] {
    
    def handleBlur(event: ReactEventFrom[HTMLInputElement], index: Double): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[HTMLInputElement], index: Double): Unit = js.native
    
    @JSName("state")
    var state_StatelessRadioGroup: FocusedRadioIndex = js.native
  }
}

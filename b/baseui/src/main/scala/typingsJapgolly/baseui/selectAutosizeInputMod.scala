package typingsJapgolly.baseui

import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.anon.InputRef
import typingsJapgolly.baseui.anon.InputWidth
import typingsJapgolly.baseui.baseuiStrings.$size
import typingsJapgolly.baseui.baseuiStrings.defaultValue
import typingsJapgolly.baseui.baseuiStrings.input
import typingsJapgolly.baseui.baseuiStrings.inputRef
import typingsJapgolly.baseui.baseuiStrings.overrides
import typingsJapgolly.baseui.baseuiStrings.value
import typingsJapgolly.baseui.selectTypesMod.AutosizeInputProps
import typingsJapgolly.baseui.selectTypesMod.AutosizeInputState
import typingsJapgolly.baseui.selectTypesMod.SharedStylePropsArg
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.std.Omit
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectAutosizeInputMod {
  
  @JSImport("baseui/select/autosize-input", JSImport.Default)
  @js.native
  open class default () extends AutosizeInput
  /* static members */
  object default {
    
    @JSImport("baseui/select/autosize-input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/select/autosize-input", "default.defaultProps")
    @js.native
    def defaultProps: InputRef = js.native
    inline def defaultProps_=(x: InputRef): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AutosizeInput
    extends Component[
          AutosizeInputProps & (Omit[
            ComponentProps[StyletronComponent[input, SharedStylePropsArg]], 
            /* keyof baseui.baseui/select/types.AutosizeInputProps */ value | defaultValue | inputRef | overrides | $size
          ]), 
          AutosizeInputState, 
          Any
        ] {
    
    @JSName("componentDidMount")
    def componentDidMount_MAutosizeInput(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MAutosizeInput(prevProps: AutosizeInputProps, prevState: AutosizeInputState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MAutosizeInput(): Unit = js.native
    
    var mounted: Boolean = js.native
    
    var sizer: js.UndefOr[HTMLElement | Null] = js.native
    
    def sizerRef(): Unit = js.native
    def sizerRef(el: HTMLElement): Unit = js.native
    
    @JSName("state")
    var state_AutosizeInput: InputWidth = js.native
    
    def updateInputWidth(): Unit = js.native
  }
}

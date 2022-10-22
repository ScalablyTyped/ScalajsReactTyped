package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.anon.IsActive
import typingsJapgolly.baseui.checkboxTypesMod.CheckboxProps
import typingsJapgolly.baseui.checkboxTypesMod.CheckboxState
import typingsJapgolly.baseui.checkboxTypesMod.DefaultProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxCheckboxMod {
  
  @JSImport("baseui/checkbox/checkbox", JSImport.Default)
  @js.native
  open class default () extends StatelessCheckbox
  object default {
    
    @JSImport("baseui/checkbox/checkbox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox/checkbox", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps = js.native
    inline def defaultProps_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatelessCheckbox extends Component[CheckboxProps, CheckboxState, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MStatelessCheckbox(): Unit = js.native
    
    def onBlur(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onFocus(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onMouseDown(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onMouseEnter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onMouseLeave(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onMouseUp(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    @JSName("state")
    var state_StatelessCheckbox: IsActive = js.native
  }
}

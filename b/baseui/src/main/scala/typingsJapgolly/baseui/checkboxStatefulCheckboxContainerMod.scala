package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.checkboxTypesMod.CheckboxReducerState
import typingsJapgolly.baseui.checkboxTypesMod.DefaultStatefulProps
import typingsJapgolly.baseui.checkboxTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxStatefulCheckboxContainerMod {
  
  @JSImport("baseui/checkbox/stateful-checkbox-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulCheckboxContainer {
    def this(props: StatefulContainerProps) = this()
  }
  object default {
    
    @JSImport("baseui/checkbox/stateful-checkbox-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/checkbox/stateful-checkbox-container", "default.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulCheckboxContainer extends Component[StatefulContainerProps, CheckboxReducerState, Any] {
    
    def onBlur(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onFocus(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onMouseEnter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def onMouseLeave(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def stateReducer(`type`: String, e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  }
}

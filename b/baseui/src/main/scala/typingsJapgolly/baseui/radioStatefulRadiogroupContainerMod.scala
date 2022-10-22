package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.baseui.radioTypesMod.DefaultStatefulProps
import typingsJapgolly.baseui.radioTypesMod.State
import typingsJapgolly.baseui.radioTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioStatefulRadiogroupContainerMod {
  
  @JSImport("baseui/radio/stateful-radiogroup-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulRadioGroupContainer {
    def this(props: StatefulContainerProps) = this()
  }
  object default {
    
    @JSImport("baseui/radio/stateful-radiogroup-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/radio/stateful-radiogroup-container", "default.defaultProps")
    @js.native
    def defaultProps: DefaultStatefulProps = js.native
    inline def defaultProps_=(x: DefaultStatefulProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulRadioGroupContainer extends Component[StatefulContainerProps, State, Any] {
    
    def onChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
    
    def stateReducer(`type`: String, e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  }
}

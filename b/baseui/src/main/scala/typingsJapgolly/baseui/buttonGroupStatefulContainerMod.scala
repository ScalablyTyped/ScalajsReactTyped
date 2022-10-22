package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.anon.InitialState
import typingsJapgolly.baseui.buttonGroupTypesMod.State
import typingsJapgolly.baseui.buttonGroupTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupStatefulContainerMod {
  
  @JSImport("baseui/button-group/stateful-container", JSImport.Default)
  @js.native
  open class default protected () extends StatefulContainer {
    def this(props: StatefulContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("baseui/button-group/stateful-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/button-group/stateful-container", "default.defaultProps")
    @js.native
    def defaultProps: InitialState = js.native
    inline def defaultProps_=(x: InitialState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulContainer extends Component[StatefulContainerProps, State, Any] {
    
    def changeState(nextState: State): Unit = js.native
    
    def onClick(event: ReactEventFrom[HTMLButtonElement], index: Double): Unit = js.native
  }
}

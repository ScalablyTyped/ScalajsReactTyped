package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.baseui.inputTypesMod.State
import typingsJapgolly.baseui.inputTypesMod.StateReducer
import typingsJapgolly.baseui.inputTypesMod.StateType
import typingsJapgolly.baseui.inputTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputStatefulContainerMod {
  
  @JSImport("baseui/input/stateful-container", JSImport.Default)
  @js.native
  open class default[T /* <: HTMLInputElement | HTMLTextAreaElement */] () extends StatefulContainer[T]
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/input/stateful-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      @JSImport("baseui/input/stateful-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatefulContainer[T /* <: HTMLInputElement | HTMLTextAreaElement */] extends Component[StatefulContainerProps[T], State, Any] {
    
    def internalSetState(`type`: StateType, nextState: State): Unit = js.native
    
    def onChange(e: ReactEventFrom[T & Element]): Unit = js.native
  }
}

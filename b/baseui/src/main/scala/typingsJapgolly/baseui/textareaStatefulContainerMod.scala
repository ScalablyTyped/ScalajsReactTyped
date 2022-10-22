package typingsJapgolly.baseui

import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.baseui.inputMod.StatefulContainer
import typingsJapgolly.baseui.inputTypesMod.StateReducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaStatefulContainerMod {
  
  @JSImport("baseui/textarea/stateful-container", JSImport.Default)
  @js.native
  open class default[T /* <: HTMLInputElement | HTMLTextAreaElement */] () extends StatefulContainer[T]
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/textarea/stateful-container", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      inline def onClear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClear")().asInstanceOf[Unit]
      
      @JSImport("baseui/textarea/stateful-container", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
}

package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.Items
import typingsJapgolly.baseui.dndListTypesMod.StateReducer
import typingsJapgolly.baseui.dndListTypesMod.StatefulListProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndListStatefulListMod {
  
  object default {
    
    inline def apply(props: StatefulListProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/dnd-list/stateful-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/dnd-list/stateful-list", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/dnd-list/stateful-list", "default.defaultProps.initialState")
      @js.native
      def initialState: Items = js.native
      inline def initialState_=(x: Items): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/dnd-list/stateful-list", "default.defaultProps.stateReducer")
      @js.native
      def stateReducer: StateReducer = js.native
      inline def stateReducer_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateReducer")(x.asInstanceOf[js.Any])
    }
  }
}

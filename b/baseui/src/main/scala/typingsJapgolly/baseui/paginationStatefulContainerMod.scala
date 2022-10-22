package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.StateReducer
import typingsJapgolly.baseui.baseuiStrings.changePage
import typingsJapgolly.baseui.paginationTypesMod.StatefulContainerProps
import typingsJapgolly.baseui.paginationTypesMod.StatefulContainerState
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationStatefulContainerMod {
  
  @JSImport("baseui/pagination/stateful-container", JSImport.Default)
  @js.native
  open class default () extends PaginationStatefulContainer
  /* static members */
  object default {
    
    @JSImport("baseui/pagination/stateful-container", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pagination/stateful-container", "default.defaultProps")
    @js.native
    def defaultProps: StateReducer = js.native
    inline def defaultProps_=(x: StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PaginationStatefulContainer extends Component[StatefulContainerProps, StatefulContainerState, Any] {
    
    def internalSetState(changeType: changePage, changes: StatefulContainerState): Unit = js.native
    
    var onPageChange: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/pagination/types.Callbacks['onPageChange'] */ js.Any
      ] = js.native
  }
}

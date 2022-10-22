package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.CurrentPage
import typingsJapgolly.baseui.anon.IsFocusVisible
import typingsJapgolly.baseui.anon.Labels
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.span
import typingsJapgolly.baseui.paginationPaginationMod.default
import typingsJapgolly.baseui.paginationTypesMod.StateReducerFn
import typingsJapgolly.baseui.paginationTypesMod.StatefulContainerState
import typingsJapgolly.baseui.paginationTypesMod.StatefulPaginationProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("baseui/pagination", "Pagination")
  @js.native
  open class Pagination () extends default
  /* static members */
  object Pagination {
    
    @JSImport("baseui/pagination", "Pagination")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pagination", "Pagination.defaultProps")
    @js.native
    def defaultProps: Labels = js.native
    inline def defaultProps_=(x: Labels): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/pagination", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/pagination", "SIZE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/pagination", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/pagination", "SIZE.mini")
    @js.native
    val mini: typingsJapgolly.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/pagination", "STATE_CHANGE_TYPE.changePage")
    @js.native
    val changePage: typingsJapgolly.baseui.baseuiStrings.changePage = js.native
  }
  
  @JSImport("baseui/pagination", "StatefulContainer")
  @js.native
  open class StatefulContainer ()
    extends typingsJapgolly.baseui.paginationStatefulContainerMod.default
  /* static members */
  object StatefulContainer {
    
    @JSImport("baseui/pagination", "StatefulContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/pagination", "StatefulContainer.defaultProps")
    @js.native
    def defaultProps: typingsJapgolly.baseui.anon.StateReducer = js.native
    inline def defaultProps_=(x: typingsJapgolly.baseui.anon.StateReducer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object StatefulPagination {
    
    inline def apply(hasNumPagesInitialStateStateReducerOnPageChangeProps: StatefulPaginationProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasNumPagesInitialStateStateReducerOnPageChangeProps.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/pagination", "StatefulPagination")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/pagination", "StatefulPagination.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/pagination", "StatefulPagination.defaultProps.initialState")
      @js.native
      def initialState: CurrentPage = js.native
      inline def initialState_=(x: CurrentPage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialState")(x.asInstanceOf[js.Any])
      
      inline def stateReducer(changeType: Any, changes: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stateReducer")(changeType.asInstanceOf[js.Any], changes.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
  
  @JSImport("baseui/pagination", "StyledDropdownContainer")
  @js.native
  val StyledDropdownContainer: StyletronComponent[div, IsFocusVisible] = js.native
  
  @JSImport("baseui/pagination", "StyledMaxLabel")
  @js.native
  val StyledMaxLabel: StyletronComponent[span, js.Object] = js.native
  
  @JSImport("baseui/pagination", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, js.Object] = js.native
  
  type State = StatefulContainerState
  
  type StateReducer = StateReducerFn
}

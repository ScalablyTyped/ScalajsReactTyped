package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.baseui.anon.IsFocusVisibleBoolean
import typingsJapgolly.baseui.anon.LoadingMessage
import typingsJapgolly.baseui.tableSemanticTypesMod.TableBuilderProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticTableBuilderMod {
  
  @JSImport("baseui/table-semantic/table-builder", JSImport.Default)
  @js.native
  open class default[T] () extends TableBuilder[T]
  /* static members */
  object default {
    
    @JSImport("baseui/table-semantic/table-builder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/table-semantic/table-builder", "default.defaultProps")
    @js.native
    def defaultProps: LoadingMessage = js.native
    inline def defaultProps_=(x: LoadingMessage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TableBuilder[T] extends Component[TableBuilderProps[T], IsFocusVisibleBoolean, Any] {
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
  }
}

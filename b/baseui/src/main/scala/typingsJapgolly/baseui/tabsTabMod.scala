package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.baseui.anon.IsFocusVisibleBoolean
import typingsJapgolly.baseui.tabsTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.tabsTypesMod.TabProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabMod {
  
  @JSImport("baseui/tabs/tab", JSImport.Default)
  @js.native
  open class default () extends TabComponent
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("baseui/tabs/tab", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/tabs/tab", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("baseui/tabs/tab", "default.defaultProps.expanded")
      @js.native
      def expanded: Boolean = js.native
      inline def expanded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expanded")(x.asInstanceOf[js.Any])
      
      inline def onClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick")().asInstanceOf[Unit]
      
      inline def onKeyDown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onKeyDown")().asInstanceOf[Unit]
      
      inline def onSelect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelect")().asInstanceOf[Unit]
      
      @JSImport("baseui/tabs/tab", "default.defaultProps.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabComponent extends Component[TabProps, IsFocusVisibleBoolean, Any] {
    
    def getSharedProps(): SharedStylePropsArg = js.native
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
    
    def onClick(e: Event): Unit = js.native
    
    def onKeyDown(e: KeyboardEvent): Unit = js.native
  }
}

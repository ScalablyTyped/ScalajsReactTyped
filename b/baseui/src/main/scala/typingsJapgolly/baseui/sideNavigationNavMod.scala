package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.baseui.anon.ActiveItemId
import typingsJapgolly.baseui.anon.IsFocusVisibleBoolean
import typingsJapgolly.baseui.sideNavigationTypesMod.Item
import typingsJapgolly.baseui.sideNavigationTypesMod.NavigationProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sideNavigationNavMod {
  
  @JSImport("baseui/side-navigation/nav", JSImport.Default)
  @js.native
  open class default () extends SideNav
  /* static members */
  object default {
    
    @JSImport("baseui/side-navigation/nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/side-navigation/nav", "default.defaultProps")
    @js.native
    def defaultProps: ActiveItemId = js.native
    inline def defaultProps_=(x: ActiveItemId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SideNav extends Component[NavigationProps, IsFocusVisibleBoolean, Any] {
    
    def activePredicate(item: Item): Boolean = js.native
    
    def handleBlur(event: ReactEventFrom[Element]): Unit = js.native
    
    def handleFocus(event: ReactEventFrom[Element]): Unit = js.native
  }
}

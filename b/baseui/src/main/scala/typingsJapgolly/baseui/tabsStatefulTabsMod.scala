package typingsJapgolly.baseui

import typingsJapgolly.baseui.anon.ActiveKeyAny
import typingsJapgolly.baseui.anon.PartialStatefulTabsProps
import typingsJapgolly.baseui.tabsTypesMod.StateChangeType
import typingsJapgolly.baseui.tabsTypesMod.StatefulTabsProps
import typingsJapgolly.baseui.tabsTypesMod.StatefulTabsState
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsStatefulTabsMod {
  
  @JSImport("baseui/tabs/stateful-tabs", JSImport.Default)
  @js.native
  open class default () extends StatefulTabs
  /* static members */
  object default {
    
    @JSImport("baseui/tabs/stateful-tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/tabs/stateful-tabs", "default.defaultProps")
    @js.native
    def defaultProps: PartialStatefulTabsProps = js.native
    inline def defaultProps_=(x: PartialStatefulTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait StatefulTabs extends Component[StatefulTabsProps, StatefulTabsState, Any] {
    
    def getInitialKey(): Any = js.native
    
    def internalSetState(`type`: StateChangeType, changes: StatefulTabsState): Unit = js.native
    
    def onTabChange(newState: StatefulTabsState): Unit = js.native
    
    @JSName("state")
    var state_StatefulTabs: ActiveKeyAny = js.native
  }
}

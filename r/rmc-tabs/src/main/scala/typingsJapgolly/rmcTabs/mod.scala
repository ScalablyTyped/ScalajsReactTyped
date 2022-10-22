package typingsJapgolly.rmcTabs

import typingsJapgolly.rmcTabs.anon.TypeofDefaultTabBar
import typingsJapgolly.rmcTabs.libDefaultTabBarMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  open class DefaultTabBar protected ()
    extends typingsJapgolly.rmcTabs.libDefaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typingsJapgolly.rmcTabs.libTabsMod.Tabs {
    def this(props: typingsJapgolly.rmcTabs.libTabsMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: typingsJapgolly.rmcTabs.libTabsMod.PropsType = js.native
    inline def defaultProps_=(x: typingsJapgolly.rmcTabs.libTabsMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}

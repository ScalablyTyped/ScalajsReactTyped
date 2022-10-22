package typingsJapgolly.rmcTabs

import typingsJapgolly.rmcTabs.anon.TypeofDefaultTabBar
import typingsJapgolly.rmcTabs.libDefaultTabBarDotnativeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIndexDotnativeMod {
  
  @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar")
  @js.native
  open class DefaultTabBar protected ()
    extends typingsJapgolly.rmcTabs.libDefaultTabBarDotnativeMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs/lib/index.native", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typingsJapgolly.rmcTabs.libTabsDotnativeMod.Tabs {
    def this(props: typingsJapgolly.rmcTabs.libTabsDotnativeMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs.defaultProps")
    @js.native
    def defaultProps: typingsJapgolly.rmcTabs.libTabsDotnativeMod.PropsType = js.native
    inline def defaultProps_=(x: typingsJapgolly.rmcTabs.libTabsDotnativeMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}

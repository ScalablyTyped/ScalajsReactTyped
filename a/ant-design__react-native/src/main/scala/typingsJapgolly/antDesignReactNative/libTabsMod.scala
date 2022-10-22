package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.anon.TypeofDefaultTabBar
import typingsJapgolly.antDesignReactNative.libTabsPropsTypeMod.PropsType
import typingsJapgolly.antDesignReactNative.libTabsTabsMod.Tabs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsMod {
  
  @JSImport("@ant-design/react-native/lib/tabs", JSImport.Default)
  @js.native
  open class default protected () extends Tabs {
    def this(props: PropsType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/tabs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/tabs", "default.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/tabs", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}

package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarDividerSidebarDividerMod {
  
  /** A divider within the sidebar that supports inner and full mode */
  @JSImport("wix-style-react/dist/types/SidebarDivider/SidebarDivider", JSImport.Default)
  @js.native
  open class default protected () extends SidebarDivider {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SidebarDivider/SidebarDivider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SidebarDivider/SidebarDivider", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SidebarDivider/SidebarDivider", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/SidebarDivider/SidebarDivider", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Indicates whether to remove the margin from sides */
      @JSImport("wix-style-react/dist/types/SidebarDivider/SidebarDivider", "default.propTypes.fullWidth")
      @js.native
      def fullWidth: Requireable[Boolean] = js.native
      inline def fullWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(x.asInstanceOf[js.Any])
    }
  }
  
  /** A divider within the sidebar that supports inner and full mode */
  @js.native
  trait SidebarDivider extends PureComponent[Any, Any, Any]
}

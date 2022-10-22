package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.ResizeObserver
import typingsJapgolly.wixStyleReact.anon.ContainerClasses
import typingsJapgolly.wixStyleReact.anon.IsScrollbarDisplayed
import typingsJapgolly.wixStyleReact.anon.SkinString
import typingsJapgolly.wixStyleReact.wixStyleReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSidebarContentWrapperMod {
  
  @JSImport("wix-style-react/dist/types/Sidebar/SidebarContentWrapper", "SidebarContentWrapper")
  @js.native
  open class SidebarContentWrapper protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    
    def _handleChildrenResize(): Unit = js.native
    
    def _shouldAddGradient(): Unit = js.native
    
    var childrenContainerRef: RefHandle[Any] = js.native
    
    var childrenContentRef: RefHandle[Any] = js.native
    
    var childrenResizeObserver: `false` | ResizeObserver = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSidebarContentWrapper(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSidebarContentWrapper(): Unit = js.native
    
    @JSName("state")
    var state_SidebarContentWrapper: IsScrollbarDisplayed = js.native
  }
  /* static members */
  object SidebarContentWrapper {
    
    @JSImport("wix-style-react/dist/types/Sidebar/SidebarContentWrapper", "SidebarContentWrapper")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Sidebar/SidebarContentWrapper", "SidebarContentWrapper.defaultProps")
    @js.native
    def defaultProps: SkinString = js.native
    inline def defaultProps_=(x: SkinString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Sidebar/SidebarContentWrapper", "SidebarContentWrapper.propTypes")
    @js.native
    def propTypes: ContainerClasses = js.native
    inline def propTypes_=(x: ContainerClasses): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}

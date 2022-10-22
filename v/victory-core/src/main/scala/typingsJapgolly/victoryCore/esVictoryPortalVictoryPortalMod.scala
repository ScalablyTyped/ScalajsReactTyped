package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.victoryCore.anon.GroupComponent
import typingsJapgolly.victoryCore.anon.GroupComponentElement
import typingsJapgolly.victoryCore.esVictoryPortalPortalContextMod.PortalContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPortalVictoryPortalMod {
  
  @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal")
  @js.native
  open class VictoryPortal protected ()
    extends Component[VictoryPortalProps, js.Object, Any] {
    def this(props: VictoryPortalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryPortalProps, context: Any) = this()
    
    /* private */ var checkedContext: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MVictoryPortal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MVictoryPortal(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVictoryPortal(): Unit = js.native
    
    @JSName("context")
    var context_VictoryPortal: ContextType[Context[PortalContextValue]] = js.native
    
    /* private */ var element: Any = js.native
    
    /* private */ var portalKey: Any = js.native
    
    /* private */ var renderInPlace: Any = js.native
    
    def renderPortal(child: Element): Element | Null = js.native
  }
  /* static members */
  object VictoryPortal {
    
    @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal.contextType")
    @js.native
    def contextType: Context[PortalContextValue] = js.native
    inline def contextType_=(x: Context[PortalContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal.defaultProps")
    @js.native
    def defaultProps: GroupComponentElement = js.native
    inline def defaultProps_=(x: GroupComponentElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal.propTypes")
    @js.native
    def propTypes: GroupComponent = js.native
    inline def propTypes_=(x: GroupComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-portal/victory-portal", "VictoryPortal.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryPortalProps extends StObject {
    
    var children: js.UndefOr[Element] = js.undefined
    
    var groupComponent: js.UndefOr[Element] = js.undefined
  }
  object VictoryPortalProps {
    
    inline def apply(): VictoryPortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryPortalProps]
    }
    
    extension [Self <: VictoryPortalProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
    }
  }
}

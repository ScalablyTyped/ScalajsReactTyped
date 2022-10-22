package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.anon.DrawerWidth
import typingsJapgolly.antDesignReactNative.libDrawerPropsTypeMod.DrawerProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDrawerMod {
  
  @JSImport("@ant-design/react-native/lib/drawer", JSImport.Default)
  @js.native
  open class default () extends Drawer
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/drawer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/drawer", "default.defaultProps")
    @js.native
    def defaultProps: DrawerWidth = js.native
    inline def defaultProps_=(x: DrawerWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Drawer extends Component[DrawerNativeProps, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDrawer(nextProps: DrawerNativeProps): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawer(): Unit = js.native
    
    var drawer: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DrawerLayout */ Any) | Null = js.native
    
    def onOpenChange(isOpen: Boolean): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DrawerLayoutProps * / any ]:? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DrawerLayoutProps * / any[P]} */ trait DrawerNativeProps
    extends StObject
       with DrawerProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var drawerBackgroundColor: js.UndefOr[String] = js.undefined
    
    var drawerRef: js.UndefOr[
        js.Function1[
          /* el */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DrawerLayout */ Any) | Null, 
          Unit
        ]
      ] = js.undefined
    
    var drawerWidth: js.UndefOr[Double] = js.undefined
  }
  object DrawerNativeProps {
    
    inline def apply(): DrawerNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerNativeProps]
    }
    
    extension [Self <: DrawerNativeProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      inline def setDrawerRef(
        value: /* el */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DrawerLayout */ Any) | Null => Callback
      ): Self = StObject.set(x, "drawerRef", js.Any.fromFunction1((t0: /* el */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DrawerLayout */ Any) | Null) => value(t0).runNow()))
      
      inline def setDrawerRefUndefined: Self = StObject.set(x, "drawerRef", js.undefined)
      
      inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
    }
  }
}

package typingsJapgolly.atlaskitAnalyticsNext

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.atlaskitAnalyticsNext.anon.GetAtlaskitAnalyticsContext
import typingsJapgolly.atlaskitAnalyticsNextStableReactContext.distCjsTypesMod.AnalyticsReactContextInterface
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAnalyticsContextLegacyAnalyticsContextMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", JSImport.Default)
  @js.native
  open class default protected () extends AnalyticsContext {
    def this(props: Props) = this()
  }
  object default {
    
    /* static member */
    object childContextTypes {
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", "default.childContextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", "default.childContextTypes.getAtlaskitAnalyticsContext")
      @js.native
      def getAtlaskitAnalyticsContext: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsContext_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsContext")(x.asInstanceOf[js.Any])
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", "default.childContextTypes.getAtlaskitAnalyticsEventHandlers")
      @js.native
      def getAtlaskitAnalyticsEventHandlers: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsEventHandlers_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsEventHandlers")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object contextTypes {
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", "default.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", "default.contextTypes.getAtlaskitAnalyticsContext")
      @js.native
      def getAtlaskitAnalyticsContext: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsContext_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsContext")(x.asInstanceOf[js.Any])
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsContext/LegacyAnalyticsContext", "default.contextTypes.getAtlaskitAnalyticsEventHandlers")
      @js.native
      def getAtlaskitAnalyticsEventHandlers: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsEventHandlers_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsEventHandlers")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnalyticsContext extends Component[Props, AnalyticsReactContextInterface, Any] {
    
    var contextValue: AnalyticsReactContextInterface = js.native
    
    def getAnalyticsContext(): js.Array[Any] = js.native
    
    def getAnalyticsEventHandlers(): Any = js.native
    
    def getChildContext(): GetAtlaskitAnalyticsContext = js.native
  }
  
  trait Props extends StObject {
    
    /** Children! */
    var children: Node
    
    /** Arbitrary data. Any events created below this component in the tree will
      * have this added as an item in their context array. */
    var data: js.Object
  }
  object Props {
    
    inline def apply(data: js.Object): Props = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}

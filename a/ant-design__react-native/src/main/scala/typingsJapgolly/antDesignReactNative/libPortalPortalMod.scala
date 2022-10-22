package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalPortalMod {
  
  /**
    * Portal allows to render a component at a different place in the parent tree.
    * You can use it to render content which should appear above other elements, similar to `Modal`.
    * It requires a [`Portal.Host`](portal-host.html) component to be rendered somewhere in the parent tree.
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Portal, Text } from '@ant-design/react-native';
    *
    * export default class MyComponent extends React.Component {
    *   render() {
    *     const { visible } = this.state;
    *     return (
    *       <Portal>
    *         <Text>This is rendered at a different place</Text>
    *       </Portal>
    *     );
    *   }
    * }
    * ```
    */
  @JSImport("@ant-design/react-native/lib/portal/portal", JSImport.Default)
  @js.native
  open class default () extends Portal
  object default {
    
    @JSImport("@ant-design/react-native/lib/portal/portal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof PortalHost` */
    @JSImport("@ant-design/react-native/lib/portal/portal", "default.Host")
    @js.native
    open class Host ()
      extends typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.default
    /* static members */
    object Host {
      
      @JSImport("@ant-design/react-native/lib/portal/portal", "default.Host")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/portal/portal", "default.Host.displayName")
      @js.native
      def displayName: String = js.native
      inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/portal/portal", "default.add")
    @js.native
    def add: js.Function1[/* e */ Node, Double] = js.native
    inline def add_=(x: js.Function1[/* e */ Node, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/portal/portal", "default.remove")
    @js.native
    def remove: js.Function1[/* key */ Double, Unit] = js.native
    inline def remove_=(x: js.Function1[/* key */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Portal allows to render a component at a different place in the parent tree.
    * You can use it to render content which should appear above other elements, similar to `Modal`.
    * It requires a [`Portal.Host`](portal-host.html) component to be rendered somewhere in the parent tree.
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Portal, Text } from '@ant-design/react-native';
    *
    * export default class MyComponent extends React.Component {
    *   render() {
    *     const { visible } = this.state;
    *     return (
    *       <Portal>
    *         <Text>This is rendered at a different place</Text>
    *       </Portal>
    *     );
    *   }
    * }
    * ```
    */
  @js.native
  trait Portal
    extends Component[PortalProps, js.Object, Any]
  object Portal {
    
    /* was `typeof PortalHost` */
    type Host = typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.default
  }
  
  trait PortalProps extends StObject {
    
    /**
      * Content of the `Portal`.
      */
    var children: js.UndefOr[Node] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}

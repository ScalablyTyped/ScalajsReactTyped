package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/portal", JSImport.Namespace)
@js.native
object portalMod extends js.Object {
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
  class default ()
    extends typingsJapgolly.antDesignReactNative.portalPortalMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Host: TypeofPortalHost = js.native
    def add(e: Node): Double = js.native
    def remove(key: Double): Unit = js.native
  }
  
}


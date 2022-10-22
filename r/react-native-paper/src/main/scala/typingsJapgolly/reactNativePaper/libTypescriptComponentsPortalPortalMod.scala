package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePaper.anon.PickPropschildrenthemeDee
import typingsJapgolly.reactNativePaper.anon.TypeofPortal
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsPortalPortalMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/Portal", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropschildrenthemeDee] & (NonReactStatics[ComponentType[Props] & TypeofPortal & Instantiable0[Portal], js.Object]) = js.native
  
  /**
    * Portal allows to render a component at a different place in the parent tree.
    * You can use it to render content which should appear above other elements, similar to `Modal`.
    * It requires a [`Portal.Host`](portal-host.html) component to be rendered somewhere in the parent tree.
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Portal, Text } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <Portal>
    *     <Text>This is rendered at a different place</Text>
    *   </Portal>
    * );
    *
    * export default MyComponent;
    * ```
    */
  @js.native
  trait Portal
    extends Component[Props, js.Object, Any]
  object Portal {
    
    /* was `typeof PortalHost` */
    type Host = typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.default
  }
  
  trait Props extends StObject {
    
    /**
      * Content of the `Portal`.
      */
    var children: Node
    
    /**
      * @optional
      */
    var theme: Theme
  }
  object Props {
    
    inline def apply(theme: Theme): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropschildrenthemeDee] & (NonReactStatics[ComponentType[Props] & TypeofPortal & Instantiable0[Portal], js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsPortalPortalMod.foo` */
  override def _to: ComponentType[PickPropschildrenthemeDee] & (NonReactStatics[ComponentType[Props] & TypeofPortal & Instantiable0[Portal], js.Object]) = default
}

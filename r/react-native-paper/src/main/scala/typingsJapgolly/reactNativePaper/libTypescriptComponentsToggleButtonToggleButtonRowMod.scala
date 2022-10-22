package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsToggleButtonToggleButtonRowMod {
  
  /**
    * Toggle button row renders a group of toggle buttons in a row.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/toggle-button-row.gif" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { ToggleButton } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('left');
    *
    *   return (
    *     <ToggleButton.Row onValueChange={value => setValue(value)} value={value}>
    *       <ToggleButton icon="format-align-left" value="left" />
    *       <ToggleButton icon="format-align-right" value="right" />
    *     </ToggleButton.Row>
    *   );
    * };
    *
    * export default MyComponent;
    *
    *```
    */
  object default {
    
    inline def apply(hasValueOnValueChangeChildrenStyle: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueOnValueChangeChildrenStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Toggle button row renders a group of toggle buttons in a row.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/toggle-button-row.gif" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { ToggleButton } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('left');
    *
    *   return (
    *     <ToggleButton.Row onValueChange={value => setValue(value)} value={value}>
    *       <ToggleButton icon="format-align-left" value="left" />
    *       <ToggleButton icon="format-align-right" value="right" />
    *     </ToggleButton.Row>
    *   );
    * };
    *
    * export default MyComponent;
    *
    *```
    */
  object ToggleButtonRow {
    
    inline def apply(hasValueOnValueChangeChildrenStyle: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueOnValueChangeChildrenStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", "ToggleButtonRow")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonRow", "ToggleButtonRow.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    /**
      * React elements containing toggle buttons.
      */
    var children: Node
    
    /**
      * Function to execute on selection change.
      */
    def onValueChange(value: String): Unit
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Value of the currently selected toggle button.
      */
    var value: String
  }
  object Props {
    
    inline def apply(onValueChange: String => Callback, value: String): Props = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1((t0: String) => onValueChange(t0).runNow()), value = value.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnValueChange(value: String => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

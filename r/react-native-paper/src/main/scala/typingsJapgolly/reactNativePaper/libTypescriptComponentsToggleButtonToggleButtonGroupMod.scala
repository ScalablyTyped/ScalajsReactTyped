package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsToggleButtonToggleButtonGroupMod {
  
  /**
    * Toggle group allows to control a group of toggle buttons.</br>
    * It doesn't change the appearance of the toggle buttons. If you want to group them in a row, check out <a href="toggle-button-row.html">`ToggleButton.Row`</a>.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/toggle-button-group.gif" />
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
    *     <ToggleButton.Group
    *       onValueChange={value => setValue(value)}
    *       value={value}>
    *       <ToggleButton icon="format-align-left" value="left" />
    *       <ToggleButton icon="format-align-right" value="right" />
    *     </ToggleButton.Group>
    *   );
    * };
    *
    * export default MyComponent;
    *```
    */
  object default {
    
    inline def apply(hasValueOnValueChangeChildren: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueOnValueChangeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonGroup", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Toggle group allows to control a group of toggle buttons.</br>
    * It doesn't change the appearance of the toggle buttons. If you want to group them in a row, check out <a href="toggle-button-row.html">`ToggleButton.Row`</a>.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/toggle-button-group.gif" />
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
    *     <ToggleButton.Group
    *       onValueChange={value => setValue(value)}
    *       value={value}>
    *       <ToggleButton icon="format-align-left" value="left" />
    *       <ToggleButton icon="format-align-right" value="right" />
    *     </ToggleButton.Group>
    *   );
    * };
    *
    * export default MyComponent;
    *```
    */
  object ToggleButtonGroup {
    
    inline def apply(hasValueOnValueChangeChildren: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueOnValueChangeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonGroup", "ToggleButtonGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonGroup", "ToggleButtonGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/ToggleButton/ToggleButtonGroup", "ToggleButtonGroupContext")
  @js.native
  val ToggleButtonGroupContext: Context[ToggleButtonContextType] = js.native
  
  trait Props extends StObject {
    
    /**
      * React elements containing toggle buttons.
      */
    var children: Node
    
    /**
      * Function to execute on selection change.
      */
    def onValueChange(value: String): Unit | Null
    
    /**
      * Value of the currently selected toggle button.
      */
    var value: String | Null
  }
  object Props {
    
    inline def apply(onValueChange: String => Unit | Null): Props = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), children = null, value = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnValueChange(value: String => Unit | Null): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait ToggleButtonContextType extends StObject {
    
    def onValueChange(item: String): Unit | Null
    
    var value: String | Null
  }
  object ToggleButtonContextType {
    
    inline def apply(onValueChange: String => Unit | Null): ToggleButtonContextType = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1(onValueChange), value = null)
      __obj.asInstanceOf[ToggleButtonContextType]
    }
    
    extension [Self <: ToggleButtonContextType](x: Self) {
      
      inline def setOnValueChange(value: String => Unit | Null): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}

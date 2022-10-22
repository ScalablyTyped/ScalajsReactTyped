package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
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

object libTypescriptComponentsRadioButtonRadioButtonGroupMod {
  
  /**
    * Radio button group allows to control a group of radio buttons.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-android.gif" />
    *  <figcaption>Android</figcaption>
    *   </figure>
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-ios.gif" />
    *  <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View } from 'react-native';
    * import { RadioButton, Text } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('first');
    *
    *   return (
    *     <RadioButton.Group onValueChange={newValue => setValue(newValue)} value={value}>
    *       <View>
    *         <Text>First</Text>
    *         <RadioButton value="first" />
    *       </View>
    *       <View>
    *         <Text>Second</Text>
    *         <RadioButton value="second" />
    *       </View>
    *     </RadioButton.Group>
    *   );
    * };
    *
    * export default MyComponent;
    *```
    */
  object default {
    
    inline def apply(hasValueOnValueChangeChildren: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueOnValueChangeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonContext")
  @js.native
  val RadioButtonContext: Context[RadioButtonContextType] = js.native
  
  /**
    * Radio button group allows to control a group of radio buttons.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-android.gif" />
    *  <figcaption>Android</figcaption>
    *   </figure>
    *   <figure>
    *     <img class="medium" src="screenshots/radio-button-group-ios.gif" />
    *  <figcaption>iOS</figcaption>
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View } from 'react-native';
    * import { RadioButton, Text } from 'react-native-paper';
    *
    * const MyComponent = () => {
    *   const [value, setValue] = React.useState('first');
    *
    *   return (
    *     <RadioButton.Group onValueChange={newValue => setValue(newValue)} value={value}>
    *       <View>
    *         <Text>First</Text>
    *         <RadioButton value="first" />
    *       </View>
    *       <View>
    *         <Text>Second</Text>
    *         <RadioButton value="second" />
    *       </View>
    *     </RadioButton.Group>
    *   );
    * };
    *
    * export default MyComponent;
    *```
    */
  object RadioButtonGroup {
    
    inline def apply(hasValueOnValueChangeChildren: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueOnValueChangeChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/RadioButton/RadioButtonGroup", "RadioButtonGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    /**
      * React elements containing radio buttons.
      */
    var children: Node
    
    /**
      * Function to execute on selection change.
      */
    def onValueChange(value: String): Unit
    
    /**
      * Value of the currently selected radio button.
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
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RadioButtonContextType extends StObject {
    
    def onValueChange(item: String): Unit
    
    var value: String
  }
  object RadioButtonContextType {
    
    inline def apply(onValueChange: String => Callback, value: String): RadioButtonContextType = {
      val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction1((t0: String) => onValueChange(t0).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioButtonContextType]
    }
    
    extension [Self <: RadioButtonContextType](x: Self) {
      
      inline def setOnValueChange(value: String => Callback): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

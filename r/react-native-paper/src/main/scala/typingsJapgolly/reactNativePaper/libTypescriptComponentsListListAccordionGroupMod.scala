package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.ExpandedId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListAccordionGroupMod {
  
  /**
    * List.AccordionGroup allows to control a group of List Accordions. `id` prop for List.Accordion is required in order for group to work.
    * List.AccordionGroup can be a controlled or uncontrolled component. The example shows the uncontrolled version.
    * At most one Accordion can be expanded at a given time.
    *
    * <div class="screenshots">
    *   <img class="medium" src="screenshots/list-accordion-group.png" />
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { View, Text } from 'react-native';
    * import { List } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <List.AccordionGroup>
    *     <List.Accordion title="Accordion 1" id="1">
    *       <List.Item title="Item 1" />
    *     </List.Accordion>
    *     <List.Accordion title="Accordion 2" id="2">
    *       <List.Item title="Item 2" />
    *     </List.Accordion>
    *     <View>
    *       <Text>
    *         List.Accordion can be wrapped because implementation uses React.Context.
    *       </Text>
    *       <List.Accordion title="Accordion 3" id="3">
    *         <List.Item title="Item 3" />
    *       </List.Accordion>
    *     </View>
    *   </List.AccordionGroup>
    * );
    *
    * export default MyComponent;
    *```
    */
  object default {
    
    inline def apply(hasExpandedIdPropOnAccordionPressChildren: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasExpandedIdPropOnAccordionPressChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/ListAccordionGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/ListAccordionGroup", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListAccordionGroup", "ListAccordionGroupContext")
  @js.native
  val ListAccordionGroupContext: Context[ListAccordionGroupContextType] = js.native
  
  type ListAccordionGroupContextType = ExpandedId | Null
  
  trait Props extends StObject {
    
    /**
      * React elements containing list accordions
      */
    var children: Node
    
    /**
      * Id of the currently expanded list accordion
      */
    var expandedId: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Function to execute on selection change.
      */
    var onAccordionPress: js.UndefOr[js.Function1[/* expandedId */ String | Double, Unit]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpandedId(value: String | Double): Self = StObject.set(x, "expandedId", value.asInstanceOf[js.Any])
      
      inline def setExpandedIdUndefined: Self = StObject.set(x, "expandedId", js.undefined)
      
      inline def setOnAccordionPress(value: /* expandedId */ String | Double => Callback): Self = StObject.set(x, "onAccordionPress", js.Any.fromFunction1((t0: /* expandedId */ String | Double) => value(t0).runNow()))
      
      inline def setOnAccordionPressUndefined: Self = StObject.set(x, "onAccordionPress", js.undefined)
    }
  }
}

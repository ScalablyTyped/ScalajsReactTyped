package typingsJapgolly.reactNativePaper

import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Call
import typingsJapgolly.reactNativePaper.anon.CallHasChildrenTitleTitleStyleStyleRest
import typingsJapgolly.reactNativePaper.anon.CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel
import typingsJapgolly.reactNativePaper.anon.CallHasLeftRightTitleDescriptionOnPressThemeStyleTitleStyleTitleNumberOfLinesDescriptionNumberOfLinesTitleEllipsizeModeDescriptionEllipsizeModeDescriptionStyleRest
import typingsJapgolly.reactNativePaper.anon.CallHasStyleThemeRest
import typingsJapgolly.reactNativePaper.anon.Description
import typingsJapgolly.reactNativePaper.anon.PickPropsstyletitlechildr
import typingsJapgolly.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityViewIsModal
import typingsJapgolly.reactNativePaper.anon.PickTouchableWithoutFeedb
import typingsJapgolly.reactNativePaper.anon.PickViewPropsRefAttributeAccessibilityValue
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAdjustsFontSizeToFit
import typingsJapgolly.reactNativePaper.anon.PickthemeDeepPartialThemeAllowFontScaling
import typingsJapgolly.reactNativePaper.anon.TouchableWithoutFeedbackP
import typingsJapgolly.reactNativePaper.anon.ViewPropsRefAttributesVieAccessibilityState
import typingsJapgolly.reactNativePaper.libTypescriptComponentsListListAccordionMod.Props
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListMod {
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Accordion")
  @js.native
  val Accordion: ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ]) = js.native
  
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
  object AccordionGroup {
    
    inline def apply(
      hasExpandedIdPropOnAccordionPressChildren: typingsJapgolly.reactNativePaper.libTypescriptComponentsListListAccordionGroupMod.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasExpandedIdPropOnAccordionPressChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "AccordionGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "AccordionGroup.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /**
    * A component to show an icon in a list item.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/list-icon.png" />
    *   </figure>
    * </div>
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { List, Colors } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *   <>
    *     <List.Icon color={Colors.blue500} icon="folder" />
    *     <List.Icon color={Colors.blue500} icon="equal" />
    *     <List.Icon color={Colors.blue500} icon="calendar" />
    *   </>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object Icon {
    
    inline def apply(
      hasIconIconColorStyle: typingsJapgolly.reactNativePaper.libTypescriptComponentsListListIconMod.Props
    ): Element = ^.asInstanceOf[js.Dynamic].apply(hasIconIconColorStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "Icon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/List/List", "Icon.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Item")
  @js.native
  val Item: ComponentType[PickRemoveChildrenComponeAccessibilityViewIsModal] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & Description
    ]) & CallHasLeftRightTitleDescriptionOnPressThemeStyleTitleStyleTitleNumberOfLinesDescriptionNumberOfLinesTitleEllipsizeModeDescriptionEllipsizeModeDescriptionStyleRest, 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Section")
  @js.native
  val Section: ComponentType[PickViewPropsRefAttributeAccessibilityValue] & (NonReactStatics[
    ComponentType[ViewPropsRefAttributesVieAccessibilityState] & CallHasChildrenTitleTitleStyleStyleRest, 
    js.Object
  ]) = js.native
  
  @JSImport("react-native-paper/lib/typescript/components/List/List", "Subheader")
  @js.native
  val Subheader: (ComponentType[
    PickthemeDeepPartialThemeAdjustsFontSizeToFit | PickthemeDeepPartialThemeAllowFontScaling
  ]) & (NonReactStatics[
    (ComponentType[
      typingsJapgolly.reactNativePaper.libTypescriptComponentsListListSubheaderMod.Props
    ]) & CallHasStyleThemeRest, 
    js.Object
  ]) = js.native
}

package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeElements.anon.ButtonGroupPropsPartialTh
import typingsJapgolly.reactNativeElements.anon.ForwardRefExoticComponentAccordion
import typingsJapgolly.reactNativeElements.anon.FunctionComponentPickTouc
import typingsJapgolly.reactNativeElements.anon.PartialIconPropsPartialThAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.PickButtonGroupPropsParti
import typingsJapgolly.reactNativeElements.anon.PickPartialIconPropsPartiAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.PickTextInputPropsRefAttrAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.PickTextPropsrightboolean
import typingsJapgolly.reactNativeElements.anon.PickTouchableOpacityPropsAccessibilityElementsHidden
import typingsJapgolly.reactNativeElements.anon.PickcontainerStyleStylePrAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.PickstyleStylePropTextSty
import typingsJapgolly.reactNativeElements.anon.TextInputPropsRefAttributAccessibilityElementsHidden
import typingsJapgolly.reactNativeElements.anon.TextPropsrightbooleanundeAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.TextPropsrightbooleanundeAccessibilityElementsHidden
import typingsJapgolly.reactNativeElements.anon.TouchableOpacityPropsChecAccessibilityElementsHidden
import typingsJapgolly.reactNativeElements.anon.containerStyleStylePropViAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.styleStylePropTextStyleunAccessibilityActions
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import typingsJapgolly.reactNativeElements.distListListItemBaseMod.ListItemProps
import typingsJapgolly.reactNativeElements.distListListItemSwipeableMod.ListItemSwipeableProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItem", JSImport.Default)
  @js.native
  val default: FunctionComponentPickTouc | ForwardRefExoticComponentAccordion = js.native
  
  @js.native
  trait ListItem
    extends StObject
       with FunctionComponent[ListItemProps & Partial[ThemeProps[ListItemProps]]] {
    
    var Accordion: FunctionComponent[PickcontainerStyleStylePrAccessibilityActions] | ForwardRefExoticComponent[containerStyleStylePropViAccessibilityActions] = js.native
    
    var ButtonGroup: FunctionComponent[PickButtonGroupPropsParti] | ForwardRefExoticComponent[ButtonGroupPropsPartialTh] = js.native
    
    var CheckBox: FunctionComponent[PickTouchableOpacityPropsAccessibilityElementsHidden] | ForwardRefExoticComponent[TouchableOpacityPropsChecAccessibilityElementsHidden] = js.native
    
    var Chevron: FunctionComponent[PickPartialIconPropsPartiAccessibilityActions] | ForwardRefExoticComponent[PartialIconPropsPartialThAccessibilityActions] = js.native
    
    var Content: FunctionComponent[PickstyleStylePropTextSty] | ForwardRefExoticComponent[styleStylePropTextStyleunAccessibilityActions] = js.native
    
    var Input: FunctionComponent[PickTextInputPropsRefAttrAccessibilityActions] | ForwardRefExoticComponent[TextInputPropsRefAttributAccessibilityElementsHidden] = js.native
    
    var Subtitle: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityElementsHidden] = js.native
    
    var Swipeable: RneFunctionComponent[ListItemSwipeableProps] = js.native
    
    var Title: FunctionComponent[PickTextPropsrightboolean] | ForwardRefExoticComponent[TextPropsrightbooleanundeAccessibilityActions] = js.native
  }
  @JSImport("react-native-elements/dist/list/ListItem", "ListItem")
  @js.native
  val ListItem: typingsJapgolly.reactNativeElements.distListListItemMod.ListItem = js.native
  
  type _To = FunctionComponentPickTouc | ForwardRefExoticComponentAccordion
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemMod.foo` */
  override def _to: FunctionComponentPickTouc | ForwardRefExoticComponentAccordion = default
}

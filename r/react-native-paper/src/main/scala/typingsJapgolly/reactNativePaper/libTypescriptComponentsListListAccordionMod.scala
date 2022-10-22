package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.GestureResponderEvent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel
import typingsJapgolly.reactNativePaper.anon.ColorString
import typingsJapgolly.reactNativePaper.anon.IsExpanded
import typingsJapgolly.reactNativePaper.anon.PickPropsstyletitlechildr
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsListListAccordionMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/List/ListAccordion", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Accessibility label for the TouchableRipple. This is read by the screen reader when the user taps the touchable.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Content of the section.
      */
    var children: Node
    
    /**
      * Description text for the list accordion.
      */
    var description: js.UndefOr[Node] = js.undefined
    
    /**
      * Truncate Description text such that the total number of lines does not
      * exceed this number.
      */
    var descriptionNumberOfLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Style that is passed to Description element.
      */
    var descriptionStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Whether the accordion is expanded
      * If this prop is provided, the accordion will behave as a "controlled component".
      * You'll need to update this prop when you want to toggle the component or on `onPress`.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Id is used for distinguishing specific accordion when using List.AccordionGroup. Property is required when using List.AccordionGroup and has no impact on behavior when using standalone List.Accordion.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Callback which returns a React element to display on the left side.
      */
    var left: js.UndefOr[js.Function1[/* props */ ColorString, Node]] = js.undefined
    
    /**
      * Function to execute on long press.
      */
    var onLongPress: js.UndefOr[js.Function1[/* e */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Function to execute on press.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback which returns a React element to display on the right side.
      */
    var right: js.UndefOr[js.Function1[/* props */ IsExpanded, Node]] = js.undefined
    
    /**
      * Style that is passed to the wrapping TouchableRipple element.
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * TestID used for testing purposes
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Title text for the list accordion.
      */
    var title: Node
    
    /**
      * Truncate Title text such that the total number of lines does not
      * exceed this number.
      */
    var titleNumberOfLines: js.UndefOr[Double] = js.undefined
    
    /**
      * Style that is passed to Title element.
      */
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  }
  object Props {
    
    inline def apply(theme: Theme): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], children = null, title = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionNumberOfLines(value: Double): Self = StObject.set(x, "descriptionNumberOfLines", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNumberOfLinesUndefined: Self = StObject.set(x, "descriptionNumberOfLines", js.undefined)
      
      inline def setDescriptionStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "descriptionStyle", value.asInstanceOf[js.Any])
      
      inline def setDescriptionStyleNull: Self = StObject.set(x, "descriptionStyle", null)
      
      inline def setDescriptionStyleUndefined: Self = StObject.set(x, "descriptionStyle", js.undefined)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLeft(value: /* props */ ColorString => Node): Self = StObject.set(x, "left", js.Any.fromFunction1(value))
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setOnLongPress(value: /* e */ GestureResponderEvent => Callback): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1((t0: /* e */ GestureResponderEvent) => value(t0).runNow()))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRight(value: /* props */ IsExpanded => Node): Self = StObject.set(x, "right", js.Any.fromFunction1(value))
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleNumberOfLines(value: Double): Self = StObject.set(x, "titleNumberOfLines", value.asInstanceOf[js.Any])
      
      inline def setTitleNumberOfLinesUndefined: Self = StObject.set(x, "titleNumberOfLines", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsListListAccordionMod.foo` */
  override def _to: ComponentType[PickPropsstyletitlechildr] & (NonReactStatics[
    ComponentType[Props] & CallHasLeftRightTitleDescriptionChildrenThemeTitleStyleDescriptionStyleTitleNumberOfLinesDescriptionNumberOfLinesStyleIdTestIDOnPressOnLongPressExpandedPropAccessibilityLabel, 
    js.Object
  ]) = default
}

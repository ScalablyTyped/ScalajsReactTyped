package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.PickPropsstylechildrentes
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsModalMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/Modal", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstylechildrentes] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDismissableVisibleOverlayAccessibilityLabelOnDismissChildrenContentContainerStyleStyleThemeTestID */ Props, 
      Element | Null
    ]), 
    js.Object
  ]) = js.native
  
  trait Props extends StObject {
    
    /**
      * Content of the `Modal`.
      */
    var children: Node
    
    /**
      * Style for the content of the modal
      */
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Determines whether clicking outside the modal dismiss it.
      */
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the user dismisses the modal.
      */
    var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Accessibility label for the overlay. This is read by the screen reader when the user taps outside the modal.
      */
    var overlayAccessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Style for the wrapper of the modal.
      * Use this prop to change the default wrapper style or to override safe area insets with marginTop and marginBottom.
      */
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
    
    /**
      * Determines Whether the modal is visible.
      */
    var visible: Boolean
  }
  object Props {
    
    inline def apply(theme: Theme, visible: Boolean): Props = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setOverlayAccessibilityLabel(value: String): Self = StObject.set(x, "overlayAccessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setOverlayAccessibilityLabelUndefined: Self = StObject.set(x, "overlayAccessibilityLabel", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstylechildrentes] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDismissableVisibleOverlayAccessibilityLabelOnDismissChildrenContentContainerStyleStyleThemeTestID */ Props, 
      Element | Null
    ]), 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsModalMod.foo` */
  override def _to: ComponentType[PickPropsstylechildrentes] & (NonReactStatics[
    ComponentType[Props] & (js.Function1[
      /* hasDismissableVisibleOverlayAccessibilityLabelOnDismissChildrenContentContainerStyleStyleThemeTestID */ Props, 
      Element | Null
    ]), 
    js.Object
  ]) = default
}

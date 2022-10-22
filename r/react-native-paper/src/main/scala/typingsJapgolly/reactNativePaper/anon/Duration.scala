package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsButtonMod.Props
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.children
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  /**
    * Label and press callback for the action button. It should contain the following properties:
    * - `label` - Label of the action button
    * - `onPress` - Callback that is called when action button is pressed.
    */
  var action: js.UndefOr[
    (Omit[
      ComponentProps[
        (ComponentType[
          PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
        ]) & (NonReactStatics[
          ComponentType[Props] & (js.Function1[
            /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
            Element
          ]), 
          js.Object
        ])
      ], 
      children
    ]) & LabelString
  ] = js.undefined
  
  /**
    * Text content of the Snackbar.
    */
  var children: Node
  
  /**
    * The duration for which the Snackbar is shown.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback called when Snackbar is dismissed. The `visible` prop needs to be updated when this is called.
    */
  def onDismiss(): Unit
  
  var ref: js.UndefOr[RefHandle[View]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Whether the Snackbar is currently visible.
    */
  var visible: Boolean
  
  /**
    * Style for the wrapper of the snackbar
    */
  var wrapperStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}
object Duration {
  
  inline def apply(
    onDismiss: Callback,
    theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme,
    visible: Boolean
  ): Duration = {
    val __obj = js.Dynamic.literal(onDismiss = onDismiss.toJsFn, theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setAction(
      value: (Omit[
          ComponentProps[
            (ComponentType[
              PickthemeDeepPartialThemeAccessibilityIgnoresInvertColors | PickthemeDeepPartialThemeAccessibilityLabel
            ]) & (NonReactStatics[
              ComponentType[Props] & (js.Function1[
                /* hasDisabledCompactModeDarkLoadingIconButtonColorChildrenUppercaseAccessibilityLabelAccessibilityHintOnPressOnLongPressStyleThemeContentStyleLabelStyleTestIDAccessibleRest */ Props, 
                Element
              ]), 
              js.Object
            ])
          ], 
          children
        ]) & LabelString
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setRef(value: RefHandle[View]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    
    inline def setWrapperStyleNull: Self = StObject.set(x, "wrapperStyle", null)
    
    inline def setWrapperStyleUndefined: Self = StObject.set(x, "wrapperStyle", js.undefined)
  }
}

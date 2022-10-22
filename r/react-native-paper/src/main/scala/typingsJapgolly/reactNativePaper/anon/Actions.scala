package typingsJapgolly.reactNativePaper.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.EndCallback
import typingsJapgolly.reactNative.mod.Animated.EndResult
import typingsJapgolly.reactNative.mod.ImageURISource
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.libTypescriptComponentsButtonMod.Props
import typingsJapgolly.reactNativePaper.libTypescriptComponentsIconMod.IconSource
import typingsJapgolly.reactNativePaper.reactNativePaperStrings.children
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  /**
    * Action items to shown in the banner.
    * An action item should contain the following properties:
    *
    * - `label`: label of the action button (required)
    * - `onPress`: callback that is called when button is pressed (required)
    *
    * To customize button you can pass other props that button component takes.
    */
  var actions: js.Array[
    LabelString & (Omit[
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
    ])
  ]
  
  /**
    * Content that will be displayed inside banner.
    */
  var children: String
  
  /**
    * Style of banner's inner content.
    * Use this prop to apply custom width for wide layouts.
    */
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Icon to display for the `Banner`. Can be an image.
    */
  var icon: js.UndefOr[IconSource] = js.undefined
  
  /**
    * @optional
    * Optional callback that will be called after the closing animation finished running normally
    */
  var onHideAnimationFinished: js.UndefOr[EndCallback] = js.undefined
  
  /**
    * @optional
    * Optional callback that will be called after the opening animation finished running normally
    */
  var onShowAnimationFinished: js.UndefOr[EndCallback] = js.undefined
  
  var ref: js.UndefOr[RefHandle[View]] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * @optional
    */
  var theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Whether banner is currently visible.
    */
  var visible: Boolean
}
object Actions {
  
  inline def apply(
    actions: js.Array[
      LabelString & (Omit[
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
      ])
    ],
    children: String,
    theme: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme,
    visible: Boolean
  ): Actions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setActions(
      value: js.Array[
          LabelString & (Omit[
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
          ])
        ]
    ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(
      value: (LabelString & (Omit[
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
        ]))*
    ): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconFunction1(value: /* props */ IconPropscolorstring => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
    
    inline def setOnHideAnimationFinished(value: /* result */ EndResult => Callback): Self = StObject.set(x, "onHideAnimationFinished", js.Any.fromFunction1((t0: /* result */ EndResult) => value(t0).runNow()))
    
    inline def setOnHideAnimationFinishedUndefined: Self = StObject.set(x, "onHideAnimationFinished", js.undefined)
    
    inline def setOnShowAnimationFinished(value: /* result */ EndResult => Callback): Self = StObject.set(x, "onShowAnimationFinished", js.Any.fromFunction1((t0: /* result */ EndResult) => value(t0).runNow()))
    
    inline def setOnShowAnimationFinishedUndefined: Self = StObject.set(x, "onShowAnimationFinished", js.undefined)
    
    inline def setRef(value: RefHandle[View]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTheme(value: typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}

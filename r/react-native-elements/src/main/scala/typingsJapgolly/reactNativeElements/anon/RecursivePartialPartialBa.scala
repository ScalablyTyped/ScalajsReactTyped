package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextProps
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.RecursivePartial
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.Component
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.error
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.primary
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.success
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/ThemeProvider.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/badge/Badge.BadgeProps>> */
trait RecursivePartialPartialBa extends StObject {
  
  var Component: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          japgolly.scalajs.react.facade.React.Component[
            typingsJapgolly.reactNativeElements.reactNativeElementsStrings.Component & js.Object, 
            js.Object
          ]
        ])
      ]
    ]
  ] = js.undefined
  
  var badgeStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var onPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* repeated */ Any, Any]]]] = js.undefined
  
  var status: js.UndefOr[RecursivePartial[js.UndefOr[primary | success | warning | error]]] = js.undefined
  
  var textProps: js.UndefOr[RecursivePartial[js.UndefOr[TextProps]]] = js.undefined
  
  var textStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var value: js.UndefOr[RecursivePartial[js.UndefOr[Node]]] = js.undefined
}
object RecursivePartialPartialBa {
  
  inline def apply(): RecursivePartialPartialBa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBa]
  }
  
  extension [Self <: RecursivePartialPartialBa](x: Self) {
    
    inline def setBadgeStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    inline def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
    inline def setComponent(
      value: RecursivePartial[
          js.UndefOr[
            TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              japgolly.scalajs.react.facade.React.Component[Component & js.Object, js.Object]
            ])
          ]
        ]
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setOnPress(value: RecursivePartial[js.UndefOr[js.Function1[/* repeated */ Any, Any]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setStatus(value: RecursivePartial[js.UndefOr[primary | success | warning | error]]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTextProps(value: RecursivePartial[js.UndefOr[TextProps]]): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
    
    inline def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
    
    inline def setTextStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setValue(value: RecursivePartial[js.UndefOr[Node]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

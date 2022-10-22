package typingsJapgolly.reactNativeElements.anon

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.reactNative.mod.ColorValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.RecursivePartial
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ModalComponent
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.onLongPress
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.onPress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/ThemeProvider.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/tooltip/Tooltip.TooltipProps>> */
trait RecursivePartialPartialTo extends StObject {
  
  var ModalComponent: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[
            typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ModalComponent & js.Object, 
            js.Object
          ]
        ])
      ]
    ]
  ] = js.undefined
  
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var closeOnlyOnBackdropPress: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double | String]]] = js.undefined
  
  var highlightColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var onClose: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onOpen: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var overlayColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var pointerColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var popover: js.UndefOr[RecursivePartial[js.UndefOr[Element]]] = js.undefined
  
  var skipAndroidStatusBar: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var toggleAction: js.UndefOr[RecursivePartial[js.UndefOr[String | onPress | onLongPress]]] = js.undefined
  
  var toggleOnPress: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double | String]]] = js.undefined
  
  var withOverlay: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var withPointer: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
}
object RecursivePartialPartialTo {
  
  inline def apply(): RecursivePartialPartialTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialTo]
  }
  
  extension [Self <: RecursivePartialPartialTo](x: Self) {
    
    inline def setBackgroundColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCloseOnlyOnBackdropPress(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "closeOnlyOnBackdropPress", value.asInstanceOf[js.Any])
    
    inline def setCloseOnlyOnBackdropPressUndefined: Self = StObject.set(x, "closeOnlyOnBackdropPress", js.undefined)
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setHeight(value: RecursivePartial[js.UndefOr[Double | String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHighlightColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
    
    inline def setHighlightColorUndefined: Self = StObject.set(x, "highlightColor", js.undefined)
    
    inline def setModalComponent(
      value: RecursivePartial[
          js.UndefOr[
            TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[ModalComponent & js.Object, js.Object]
            ])
          ]
        ]
    ): Self = StObject.set(x, "ModalComponent", value.asInstanceOf[js.Any])
    
    inline def setModalComponentUndefined: Self = StObject.set(x, "ModalComponent", js.undefined)
    
    inline def setOnClose(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnOpen(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
    
    inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    inline def setOverlayColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
    
    inline def setPointerColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setPopover(value: RecursivePartial[js.UndefOr[Element]]): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    inline def setSkipAndroidStatusBar(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "skipAndroidStatusBar", value.asInstanceOf[js.Any])
    
    inline def setSkipAndroidStatusBarUndefined: Self = StObject.set(x, "skipAndroidStatusBar", js.undefined)
    
    inline def setToggleAction(value: RecursivePartial[js.UndefOr[String | onPress | onLongPress]]): Self = StObject.set(x, "toggleAction", value.asInstanceOf[js.Any])
    
    inline def setToggleActionUndefined: Self = StObject.set(x, "toggleAction", js.undefined)
    
    inline def setToggleOnPress(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "toggleOnPress", value.asInstanceOf[js.Any])
    
    inline def setToggleOnPressUndefined: Self = StObject.set(x, "toggleOnPress", js.undefined)
    
    inline def setWidth(value: RecursivePartial[js.UndefOr[Double | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWithOverlay(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "withOverlay", value.asInstanceOf[js.Any])
    
    inline def setWithOverlayUndefined: Self = StObject.set(x, "withOverlay", js.undefined)
    
    inline def setWithPointer(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "withPointer", value.asInstanceOf[js.Any])
    
    inline def setWithPointerUndefined: Self = StObject.set(x, "withPointer", js.undefined)
  }
}

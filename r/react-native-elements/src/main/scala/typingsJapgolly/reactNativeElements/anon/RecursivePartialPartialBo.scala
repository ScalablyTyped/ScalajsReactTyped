package typingsJapgolly.reactNativeElements.anon

import typingsJapgolly.reactNative.mod.ModalProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/ThemeProvider.RecursivePartial<std.Partial<react-native-elements.react-native-elements/dist/bottomSheet/BottomSheet.BottomSheetProps>> */
trait RecursivePartialPartialBo extends StObject {
  
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var modalProps: js.UndefOr[RecursivePartial[js.UndefOr[ModalProps]]] = js.undefined
}
object RecursivePartialPartialBo {
  
  inline def apply(): RecursivePartialPartialBo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialBo]
  }
  
  extension [Self <: RecursivePartialPartialBo](x: Self) {
    
    inline def setContainerStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    inline def setModalProps(value: RecursivePartial[js.UndefOr[ModalProps]]): Self = StObject.set(x, "modalProps", value.asInstanceOf[js.Any])
    
    inline def setModalPropsUndefined: Self = StObject.set(x, "modalProps", js.undefined)
  }
}

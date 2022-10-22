package typingsJapgolly.storybookReactNative.anon

import typingsJapgolly.storybookReactNative.distPreviewMod.AsyncStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@storybook/react-native.@storybook/react-native/dist/preview.Params> */
trait PartialParams extends StObject {
  
  var asyncStorage: js.UndefOr[AsyncStorage | Null] = js.undefined
  
  var disableWebsockets: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var initialSelection: js.UndefOr[Any] = js.undefined
  
  var isUIHidden: js.UndefOr[Boolean] = js.undefined
  
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[Double] = js.undefined
  
  var onDeviceUI: js.UndefOr[Boolean] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var resetStorybook: js.UndefOr[Boolean] = js.undefined
  
  var secured: js.UndefOr[Boolean] = js.undefined
  
  var shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined
  
  var shouldPersistSelection: js.UndefOr[Boolean] = js.undefined
  
  var tabOpen: js.UndefOr[Double] = js.undefined
  
  var theme: js.UndefOr[BackgroundColor] = js.undefined
}
object PartialParams {
  
  inline def apply(): PartialParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialParams]
  }
  
  extension [Self <: PartialParams](x: Self) {
    
    inline def setAsyncStorage(value: AsyncStorage): Self = StObject.set(x, "asyncStorage", value.asInstanceOf[js.Any])
    
    inline def setAsyncStorageNull: Self = StObject.set(x, "asyncStorage", null)
    
    inline def setAsyncStorageUndefined: Self = StObject.set(x, "asyncStorage", js.undefined)
    
    inline def setDisableWebsockets(value: Boolean): Self = StObject.set(x, "disableWebsockets", value.asInstanceOf[js.Any])
    
    inline def setDisableWebsocketsUndefined: Self = StObject.set(x, "disableWebsockets", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInitialSelection(value: Any): Self = StObject.set(x, "initialSelection", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectionUndefined: Self = StObject.set(x, "initialSelection", js.undefined)
    
    inline def setIsUIHidden(value: Boolean): Self = StObject.set(x, "isUIHidden", value.asInstanceOf[js.Any])
    
    inline def setIsUIHiddenUndefined: Self = StObject.set(x, "isUIHidden", js.undefined)
    
    inline def setKeyboardAvoidingViewVerticalOffset(value: Double): Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", value.asInstanceOf[js.Any])
    
    inline def setKeyboardAvoidingViewVerticalOffsetUndefined: Self = StObject.set(x, "keyboardAvoidingViewVerticalOffset", js.undefined)
    
    inline def setOnDeviceUI(value: Boolean): Self = StObject.set(x, "onDeviceUI", value.asInstanceOf[js.Any])
    
    inline def setOnDeviceUIUndefined: Self = StObject.set(x, "onDeviceUI", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResetStorybook(value: Boolean): Self = StObject.set(x, "resetStorybook", value.asInstanceOf[js.Any])
    
    inline def setResetStorybookUndefined: Self = StObject.set(x, "resetStorybook", js.undefined)
    
    inline def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
    
    inline def setSecuredUndefined: Self = StObject.set(x, "secured", js.undefined)
    
    inline def setShouldDisableKeyboardAvoidingView(value: Boolean): Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", value.asInstanceOf[js.Any])
    
    inline def setShouldDisableKeyboardAvoidingViewUndefined: Self = StObject.set(x, "shouldDisableKeyboardAvoidingView", js.undefined)
    
    inline def setShouldPersistSelection(value: Boolean): Self = StObject.set(x, "shouldPersistSelection", value.asInstanceOf[js.Any])
    
    inline def setShouldPersistSelectionUndefined: Self = StObject.set(x, "shouldPersistSelection", js.undefined)
    
    inline def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
    
    inline def setTabOpenUndefined: Self = StObject.set(x, "tabOpen", js.undefined)
    
    inline def setTheme(value: BackgroundColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}

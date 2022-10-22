package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.anon.Modals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcAdaptersNativeCommandsSenderMod {
  
  @JSImport("react-native-navigation/lib/dist/src/adapters/NativeCommandsSender", "NativeCommandsSender")
  @js.native
  open class NativeCommandsSender () extends StObject {
    
    def dismissAllModals(commandId: String): js.Promise[Any] = js.native
    def dismissAllModals(commandId: String, options: js.Object): js.Promise[Any] = js.native
    
    def dismissAllOverlays(commandId: String): js.Promise[Any] = js.native
    
    def dismissModal(commandId: String, componentId: String): js.Promise[Any] = js.native
    def dismissModal(commandId: String, componentId: String, options: js.Object): js.Promise[Any] = js.native
    
    def dismissOverlay(commandId: String, componentId: String): js.Promise[Any] = js.native
    
    def getLaunchArgs(commandId: String): js.Promise[Any] = js.native
    
    def mergeOptions(componentId: String, options: js.Object): Unit = js.native
    
    /* private */ val nativeCommandsModule: Any = js.native
    
    def pop(commandId: String, componentId: String): js.Promise[Any] = js.native
    def pop(commandId: String, componentId: String, options: js.Object): js.Promise[Any] = js.native
    
    def popTo(commandId: String, componentId: String): js.Promise[Any] = js.native
    def popTo(commandId: String, componentId: String, options: js.Object): js.Promise[Any] = js.native
    
    def popToRoot(commandId: String, componentId: String): js.Promise[Any] = js.native
    def popToRoot(commandId: String, componentId: String, options: js.Object): js.Promise[Any] = js.native
    
    def push(commandId: String, onComponentId: String, layout: js.Object): js.Promise[Any] = js.native
    
    def setDefaultOptions(options: js.Object): Unit = js.native
    
    def setRoot(commandId: String, layout: Modals): js.Promise[Any] = js.native
    
    def setStackRoot(commandId: String, onComponentId: String, layout: js.Object): js.Promise[Any] = js.native
    
    def showModal(commandId: String, layout: js.Object): js.Promise[Any] = js.native
    
    def showOverlay(commandId: String, layout: js.Object): js.Promise[Any] = js.native
  }
}

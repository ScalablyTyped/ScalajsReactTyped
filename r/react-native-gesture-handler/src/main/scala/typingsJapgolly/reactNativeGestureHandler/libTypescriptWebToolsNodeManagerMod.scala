package typingsJapgolly.reactNativeGestureHandler

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.reactNativeGestureHandler.anon.FlingGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptTypeUtilsMod.ValueOf
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsNodeManagerMod {
  
  /* note: abstract class */ @JSImport("react-native-gesture-handler/lib/typescript/web/tools/NodeManager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeManager
  /* static members */
  object default {
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/NodeManager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createGestureHandler(handlerTag: Double, handler: InstanceType[ValueOf[FlingGestureHandler]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGestureHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def dropGestureHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("react-native-gesture-handler/lib/typescript/web/tools/NodeManager", "default.gestures")
    @js.native
    def gestures: Any = js.native
    inline def gestures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gestures")(x.asInstanceOf[js.Any])
    
    inline def getHandler(tag: Double): typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandler")(tag.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default]
    
    inline def getNodes(): NumberDictionary[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodes")().asInstanceOf[NumberDictionary[
        typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersManualGestureHandlerMod.default
      ]]
  }
  
  trait NodeManager extends StObject
}

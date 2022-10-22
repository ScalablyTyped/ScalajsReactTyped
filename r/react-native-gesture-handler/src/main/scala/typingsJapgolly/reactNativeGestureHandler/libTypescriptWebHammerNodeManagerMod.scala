package typingsJapgolly.reactNativeGestureHandler

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.reactNativeGestureHandler.anon.LongPressGestureHandler
import typingsJapgolly.reactNativeGestureHandler.libTypescriptTypeUtilsMod.ValueOf
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersNativeViewGestureHandlerMod.default
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebHammerNodeManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web_hammer/NodeManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createGestureHandler(handlerTag: Double, handler: InstanceType[ValueOf[LongPressGestureHandler]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createGestureHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dropGestureHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dropGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getHandler(tag: Double): default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getHandler")(tag.asInstanceOf[js.Any]).asInstanceOf[default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default]
  
  inline def getNodes(): NumberDictionary[
    default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodes")().asInstanceOf[NumberDictionary[
    default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPanGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersTapGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersLongPressGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersPinchGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersRotationGestureHandlerMod.default | typingsJapgolly.reactNativeGestureHandler.libTypescriptWebHandlersFlingGestureHandlerMod.default
  ]]
}

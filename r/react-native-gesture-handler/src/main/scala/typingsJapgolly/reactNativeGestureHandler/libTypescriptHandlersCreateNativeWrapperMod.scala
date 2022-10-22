package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNativeGestureHandler.anon.ReadonlyNativeViewGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersCreateNativeWrapperMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/createNativeWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](Component: ComponentType[P]): ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ]]
  inline def default[P](Component: ComponentType[P], config: ReadonlyNativeViewGesture): ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ForwardRefExoticComponent[
    (PropsWithoutRef[P & NativeViewGestureHandlerProps_]) & RefAttributes[ComponentType[Any]]
  ]]
}

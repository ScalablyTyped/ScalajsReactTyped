package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.RefreshControlProps
import typingsJapgolly.reactNative.mod.ScrollViewProps
import typingsJapgolly.reactNative.mod.SwitchProps
import typingsJapgolly.reactNative.mod.TextInputProps
import typingsJapgolly.reactNativeGestureHandler.anon.DrawerLayoutAndroidPropsc
import typingsJapgolly.reactNativeGestureHandler.anon.ScrollViewPropschildrenRe
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsGestureComponentsMod {
  
  @js.native
  trait DrawerLayoutAndroid
    extends typingsJapgolly.reactNative.mod.DrawerLayoutAndroid
       with ForwardRefExoticComponent[DrawerLayoutAndroidPropsc]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "DrawerLayoutAndroid")
  @js.native
  val DrawerLayoutAndroid: ForwardRefExoticComponent[DrawerLayoutAndroidPropsc] = js.native
  
  @js.native
  trait FlatList[ItemT]
    extends typingsJapgolly.reactNative.mod.FlatList[ItemT] {
    
    def apply[ItemT](
      props: PropsWithChildren[
          FlatListProps[ItemT] & RefAttributes[FlatList[ItemT]] & NativeViewGestureHandlerProps_
        ],
      ref: ForwardedRef[FlatList[ItemT]]
    ): Element | Null = js.native
  }
  object FlatList {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "FlatList")
    @js.native
    def apply[ItemT](
      props: PropsWithChildren[
          FlatListProps[ItemT] & RefAttributes[FlatList[ItemT]] & NativeViewGestureHandlerProps_
        ],
      ref: ForwardedRef[FlatList[ItemT]]
    ): Element | Null = js.native
  }
  
  @js.native
  trait RefreshControl
    extends typingsJapgolly.reactNative.mod.RefreshControl
       with ForwardRefExoticComponent[
          RefreshControlProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
        ]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "RefreshControl")
  @js.native
  val RefreshControl: ForwardRefExoticComponent[
    RefreshControlProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
  
  @js.native
  trait ScrollView
    extends typingsJapgolly.reactNative.mod.ScrollView
       with ForwardRefExoticComponent[ScrollViewPropschildrenRe]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "ScrollView")
  @js.native
  val ScrollView: ForwardRefExoticComponent[
    ScrollViewProps & NativeViewGestureHandlerProps_ & RefAttributes[typingsJapgolly.reactNative.mod.ScrollView]
  ] = js.native
  
  @js.native
  trait Switch
    extends typingsJapgolly.reactNative.mod.Switch
       with ForwardRefExoticComponent[SwitchProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]] = js.native
  
  @js.native
  trait TextInput
    extends typingsJapgolly.reactNative.mod.TextInput
       with ForwardRefExoticComponent[
          TextInputProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
        ]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "TextInput")
  @js.native
  val TextInput: ForwardRefExoticComponent[
    TextInputProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
}

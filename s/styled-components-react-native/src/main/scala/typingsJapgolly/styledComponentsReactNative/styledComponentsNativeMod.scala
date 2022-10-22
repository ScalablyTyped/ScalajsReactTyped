package typingsJapgolly.styledComponentsReactNative

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.ActivityIndicator
import typingsJapgolly.reactNative.mod.PressableProps
import typingsJapgolly.reactNative.mod.Slider
import typingsJapgolly.reactNative.mod.Switch
import typingsJapgolly.reactNative.mod.View
import typingsJapgolly.styledComponentsReactNative.anon.ReadonlyButtonProps
import typingsJapgolly.styledComponentsReactNative.anon.ReadonlyFlatListPropsany
import typingsJapgolly.styledComponentsReactNative.anon.ReadonlyModalProps
import typingsJapgolly.styledComponentsReactNative.anon.ReadonlyNavigatorIOSProps
import typingsJapgolly.styledComponentsReactNative.anon.ReadonlySectionListPropsa
import typingsJapgolly.styledComponentsReactNative.anon.ReadonlySwitchIOSProps
import typingsJapgolly.styledComponentsReactNative.anon.TypeofImage
import typingsJapgolly.styledComponentsReactNative.anon.TypeofListView
import typingsJapgolly.styledComponentsReactNative.anon.TypeofRefreshControl
import typingsJapgolly.styledComponentsReactNative.anon.TypeofStatusBar
import typingsJapgolly.styledComponentsReactNative.anon.TypeofSwipeableListView
import typingsJapgolly.styledComponentsReactNative.anon.TypeofTabBarIOS
import typingsJapgolly.styledComponentsReactNative.anon.TypeofTextInput
import typingsJapgolly.styledComponentsReactNative.anon.TypeofTouchableNativeFeed
import typingsJapgolly.styledComponentsReactNative.anon.TypeofView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledComponentsNativeMod extends Shortcut {
  
  @JSImport("styled-components/native", JSImport.Default)
  @js.native
  val default: ReactNativeStyledInterface[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultTheme */ Any
  ] = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    keyof T extends never ? any : T
    }}}
    */
  @js.native
  trait AnyIfEmpty[T /* <: js.Object */] extends StObject
  
  @js.native
  trait ReactNativeStyledInterface[T /* <: js.Object */]
    extends StObject
       with ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]] {
    
    var ActivityIndicator: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.ActivityIndicator], T] = js.native
    
    var ActivityIndicatorIOS: ReactNativeThemedStyledFunction[Instantiable0[ActivityIndicator], T] = js.native
    
    var Button: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyButtonProps, typingsJapgolly.reactNative.mod.Button], 
        T
      ] = js.native
    
    var DatePickerIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.DatePickerIOS], T] = js.native
    
    var DrawerLayoutAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.DrawerLayoutAndroid], T] = js.native
    
    var FlatList: ReactNativeThemedStyledFunction[
        Instantiable1[
          /* props */ ReadonlyFlatListPropsany, 
          typingsJapgolly.reactNative.mod.FlatList[js.Object]
        ], 
        T
      ] = js.native
    
    var Image: ReactNativeThemedStyledFunction[TypeofImage, T] = js.native
    
    var ImageBackground: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.ImageBackground], T] = js.native
    
    var KeyboardAvoidingView: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.KeyboardAvoidingView], T] = js.native
    
    var ListView: ReactNativeThemedStyledFunction[TypeofListView, T] = js.native
    
    var Modal: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlyModalProps, typingsJapgolly.reactNative.mod.Modal], 
        T
      ] = js.native
    
    var NavigatorIOS: ReactNativeThemedStyledFunction[
        Instantiable1[
          /* props */ ReadonlyNavigatorIOSProps, 
          typingsJapgolly.reactNative.mod.NavigatorIOS
        ], 
        T
      ] = js.native
    
    var Picker: ReactNativeThemedStyledFunction[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactNative.Picker */ Any, 
        T
      ] = js.native
    
    var PickerIOS: ReactNativeThemedStyledFunction[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactNative.PickerIOS */ Any, 
        T
      ] = js.native
    
    var Pressable: ReactNativeThemedStyledFunction[ForwardRefExoticComponent[PressableProps & RefAttributes[View]], T] = js.native
    
    var ProgressBarAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.ProgressBarAndroid], T] = js.native
    
    var ProgressViewIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.ProgressViewIOS], T] = js.native
    
    var RecyclerViewBackedScrollView: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.RecyclerViewBackedScrollView], T] = js.native
    
    var RefreshControl: ReactNativeThemedStyledFunction[TypeofRefreshControl, T] = js.native
    
    var SafeAreaView: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.SafeAreaView], T] = js.native
    
    var ScrollView: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.ScrollView], T] = js.native
    
    var SectionList: ReactNativeThemedStyledFunction[
        Instantiable1[
          /* props */ ReadonlySectionListPropsa, 
          typingsJapgolly.reactNative.mod.SectionList[js.Object, js.Object]
        ], 
        T
      ] = js.native
    
    var SegmentedControlIOS: ReactNativeThemedStyledFunction[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactNative.SegmentedControlIOS */ Any, 
        T
      ] = js.native
    
    var Slider: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.Slider], T] = js.native
    
    var SliderIOS: ReactNativeThemedStyledFunction[Instantiable0[Slider], T] = js.native
    
    var SnapshotViewIOS: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.SnapshotViewIOS], T] = js.native
    
    var StatusBar: ReactNativeThemedStyledFunction[TypeofStatusBar, T] = js.native
    
    var SwipeableListView: ReactNativeThemedStyledFunction[TypeofSwipeableListView, T] = js.native
    
    var Switch: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.Switch], T] = js.native
    
    var SwitchAndroid: ReactNativeThemedStyledFunction[Instantiable0[Switch], T] = js.native
    
    var SwitchIOS: ReactNativeThemedStyledFunction[
        Instantiable1[/* props */ ReadonlySwitchIOSProps, typingsJapgolly.reactNative.mod.SwitchIOS], 
        T
      ] = js.native
    
    var TabBarIOS: ReactNativeThemedStyledFunction[TypeofTabBarIOS, T] = js.native
    
    var Text: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.Text], T] = js.native
    
    var TextInput: ReactNativeThemedStyledFunction[TypeofTextInput, T] = js.native
    
    var TouchableHighlight: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.TouchableHighlight], T] = js.native
    
    var TouchableNativeFeedback: ReactNativeThemedStyledFunction[TypeofTouchableNativeFeed, T] = js.native
    
    var TouchableOpacity: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.TouchableOpacity], T] = js.native
    
    var TouchableWithoutFeedback: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.TouchableWithoutFeedback], T] = js.native
    
    var View: ReactNativeThemedStyledFunction[TypeofView, T] = js.native
    
    var ViewPagerAndroid: ReactNativeThemedStyledFunction[Instantiable0[typingsJapgolly.reactNative.mod.ViewPagerAndroid], T] = js.native
  }
  
  // Copied over from "ThemedBaseStyledInterface" in index.d.ts in order to remove DOM element typings
  @js.native
  trait ReactNativeThemedBaseStyledInterface[T /* <: js.Object */] extends StObject {
    
    def apply[C /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any */](component: C): Any = js.native
  }
  
  trait ReactNativeThemedStyledComponentsModule[T /* <: js.Object */, U /* <: js.Object */] extends StObject {
    
    var default: ReactNativeStyledInterface[T]
    
    var ThemeConsumer: Consumer[T]
    
    var ThemeContext: Context[T]
    
    var ThemeProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeProviderComponent<T, U> */ Any
    
    var css: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedCssFunction<T> */ Any
    
    // This could be made to assert `target is StyledComponent<any, T>` instead, but that feels not type safe
    var isStyledComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isStyledComponent */ Any
    
    def useTheme(): T
    
    var withTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WithThemeFnInterface<T> */ Any
  }
  object ReactNativeThemedStyledComponentsModule {
    
    inline def apply[T /* <: js.Object */, U /* <: js.Object */](
      ThemeConsumer: Consumer[T],
      ThemeContext: Context[T],
      ThemeProvider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeProviderComponent<T, U> */ Any,
      css: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedCssFunction<T> */ Any,
      default: ReactNativeStyledInterface[T],
      isStyledComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isStyledComponent */ Any,
      useTheme: CallbackTo[T],
      withTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WithThemeFnInterface<T> */ Any
    ): ReactNativeThemedStyledComponentsModule[T, U] = {
      val __obj = js.Dynamic.literal(ThemeConsumer = ThemeConsumer.asInstanceOf[js.Any], ThemeContext = ThemeContext.asInstanceOf[js.Any], ThemeProvider = ThemeProvider.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], isStyledComponent = isStyledComponent.asInstanceOf[js.Any], useTheme = useTheme.toJsFn, withTheme = withTheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactNativeThemedStyledComponentsModule[T, U]]
    }
    
    extension [Self <: ReactNativeThemedStyledComponentsModule[?, ?], T /* <: js.Object */, U /* <: js.Object */](x: Self & (ReactNativeThemedStyledComponentsModule[T, U])) {
      
      inline def setCss(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedCssFunction<T> */ Any
      ): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setDefault(value: ReactNativeStyledInterface[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setIsStyledComponent(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isStyledComponent */ Any
      ): Self = StObject.set(x, "isStyledComponent", value.asInstanceOf[js.Any])
      
      inline def setThemeConsumer(value: Consumer[T]): Self = StObject.set(x, "ThemeConsumer", value.asInstanceOf[js.Any])
      
      inline def setThemeContext(value: Context[T]): Self = StObject.set(x, "ThemeContext", value.asInstanceOf[js.Any])
      
      inline def setThemeProvider(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeProviderComponent<T, U> */ Any
      ): Self = StObject.set(x, "ThemeProvider", value.asInstanceOf[js.Any])
      
      inline def setUseTheme(value: CallbackTo[T]): Self = StObject.set(x, "useTheme", value.toJsFn)
      
      inline def setWithTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WithThemeFnInterface<T> */ Any
      ): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactNativeThemedStyledFunction[C /* <: ComponentType[Any] */, T /* <: js.Object */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemedStyledFunction<C, T> */ Any
  
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = ReactNativeThemedBaseStyledInterface[AnyIfEmpty[T]]
  
  type _To = ReactNativeStyledInterface[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultTheme */ Any
  ]
  
  /* This means you don't have to write `default`, but can instead just say `styledComponentsNativeMod.foo` */
  override def _to: ReactNativeStyledInterface[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultTheme */ Any
  ] = default
}

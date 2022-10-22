package typingsJapgolly.reactNativeReanimated.libTypesIndexDotwebMod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativeReanimated.libTypesCreateAnimatedComponentMod.AnimatedComponentProps
import typingsJapgolly.reactNativeReanimated.libTypesCreateAnimatedComponentMod.InitialComponentProps
import typingsJapgolly.reactNativeReanimated.libTypesCreateAnimatedComponentMod.Options
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2ComponentFlatListMod.ReanimatedFlatListFC
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("react-native-reanimated/lib/types/index.web", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/index.web", "default.FlatList")
  @js.native
  val FlatList: ReanimatedFlatListFC[Any] = js.native
  
  @JSImport("react-native-reanimated/lib/types/index.web", "default.Image")
  @js.native
  val Image: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  @JSImport("react-native-reanimated/lib/types/index.web", "default.ScrollView")
  @js.native
  val ScrollView: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  @JSImport("react-native-reanimated/lib/types/index.web", "default.Text")
  @js.native
  val Text: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  @JSImport("react-native-reanimated/lib/types/index.web", "default.View")
  @js.native
  val View: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  inline def addWhitelistedNativeProps(props: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedNativeProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addWhitelistedUIProps(props: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedUIProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createAnimatedComponent(Component: ComponentType[InitialComponentProps]): ComponentType[AnimatedComponentProps[InitialComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedComponentProps[InitialComponentProps]]]
  inline def createAnimatedComponent(Component: ComponentType[InitialComponentProps], options: Options[InitialComponentProps]): ComponentType[AnimatedComponentProps[InitialComponentProps]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[AnimatedComponentProps[InitialComponentProps]]]
}

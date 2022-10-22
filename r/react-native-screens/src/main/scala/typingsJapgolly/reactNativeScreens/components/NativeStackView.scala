package typingsJapgolly.reactNativeScreens.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackDescriptorMap
import typingsJapgolly.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigationHelpers
import typingsJapgolly.reactNativeScreens.libTypescriptNativeStackViewsNativeStackViewMod.Props
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcStackRouterMod.StackNavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NativeStackView {
  
  inline def apply(
    descriptors: NativeStackDescriptorMap,
    navigation: NativeStackNavigationHelpers,
    state: StackNavigationState[ParamListBase]
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-screens/lib/typescript/native-stack", "NativeStackView")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

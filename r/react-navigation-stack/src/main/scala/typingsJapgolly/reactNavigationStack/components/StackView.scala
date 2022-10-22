package typingsJapgolly.reactNavigationStack.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNavigation.mod.NavigationState
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackDescriptorMap
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderMode
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationHelpers
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsStackStackViewMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackView {
  
  inline def apply(
    descriptors: StackDescriptorMap,
    navigation: StackNavigationHelpers,
    screenProps: Any,
    state: NavigationState
  ): Builder = {
    val __props = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-stack", "StackView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNavigationStack.mod.StackView] {
    
    inline def detachInactiveScreens(value: Boolean): this.type = set("detachInactiveScreens", value.asInstanceOf[js.Any])
    
    inline def headerMode(value: StackHeaderMode): this.type = set("headerMode", value.asInstanceOf[js.Any])
    
    inline def keyboardHandlingEnabled(value: Boolean): this.type = set("keyboardHandlingEnabled", value.asInstanceOf[js.Any])
    
    inline def mode(value: StackCardMode): this.type = set("mode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.tuyaPanelKit.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typingsJapgolly.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.Layout
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.Scene
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackHeaderInterpolatedStyle
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackHeaderInterpolationProps
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackHeaderProps
import typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`.StackNavigationProp
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.float
import typingsJapgolly.tuyaPanelKit.tuyaPanelKitStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  inline def apply(
    insets: EdgeInsets,
    layout: Layout,
    mode: float | screen,
    navigation: StackNavigationProp[ParamListBase, String],
    scene: Scene[Route[String, js.UndefOr[js.Object]]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
  ): Builder = {
    val __props = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    new Builder(js.Array(this.component, __props.asInstanceOf[StackHeaderProps]))
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/stack", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def previous(value: Scene[Route[String, js.UndefOr[js.Object]]]): this.type = set("previous", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StackHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

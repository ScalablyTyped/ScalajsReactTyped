package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalConsumerMod.Props
import typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalConsumerMod.default
import typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.PortalMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalConsumer {
  
  inline def apply(manager: PortalMethods): Default[default] = {
    val __props = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalConsumer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

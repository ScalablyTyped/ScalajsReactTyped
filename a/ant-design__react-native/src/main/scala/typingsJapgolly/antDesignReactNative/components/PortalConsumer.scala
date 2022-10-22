package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignReactNative.libPortalPortalConsumerMod.PortalConsumerProps
import typingsJapgolly.antDesignReactNative.libPortalPortalConsumerMod.default
import typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.PortalMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalConsumer {
  
  inline def apply(manager: PortalMethods): Default[default] = {
    val __props = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[PortalConsumerProps]))
  }
  
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PortalConsumerProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

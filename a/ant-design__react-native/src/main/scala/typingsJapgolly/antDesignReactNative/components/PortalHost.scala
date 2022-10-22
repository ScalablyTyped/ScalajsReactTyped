package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.PortalHostProps
import typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalHost {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PortalHost.type): SharedBuilder_PortalHostProps_1683612200[default] = new SharedBuilder_PortalHostProps_1683612200[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalHostProps): SharedBuilder_PortalHostProps_1683612200[default] = new SharedBuilder_PortalHostProps_1683612200[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.PortalHostProps
import typingsJapgolly.antDesignReactNative.libPortalPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  object Host {
    
    @JSImport("@ant-design/react-native", "Portal.Host")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Host.type): SharedBuilder_PortalHostProps_1683612200[typingsJapgolly.antDesignReactNative.mod.Portal.Host] = new SharedBuilder_PortalHostProps_1683612200[typingsJapgolly.antDesignReactNative.mod.Portal.Host](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PortalHostProps): SharedBuilder_PortalHostProps_1683612200[typingsJapgolly.antDesignReactNative.mod.Portal.Host] = new SharedBuilder_PortalHostProps_1683612200[typingsJapgolly.antDesignReactNative.mod.Portal.Host](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native", "Portal")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Portal.type): Default[typingsJapgolly.antDesignReactNative.mod.Portal] = new Default[typingsJapgolly.antDesignReactNative.mod.Portal](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Default[typingsJapgolly.antDesignReactNative.mod.Portal] = new Default[typingsJapgolly.antDesignReactNative.mod.Portal](js.Array(this.component, p.asInstanceOf[js.Any]))
}

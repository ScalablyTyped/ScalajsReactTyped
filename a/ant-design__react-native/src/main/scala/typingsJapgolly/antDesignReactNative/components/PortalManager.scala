package typingsJapgolly.antDesignReactNative.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignReactNative.libPortalPortalManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalManager {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-manager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PortalManager.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

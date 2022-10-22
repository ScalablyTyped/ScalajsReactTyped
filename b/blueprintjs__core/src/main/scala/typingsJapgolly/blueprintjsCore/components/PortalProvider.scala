package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmContextPortalPortalProviderMod.PortalContextOptions
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalProvider {
  
  @JSImport("@blueprintjs/core", "PortalProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PortalProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[PortalContextOptions]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

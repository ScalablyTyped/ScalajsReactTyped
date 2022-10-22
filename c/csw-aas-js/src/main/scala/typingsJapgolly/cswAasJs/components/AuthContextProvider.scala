package typingsJapgolly.cswAasJs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.cswAasJs.distComponentsContextAuthContextProviderMod.AuthContextConfig
import typingsJapgolly.cswAasJs.distComponentsContextAuthContextProviderMod.AuthContextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthContextProvider {
  
  inline def apply(config: AuthContextConfig): Default[js.Object] = {
    val __props = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[AuthContextProps]))
  }
  
  @JSImport("csw-aas-js", "AuthContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AuthContextProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

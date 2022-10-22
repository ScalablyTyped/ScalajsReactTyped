package typingsJapgolly.cswAasJs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.cswAasJs.distComponentsContextAuthContextMod.AuthContextType
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply(value: AuthContextType): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[AuthContextType]]))
  }
  
  @JSImport("csw-aas-js/dist/components/context/AuthContext", "Provider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[AuthContextType]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

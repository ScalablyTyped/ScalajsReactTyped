package typingsJapgolly.reactRelay.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactRelay.relayHooksRelayEnvironmentProviderDotreactMod.Props
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RelayEnvironmentProvider {
  
  inline def apply(environment: Environment): Default[js.Object] = {
    val __props = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-relay", "RelayEnvironmentProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactSelect.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactSelect.distDeclarationsSrcNonceProviderMod.NonceProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NonceProvider {
  
  inline def apply(cacheKey: String, nonce: String): Default[typingsJapgolly.reactSelect.mod.NonceProvider] = {
    val __props = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactSelect.mod.NonceProvider](js.Array(this.component, __props.asInstanceOf[NonceProviderProps]))
  }
  
  @JSImport("react-select", "NonceProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NonceProviderProps): Default[typingsJapgolly.reactSelect.mod.NonceProvider] = new Default[typingsJapgolly.reactSelect.mod.NonceProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}

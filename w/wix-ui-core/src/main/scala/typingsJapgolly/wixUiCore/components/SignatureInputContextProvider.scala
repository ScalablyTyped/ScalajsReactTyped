package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSignatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureInputContextProvider {
  
  inline def apply(value: SignatureInputContextValue): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[SignatureInputContextValue]]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInputContext", "SignatureInputContextProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[SignatureInputContextValue]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

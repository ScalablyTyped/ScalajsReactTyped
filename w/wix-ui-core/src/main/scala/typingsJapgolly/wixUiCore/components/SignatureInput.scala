package typingsJapgolly.wixUiCore.components

import typingsJapgolly.wixUiCore.anon.PickClearButtonPropschild
import typingsJapgolly.wixUiCore.anon.PickSigningPadPropschildr
import typingsJapgolly.wixUiCore.anon.PickTitlePropschildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SignatureInput {
  
  object ClearButton {
    
    @JSImport("wix-ui-core/dist/es/src", "SignatureInput.ClearButton")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ClearButton.type): SharedBuilder_PickClearButtonPropschild727939066 = new SharedBuilder_PickClearButtonPropschild727939066(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PickClearButtonPropschild): SharedBuilder_PickClearButtonPropschild727939066 = new SharedBuilder_PickClearButtonPropschild727939066(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object SigningPad {
    
    @JSImport("wix-ui-core/dist/es/src", "SignatureInput.SigningPad")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: SigningPad.type): SharedBuilder_PickSigningPadPropschildr259741442 = new SharedBuilder_PickSigningPadPropschildr259741442(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PickSigningPadPropschildr): SharedBuilder_PickSigningPadPropschildr259741442 = new SharedBuilder_PickSigningPadPropschildr259741442(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("wix-ui-core/dist/es/src", "SignatureInput.Title")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Title.type): SharedBuilder_PickTitlePropschildren_1463857465 = new SharedBuilder_PickTitlePropschildren_1463857465(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: PickTitlePropschildren): SharedBuilder_PickTitlePropschildren_1463857465 = new SharedBuilder_PickTitlePropschildren_1463857465(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "SignatureInput")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SignatureInput.type): SharedBuilder_Object_159303587[typingsJapgolly.wixUiCore.distEsSrcMod.SignatureInput] = new SharedBuilder_Object_159303587[typingsJapgolly.wixUiCore.distEsSrcMod.SignatureInput](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[typingsJapgolly.wixUiCore.distEsSrcMod.SignatureInput] = new SharedBuilder_Object_159303587[typingsJapgolly.wixUiCore.distEsSrcMod.SignatureInput](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @JSImport("office-ui-fabric-react", "Button")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Button.type): SharedBuilder_IButtonProps96385884[typingsJapgolly.officeUiFabricReact.mod.Button] = new SharedBuilder_IButtonProps96385884[typingsJapgolly.officeUiFabricReact.mod.Button](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IButtonProps): SharedBuilder_IButtonProps96385884[typingsJapgolly.officeUiFabricReact.mod.Button] = new SharedBuilder_IButtonProps96385884[typingsJapgolly.officeUiFabricReact.mod.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
}

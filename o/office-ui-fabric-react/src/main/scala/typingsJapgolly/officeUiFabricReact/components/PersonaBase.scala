package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersonaBase {
  
  @JSImport("office-ui-fabric-react", "PersonaBase")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PersonaBase.type): SharedBuilder_IPersonaProps_1396355299 = new SharedBuilder_IPersonaProps_1396355299(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPersonaProps): SharedBuilder_IPersonaProps_1396355299 = new SharedBuilder_IPersonaProps_1396355299(js.Array(this.component, p.asInstanceOf[js.Any]))
}

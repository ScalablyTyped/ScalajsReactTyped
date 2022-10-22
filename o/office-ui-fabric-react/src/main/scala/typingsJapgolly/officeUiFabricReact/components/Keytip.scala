package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsKeytipKeytipDottypesMod.IKeytipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Keytip {
  
  inline def apply(content: String, keySequences: js.Array[String]): SharedBuilder_IKeytipProps1110627561[typingsJapgolly.officeUiFabricReact.mod.Keytip] = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    new SharedBuilder_IKeytipProps1110627561[typingsJapgolly.officeUiFabricReact.mod.Keytip](js.Array(this.component, __props.asInstanceOf[IKeytipProps]))
  }
  
  @JSImport("office-ui-fabric-react", "Keytip")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IKeytipProps): SharedBuilder_IKeytipProps1110627561[typingsJapgolly.officeUiFabricReact.mod.Keytip] = new SharedBuilder_IKeytipProps1110627561[typingsJapgolly.officeUiFabricReact.mod.Keytip](js.Array(this.component, p.asInstanceOf[js.Any]))
}

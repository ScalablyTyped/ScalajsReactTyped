package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsCollectionsFormFormButtonMod.FormButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormButton {
  
  inline def apply(id: (js.UndefOr[Double | String]) & js.UndefOr[String]): SharedBuilder_FormButtonProps179501639 = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new SharedBuilder_FormButtonProps179501639(js.Array(this.component, __props.asInstanceOf[FormButtonProps]))
  }
  
  @JSImport("semantic-ui-react", "FormButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormButtonProps): SharedBuilder_FormButtonProps179501639 = new SharedBuilder_FormButtonProps179501639(js.Array(this.component, p.asInstanceOf[js.Any]))
}

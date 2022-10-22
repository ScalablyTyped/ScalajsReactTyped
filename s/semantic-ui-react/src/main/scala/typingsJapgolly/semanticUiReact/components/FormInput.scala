package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsCollectionsFormFormInputMod.FormInputProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticWIDTHS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormInput {
  
  inline def apply(
    id: (js.UndefOr[Double | String]) & js.UndefOr[String],
    required: js.UndefOr[Any] & js.UndefOr[Boolean],
    width: js.UndefOr[SemanticWIDTHS] & (js.UndefOr[Double | String])
  ): SharedBuilder_FormInputProps269389813 = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new SharedBuilder_FormInputProps269389813(js.Array(this.component, __props.asInstanceOf[FormInputProps]))
  }
  
  @JSImport("semantic-ui-react", "FormInput")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormInputProps): SharedBuilder_FormInputProps269389813 = new SharedBuilder_FormInputProps269389813(js.Array(this.component, p.asInstanceOf[js.Any]))
}

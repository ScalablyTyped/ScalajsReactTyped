package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsElementsLabelLabelGroupMod.LabelGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelGroup {
  
  @JSImport("semantic-ui-react", "LabelGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: LabelGroup.type): SharedBuilder_LabelGroupProps490632779 = new SharedBuilder_LabelGroupProps490632779(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LabelGroupProps): SharedBuilder_LabelGroupProps490632779 = new SharedBuilder_LabelGroupProps490632779(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardGroupMod.CardGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardGroup {
  
  @JSImport("semantic-ui-react", "CardGroup")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardGroup.type): SharedBuilder_CardGroupProps368716750 = new SharedBuilder_CardGroupProps368716750(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardGroupProps): SharedBuilder_CardGroupProps368716750 = new SharedBuilder_CardGroupProps368716750(js.Array(this.component, p.asInstanceOf[js.Any]))
}

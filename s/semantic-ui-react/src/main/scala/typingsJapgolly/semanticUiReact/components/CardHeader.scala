package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardHeaderMod.CardHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardHeader {
  
  @JSImport("semantic-ui-react", "CardHeader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardHeader.type): SharedBuilder_CardHeaderProps586099955 = new SharedBuilder_CardHeaderProps586099955(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardHeaderProps): SharedBuilder_CardHeaderProps586099955 = new SharedBuilder_CardHeaderProps586099955(js.Array(this.component, p.asInstanceOf[js.Any]))
}

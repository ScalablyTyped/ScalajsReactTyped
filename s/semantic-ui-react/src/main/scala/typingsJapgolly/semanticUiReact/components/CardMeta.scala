package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsViewsCardCardMetaMod.CardMetaProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CardMeta {
  
  @JSImport("semantic-ui-react", "CardMeta")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CardMeta.type): SharedBuilder_CardMetaProps_2106210004 = new SharedBuilder_CardMetaProps_2106210004(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardMetaProps): SharedBuilder_CardMetaProps_2106210004 = new SharedBuilder_CardMetaProps_2106210004(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libMediaListItemMod.MediaListItemProps
import typingsJapgolly.reactBootstrap.libMediaListItemMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaListItem {
  
  @JSImport("react-bootstrap/lib/MediaListItem", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaListItem.type): SharedBuilder_MediaListItemProps_1965911486[^] = new SharedBuilder_MediaListItemProps_1965911486[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaListItemProps): SharedBuilder_MediaListItemProps_1965911486[^] = new SharedBuilder_MediaListItemProps_1965911486[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libMediaListMod.MediaListProps
import typingsJapgolly.reactBootstrap.libMediaListMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaList {
  
  @JSImport("react-bootstrap/lib/MediaList", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaList.type): SharedBuilder_MediaListProps_687943505[^] = new SharedBuilder_MediaListProps_687943505[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaListProps): SharedBuilder_MediaListProps_687943505[^] = new SharedBuilder_MediaListProps_687943505[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}

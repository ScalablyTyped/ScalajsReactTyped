package typingsJapgolly.reactFoundation.components

import typingsJapgolly.reactFoundation.componentsThumbnailMod.ThumbnailProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThumbnailLink {
  
  @JSImport("react-foundation", "ThumbnailLink")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ThumbnailLink.type): SharedBuilder_ThumbnailProps936810432 = new SharedBuilder_ThumbnailProps936810432(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThumbnailProps): SharedBuilder_ThumbnailProps936810432 = new SharedBuilder_ThumbnailProps936810432(js.Array(this.component, p.asInstanceOf[js.Any]))
}

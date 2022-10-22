package typingsJapgolly.agiledigitalMulePreview.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewUrlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MulePreviewUrl {
  
  inline def apply(contentRoot: String, contentUrl: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewUrlProps]))
  }
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewUrl")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MulePreviewUrlProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

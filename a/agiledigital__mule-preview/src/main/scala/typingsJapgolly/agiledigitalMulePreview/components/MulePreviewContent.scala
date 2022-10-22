package typingsJapgolly.agiledigitalMulePreview.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MulePreviewContent {
  
  inline def apply(contentRoot: String, contentString: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentString = contentString.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewContentProps]))
  }
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MulePreviewContentProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

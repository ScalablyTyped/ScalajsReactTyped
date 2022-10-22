package typingsJapgolly.agiledigitalMulePreview.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffUrlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MulePreviewDiffUrl {
  
  inline def apply(contentRoot: String, contentUrls: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Default[js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentUrls = contentUrls.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewDiffUrlProps]))
  }
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffUrl")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MulePreviewDiffUrlProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

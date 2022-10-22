package typingsJapgolly.agiledigitalMulePreview.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.agiledigitalMulePreview.mod.MulePreviewDiffContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MulePreviewDiffContent {
  
  inline def apply(contentRoot: String, contentStrings: js.Tuple2[js.UndefOr[String], js.UndefOr[String]]): Default[js.Object] = {
    val __props = js.Dynamic.literal(contentRoot = contentRoot.asInstanceOf[js.Any], contentStrings = contentStrings.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MulePreviewDiffContentProps]))
  }
  
  @JSImport("@agiledigital/mule-preview", "MulePreviewDiffContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MulePreviewDiffContentProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

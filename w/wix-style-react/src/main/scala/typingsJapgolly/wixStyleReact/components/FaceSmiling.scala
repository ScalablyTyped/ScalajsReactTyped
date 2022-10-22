package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FaceSmiling {
  
  @JSImport("wix-style-react/dist/types/FacesRatingBar/icons/FaceIcons", "FaceSmiling")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FaceSmiling.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

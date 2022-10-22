package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.videoReact.mod.PosterImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PosterImage {
  
  inline def apply(poster: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(poster = poster.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[PosterImageProps]))
  }
  
  @JSImport("video-react", "PosterImage")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PosterImageProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

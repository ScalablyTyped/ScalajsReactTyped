package typingsJapgolly.reactYoutubeEmbed.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactYoutubeEmbed.mod.YouTubeEmbedProps
import typingsJapgolly.reactYoutubeEmbed.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactYoutubeEmbed {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[YouTubeEmbedProps]))
  }
  
  @JSImport("react-youtube-embed", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def appendSrc(value: String): this.type = set("appendSrc", value.asInstanceOf[js.Any])
    
    inline def aspectRatio(value: String): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    inline def prependSrc(value: String): this.type = set("prependSrc", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: YouTubeEmbedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

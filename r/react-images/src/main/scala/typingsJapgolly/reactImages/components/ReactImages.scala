package typingsJapgolly.reactImages.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactImages.mod.CarouselModalProps
import typingsJapgolly.reactImages.mod.CarouselProps
import typingsJapgolly.reactImages.mod.CarouselStyles
import typingsJapgolly.reactImages.mod.Components
import typingsJapgolly.reactImages.mod.Formatters
import typingsJapgolly.reactImages.mod.FrameProps
import typingsJapgolly.reactImages.mod.TrackProps
import typingsJapgolly.reactImages.mod.ViewType
import typingsJapgolly.reactImages.reactImagesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImages {
  
  inline def apply(views: js.Array[ViewType]): Builder = {
    val __props = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CarouselProps]))
  }
  
  @JSImport("react-images", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def components(value: Components): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def currentIndex(value: Double): this.type = set("currentIndex", value.asInstanceOf[js.Any])
    
    inline def formatters(value: Formatters): this.type = set("formatters", value.asInstanceOf[js.Any])
    
    inline def frameProps(value: FrameProps): this.type = set("frameProps", value.asInstanceOf[js.Any])
    
    inline def hideControlsWhenIdle(value: Double | `false`): this.type = set("hideControlsWhenIdle", value.asInstanceOf[js.Any])
    
    inline def modalProps(value: CarouselModalProps): this.type = set("modalProps", value.asInstanceOf[js.Any])
    
    inline def styles(value: CarouselStyles): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def trackProps(value: TrackProps): this.type = set("trackProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

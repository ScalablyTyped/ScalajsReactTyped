package typingsJapgolly.videoReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.videoReact.mod.PlaybackRateMenuButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlaybackRateMenuButton {
  
  @JSImport("video-react", "PlaybackRateMenuButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def rates(value: js.Array[Double]): this.type = set("rates", value.asInstanceOf[js.Any])
    
    inline def ratesVarargs(value: Double*): this.type = set("rates", js.Array(value*))
  }
  
  implicit def make(companion: PlaybackRateMenuButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PlaybackRateMenuButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

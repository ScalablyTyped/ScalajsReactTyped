package typingsJapgolly.reactAliceCarousel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAliceCarousel.anon.IsPlaying
import typingsJapgolly.reactAliceCarousel.libViewsPlayPauseButtonMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlayPauseButton {
  
  inline def apply(isPlaying: Boolean, onClick: Any => Callback): Builder = {
    val __props = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "PlayPauseButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def renderPlayPauseButton(value: /* hasIsPlaying */ IsPlaying => Any): this.type = set("renderPlayPauseButton", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

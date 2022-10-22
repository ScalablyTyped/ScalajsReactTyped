package typingsJapgolly.reactAliceCarousel.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAliceCarousel.anon.IsDisabled
import typingsJapgolly.reactAliceCarousel.libViewsPrevNextButtonMod.Props
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.next
import typingsJapgolly.reactAliceCarousel.reactAliceCarouselStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrevNextButton {
  
  inline def apply(isDisabled: Boolean, name: prev | next, onClick: Any => Callback): Builder = {
    val __props = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "PrevNextButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def renderNextButton(value: /* hasIsDisabled */ IsDisabled => Any): this.type = set("renderNextButton", js.Any.fromFunction1(value))
    
    inline def renderPrevButton(value: /* hasIsDisabled */ IsDisabled => Any): this.type = set("renderPrevButton", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

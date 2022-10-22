package typingsJapgolly.reactAliceCarousel.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAliceCarousel.anon.IsActive
import typingsJapgolly.reactAliceCarousel.libTypesMod.State
import typingsJapgolly.reactAliceCarousel.libViewsDotsNavigationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotsNavigation {
  
  inline def apply(onClick: Double => Callback, state: State): Builder = {
    val __props = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: Double) => onClick(t0).runNow()), state = state.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "DotsNavigation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def controlsStrategy(value: String): this.type = set("controlsStrategy", value.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: ReactMouseEventFrom[Element & Element] => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def onMouseLeave(value: ReactMouseEventFrom[Element & Element] => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def renderDotsItem(value: /* hasIsActiveActiveIndex */ IsActive => Any): this.type = set("renderDotsItem", js.Any.fromFunction1(value))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

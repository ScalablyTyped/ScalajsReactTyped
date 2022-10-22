package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsScrollMaskScrollMaskMod.ScrollMaskProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollMask {
  
  inline def apply(scrollTrackRef: RefHandle[HTMLElement]): Default[js.Object] = {
    val __props = js.Dynamic.literal(scrollTrackRef = scrollTrackRef.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ScrollMaskProps]))
  }
  
  @JSImport("antd-mobile", "ScrollMask")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ScrollMaskProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

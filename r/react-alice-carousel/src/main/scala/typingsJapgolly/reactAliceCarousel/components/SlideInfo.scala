package typingsJapgolly.reactAliceCarousel.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactAliceCarousel.anon.ItemsCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideInfo {
  
  inline def apply(activeIndex: Any, itemsCount: Any, renderSlideInfo: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], renderSlideInfo = renderSlideInfo.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ItemsCount]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "SlideInfo")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ItemsCount): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

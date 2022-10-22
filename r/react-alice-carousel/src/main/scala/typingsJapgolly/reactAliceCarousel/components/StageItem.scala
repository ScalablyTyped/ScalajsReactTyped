package typingsJapgolly.reactAliceCarousel.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactAliceCarousel.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StageItem {
  
  inline def apply(className: Any, item: Any, styles: Any): Default[js.Object] = {
    val __props = js.Dynamic.literal(className = className.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ClassName]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "StageItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClassName): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

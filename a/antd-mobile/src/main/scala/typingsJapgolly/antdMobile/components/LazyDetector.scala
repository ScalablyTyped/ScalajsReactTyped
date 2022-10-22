package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobile.esComponentsImageLazyDetectorMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LazyDetector {
  
  inline def apply(onActive: Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(onActive = onActive.toJsFn)
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("antd-mobile/es/components/image/lazy-detector", "LazyDetector")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsImageViewerSlideMod.Props
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slide {
  
  inline def apply(image: String, maxZoom: Double, onTap: Callback): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], onTap = onTap.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("antd-mobile/es/components/image-viewer/slide", "Slide")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dragLockRef(value: MutableRefObject[Boolean]): this.type = set("dragLockRef", value.asInstanceOf[js.Any])
    
    inline def onZoomChange(value: /* zoom */ Double => Callback): this.type = set("onZoomChange", js.Any.fromFunction1((t0: /* zoom */ Double) => value(t0).runNow()))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

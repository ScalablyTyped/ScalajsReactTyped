package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsImageViewerSlidesMod.SlidesRef
import typingsJapgolly.antdMobile.esComponentsImageViewerSlidesMod.SlidesType
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slides {
  
  inline def apply(defaultIndex: Double, images: js.Array[String], maxZoom: Double, onTap: Callback): Builder = {
    val __props = js.Dynamic.literal(defaultIndex = defaultIndex.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], onTap = onTap.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[SlidesType & RefAttributes[SlidesRef]]))
  }
  
  @JSImport("antd-mobile/es/components/image-viewer/slides", "Slides")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[SlidesRef] {
    
    inline def onIndexChange(value: /* index */ Double => Callback): this.type = set("onIndexChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
  }
  
  def withProps(p: SlidesType & RefAttributes[SlidesRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

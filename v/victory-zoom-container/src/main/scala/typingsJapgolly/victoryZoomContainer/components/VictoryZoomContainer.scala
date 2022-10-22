package typingsJapgolly.victoryZoomContainer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryZoomContainer.anon.X
import typingsJapgolly.victoryZoomContainer.anon.XY
import typingsJapgolly.victoryZoomContainer.anon.Y
import typingsJapgolly.victoryZoomContainer.esMod.VictoryZoomContainerProps
import typingsJapgolly.victoryZoomContainer.esMod.ZoomDimensionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryZoomContainer {
  
  @JSImport("victory-zoom-container/es", "VictoryZoomContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryZoomContainer.esMod.VictoryZoomContainer] {
    
    inline def allowPan(value: Boolean): this.type = set("allowPan", value.asInstanceOf[js.Any])
    
    inline def allowZoom(value: Boolean): this.type = set("allowZoom", value.asInstanceOf[js.Any])
    
    inline def clipContainerComponent(value: VdomElement): this.type = set("clipContainerComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def downsample(value: Double | Boolean): this.type = set("downsample", value.asInstanceOf[js.Any])
    
    inline def minimumZoom(value: X): this.type = set("minimumZoom", value.asInstanceOf[js.Any])
    
    inline def onZoomDomainChange(value: (/* domain */ Y, VictoryZoomContainerProps) => Callback): this.type = set("onZoomDomainChange", js.Any.fromFunction2((t0: /* domain */ Y, t1: VictoryZoomContainerProps) => (value(t0, t1)).runNow()))
    
    inline def zoomDimension(value: ZoomDimensionType): this.type = set("zoomDimension", value.asInstanceOf[js.Any])
    
    inline def zoomDomain(value: XY): this.type = set("zoomDomain", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryZoomContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryZoomContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.reactCanvasDraw.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCanvasDraw.anon.Max
import typingsJapgolly.reactCanvasDraw.mod.CanvasDraw
import typingsJapgolly.reactCanvasDraw.mod.CanvasDrawProps
import typingsJapgolly.reactCanvasDraw.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCanvasDraw {
  
  @JSImport("react-canvas-draw", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def brushColor(value: String): this.type = set("brushColor", value.asInstanceOf[js.Any])
    
    inline def brushRadius(value: Double): this.type = set("brushRadius", value.asInstanceOf[js.Any])
    
    inline def canvasHeight(value: Double | String): this.type = set("canvasHeight", value.asInstanceOf[js.Any])
    
    inline def canvasWidth(value: Double | String): this.type = set("canvasWidth", value.asInstanceOf[js.Any])
    
    inline def catenaryColor(value: String): this.type = set("catenaryColor", value.asInstanceOf[js.Any])
    
    inline def clampLinesToDocument(value: Boolean): this.type = set("clampLinesToDocument", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def enablePanAndZoom(value: Boolean): this.type = set("enablePanAndZoom", value.asInstanceOf[js.Any])
    
    inline def gridColor(value: String): this.type = set("gridColor", value.asInstanceOf[js.Any])
    
    inline def gridLineWidth(value: Double): this.type = set("gridLineWidth", value.asInstanceOf[js.Any])
    
    inline def gridSizeX(value: Double): this.type = set("gridSizeX", value.asInstanceOf[js.Any])
    
    inline def gridSizeY(value: Double): this.type = set("gridSizeY", value.asInstanceOf[js.Any])
    
    inline def hideGrid(value: Boolean): this.type = set("hideGrid", value.asInstanceOf[js.Any])
    
    inline def hideGridX(value: Boolean): this.type = set("hideGridX", value.asInstanceOf[js.Any])
    
    inline def hideGridY(value: Boolean): this.type = set("hideGridY", value.asInstanceOf[js.Any])
    
    inline def hideInterface(value: Boolean): this.type = set("hideInterface", value.asInstanceOf[js.Any])
    
    inline def imgSrc(value: String): this.type = set("imgSrc", value.asInstanceOf[js.Any])
    
    inline def immediateLoading(value: Boolean): this.type = set("immediateLoading", value.asInstanceOf[js.Any])
    
    inline def lazyRadius(value: Double): this.type = set("lazyRadius", value.asInstanceOf[js.Any])
    
    inline def loadTimeOffset(value: Double): this.type = set("loadTimeOffset", value.asInstanceOf[js.Any])
    
    inline def mouseZoomFactor(value: Double): this.type = set("mouseZoomFactor", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* canvas */ CanvasDraw => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* canvas */ CanvasDraw) => value(t0).runNow()))
    
    inline def onChangeNull: this.type = set("onChange", null)
    
    inline def saveData(value: String): this.type = set("saveData", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def zoomExtents(value: Max): this.type = set("zoomExtents", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactCanvasDraw.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CanvasDrawProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}

package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.materialUi.internalAppCanvasMod.AppCanvasProps
import typingsJapgolly.materialUi.internalAppCanvasMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppCanvas {
  
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AppCanvas.type): Default[default] = new Default[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: AppCanvasProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}

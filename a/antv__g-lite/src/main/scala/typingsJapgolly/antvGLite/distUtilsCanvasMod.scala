package typingsJapgolly.antvGLite

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvGLite.distCanvasMod.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCanvasMod {
  
  @JSImport("@antv/g-lite/dist/utils/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanExistedCanvas(container: String, canvas: Canvas): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanExistedCanvas")(container.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def cleanExistedCanvas(container: HTMLElement, canvas: Canvas): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanExistedCanvas")(container.asInstanceOf[js.Any], canvas.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@antv/g-lite/dist/utils/canvas", "isBrowser")
  @js.native
  val isBrowser: Boolean = js.native
}

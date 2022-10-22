package typingsJapgolly.obeliskJs.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("obelisk.js", "CanvasManager")
@js.native
open class CanvasManager () extends StObject
/* static members */
object CanvasManager {
  
  @JSImport("obelisk.js", "CanvasManager")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("obelisk.js", "CanvasManager.defaultCanvas")
  @js.native
  def defaultCanvas: HTMLCanvasElement = js.native
  inline def defaultCanvas_=(x: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCanvas")(x.asInstanceOf[js.Any])
  
  inline def getDefaultCanvas(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCanvas")().asInstanceOf[HTMLCanvasElement]
  
  inline def getNewCanvas(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewCanvas")().asInstanceOf[HTMLCanvasElement]
}

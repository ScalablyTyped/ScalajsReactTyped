package typingsJapgolly.pixiJs.mod

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "CanvasResource")
@js.native
open class CanvasResource protected ()
  extends typingsJapgolly.pixiCore.mod.CanvasResource {
  /**
    * @param source - Canvas element to use
    */
  def this(source: HTMLCanvasElement) = this()
}
/* static members */
object CanvasResource {
  
  @JSImport("pixi.js", "CanvasResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to auto-detect the type of resource.
    * @param {*} source - The source object
    * @returns {boolean} `true` if source is HTMLCanvasElement or OffscreenCanvas
    */
  inline def test(source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
